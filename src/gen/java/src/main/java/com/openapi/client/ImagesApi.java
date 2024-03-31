package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CreateImageRequest;
import java.io.File;
import com.openapi.client.model.ImagesResponse;

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


@Component("com.openapi.client.ImagesApi")
public class ImagesApi {
    private ApiClient apiClient;

    public ImagesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ImagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates an image given a prompt.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImagesResponse createImage(CreateImageRequest body) throws RestClientException {
        return createImageWithHttpInfo(body).getBody();
    }

    /**
     * Creates an image given a prompt.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;ImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImagesResponse> createImageWithHttpInfo(CreateImageRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createImage");
        }
        String path = UriComponentsBuilder.fromPath("/images/generations").build().toUriString();
        
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

        ParameterizedTypeReference<ImagesResponse> returnType = new ParameterizedTypeReference<ImagesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     * <p><b>200</b> - OK
     * @param image  (required)
     * @param prompt  (required)
     * @param mask  (required)
     * @param model  (required)
     * @param n  (required)
     * @param size  (required)
     * @param responseFormat  (required)
     * @param user  (required)
     * @return ImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImagesResponse createImageEdit(File image, String prompt, File mask, Object model, Integer n, String size, String responseFormat, String user) throws RestClientException {
        return createImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user).getBody();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     * <p><b>200</b> - OK
     * @param image  (required)
     * @param prompt  (required)
     * @param mask  (required)
     * @param model  (required)
     * @param n  (required)
     * @param size  (required)
     * @param responseFormat  (required)
     * @param user  (required)
     * @return ResponseEntity&lt;ImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImagesResponse> createImageEditWithHttpInfo(File image, String prompt, File mask, Object model, Integer n, String size, String responseFormat, String user) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'image' when calling createImageEdit");
        }
        // verify the required parameter 'prompt' is set
        if (prompt == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'prompt' when calling createImageEdit");
        }
        // verify the required parameter 'mask' is set
        if (mask == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mask' when calling createImageEdit");
        }
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling createImageEdit");
        }
        // verify the required parameter 'n' is set
        if (n == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'n' when calling createImageEdit");
        }
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling createImageEdit");
        }
        // verify the required parameter 'responseFormat' is set
        if (responseFormat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseFormat' when calling createImageEdit");
        }
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling createImageEdit");
        }
        String path = UriComponentsBuilder.fromPath("/images/edits").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (image != null)
            formParams.add("image", new FileSystemResource(image));
        if (prompt != null)
            formParams.add("prompt", prompt);
        if (mask != null)
            formParams.add("mask", new FileSystemResource(mask));
        if (model != null)
            formParams.add("model", model);
        if (n != null)
            formParams.add("n", n);
        if (size != null)
            formParams.add("size", size);
        if (responseFormat != null)
            formParams.add("response_format", responseFormat);
        if (user != null)
            formParams.add("user", user);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ImagesResponse> returnType = new ParameterizedTypeReference<ImagesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a variation of a given image.
     * 
     * <p><b>200</b> - OK
     * @param image  (required)
     * @param model  (required)
     * @param n  (required)
     * @param responseFormat  (required)
     * @param size  (required)
     * @param user  (required)
     * @return ImagesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImagesResponse createImageVariation(File image, Object model, Integer n, String responseFormat, String size, String user) throws RestClientException {
        return createImageVariationWithHttpInfo(image, model, n, responseFormat, size, user).getBody();
    }

    /**
     * Creates a variation of a given image.
     * 
     * <p><b>200</b> - OK
     * @param image  (required)
     * @param model  (required)
     * @param n  (required)
     * @param responseFormat  (required)
     * @param size  (required)
     * @param user  (required)
     * @return ResponseEntity&lt;ImagesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImagesResponse> createImageVariationWithHttpInfo(File image, Object model, Integer n, String responseFormat, String size, String user) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'image' when calling createImageVariation");
        }
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling createImageVariation");
        }
        // verify the required parameter 'n' is set
        if (n == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'n' when calling createImageVariation");
        }
        // verify the required parameter 'responseFormat' is set
        if (responseFormat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseFormat' when calling createImageVariation");
        }
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling createImageVariation");
        }
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling createImageVariation");
        }
        String path = UriComponentsBuilder.fromPath("/images/variations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (image != null)
            formParams.add("image", new FileSystemResource(image));
        if (model != null)
            formParams.add("model", model);
        if (n != null)
            formParams.add("n", n);
        if (responseFormat != null)
            formParams.add("response_format", responseFormat);
        if (size != null)
            formParams.add("size", size);
        if (user != null)
            formParams.add("user", user);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ImagesResponse> returnType = new ParameterizedTypeReference<ImagesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
