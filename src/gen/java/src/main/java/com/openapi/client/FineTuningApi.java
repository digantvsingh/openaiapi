package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.CreateFineTuningJobRequest;
import com.openapi.client.model.FineTuningJob;
import com.openapi.client.model.ListFineTuningJobCheckpointsResponse;
import com.openapi.client.model.ListFineTuningJobEventsResponse;
import com.openapi.client.model.ListPaginatedFineTuningJobsResponse;

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


@Component("com.openapi.client.FineTuningApi")
public class FineTuningApi {
    private ApiClient apiClient;

    public FineTuningApi() {
        this(new ApiClient());
    }

    @Autowired
    public FineTuningApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Immediately cancel a fine-tune job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return FineTuningJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FineTuningJob cancelFineTuningJob(String fineTuningJobId) throws RestClientException {
        return cancelFineTuningJobWithHttpInfo(fineTuningJobId).getBody();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return ResponseEntity&lt;FineTuningJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FineTuningJob> cancelFineTuningJobWithHttpInfo(String fineTuningJobId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fineTuningJobId' when calling cancelFineTuningJob");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fine_tuning_job_id", fineTuningJobId);
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs/{fine_tuning_job_id}/cancel").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<FineTuningJob> returnType = new ParameterizedTypeReference<FineTuningJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return FineTuningJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FineTuningJob createFineTuningJob(CreateFineTuningJobRequest body) throws RestClientException {
        return createFineTuningJobWithHttpInfo(body).getBody();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * <p><b>200</b> - OK
     * @param body  (required)
     * @return ResponseEntity&lt;FineTuningJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FineTuningJob> createFineTuningJobWithHttpInfo(CreateFineTuningJobRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createFineTuningJob");
        }
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs").build().toUriString();
        
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

        ParameterizedTypeReference<FineTuningJob> returnType = new ParameterizedTypeReference<FineTuningJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get status updates for a fine-tuning job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ListFineTuningJobEventsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListFineTuningJobEventsResponse listFineTuningEvents(String fineTuningJobId, String after, Integer limit) throws RestClientException {
        return listFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit).getBody();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ResponseEntity&lt;ListFineTuningJobEventsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListFineTuningJobEventsResponse> listFineTuningEventsWithHttpInfo(String fineTuningJobId, String after, Integer limit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fineTuningJobId' when calling listFineTuningEvents");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fine_tuning_job_id", fineTuningJobId);
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs/{fine_tuning_job_id}/events").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ListFineTuningJobEventsResponse> returnType = new ParameterizedTypeReference<ListFineTuningJobEventsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List checkpoints for a fine-tuning job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  (required)
     * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return ListFineTuningJobCheckpointsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit) throws RestClientException {
        return listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId, after, limit).getBody();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  (required)
     * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return ResponseEntity&lt;ListFineTuningJobCheckpointsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListFineTuningJobCheckpointsResponse> listFineTuningJobCheckpointsWithHttpInfo(String fineTuningJobId, String after, Integer limit) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fineTuningJobId' when calling listFineTuningJobCheckpoints");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fine_tuning_job_id", fineTuningJobId);
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ListFineTuningJobCheckpointsResponse> returnType = new ParameterizedTypeReference<ListFineTuningJobCheckpointsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List your organization&#x27;s fine-tuning jobs 
     * 
     * <p><b>200</b> - OK
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return ListPaginatedFineTuningJobsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(String after, Integer limit) throws RestClientException {
        return listPaginatedFineTuningJobsWithHttpInfo(after, limit).getBody();
    }

    /**
     * List your organization&#x27;s fine-tuning jobs 
     * 
     * <p><b>200</b> - OK
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return ResponseEntity&lt;ListPaginatedFineTuningJobsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListPaginatedFineTuningJobsResponse> listPaginatedFineTuningJobsWithHttpInfo(String after, Integer limit) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs").build().toUriString();
        
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

        ParameterizedTypeReference<ListPaginatedFineTuningJobsResponse> returnType = new ParameterizedTypeReference<ListPaginatedFineTuningJobsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return FineTuningJob
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FineTuningJob retrieveFineTuningJob(String fineTuningJobId) throws RestClientException {
        return retrieveFineTuningJobWithHttpInfo(fineTuningJobId).getBody();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     * <p><b>200</b> - OK
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return ResponseEntity&lt;FineTuningJob&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FineTuningJob> retrieveFineTuningJobWithHttpInfo(String fineTuningJobId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fineTuningJobId' is set
        if (fineTuningJobId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fineTuningJobId' when calling retrieveFineTuningJob");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fine_tuning_job_id", fineTuningJobId);
        String path = UriComponentsBuilder.fromPath("/fine_tuning/jobs/{fine_tuning_job_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<FineTuningJob> returnType = new ParameterizedTypeReference<FineTuningJob>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
