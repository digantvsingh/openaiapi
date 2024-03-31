package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CreateEmbeddingRequest;
import com.openapi.client.model.CreateEmbeddingResponse;

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


@Component("com.openapi.client.EmbeddingsApi")
public class EmbeddingsApi {
    private ApiClient apiClient;

    public EmbeddingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmbeddingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an embedding vector representing the input text.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return CreateEmbeddingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateEmbeddingResponse createEmbedding(CreateEmbeddingRequest body) throws RestClientException {
        return createEmbeddingWithHttpInfo(body).getBody();
    }

    /**
     * Creates an embedding vector representing the input text.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;CreateEmbeddingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateEmbeddingResponse> createEmbeddingWithHttpInfo(CreateEmbeddingRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createEmbedding");
        }
        String path = UriComponentsBuilder.fromPath("/embeddings").build().toUriString();
        
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

        ParameterizedTypeReference<CreateEmbeddingResponse> returnType = new ParameterizedTypeReference<CreateEmbeddingResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
