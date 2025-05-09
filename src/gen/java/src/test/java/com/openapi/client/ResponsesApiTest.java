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

import com.openapi.client.model.CreateResponse;
import com.openapi.client.model.Error;
import com.openapi.client.model.Includable;
import com.openapi.client.model.Response;
import com.openapi.client.model.ResponseItemList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResponsesApi
 */
@Ignore
public class ResponsesApiTest {

    private final ResponsesApi api = new ResponsesApi();

    /**
     * Creates a model response. Provide [text](/docs/guides/text) or [image](/docs/guides/images) inputs to generate [text](/docs/guides/text) or [JSON](/docs/guides/structured-outputs) outputs. Have the model call your own [custom code](/docs/guides/function-calling) or use built-in [tools](/docs/guides/tools) like [web search](/docs/guides/tools-web-search) or [file search](/docs/guides/tools-file-search) to use your own data as input for the model&#x27;s response. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createResponseTest() {
        CreateResponse body = null;
        Response response = api.createResponse(body);

        // TODO: test validations
    }
    /**
     * Deletes a model response with the given ID. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteResponseTest() {
        String responseId = null;
        api.deleteResponse(responseId);

        // TODO: test validations
    }
    /**
     * Retrieves a model response with the given ID. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResponseTest() {
        String responseId = null;
        List<Includable> include = null;
        Response response = api.getResponse(responseId, include);

        // TODO: test validations
    }
    /**
     * Returns a list of input items for a given response.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInputItemsTest() {
        String responseId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ResponseItemList response = api.listInputItems(responseId, limit, order, after, before);

        // TODO: test validations
    }
}
