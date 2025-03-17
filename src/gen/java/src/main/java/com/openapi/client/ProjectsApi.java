package com.openapi.client;

import com.openapi.ApiClient;

import com.openapi.client.model.ErrorResponse;
import com.openapi.client.model.Project;
import com.openapi.client.model.ProjectApiKey;
import com.openapi.client.model.ProjectApiKeyDeleteResponse;
import com.openapi.client.model.ProjectApiKeyListResponse;
import com.openapi.client.model.ProjectCreateRequest;
import com.openapi.client.model.ProjectListResponse;
import com.openapi.client.model.ProjectServiceAccount;
import com.openapi.client.model.ProjectServiceAccountCreateRequest;
import com.openapi.client.model.ProjectServiceAccountCreateResponse;
import com.openapi.client.model.ProjectServiceAccountDeleteResponse;
import com.openapi.client.model.ProjectServiceAccountListResponse;
import com.openapi.client.model.ProjectUpdateRequest;
import com.openapi.client.model.ProjectUser;
import com.openapi.client.model.ProjectUserCreateRequest;
import com.openapi.client.model.ProjectUserDeleteResponse;
import com.openapi.client.model.ProjectUserListResponse;
import com.openapi.client.model.ProjectUserUpdateRequest;

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


@Component("com.openapi.client.ProjectsApi")
public class ProjectsApi {
    private ApiClient apiClient;

