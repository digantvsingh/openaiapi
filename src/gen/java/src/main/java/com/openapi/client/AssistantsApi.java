package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.AssistantObject;
import com.openapi.client.model.CreateAssistantRequest;
import com.openapi.client.model.CreateMessageRequest;
import com.openapi.client.model.CreateRunRequest;
import com.openapi.client.model.CreateThreadAndRunRequest;
import com.openapi.client.model.CreateThreadRequest;
import com.openapi.client.model.DeleteAssistantResponse;
import com.openapi.client.model.DeleteMessageResponse;
import com.openapi.client.model.DeleteThreadResponse;
import com.openapi.client.model.ListAssistantsResponse;
import com.openapi.client.model.ListMessagesResponse;
import com.openapi.client.model.ListRunStepsResponse;
import com.openapi.client.model.ListRunsResponse;
import com.openapi.client.model.MessageObject;
import com.openapi.client.model.ModifyAssistantRequest;
import com.openapi.client.model.ModifyMessageRequest;
import com.openapi.client.model.ModifyRunRequest;
import com.openapi.client.model.ModifyThreadRequest;
import com.openapi.client.model.RunObject;
import com.openapi.client.model.RunStepObject;
import com.openapi.client.model.SubmitToolOutputsRunRequest;
import com.openapi.client.model.ThreadObject;

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


@Component("com.openapi.client.AssistantsApi")
public class AssistantsApi {
    private ApiClient apiClient;

