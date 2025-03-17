package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.ChatCompletionDeleted;
import com.openapi.client.model.ChatCompletionList;
import com.openapi.client.model.ChatCompletionMessageList;
import com.openapi.client.model.CompletionsCompletionIdBody;
import com.openapi.client.model.CreateChatCompletionRequest;
import com.openapi.client.model.CreateChatCompletionResponse;
import com.openapi.client.model.Metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("com.openapi.client.ChatApi")
public class ChatApi {
    private ApiClient apiClient;

    public ChatApi() {
        this(new ApiClient());
    }

    @Autowired
    public ChatApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * **Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return CreateChatCompletionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateChatCompletionResponse createChatCompletion(CreateChatCompletionRequest body) throws RestClientException {
        return createChatCompletionWithHttpInfo(body).getBody();
    }

    /**
     * **Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;CreateChatCompletionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateChatCompletionResponse> createChatCompletionWithHttpInfo(CreateChatCompletionRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createChatCompletion");
        }
        String path = UriComponentsBuilder.fromPath("/chat/completions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/event-stream"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CreateChatCompletionResponse> returnType = new ParameterizedTypeReference<CreateChatCompletionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted. 
     * 
     * <p><b>200</b> - The chat completion was deleted successfully.
     * @param completionId The ID of the chat completion to delete. (required)
     * @return ChatCompletionDeleted
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChatCompletionDeleted deleteChatCompletion(String completionId) throws RestClientException {
        return deleteChatCompletionWithHttpInfo(completionId).getBody();
    }

    /**
     * Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted. 
     * 
     * <p><b>200</b> - The chat completion was deleted successfully.
     * @param completionId The ID of the chat completion to delete. (required)
     * @return ResponseEntity&lt;ChatCompletionDeleted&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChatCompletionDeleted> deleteChatCompletionWithHttpInfo(String completionId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'completionId' is set
        if (completionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'completionId' when calling deleteChatCompletion");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("completion_id", completionId);
        String path = UriComponentsBuilder.fromPath("/chat/completions/{completion_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ChatCompletionDeleted> returnType = new ParameterizedTypeReference<ChatCompletionDeleted>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A chat completion
     * @param completionId The ID of the chat completion to retrieve. (required)
     * @return CreateChatCompletionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateChatCompletionResponse getChatCompletion(String completionId) throws RestClientException {
        return getChatCompletionWithHttpInfo(completionId).getBody();
    }

    /**
     * Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A chat completion
     * @param completionId The ID of the chat completion to retrieve. (required)
     * @return ResponseEntity&lt;CreateChatCompletionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateChatCompletionResponse> getChatCompletionWithHttpInfo(String completionId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'completionId' is set
        if (completionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'completionId' when calling getChatCompletion");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("completion_id", completionId);
        String path = UriComponentsBuilder.fromPath("/chat/completions/{completion_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CreateChatCompletionResponse> returnType = new ParameterizedTypeReference<CreateChatCompletionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A list of messages
     * @param completionId The ID of the chat completion to retrieve messages from. (required)
     * @param after Identifier for the last message from the previous pagination request. (optional)
     * @param limit Number of messages to retrieve. (optional, default to 20)
     * @param order Sort order for messages by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. (optional, default to asc)
     * @return ChatCompletionMessageList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChatCompletionMessageList getChatCompletionMessages(String completionId, String after, Integer limit, String order) throws RestClientException {
        return getChatCompletionMessagesWithHttpInfo(completionId, after, limit, order).getBody();
    }

    /**
     * Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A list of messages
     * @param completionId The ID of the chat completion to retrieve messages from. (required)
     * @param after Identifier for the last message from the previous pagination request. (optional)
     * @param limit Number of messages to retrieve. (optional, default to 20)
     * @param order Sort order for messages by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. (optional, default to asc)
     * @return ResponseEntity&lt;ChatCompletionMessageList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChatCompletionMessageList> getChatCompletionMessagesWithHttpInfo(String completionId, String after, Integer limit, String order) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'completionId' is set
        if (completionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'completionId' when calling getChatCompletionMessages");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("completion_id", completionId);
        String path = UriComponentsBuilder.fromPath("/chat/completions/{completion_id}/messages").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ChatCompletionMessageList> returnType = new ParameterizedTypeReference<ChatCompletionMessageList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A list of Chat Completions
     * @param model The model used to generate the Chat Completions. (optional)
     * @param metadata A list of metadata keys to filter the Chat Completions by. Example:  &#x60;metadata[key1]&#x3D;value1&amp;metadata[key2]&#x3D;value2&#x60;  (optional)
     * @param after Identifier for the last chat completion from the previous pagination request. (optional)
     * @param limit Number of Chat Completions to retrieve. (optional, default to 20)
     * @param order Sort order for Chat Completions by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. (optional, default to asc)
     * @return ChatCompletionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChatCompletionList listChatCompletions(String model, Metadata metadata, String after, Integer limit, String order) throws RestClientException {
        return listChatCompletionsWithHttpInfo(model, metadata, after, limit, order).getBody();
    }

    /**
     * List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
     * 
     * <p><b>200</b> - A list of Chat Completions
     * @param model The model used to generate the Chat Completions. (optional)
     * @param metadata A list of metadata keys to filter the Chat Completions by. Example:  &#x60;metadata[key1]&#x3D;value1&amp;metadata[key2]&#x3D;value2&#x60;  (optional)
     * @param after Identifier for the last chat completion from the previous pagination request. (optional)
     * @param limit Number of Chat Completions to retrieve. (optional, default to 20)
     * @param order Sort order for Chat Completions by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. (optional, default to asc)
     * @return ResponseEntity&lt;ChatCompletionList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChatCompletionList> listChatCompletionsWithHttpInfo(String model, Metadata metadata, String after, Integer limit, String order) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/chat/completions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "model", model));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadata", metadata));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ChatCompletionList> returnType = new ParameterizedTypeReference<ChatCompletionList>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field. 
     * 
     * <p><b>200</b> - A chat completion
     * @param body  (required)
     * @param completionId The ID of the chat completion to update. (required)
     * @return CreateChatCompletionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateChatCompletionResponse updateChatCompletion(CompletionsCompletionIdBody body, String completionId) throws RestClientException {
        return updateChatCompletionWithHttpInfo(body, completionId).getBody();
    }

    /**
     * Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field. 
     * 
     * <p><b>200</b> - A chat completion
     * @param body  (required)
     * @param completionId The ID of the chat completion to update. (required)
     * @return ResponseEntity&lt;CreateChatCompletionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateChatCompletionResponse> updateChatCompletionWithHttpInfo(CompletionsCompletionIdBody body, String completionId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateChatCompletion");
        }
        // verify the required parameter 'completionId' is set
        if (completionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'completionId' when calling updateChatCompletion");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("completion_id", completionId);
        String path = UriComponentsBuilder.fromPath("/chat/completions/{completion_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CreateChatCompletionResponse> returnType = new ParameterizedTypeReference<CreateChatCompletionResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
