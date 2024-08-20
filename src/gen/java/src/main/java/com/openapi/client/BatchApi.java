package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.Batch;
import com.openapi.client.model.BatchesBody;
import com.openapi.client.model.ListBatchesResponse;

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


@Component("com.openapi.client.BatchApi")
public class BatchApi {
    private ApiClient apiClient;

    public BatchApi() {
        this(new ApiClient());
    }

    @Autowired
    public BatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     * 
     * <p><b>200</b> - Batch is cancelling. Returns the cancelling batch&#x27;s details.
     * @param batchId The ID of the batch to cancel. (required)
     * @return Batch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Batch cancelBatch(String batchId) throws RestClientException {
        return cancelBatchWithHttpInfo(batchId).getBody();
    }

    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     * 
     * <p><b>200</b> - Batch is cancelling. Returns the cancelling batch&#x27;s details.
     * @param batchId The ID of the batch to cancel. (required)
     * @return ResponseEntity&lt;Batch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Batch> cancelBatchWithHttpInfo(String batchId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling cancelBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batch_id", batchId);
        String path = UriComponentsBuilder.fromPath("/batches/{batch_id}/cancel").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Batch> returnType = new ParameterizedTypeReference<Batch>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates and executes a batch from an uploaded file of requests
     * 
     * <p><b>200</b> - Batch created successfully.
     * @param body  (required)
     * @return Batch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Batch createBatch(BatchesBody body) throws RestClientException {
        return createBatchWithHttpInfo(body).getBody();
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * 
     * <p><b>200</b> - Batch created successfully.
     * @param body  (required)
     * @return ResponseEntity&lt;Batch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Batch> createBatchWithHttpInfo(BatchesBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createBatch");
        }
        String path = UriComponentsBuilder.fromPath("/batches").build().toUriString();
        
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

        ParameterizedTypeReference<Batch> returnType = new ParameterizedTypeReference<Batch>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List your organization&#x27;s batches.
     * 
     * <p><b>200</b> - Batch listed successfully.
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @return ListBatchesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListBatchesResponse listBatches(String after, Integer limit) throws RestClientException {
        return listBatchesWithHttpInfo(after, limit).getBody();
    }

    /**
     * List your organization&#x27;s batches.
     * 
     * <p><b>200</b> - Batch listed successfully.
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @return ResponseEntity&lt;ListBatchesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListBatchesResponse> listBatchesWithHttpInfo(String after, Integer limit) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/batches").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListBatchesResponse> returnType = new ParameterizedTypeReference<ListBatchesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a batch.
     * 
     * <p><b>200</b> - Batch retrieved successfully.
     * @param batchId The ID of the batch to retrieve. (required)
     * @return Batch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Batch retrieveBatch(String batchId) throws RestClientException {
        return retrieveBatchWithHttpInfo(batchId).getBody();
    }

    /**
     * Retrieves a batch.
     * 
     * <p><b>200</b> - Batch retrieved successfully.
     * @param batchId The ID of the batch to retrieve. (required)
     * @return ResponseEntity&lt;Batch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Batch> retrieveBatchWithHttpInfo(String batchId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling retrieveBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batch_id", batchId);
        String path = UriComponentsBuilder.fromPath("/batches/{batch_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Batch> returnType = new ParameterizedTypeReference<Batch>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