    public AssistantsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AssistantsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which this run belongs. (required)
     * @param runId The ID of the run to cancel. (required)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject cancelRun(String threadId, String runId) throws RestClientException {
        return cancelRunWithHttpInfo(threadId, runId).getBody();
    }

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which this run belongs. (required)
     * @param runId The ID of the run to cancel. (required)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> cancelRunWithHttpInfo(String threadId, String runId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling cancelRun");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling cancelRun");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}/cancel").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an assistant with a model and instructions.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return AssistantObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssistantObject createAssistant(CreateAssistantRequest body) throws RestClientException {
        return createAssistantWithHttpInfo(body).getBody();
    }

    /**
     * Create an assistant with a model and instructions.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;AssistantObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssistantObject> createAssistantWithHttpInfo(CreateAssistantRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createAssistant");
        }
        String path = UriComponentsBuilder.fromPath("/assistants").build().toUriString();
        
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

        ParameterizedTypeReference<AssistantObject> returnType = new ParameterizedTypeReference<AssistantObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a message.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. (required)
     * @return MessageObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageObject createMessage(CreateMessageRequest body, String threadId) throws RestClientException {
        return createMessageWithHttpInfo(body, threadId).getBody();
    }

    /**
     * Create a message.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. (required)
     * @return ResponseEntity&lt;MessageObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageObject> createMessageWithHttpInfo(CreateMessageRequest body, String threadId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createMessage");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling createMessage");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/messages").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<MessageObject> returnType = new ParameterizedTypeReference<MessageObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a run.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to run. (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject createRun(CreateRunRequest body, String threadId, List<String> include) throws RestClientException {
        return createRunWithHttpInfo(body, threadId, include).getBody();
    }

    /**
     * Create a run.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to run. (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> createRunWithHttpInfo(CreateRunRequest body, String threadId, List<String> include) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createRun");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling createRun");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "include[]", include));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a thread.
     * 
     * <p><b>200</b> - OK
     * @param body  (optional)
     * @return ThreadObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ThreadObject createThread(CreateThreadRequest body) throws RestClientException {
        return createThreadWithHttpInfo(body).getBody();
    }

    /**
     * Create a thread.
     * 
     * <p><b>200</b> - OK
     * @param body  (optional)
     * @return ResponseEntity&lt;ThreadObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThreadObject> createThreadWithHttpInfo(CreateThreadRequest body) throws RestClientException {
        Object postBody = body;
        String path = UriComponentsBuilder.fromPath("/threads").build().toUriString();
        
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

        ParameterizedTypeReference<ThreadObject> returnType = new ParameterizedTypeReference<ThreadObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a thread and run it in one request.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject createThreadAndRun(CreateThreadAndRunRequest body) throws RestClientException {
        return createThreadAndRunWithHttpInfo(body).getBody();
    }

    /**
     * Create a thread and run it in one request.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> createThreadAndRunWithHttpInfo(CreateThreadAndRunRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createThreadAndRun");
        }
        String path = UriComponentsBuilder.fromPath("/threads/runs").build().toUriString();
        
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

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an assistant.
     * 
     * <p><b>200</b> - OK
     * @param assistantId The ID of the assistant to delete. (required)
     * @return DeleteAssistantResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteAssistantResponse deleteAssistant(String assistantId) throws RestClientException {
        return deleteAssistantWithHttpInfo(assistantId).getBody();
    }

    /**
     * Delete an assistant.
     * 
     * <p><b>200</b> - OK
     * @param assistantId The ID of the assistant to delete. (required)
     * @return ResponseEntity&lt;DeleteAssistantResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteAssistantResponse> deleteAssistantWithHttpInfo(String assistantId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'assistantId' is set
        if (assistantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assistantId' when calling deleteAssistant");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assistant_id", assistantId);
        String path = UriComponentsBuilder.fromPath("/assistants/{assistant_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteAssistantResponse> returnType = new ParameterizedTypeReference<DeleteAssistantResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a message.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to delete. (required)
     * @return DeleteMessageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteMessageResponse deleteMessage(String threadId, String messageId) throws RestClientException {
        return deleteMessageWithHttpInfo(threadId, messageId).getBody();
    }

    /**
     * Deletes a message.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to delete. (required)
     * @return ResponseEntity&lt;DeleteMessageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteMessageResponse> deleteMessageWithHttpInfo(String threadId, String messageId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling deleteMessage");
        }
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageId' when calling deleteMessage");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("message_id", messageId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/messages/{message_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteMessageResponse> returnType = new ParameterizedTypeReference<DeleteMessageResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to delete. (required)
     * @return DeleteThreadResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteThreadResponse deleteThread(String threadId) throws RestClientException {
        return deleteThreadWithHttpInfo(threadId).getBody();
    }

    /**
     * Delete a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to delete. (required)
     * @return ResponseEntity&lt;DeleteThreadResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteThreadResponse> deleteThreadWithHttpInfo(String threadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling deleteThread");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteThreadResponse> returnType = new ParameterizedTypeReference<DeleteThreadResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves an assistant.
     * 
     * <p><b>200</b> - OK
     * @param assistantId The ID of the assistant to retrieve. (required)
     * @return AssistantObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssistantObject getAssistant(String assistantId) throws RestClientException {
        return getAssistantWithHttpInfo(assistantId).getBody();
    }

    /**
     * Retrieves an assistant.
     * 
     * <p><b>200</b> - OK
     * @param assistantId The ID of the assistant to retrieve. (required)
     * @return ResponseEntity&lt;AssistantObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssistantObject> getAssistantWithHttpInfo(String assistantId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'assistantId' is set
        if (assistantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assistantId' when calling getAssistant");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assistant_id", assistantId);
        String path = UriComponentsBuilder.fromPath("/assistants/{assistant_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AssistantObject> returnType = new ParameterizedTypeReference<AssistantObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a message.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. (required)
     * @param messageId The ID of the message to retrieve. (required)
     * @return MessageObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageObject getMessage(String threadId, String messageId) throws RestClientException {
        return getMessageWithHttpInfo(threadId, messageId).getBody();
    }

    /**
     * Retrieve a message.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. (required)
     * @param messageId The ID of the message to retrieve. (required)
     * @return ResponseEntity&lt;MessageObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageObject> getMessageWithHttpInfo(String threadId, String messageId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling getMessage");
        }
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageId' when calling getMessage");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("message_id", messageId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/messages/{message_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<MessageObject> returnType = new ParameterizedTypeReference<MessageObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a run.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to retrieve. (required)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject getRun(String threadId, String runId) throws RestClientException {
        return getRunWithHttpInfo(threadId, runId).getBody();
    }

    /**
     * Retrieves a run.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to retrieve. (required)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> getRunWithHttpInfo(String threadId, String runId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling getRun");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling getRun");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a run step.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which the run and run step belongs. (required)
     * @param runId The ID of the run to which the run step belongs. (required)
     * @param stepId The ID of the run step to retrieve. (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return RunStepObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunStepObject getRunStep(String threadId, String runId, String stepId, List<String> include) throws RestClientException {
        return getRunStepWithHttpInfo(threadId, runId, stepId, include).getBody();
    }

    /**
     * Retrieves a run step.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to which the run and run step belongs. (required)
     * @param runId The ID of the run to which the run step belongs. (required)
     * @param stepId The ID of the run step to retrieve. (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return ResponseEntity&lt;RunStepObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunStepObject> getRunStepWithHttpInfo(String threadId, String runId, String stepId, List<String> include) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling getRunStep");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling getRunStep");
        }
        // verify the required parameter 'stepId' is set
        if (stepId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stepId' when calling getRunStep");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        uriVariables.put("step_id", stepId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}/steps/{step_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "include[]", include));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<RunStepObject> returnType = new ParameterizedTypeReference<RunStepObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to retrieve. (required)
     * @return ThreadObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ThreadObject getThread(String threadId) throws RestClientException {
        return getThreadWithHttpInfo(threadId).getBody();
    }

    /**
     * Retrieves a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread to retrieve. (required)
     * @return ResponseEntity&lt;ThreadObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThreadObject> getThreadWithHttpInfo(String threadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling getThread");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ThreadObject> returnType = new ParameterizedTypeReference<ThreadObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of assistants.
     * 
     * <p><b>200</b> - OK
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAssistantsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListAssistantsResponse listAssistants(Integer limit, String order, String after, String before) throws RestClientException {
        return listAssistantsWithHttpInfo(limit, order, after, before).getBody();
    }

    /**
     * Returns a list of assistants.
     * 
     * <p><b>200</b> - OK
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ResponseEntity&lt;ListAssistantsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListAssistantsResponse> listAssistantsWithHttpInfo(Integer limit, String order, String after, String before) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/assistants").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListAssistantsResponse> returnType = new ParameterizedTypeReference<ListAssistantsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of messages for a given thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param runId Filter messages by the run ID that generated them.  (optional)
     * @return ListMessagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListMessagesResponse listMessages(String threadId, Integer limit, String order, String after, String before, String runId) throws RestClientException {
        return listMessagesWithHttpInfo(threadId, limit, order, after, before, runId).getBody();
    }

    /**
     * Returns a list of messages for a given thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param runId Filter messages by the run ID that generated them.  (optional)
     * @return ResponseEntity&lt;ListMessagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListMessagesResponse> listMessagesWithHttpInfo(String threadId, Integer limit, String order, String after, String before, String runId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling listMessages");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/messages").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "run_id", runId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListMessagesResponse> returnType = new ParameterizedTypeReference<ListMessagesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of run steps belonging to a run.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread the run and run steps belong to. (required)
     * @param runId The ID of the run the run steps belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return ListRunStepsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListRunStepsResponse listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before, List<String> include) throws RestClientException {
        return listRunStepsWithHttpInfo(threadId, runId, limit, order, after, before, include).getBody();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread the run and run steps belong to. (required)
     * @param runId The ID of the run the run steps belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information.  (optional)
     * @return ResponseEntity&lt;ListRunStepsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListRunStepsResponse> listRunStepsWithHttpInfo(String threadId, String runId, Integer limit, String order, String after, String before, List<String> include) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling listRunSteps");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling listRunSteps");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}/steps").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "include[]", include));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListRunStepsResponse> returnType = new ParameterizedTypeReference<ListRunStepsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of runs belonging to a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread the run belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListRunsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListRunsResponse listRuns(String threadId, Integer limit, String order, String after, String before) throws RestClientException {
        return listRunsWithHttpInfo(threadId, limit, order, after, before).getBody();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * 
     * <p><b>200</b> - OK
     * @param threadId The ID of the thread the run belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ResponseEntity&lt;ListRunsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListRunsResponse> listRunsWithHttpInfo(String threadId, Integer limit, String order, String after, String before) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling listRuns");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListRunsResponse> returnType = new ParameterizedTypeReference<ListRunsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies an assistant.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param assistantId The ID of the assistant to modify. (required)
     * @return AssistantObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssistantObject modifyAssistant(ModifyAssistantRequest body, String assistantId) throws RestClientException {
        return modifyAssistantWithHttpInfo(body, assistantId).getBody();
    }

    /**
     * Modifies an assistant.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param assistantId The ID of the assistant to modify. (required)
     * @return ResponseEntity&lt;AssistantObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssistantObject> modifyAssistantWithHttpInfo(ModifyAssistantRequest body, String assistantId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyAssistant");
        }
        // verify the required parameter 'assistantId' is set
        if (assistantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assistantId' when calling modifyAssistant");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assistant_id", assistantId);
        String path = UriComponentsBuilder.fromPath("/assistants/{assistant_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AssistantObject> returnType = new ParameterizedTypeReference<AssistantObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a message.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to modify. (required)
     * @return MessageObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageObject modifyMessage(ModifyMessageRequest body, String threadId, String messageId) throws RestClientException {
        return modifyMessageWithHttpInfo(body, threadId, messageId).getBody();
    }

    /**
     * Modifies a message.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to modify. (required)
     * @return ResponseEntity&lt;MessageObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageObject> modifyMessageWithHttpInfo(ModifyMessageRequest body, String threadId, String messageId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyMessage");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling modifyMessage");
        }
        // verify the required parameter 'messageId' is set
        if (messageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageId' when calling modifyMessage");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("message_id", messageId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/messages/{message_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<MessageObject> returnType = new ParameterizedTypeReference<MessageObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a run.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to modify. (required)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject modifyRun(ModifyRunRequest body, String threadId, String runId) throws RestClientException {
        return modifyRunWithHttpInfo(body, threadId, runId).getBody();
    }

    /**
     * Modifies a run.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to modify. (required)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> modifyRunWithHttpInfo(ModifyRunRequest body, String threadId, String runId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyRun");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling modifyRun");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling modifyRun");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a thread.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. (required)
     * @return ThreadObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ThreadObject modifyThread(ModifyThreadRequest body, String threadId) throws RestClientException {
        return modifyThreadWithHttpInfo(body, threadId).getBody();
    }

    /**
     * Modifies a thread.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. (required)
     * @return ResponseEntity&lt;ThreadObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThreadObject> modifyThreadWithHttpInfo(ModifyThreadRequest body, String threadId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyThread");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling modifyThread");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ThreadObject> returnType = new ParameterizedTypeReference<ThreadObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#x27;re all completed. All outputs must be submitted in a single request. 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. (required)
     * @param runId The ID of the run that requires the tool output submission. (required)
     * @return RunObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunObject submitToolOuputsToRun(SubmitToolOutputsRunRequest body, String threadId, String runId) throws RestClientException {
        return submitToolOuputsToRunWithHttpInfo(body, threadId, runId).getBody();
    }

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#x27;re all completed. All outputs must be submitted in a single request. 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. (required)
     * @param runId The ID of the run that requires the tool output submission. (required)
     * @return ResponseEntity&lt;RunObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunObject> submitToolOuputsToRunWithHttpInfo(SubmitToolOutputsRunRequest body, String threadId, String runId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling submitToolOuputsToRun");
        }
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling submitToolOuputsToRun");
        }
        // verify the required parameter 'runId' is set
        if (runId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'runId' when calling submitToolOuputsToRun");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("thread_id", threadId);
        uriVariables.put("run_id", runId);
        String path = UriComponentsBuilder.fromPath("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RunObject> returnType = new ParameterizedTypeReference<RunObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
