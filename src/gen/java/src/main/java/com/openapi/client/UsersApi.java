package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.User;
import com.openapi.client.model.UserDeleteResponse;
import com.openapi.client.model.UserListResponse;
import com.openapi.client.model.UserRoleUpdateRequest;

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


@Component("com.openapi.client.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a user from the organization.
     * 
     * <p><b>200</b> - User deleted successfully.
     * @param userId The ID of the user. (required)
     * @return UserDeleteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserDeleteResponse deleteUser(String userId) throws RestClientException {
        return deleteUserWithHttpInfo(userId).getBody();
    }

    /**
     * Deletes a user from the organization.
     * 
     * <p><b>200</b> - User deleted successfully.
     * @param userId The ID of the user. (required)
     * @return ResponseEntity&lt;UserDeleteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserDeleteResponse> deleteUserWithHttpInfo(String userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deleteUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/organization/users/{user_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<UserDeleteResponse> returnType = new ParameterizedTypeReference<UserDeleteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Lists all of the users in the organization.
     * 
     * <p><b>200</b> - Users listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return UserListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserListResponse listUsers(Integer limit, String after) throws RestClientException {
        return listUsersWithHttpInfo(limit, after).getBody();
    }

    /**
     * Lists all of the users in the organization.
     * 
     * <p><b>200</b> - Users listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;UserListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserListResponse> listUsersWithHttpInfo(Integer limit, String after) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/organization/users").build().toUriString();
        
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

        ParameterizedTypeReference<UserListResponse> returnType = new ParameterizedTypeReference<UserListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a user&#x27;s role in the organization.
     * 
     * <p><b>200</b> - User role updated successfully.
     * @param body The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User modifyUser(UserRoleUpdateRequest body) throws RestClientException {
        return modifyUserWithHttpInfo(body).getBody();
    }

    /**
     * Modifies a user&#x27;s role in the organization.
     * 
     * <p><b>200</b> - User role updated successfully.
     * @param body The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> modifyUserWithHttpInfo(UserRoleUpdateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyUser");
        }
        String path = UriComponentsBuilder.fromPath("/organization/users/{user_id}").build().toUriString();
        
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

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a user by their identifier.
     * 
     * <p><b>200</b> - User retrieved successfully.
     * @param userId The ID of the user. (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User retrieveUser(String userId) throws RestClientException {
        return retrieveUserWithHttpInfo(userId).getBody();
    }

    /**
     * Retrieves a user by their identifier.
     * 
     * <p><b>200</b> - User retrieved successfully.
     * @param userId The ID of the user. (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> retrieveUserWithHttpInfo(String userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling retrieveUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/organization/users/{user_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<User> returnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
