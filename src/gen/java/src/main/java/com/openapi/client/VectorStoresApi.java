package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CreateVectorStoreFileBatchRequest;
import com.openapi.client.model.CreateVectorStoreFileRequest;
import com.openapi.client.model.CreateVectorStoreRequest;
import com.openapi.client.model.DeleteVectorStoreFileResponse;
import com.openapi.client.model.DeleteVectorStoreResponse;
import com.openapi.client.model.ListVectorStoreFilesResponse;
import com.openapi.client.model.ListVectorStoresResponse;
import com.openapi.client.model.UpdateVectorStoreFileAttributesRequest;
import com.openapi.client.model.UpdateVectorStoreRequest;
import com.openapi.client.model.VectorStoreFileBatchObject;
import com.openapi.client.model.VectorStoreFileContentResponse;
import com.openapi.client.model.VectorStoreFileObject;
import com.openapi.client.model.VectorStoreObject;
import com.openapi.client.model.VectorStoreSearchRequest;
import com.openapi.client.model.VectorStoreSearchResultsPage;

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


@Component("com.openapi.client.VectorStoresApi")
public class VectorStoresApi {
    private ApiClient apiClient;

    public VectorStoresApi() {
        this(new ApiClient());
    }

    @Autowired
    public VectorStoresApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch to cancel. (required)
     * @return VectorStoreFileBatchObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileBatchObject cancelVectorStoreFileBatch(String vectorStoreId, String batchId) throws RestClientException {
        return cancelVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId).getBody();
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch to cancel. (required)
     * @return ResponseEntity&lt;VectorStoreFileBatchObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileBatchObject> cancelVectorStoreFileBatchWithHttpInfo(String vectorStoreId, String batchId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling cancelVectorStoreFileBatch");
        }
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling cancelVectorStoreFileBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("batch_id", batchId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileBatchObject> returnType = new ParameterizedTypeReference<VectorStoreFileBatchObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a vector store.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return VectorStoreObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreObject createVectorStore(CreateVectorStoreRequest body) throws RestClientException {
        return createVectorStoreWithHttpInfo(body).getBody();
    }

    /**
     * Create a vector store.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;VectorStoreObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreObject> createVectorStoreWithHttpInfo(CreateVectorStoreRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createVectorStore");
        }
        String path = UriComponentsBuilder.fromPath("/vector_stores").build().toUriString();
        
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

        ParameterizedTypeReference<VectorStoreObject> returnType = new ParameterizedTypeReference<VectorStoreObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store for which to create a File.  (required)
     * @return VectorStoreFileObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileObject createVectorStoreFile(CreateVectorStoreFileRequest body, String vectorStoreId) throws RestClientException {
        return createVectorStoreFileWithHttpInfo(body, vectorStoreId).getBody();
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store for which to create a File.  (required)
     * @return ResponseEntity&lt;VectorStoreFileObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileObject> createVectorStoreFileWithHttpInfo(CreateVectorStoreFileRequest body, String vectorStoreId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createVectorStoreFile");
        }
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling createVectorStoreFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileObject> returnType = new ParameterizedTypeReference<VectorStoreFileObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a vector store file batch.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store for which to create a File Batch.  (required)
     * @return VectorStoreFileBatchObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileBatchObject createVectorStoreFileBatch(CreateVectorStoreFileBatchRequest body, String vectorStoreId) throws RestClientException {
        return createVectorStoreFileBatchWithHttpInfo(body, vectorStoreId).getBody();
    }

    /**
     * Create a vector store file batch.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store for which to create a File Batch.  (required)
     * @return ResponseEntity&lt;VectorStoreFileBatchObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileBatchObject> createVectorStoreFileBatchWithHttpInfo(CreateVectorStoreFileBatchRequest body, String vectorStoreId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createVectorStoreFileBatch");
        }
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling createVectorStoreFileBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/file_batches").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileBatchObject> returnType = new ParameterizedTypeReference<VectorStoreFileBatchObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a vector store.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store to delete. (required)
     * @return DeleteVectorStoreResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteVectorStoreResponse deleteVectorStore(String vectorStoreId) throws RestClientException {
        return deleteVectorStoreWithHttpInfo(vectorStoreId).getBody();
    }

    /**
     * Delete a vector store.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store to delete. (required)
     * @return ResponseEntity&lt;DeleteVectorStoreResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteVectorStoreResponse> deleteVectorStoreWithHttpInfo(String vectorStoreId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling deleteVectorStore");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteVectorStoreResponse> returnType = new ParameterizedTypeReference<DeleteVectorStoreResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file to delete. (required)
     * @return DeleteVectorStoreFileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteVectorStoreFileResponse deleteVectorStoreFile(String vectorStoreId, String fileId) throws RestClientException {
        return deleteVectorStoreFileWithHttpInfo(vectorStoreId, fileId).getBody();
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file to delete. (required)
     * @return ResponseEntity&lt;DeleteVectorStoreFileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteVectorStoreFileResponse> deleteVectorStoreFileWithHttpInfo(String vectorStoreId, String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling deleteVectorStoreFile");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling deleteVectorStoreFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files/{file_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteVectorStoreFileResponse> returnType = new ParameterizedTypeReference<DeleteVectorStoreFileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a vector store.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store to retrieve. (required)
     * @return VectorStoreObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreObject getVectorStore(String vectorStoreId) throws RestClientException {
        return getVectorStoreWithHttpInfo(vectorStoreId).getBody();
    }

    /**
     * Retrieves a vector store.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store to retrieve. (required)
     * @return ResponseEntity&lt;VectorStoreObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreObject> getVectorStoreWithHttpInfo(String vectorStoreId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling getVectorStore");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreObject> returnType = new ParameterizedTypeReference<VectorStoreObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file being retrieved. (required)
     * @return VectorStoreFileObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileObject getVectorStoreFile(String vectorStoreId, String fileId) throws RestClientException {
        return getVectorStoreFileWithHttpInfo(vectorStoreId, fileId).getBody();
    }

    /**
     * Retrieves a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file belongs to. (required)
     * @param fileId The ID of the file being retrieved. (required)
     * @return ResponseEntity&lt;VectorStoreFileObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileObject> getVectorStoreFileWithHttpInfo(String vectorStoreId, String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling getVectorStoreFile");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling getVectorStoreFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files/{file_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileObject> returnType = new ParameterizedTypeReference<VectorStoreFileObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a vector store file batch.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch being retrieved. (required)
     * @return VectorStoreFileBatchObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileBatchObject getVectorStoreFileBatch(String vectorStoreId, String batchId) throws RestClientException {
        return getVectorStoreFileBatchWithHttpInfo(vectorStoreId, batchId).getBody();
    }

    /**
     * Retrieves a vector store file batch.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the file batch belongs to. (required)
     * @param batchId The ID of the file batch being retrieved. (required)
     * @return ResponseEntity&lt;VectorStoreFileBatchObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileBatchObject> getVectorStoreFileBatchWithHttpInfo(String vectorStoreId, String batchId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling getVectorStoreFileBatch");
        }
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling getVectorStoreFileBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("batch_id", batchId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/file_batches/{batch_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileBatchObject> returnType = new ParameterizedTypeReference<VectorStoreFileBatchObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of vector store files in a batch.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param batchId The ID of the file batch that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ListVectorStoreFilesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListVectorStoreFilesResponse listFilesInVectorStoreBatch(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) throws RestClientException {
        return listFilesInVectorStoreBatchWithHttpInfo(vectorStoreId, batchId, limit, order, after, before, filter).getBody();
    }

    /**
     * Returns a list of vector store files in a batch.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param batchId The ID of the file batch that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ResponseEntity&lt;ListVectorStoreFilesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListVectorStoreFilesResponse> listFilesInVectorStoreBatchWithHttpInfo(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling listFilesInVectorStoreBatch");
        }
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling listFilesInVectorStoreBatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("batch_id", batchId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListVectorStoreFilesResponse> returnType = new ParameterizedTypeReference<ListVectorStoreFilesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of vector store files.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ListVectorStoreFilesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListVectorStoreFilesResponse listVectorStoreFiles(String vectorStoreId, Integer limit, String order, String after, String before, String filter) throws RestClientException {
        return listVectorStoreFilesWithHttpInfo(vectorStoreId, limit, order, after, before, filter).getBody();
    }

    /**
     * Returns a list of vector store files.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store that the files belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param filter Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. (optional)
     * @return ResponseEntity&lt;ListVectorStoreFilesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListVectorStoreFilesResponse> listVectorStoreFilesWithHttpInfo(String vectorStoreId, Integer limit, String order, String after, String before, String filter) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling listVectorStoreFiles");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListVectorStoreFilesResponse> returnType = new ParameterizedTypeReference<ListVectorStoreFilesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of vector stores.
     * 
     * <p><b>200</b> - OK
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListVectorStoresResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListVectorStoresResponse listVectorStores(Integer limit, String order, String after, String before) throws RestClientException {
        return listVectorStoresWithHttpInfo(limit, order, after, before).getBody();
    }

    /**
     * Returns a list of vector stores.
     * 
     * <p><b>200</b> - OK
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ResponseEntity&lt;ListVectorStoresResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListVectorStoresResponse> listVectorStoresWithHttpInfo(Integer limit, String order, String after, String before) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/vector_stores").build().toUriString();
        
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

        ParameterizedTypeReference<ListVectorStoresResponse> returnType = new ParameterizedTypeReference<ListVectorStoresResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a vector store.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store to modify. (required)
     * @return VectorStoreObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreObject modifyVectorStore(UpdateVectorStoreRequest body, String vectorStoreId) throws RestClientException {
        return modifyVectorStoreWithHttpInfo(body, vectorStoreId).getBody();
    }

    /**
     * Modifies a vector store.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store to modify. (required)
     * @return ResponseEntity&lt;VectorStoreObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreObject> modifyVectorStoreWithHttpInfo(UpdateVectorStoreRequest body, String vectorStoreId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyVectorStore");
        }
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling modifyVectorStore");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreObject> returnType = new ParameterizedTypeReference<VectorStoreObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve the parsed contents of a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store. (required)
     * @param fileId The ID of the file within the vector store. (required)
     * @return VectorStoreFileContentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileContentResponse retrieveVectorStoreFileContent(String vectorStoreId, String fileId) throws RestClientException {
        return retrieveVectorStoreFileContentWithHttpInfo(vectorStoreId, fileId).getBody();
    }

    /**
     * Retrieve the parsed contents of a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param vectorStoreId The ID of the vector store. (required)
     * @param fileId The ID of the file within the vector store. (required)
     * @return ResponseEntity&lt;VectorStoreFileContentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileContentResponse> retrieveVectorStoreFileContentWithHttpInfo(String vectorStoreId, String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling retrieveVectorStoreFileContent");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling retrieveVectorStoreFileContent");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files/{file_id}/content").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileContentResponse> returnType = new ParameterizedTypeReference<VectorStoreFileContentResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Search a vector store for relevant chunks based on a query and file attributes filter.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store to search. (required)
     * @return VectorStoreSearchResultsPage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreSearchResultsPage searchVectorStore(VectorStoreSearchRequest body, String vectorStoreId) throws RestClientException {
        return searchVectorStoreWithHttpInfo(body, vectorStoreId).getBody();
    }

    /**
     * Search a vector store for relevant chunks based on a query and file attributes filter.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store to search. (required)
     * @return ResponseEntity&lt;VectorStoreSearchResultsPage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreSearchResultsPage> searchVectorStoreWithHttpInfo(VectorStoreSearchRequest body, String vectorStoreId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling searchVectorStore");
        }
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling searchVectorStore");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/search").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreSearchResultsPage> returnType = new ParameterizedTypeReference<VectorStoreSearchResultsPage>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update attributes on a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store the file belongs to. (required)
     * @param fileId The ID of the file to update attributes. (required)
     * @return VectorStoreFileObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VectorStoreFileObject updateVectorStoreFileAttributes(UpdateVectorStoreFileAttributesRequest body, String vectorStoreId, String fileId) throws RestClientException {
        return updateVectorStoreFileAttributesWithHttpInfo(body, vectorStoreId, fileId).getBody();
    }

    /**
     * Update attributes on a vector store file.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param vectorStoreId The ID of the vector store the file belongs to. (required)
     * @param fileId The ID of the file to update attributes. (required)
     * @return ResponseEntity&lt;VectorStoreFileObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VectorStoreFileObject> updateVectorStoreFileAttributesWithHttpInfo(UpdateVectorStoreFileAttributesRequest body, String vectorStoreId, String fileId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateVectorStoreFileAttributes");
        }
        // verify the required parameter 'vectorStoreId' is set
        if (vectorStoreId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vectorStoreId' when calling updateVectorStoreFileAttributes");
        }
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling updateVectorStoreFileAttributes");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vector_store_id", vectorStoreId);
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/vector_stores/{vector_store_id}/files/{file_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<VectorStoreFileObject> returnType = new ParameterizedTypeReference<VectorStoreFileObject>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
