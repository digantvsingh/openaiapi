package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CreateChatCompletionRequest;
import com.openapi.client.model.CreateChatCompletionResponse;

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
     * Creates a model response for the given chat conversation.
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
     * Creates a model response for the given chat conversation.
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
