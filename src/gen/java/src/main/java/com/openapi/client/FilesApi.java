package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.DeleteFileResponse;
import java.io.File;
import com.openapi.client.model.ListFilesResponse;
import com.openapi.client.model.OpenAIFile;

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


@Component("com.openapi.client.FilesApi")
public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(new ApiClient());
    }

    @Autowired
    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param purpose  (required)
     * @return OpenAIFile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OpenAIFile createFile(File file, String purpose) throws RestClientException {
        return createFileWithHttpInfo(file, purpose).getBody();
    }

    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param purpose  (required)
     * @return ResponseEntity&lt;OpenAIFile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OpenAIFile> createFileWithHttpInfo(File file, String purpose) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling createFile");
        }
        // verify the required parameter 'purpose' is set
        if (purpose == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purpose' when calling createFile");
        }
        String path = UriComponentsBuilder.fromPath("/files").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (purpose != null)
            formParams.add("purpose", purpose);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<OpenAIFile> returnType = new ParameterizedTypeReference<OpenAIFile>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return DeleteFileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteFileResponse deleteFile(String fileId) throws RestClientException {
        return deleteFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Delete a file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return ResponseEntity&lt;DeleteFileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteFileResponse> deleteFileWithHttpInfo(String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling deleteFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/files/{file_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteFileResponse> returnType = new ParameterizedTypeReference<DeleteFileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns the contents of the specified file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String downloadFile(String fileId) throws RestClientException {
        return downloadFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Returns the contents of the specified file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> downloadFileWithHttpInfo(String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling downloadFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/files/{file_id}/content").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of files.
     * 
     * <p><b>200</b> - OK
     * @param purpose Only return files with the given purpose. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional, default to 10000)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ListFilesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListFilesResponse listFiles(String purpose, Integer limit, String order, String after) throws RestClientException {
        return listFilesWithHttpInfo(purpose, limit, order, after).getBody();
    }

    /**
     * Returns a list of files.
     * 
     * <p><b>200</b> - OK
     * @param purpose Only return files with the given purpose. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional, default to 10000)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;ListFilesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListFilesResponse> listFilesWithHttpInfo(String purpose, Integer limit, String order, String after) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/files").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "purpose", purpose));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListFilesResponse> returnType = new ParameterizedTypeReference<ListFilesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns information about a specific file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return OpenAIFile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OpenAIFile retrieveFile(String fileId) throws RestClientException {
        return retrieveFileWithHttpInfo(fileId).getBody();
    }

    /**
     * Returns information about a specific file.
     * 
     * <p><b>200</b> - OK
     * @param fileId The ID of the file to use for this request. (required)
     * @return ResponseEntity&lt;OpenAIFile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OpenAIFile> retrieveFileWithHttpInfo(String fileId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling retrieveFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);
        String path = UriComponentsBuilder.fromPath("/files/{file_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<OpenAIFile> returnType = new ParameterizedTypeReference<OpenAIFile>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
