package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CompleteUploadRequest;
import com.openapi.client.model.CreateUploadRequest;
import java.io.File;
import com.openapi.client.model.Upload;
import com.openapi.client.model.UploadPart;

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


@Component("com.openapi.client.UploadsApi")
public class UploadsApi {
    private ApiClient apiClient;

    public UploadsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UploadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * 
     * <p><b>200</b> - OK
     * @param data  (required)
     * @param uploadId The ID of the Upload.  (required)
     * @return UploadPart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadPart addUploadPart(File data, String uploadId) throws RestClientException {
        return addUploadPartWithHttpInfo(data, uploadId).getBody();
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     * 
     * <p><b>200</b> - OK
     * @param data  (required)
     * @param uploadId The ID of the Upload.  (required)
     * @return ResponseEntity&lt;UploadPart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadPart> addUploadPartWithHttpInfo(File data, String uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'data' when calling addUploadPart");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling addUploadPart");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("upload_id", uploadId);
        String path = UriComponentsBuilder.fromPath("/uploads/{upload_id}/parts").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (data != null)
            formParams.add("data", new FileSystemResource(data));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<UploadPart> returnType = new ParameterizedTypeReference<UploadPart>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * 
     * <p><b>200</b> - OK
     * @param uploadId The ID of the Upload.  (required)
     * @return Upload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Upload cancelUpload(String uploadId) throws RestClientException {
        return cancelUploadWithHttpInfo(uploadId).getBody();
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     * 
     * <p><b>200</b> - OK
     * @param uploadId The ID of the Upload.  (required)
     * @return ResponseEntity&lt;Upload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Upload> cancelUploadWithHttpInfo(String uploadId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling cancelUpload");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("upload_id", uploadId);
        String path = UriComponentsBuilder.fromPath("/uploads/{upload_id}/cancel").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Upload> returnType = new ParameterizedTypeReference<Upload>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param uploadId The ID of the Upload.  (required)
     * @return Upload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Upload completeUpload(CompleteUploadRequest body, String uploadId) throws RestClientException {
        return completeUploadWithHttpInfo(body, uploadId).getBody();
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @param uploadId The ID of the Upload.  (required)
     * @return ResponseEntity&lt;Upload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Upload> completeUploadWithHttpInfo(CompleteUploadRequest body, String uploadId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling completeUpload");
        }
        // verify the required parameter 'uploadId' is set
        if (uploadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uploadId' when calling completeUpload");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("upload_id", uploadId);
        String path = UriComponentsBuilder.fromPath("/uploads/{upload_id}/complete").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Upload> returnType = new ParameterizedTypeReference<Upload>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search/supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return Upload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Upload createUpload(CreateUploadRequest body) throws RestClientException {
        return createUploadWithHttpInfo(body).getBody();
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search/supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;Upload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Upload> createUploadWithHttpInfo(CreateUploadRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createUpload");
        }
        String path = UriComponentsBuilder.fromPath("/uploads").build().toUriString();
        
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

        ParameterizedTypeReference<Upload> returnType = new ParameterizedTypeReference<Upload>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
