package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.AuditLogEventType;
import com.openapi.client.model.EffectiveAt;
import com.openapi.client.model.ListAuditLogsResponse;

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


@Component("com.openapi.client.AuditLogsApi")
public class AuditLogsApi {
    private ApiClient apiClient;

    public AuditLogsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuditLogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List user actions and configuration changes within this organization.
     * 
     * <p><b>200</b> - Audit logs listed successfully.
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAuditLogsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListAuditLogsResponse listAuditLogs(EffectiveAt effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws RestClientException {
        return listAuditLogsWithHttpInfo(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before).getBody();
    }

    /**
     * List user actions and configuration changes within this organization.
     * 
     * <p><b>200</b> - Audit logs listed successfully.
     * @param effectiveAt Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. (optional)
     * @param projectIds Return only events for these projects. (optional)
     * @param eventTypes Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
     * @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
     * @param actorEmails Return only events performed by users with these emails. (optional)
     * @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ResponseEntity&lt;ListAuditLogsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListAuditLogsResponse> listAuditLogsWithHttpInfo(EffectiveAt effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/organization/audit_logs").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "effective_at", effectiveAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "project_ids[]", projectIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "event_types[]", eventTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "actor_ids[]", actorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "actor_emails[]", actorEmails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "resource_ids[]", resourceIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ListAuditLogsResponse> returnType = new ParameterizedTypeReference<ListAuditLogsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
