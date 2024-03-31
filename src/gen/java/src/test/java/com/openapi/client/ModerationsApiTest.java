/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.openapi.client;

import com.openapi.client.model.CreateModerationRequest;
import com.openapi.client.model.CreateModerationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModerationsApi
 */
@Ignore
public class ModerationsApiTest {

    private final ModerationsApi api = new ModerationsApi();

    /**
     * Classifies if text is potentially harmful.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModerationTest() {
        CreateModerationRequest body = null;
        CreateModerationResponse response = api.createModeration(body);

        // TODO: test validations
    }
}
