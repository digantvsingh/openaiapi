package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.DeleteModelResponse;
import com.openapi.client.model.ListModelsResponse;
import com.openapi.client.model.Model;

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


@Component("com.openapi.client.ModelsApi")
public class ModelsApi {
    private ApiClient apiClient;

    public ModelsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ModelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * 
     * <p><b>200</b> - OK
     * @param model The model to delete (required)
     * @return DeleteModelResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteModelResponse deleteModel(String model) throws RestClientException {
        return deleteModelWithHttpInfo(model).getBody();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * 
     * <p><b>200</b> - OK
     * @param model The model to delete (required)
     * @return ResponseEntity&lt;DeleteModelResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteModelResponse> deleteModelWithHttpInfo(String model) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling deleteModel");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model", model);
        String path = UriComponentsBuilder.fromPath("/models/{model}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DeleteModelResponse> returnType = new ParameterizedTypeReference<DeleteModelResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * 
     * <p><b>200</b> - OK
     * @return ListModelsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListModelsResponse listModels() throws RestClientException {
        return listModelsWithHttpInfo().getBody();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ListModelsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListModelsResponse> listModelsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/models").build().toUriString();
        
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

        ParameterizedTypeReference<ListModelsResponse> returnType = new ParameterizedTypeReference<ListModelsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * 
     * <p><b>200</b> - OK
     * @param model The ID of the model to use for this request (required)
     * @return Model
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model retrieveModel(String model) throws RestClientException {
        return retrieveModelWithHttpInfo(model).getBody();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * 
     * <p><b>200</b> - OK
     * @param model The ID of the model to use for this request (required)
     * @return ResponseEntity&lt;Model&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model> retrieveModelWithHttpInfo(String model) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling retrieveModel");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("model", model);
        String path = UriComponentsBuilder.fromPath("/models/{model}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Model> returnType = new ParameterizedTypeReference<Model>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
