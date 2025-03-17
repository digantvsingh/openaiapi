/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.openapi.client;

import com.openapi.client.model.Invite;
import com.openapi.client.model.InviteDeleteResponse;
import com.openapi.client.model.InviteListResponse;
import com.openapi.client.model.InviteRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitesApi
 */
@Ignore
public class InvitesApiTest {

    private final InvitesApi api = new InvitesApi();

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInviteTest() {
        String inviteId = null;
        InviteDeleteResponse response = api.deleteInvite(inviteId);

        // TODO: test validations
    }
    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inviteUserTest() {
        InviteRequest body = null;
        Invite response = api.inviteUser(body);

        // TODO: test validations
    }
    /**
     * Returns a list of invites in the organization.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInvitesTest() {
        Integer limit = null;
        String after = null;
        InviteListResponse response = api.listInvites(limit, after);

        // TODO: test validations
    }
    /**
     * Retrieves an invite.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInviteTest() {
        String inviteId = null;
        Invite response = api.retrieveInvite(inviteId);

        // TODO: test validations
    }
}
