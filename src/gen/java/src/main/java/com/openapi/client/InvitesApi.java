package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.Invite;
import com.openapi.client.model.InviteDeleteResponse;
import com.openapi.client.model.InviteListResponse;
import com.openapi.client.model.InviteRequest;

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


@Component("com.openapi.client.InvitesApi")
public class InvitesApi {
    private ApiClient apiClient;

    public InvitesApi() {
        this(new ApiClient());
    }

    @Autowired
    public InvitesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * 
     * <p><b>200</b> - Invite deleted successfully.
     * @param inviteId The ID of the invite to delete. (required)
     * @return InviteDeleteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InviteDeleteResponse deleteInvite(String inviteId) throws RestClientException {
        return deleteInviteWithHttpInfo(inviteId).getBody();
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * 
     * <p><b>200</b> - Invite deleted successfully.
     * @param inviteId The ID of the invite to delete. (required)
     * @return ResponseEntity&lt;InviteDeleteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InviteDeleteResponse> deleteInviteWithHttpInfo(String inviteId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inviteId' is set
        if (inviteId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteId' when calling deleteInvite");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invite_id", inviteId);
        String path = UriComponentsBuilder.fromPath("/organization/invites/{invite_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InviteDeleteResponse> returnType = new ParameterizedTypeReference<InviteDeleteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * 
     * <p><b>200</b> - User invited successfully.
     * @param body The invite request payload. (required)
     * @return Invite
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Invite inviteUser(InviteRequest body) throws RestClientException {
        return inviteUserWithHttpInfo(body).getBody();
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * 
     * <p><b>200</b> - User invited successfully.
     * @param body The invite request payload. (required)
     * @return ResponseEntity&lt;Invite&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Invite> inviteUserWithHttpInfo(InviteRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling inviteUser");
        }
        String path = UriComponentsBuilder.fromPath("/organization/invites").build().toUriString();
        
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

        ParameterizedTypeReference<Invite> returnType = new ParameterizedTypeReference<Invite>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of invites in the organization.
     * 
     * <p><b>200</b> - Invites listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return InviteListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InviteListResponse listInvites(Integer limit, String after) throws RestClientException {
        return listInvitesWithHttpInfo(limit, after).getBody();
    }

    /**
     * Returns a list of invites in the organization.
     * 
     * <p><b>200</b> - Invites listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;InviteListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InviteListResponse> listInvitesWithHttpInfo(Integer limit, String after) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/organization/invites").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<InviteListResponse> returnType = new ParameterizedTypeReference<InviteListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves an invite.
     * 
     * <p><b>200</b> - Invite retrieved successfully.
     * @param inviteId The ID of the invite to retrieve. (required)
     * @return Invite
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Invite retrieveInvite(String inviteId) throws RestClientException {
        return retrieveInviteWithHttpInfo(inviteId).getBody();
    }

    /**
     * Retrieves an invite.
     * 
     * <p><b>200</b> - Invite retrieved successfully.
     * @param inviteId The ID of the invite to retrieve. (required)
     * @return ResponseEntity&lt;Invite&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Invite> retrieveInviteWithHttpInfo(String inviteId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inviteId' is set
        if (inviteId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteId' when calling retrieveInvite");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("invite_id", inviteId);
        String path = UriComponentsBuilder.fromPath("/organization/invites/{invite_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Invite> returnType = new ParameterizedTypeReference<Invite>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