    public ProjectsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * 
     * <p><b>200</b> - Project archived successfully.
     * @param projectId The ID of the project. (required)
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project archiveProject(String projectId) throws RestClientException {
        return archiveProjectWithHttpInfo(projectId).getBody();
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * 
     * <p><b>200</b> - Project archived successfully.
     * @param projectId The ID of the project. (required)
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> archiveProjectWithHttpInfo(String projectId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling archiveProject");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/archive").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * 
     * <p><b>200</b> - Project created successfully.
     * @param body The project create request payload. (required)
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project createProject(ProjectCreateRequest body) throws RestClientException {
        return createProjectWithHttpInfo(body).getBody();
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * 
     * <p><b>200</b> - Project created successfully.
     * @param body The project create request payload. (required)
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> createProjectWithHttpInfo(ProjectCreateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createProject");
        }
        String path = UriComponentsBuilder.fromPath("/organization/projects").build().toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * 
     * <p><b>200</b> - Project service account created successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param body The project service account create request payload. (required)
     * @param projectId The ID of the project. (required)
     * @return ProjectServiceAccountCreateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectServiceAccountCreateResponse createProjectServiceAccount(ProjectServiceAccountCreateRequest body, String projectId) throws RestClientException {
        return createProjectServiceAccountWithHttpInfo(body, projectId).getBody();
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * 
     * <p><b>200</b> - Project service account created successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param body The project service account create request payload. (required)
     * @param projectId The ID of the project. (required)
     * @return ResponseEntity&lt;ProjectServiceAccountCreateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectServiceAccountCreateResponse> createProjectServiceAccountWithHttpInfo(ProjectServiceAccountCreateRequest body, String projectId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createProjectServiceAccount");
        }
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createProjectServiceAccount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/service_accounts").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectServiceAccountCreateResponse> returnType = new ParameterizedTypeReference<ProjectServiceAccountCreateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * 
     * <p><b>200</b> - User added to project successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param body The project user create request payload. (required)
     * @param projectId The ID of the project. (required)
     * @return ProjectUser
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectUser createProjectUser(ProjectUserCreateRequest body, String projectId) throws RestClientException {
        return createProjectUserWithHttpInfo(body, projectId).getBody();
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * 
     * <p><b>200</b> - User added to project successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param body The project user create request payload. (required)
     * @param projectId The ID of the project. (required)
     * @return ResponseEntity&lt;ProjectUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectUser> createProjectUserWithHttpInfo(ProjectUserCreateRequest body, String projectId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createProjectUser");
        }
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createProjectUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectUser> returnType = new ParameterizedTypeReference<ProjectUser>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes an API key from the project.
     * 
     * <p><b>200</b> - Project API key deleted successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ProjectApiKeyDeleteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectApiKeyDeleteResponse deleteProjectApiKey(String projectId, String keyId) throws RestClientException {
        return deleteProjectApiKeyWithHttpInfo(projectId, keyId).getBody();
    }

    /**
     * Deletes an API key from the project.
     * 
     * <p><b>200</b> - Project API key deleted successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ResponseEntity&lt;ProjectApiKeyDeleteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectApiKeyDeleteResponse> deleteProjectApiKeyWithHttpInfo(String projectId, String keyId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteProjectApiKey");
        }
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyId' when calling deleteProjectApiKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("key_id", keyId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/api_keys/{key_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectApiKeyDeleteResponse> returnType = new ParameterizedTypeReference<ProjectApiKeyDeleteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a service account from the project.
     * 
     * <p><b>200</b> - Project service account deleted successfully.
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ProjectServiceAccountDeleteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(String projectId, String serviceAccountId) throws RestClientException {
        return deleteProjectServiceAccountWithHttpInfo(projectId, serviceAccountId).getBody();
    }

    /**
     * Deletes a service account from the project.
     * 
     * <p><b>200</b> - Project service account deleted successfully.
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ResponseEntity&lt;ProjectServiceAccountDeleteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectServiceAccountDeleteResponse> deleteProjectServiceAccountWithHttpInfo(String projectId, String serviceAccountId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteProjectServiceAccount");
        }
        // verify the required parameter 'serviceAccountId' is set
        if (serviceAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAccountId' when calling deleteProjectServiceAccount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("service_account_id", serviceAccountId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/service_accounts/{service_account_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectServiceAccountDeleteResponse> returnType = new ParameterizedTypeReference<ProjectServiceAccountDeleteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a user from the project.
     * 
     * <p><b>200</b> - Project user deleted successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ProjectUserDeleteResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectUserDeleteResponse deleteProjectUser(String projectId, String userId) throws RestClientException {
        return deleteProjectUserWithHttpInfo(projectId, userId).getBody();
    }

    /**
     * Deletes a user from the project.
     * 
     * <p><b>200</b> - Project user deleted successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ResponseEntity&lt;ProjectUserDeleteResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectUserDeleteResponse> deleteProjectUserWithHttpInfo(String projectId, String userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteProjectUser");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deleteProjectUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/users/{user_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectUserDeleteResponse> returnType = new ParameterizedTypeReference<ProjectUserDeleteResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of API keys in the project.
     * 
     * <p><b>200</b> - Project API keys listed successfully.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectApiKeyListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectApiKeyListResponse listProjectApiKeys(String projectId, Integer limit, String after) throws RestClientException {
        return listProjectApiKeysWithHttpInfo(projectId, limit, after).getBody();
    }

    /**
     * Returns a list of API keys in the project.
     * 
     * <p><b>200</b> - Project API keys listed successfully.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;ProjectApiKeyListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectApiKeyListResponse> listProjectApiKeysWithHttpInfo(String projectId, Integer limit, String after) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling listProjectApiKeys");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/api_keys").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectApiKeyListResponse> returnType = new ParameterizedTypeReference<ProjectApiKeyListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of service accounts in the project.
     * 
     * <p><b>200</b> - Project service accounts listed successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectServiceAccountListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectServiceAccountListResponse listProjectServiceAccounts(String projectId, Integer limit, String after) throws RestClientException {
        return listProjectServiceAccountsWithHttpInfo(projectId, limit, after).getBody();
    }

    /**
     * Returns a list of service accounts in the project.
     * 
     * <p><b>200</b> - Project service accounts listed successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;ProjectServiceAccountListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectServiceAccountListResponse> listProjectServiceAccountsWithHttpInfo(String projectId, Integer limit, String after) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling listProjectServiceAccounts");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/service_accounts").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectServiceAccountListResponse> returnType = new ParameterizedTypeReference<ProjectServiceAccountListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of users in the project.
     * 
     * <p><b>200</b> - Project users listed successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ProjectUserListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectUserListResponse listProjectUsers(String projectId, Integer limit, String after) throws RestClientException {
        return listProjectUsersWithHttpInfo(projectId, limit, after).getBody();
    }

    /**
     * Returns a list of users in the project.
     * 
     * <p><b>200</b> - Project users listed successfully.
     * <p><b>400</b> - Error response when project is archived.
     * @param projectId The ID of the project. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @return ResponseEntity&lt;ProjectUserListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectUserListResponse> listProjectUsersWithHttpInfo(String projectId, Integer limit, String after) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling listProjectUsers");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectUserListResponse> returnType = new ParameterizedTypeReference<ProjectUserListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of projects.
     * 
     * <p><b>200</b> - Projects listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param includeArchived If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. (optional, default to false)
     * @return ProjectListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectListResponse listProjects(Integer limit, String after, Boolean includeArchived) throws RestClientException {
        return listProjectsWithHttpInfo(limit, after, includeArchived).getBody();
    }

    /**
     * Returns a list of projects.
     * 
     * <p><b>200</b> - Projects listed successfully.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param includeArchived If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. (optional, default to false)
     * @return ResponseEntity&lt;ProjectListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectListResponse> listProjectsWithHttpInfo(Integer limit, String after, Boolean includeArchived) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/organization/projects").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_archived", includeArchived));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<ProjectListResponse> returnType = new ParameterizedTypeReference<ProjectListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a project in the organization.
     * 
     * <p><b>200</b> - Project updated successfully.
     * <p><b>400</b> - Error response when updating the default project.
     * @param body The project update request payload. (required)
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project modifyProject(ProjectUpdateRequest body) throws RestClientException {
        return modifyProjectWithHttpInfo(body).getBody();
    }

    /**
     * Modifies a project in the organization.
     * 
     * <p><b>200</b> - Project updated successfully.
     * <p><b>400</b> - Error response when updating the default project.
     * @param body The project update request payload. (required)
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> modifyProjectWithHttpInfo(ProjectUpdateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyProject");
        }
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}").build().toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Modifies a user&#x27;s role in the project.
     * 
     * <p><b>200</b> - Project user&#x27;s role updated successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param body The project user update request payload. (required)
     * @return ProjectUser
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectUser modifyProjectUser(ProjectUserUpdateRequest body) throws RestClientException {
        return modifyProjectUserWithHttpInfo(body).getBody();
    }

    /**
     * Modifies a user&#x27;s role in the project.
     * 
     * <p><b>200</b> - Project user&#x27;s role updated successfully.
     * <p><b>400</b> - Error response for various conditions.
     * @param body The project user update request payload. (required)
     * @return ResponseEntity&lt;ProjectUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectUser> modifyProjectUserWithHttpInfo(ProjectUserUpdateRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling modifyProjectUser");
        }
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/users/{user_id}").build().toUriString();
        
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

        ParameterizedTypeReference<ProjectUser> returnType = new ParameterizedTypeReference<ProjectUser>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a project.
     * 
     * <p><b>200</b> - Project retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project retrieveProject(String projectId) throws RestClientException {
        return retrieveProjectWithHttpInfo(projectId).getBody();
    }

    /**
     * Retrieves a project.
     * 
     * <p><b>200</b> - Project retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> retrieveProjectWithHttpInfo(String projectId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling retrieveProject");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Project> returnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves an API key in the project.
     * 
     * <p><b>200</b> - Project API key retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ProjectApiKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectApiKey retrieveProjectApiKey(String projectId, String keyId) throws RestClientException {
        return retrieveProjectApiKeyWithHttpInfo(projectId, keyId).getBody();
    }

    /**
     * Retrieves an API key in the project.
     * 
     * <p><b>200</b> - Project API key retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param keyId The ID of the API key. (required)
     * @return ResponseEntity&lt;ProjectApiKey&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectApiKey> retrieveProjectApiKeyWithHttpInfo(String projectId, String keyId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling retrieveProjectApiKey");
        }
        // verify the required parameter 'keyId' is set
        if (keyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'keyId' when calling retrieveProjectApiKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("key_id", keyId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/api_keys/{key_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectApiKey> returnType = new ParameterizedTypeReference<ProjectApiKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a service account in the project.
     * 
     * <p><b>200</b> - Project service account retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ProjectServiceAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectServiceAccount retrieveProjectServiceAccount(String projectId, String serviceAccountId) throws RestClientException {
        return retrieveProjectServiceAccountWithHttpInfo(projectId, serviceAccountId).getBody();
    }

    /**
     * Retrieves a service account in the project.
     * 
     * <p><b>200</b> - Project service account retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param serviceAccountId The ID of the service account. (required)
     * @return ResponseEntity&lt;ProjectServiceAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectServiceAccount> retrieveProjectServiceAccountWithHttpInfo(String projectId, String serviceAccountId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling retrieveProjectServiceAccount");
        }
        // verify the required parameter 'serviceAccountId' is set
        if (serviceAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceAccountId' when calling retrieveProjectServiceAccount");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("service_account_id", serviceAccountId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/service_accounts/{service_account_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectServiceAccount> returnType = new ParameterizedTypeReference<ProjectServiceAccount>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a user in the project.
     * 
     * <p><b>200</b> - Project user retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ProjectUser
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectUser retrieveProjectUser(String projectId, String userId) throws RestClientException {
        return retrieveProjectUserWithHttpInfo(projectId, userId).getBody();
    }

    /**
     * Retrieves a user in the project.
     * 
     * <p><b>200</b> - Project user retrieved successfully.
     * @param projectId The ID of the project. (required)
     * @param userId The ID of the user. (required)
     * @return ResponseEntity&lt;ProjectUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectUser> retrieveProjectUserWithHttpInfo(String projectId, String userId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling retrieveProjectUser");
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling retrieveProjectUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("user_id", userId);
        String path = UriComponentsBuilder.fromPath("/organization/projects/{project_id}/users/{user_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectUser> returnType = new ParameterizedTypeReference<ProjectUser>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
