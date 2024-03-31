package com.openapi.client;

import com.openapi.ApiClient;

import java.math.BigDecimal;
import com.openapi.client.model.CreateSpeechRequest;
import java.io.File;
import com.openapi.client.model.InlineResponse200;
import com.openapi.client.model.InlineResponse2001;

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


@Component("com.openapi.client.AudioApi")
public class AudioApi {
    private ApiClient apiClient;

    public AudioApi() {
        this(new ApiClient());
    }

    @Autowired
    public AudioApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generates audio from the input text.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File createSpeech(CreateSpeechRequest body) throws RestClientException {
        return createSpeechWithHttpInfo(body).getBody();
    }

    /**
     * Generates audio from the input text.
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> createSpeechWithHttpInfo(CreateSpeechRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createSpeech");
        }
        String path = UriComponentsBuilder.fromPath("/audio/speech").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/octet-stream"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Transcribes audio into the input language.
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param model  (required)
     * @param language  (required)
     * @param prompt  (required)
     * @param responseFormat  (required)
     * @param temperature  (required)
     * @param timestampGranularities  (required)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 createTranscription(File file, Object model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities) throws RestClientException {
        return createTranscriptionWithHttpInfo(file, model, language, prompt, responseFormat, temperature, timestampGranularities).getBody();
    }

    /**
     * Transcribes audio into the input language.
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param model  (required)
     * @param language  (required)
     * @param prompt  (required)
     * @param responseFormat  (required)
     * @param temperature  (required)
     * @param timestampGranularities  (required)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> createTranscriptionWithHttpInfo(File file, Object model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling createTranscription");
        }
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling createTranscription");
        }
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'language' when calling createTranscription");
        }
        // verify the required parameter 'prompt' is set
        if (prompt == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'prompt' when calling createTranscription");
        }
        // verify the required parameter 'responseFormat' is set
        if (responseFormat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseFormat' when calling createTranscription");
        }
        // verify the required parameter 'temperature' is set
        if (temperature == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'temperature' when calling createTranscription");
        }
        // verify the required parameter 'timestampGranularities' is set
        if (timestampGranularities == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timestampGranularities' when calling createTranscription");
        }
        String path = UriComponentsBuilder.fromPath("/audio/transcriptions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (model != null)
            formParams.add("model", model);
        if (language != null)
            formParams.add("language", language);
        if (prompt != null)
            formParams.add("prompt", prompt);
        if (responseFormat != null)
            formParams.add("response_format", responseFormat);
        if (temperature != null)
            formParams.add("temperature", temperature);
        if (timestampGranularities != null)
            formParams.add("timestamp_granularities[]", timestampGranularities);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Translates audio into English.
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param model  (required)
     * @param prompt  (required)
     * @param responseFormat  (required)
     * @param temperature  (required)
     * @return InlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2001 createTranslation(File file, Object model, String prompt, String responseFormat, BigDecimal temperature) throws RestClientException {
        return createTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature).getBody();
    }

    /**
     * Translates audio into English.
     * 
     * <p><b>200</b> - OK
     * @param file  (required)
     * @param model  (required)
     * @param prompt  (required)
     * @param responseFormat  (required)
     * @param temperature  (required)
     * @return ResponseEntity&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2001> createTranslationWithHttpInfo(File file, Object model, String prompt, String responseFormat, BigDecimal temperature) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling createTranslation");
        }
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling createTranslation");
        }
        // verify the required parameter 'prompt' is set
        if (prompt == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'prompt' when calling createTranslation");
        }
        // verify the required parameter 'responseFormat' is set
        if (responseFormat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseFormat' when calling createTranslation");
        }
        // verify the required parameter 'temperature' is set
        if (temperature == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'temperature' when calling createTranslation");
        }
        String path = UriComponentsBuilder.fromPath("/audio/translations").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (file != null)
            formParams.add("file", new FileSystemResource(file));
        if (model != null)
            formParams.add("model", model);
        if (prompt != null)
            formParams.add("prompt", prompt);
        if (responseFormat != null)
            formParams.add("response_format", responseFormat);
        if (temperature != null)
            formParams.add("temperature", temperature);

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InlineResponse2001> returnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
