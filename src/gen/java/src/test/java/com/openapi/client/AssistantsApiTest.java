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

import com.openapi.client.model.AssistantFileObject;
import com.openapi.client.model.AssistantObject;
import com.openapi.client.model.CreateAssistantFileRequest;
import com.openapi.client.model.CreateAssistantRequest;
import com.openapi.client.model.CreateMessageRequest;
import com.openapi.client.model.CreateRunRequest;
import com.openapi.client.model.CreateThreadAndRunRequest;
import com.openapi.client.model.CreateThreadRequest;
import com.openapi.client.model.DeleteAssistantFileResponse;
import com.openapi.client.model.DeleteAssistantResponse;
import com.openapi.client.model.DeleteThreadResponse;
import com.openapi.client.model.ListAssistantFilesResponse;
import com.openapi.client.model.ListAssistantsResponse;
import com.openapi.client.model.ListMessageFilesResponse;
import com.openapi.client.model.ListMessagesResponse;
import com.openapi.client.model.ListRunStepsResponse;
import com.openapi.client.model.ListRunsResponse;
import com.openapi.client.model.MessageFileObject;
import com.openapi.client.model.MessageObject;
import com.openapi.client.model.ModifyAssistantRequest;
import com.openapi.client.model.ModifyMessageRequest;
import com.openapi.client.model.ModifyRunRequest;
import com.openapi.client.model.ModifyThreadRequest;
import com.openapi.client.model.RunObject;
import com.openapi.client.model.RunStepObject;
import com.openapi.client.model.SubmitToolOutputsRunRequest;
import com.openapi.client.model.ThreadObject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssistantsApi
 */
@Ignore
public class AssistantsApiTest {

    private final AssistantsApi api = new AssistantsApi();

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelRunTest() {
        String threadId = null;
        String runId = null;
        RunObject response = api.cancelRun(threadId, runId);

        // TODO: test validations
    }
    /**
     * Create an assistant with a model and instructions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAssistantTest() {
        CreateAssistantRequest body = null;
        AssistantObject response = api.createAssistant(body);

        // TODO: test validations
    }
    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAssistantFileTest() {
        CreateAssistantFileRequest body = null;
        String assistantId = null;
        AssistantFileObject response = api.createAssistantFile(body, assistantId);

        // TODO: test validations
    }
    /**
     * Create a message.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessageTest() {
        CreateMessageRequest body = null;
        String threadId = null;
        MessageObject response = api.createMessage(body, threadId);

        // TODO: test validations
    }
    /**
     * Create a run.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRunTest() {
        CreateRunRequest body = null;
        String threadId = null;
        RunObject response = api.createRun(body, threadId);

        // TODO: test validations
    }
    /**
     * Create a thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createThreadTest() {
        CreateThreadRequest body = null;
        ThreadObject response = api.createThread(body);

        // TODO: test validations
    }
    /**
     * Create a thread and run it in one request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createThreadAndRunTest() {
        CreateThreadAndRunRequest body = null;
        RunObject response = api.createThreadAndRun(body);

        // TODO: test validations
    }
    /**
     * Delete an assistant.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAssistantTest() {
        String assistantId = null;
        DeleteAssistantResponse response = api.deleteAssistant(assistantId);

        // TODO: test validations
    }
    /**
     * Delete an assistant file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAssistantFileTest() {
        String assistantId = null;
        String fileId = null;
        DeleteAssistantFileResponse response = api.deleteAssistantFile(assistantId, fileId);

        // TODO: test validations
    }
    /**
     * Delete a thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteThreadTest() {
        String threadId = null;
        DeleteThreadResponse response = api.deleteThread(threadId);

        // TODO: test validations
    }
    /**
     * Retrieves an assistant.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssistantTest() {
        String assistantId = null;
        AssistantObject response = api.getAssistant(assistantId);

        // TODO: test validations
    }
    /**
     * Retrieves an AssistantFile.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssistantFileTest() {
        String assistantId = null;
        String fileId = null;
        AssistantFileObject response = api.getAssistantFile(assistantId, fileId);

        // TODO: test validations
    }
    /**
     * Retrieve a message.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTest() {
        String threadId = null;
        String messageId = null;
        MessageObject response = api.getMessage(threadId, messageId);

        // TODO: test validations
    }
    /**
     * Retrieves a message file.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageFileTest() {
        String threadId = null;
        String messageId = null;
        String fileId = null;
        MessageFileObject response = api.getMessageFile(threadId, messageId, fileId);

        // TODO: test validations
    }
    /**
     * Retrieves a run.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunTest() {
        String threadId = null;
        String runId = null;
        RunObject response = api.getRun(threadId, runId);

        // TODO: test validations
    }
    /**
     * Retrieves a run step.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRunStepTest() {
        String threadId = null;
        String runId = null;
        String stepId = null;
        RunStepObject response = api.getRunStep(threadId, runId, stepId);

        // TODO: test validations
    }
    /**
     * Retrieves a thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getThreadTest() {
        String threadId = null;
        ThreadObject response = api.getThread(threadId);

        // TODO: test validations
    }
    /**
     * Returns a list of assistant files.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAssistantFilesTest() {
        String assistantId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListAssistantFilesResponse response = api.listAssistantFiles(assistantId, limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Returns a list of assistants.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAssistantsTest() {
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListAssistantsResponse response = api.listAssistants(limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Returns a list of message files.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessageFilesTest() {
        String threadId = null;
        String messageId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListMessageFilesResponse response = api.listMessageFiles(threadId, messageId, limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Returns a list of messages for a given thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagesTest() {
        String threadId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListMessagesResponse response = api.listMessages(threadId, limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Returns a list of run steps belonging to a run.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRunStepsTest() {
        String threadId = null;
        String runId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListRunStepsResponse response = api.listRunSteps(threadId, runId, limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Returns a list of runs belonging to a thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRunsTest() {
        String threadId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListRunsResponse response = api.listRuns(threadId, limit, order, after, before);

        // TODO: test validations
    }
    /**
     * Modifies an assistant.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyAssistantTest() {
        ModifyAssistantRequest body = null;
        String assistantId = null;
        AssistantObject response = api.modifyAssistant(body, assistantId);

        // TODO: test validations
    }
    /**
     * Modifies a message.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyMessageTest() {
        ModifyMessageRequest body = null;
        String threadId = null;
        String messageId = null;
        MessageObject response = api.modifyMessage(body, threadId, messageId);

        // TODO: test validations
    }
    /**
     * Modifies a run.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyRunTest() {
        ModifyRunRequest body = null;
        String threadId = null;
        String runId = null;
        RunObject response = api.modifyRun(body, threadId, runId);

        // TODO: test validations
    }
    /**
     * Modifies a thread.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyThreadTest() {
        ModifyThreadRequest body = null;
        String threadId = null;
        ThreadObject response = api.modifyThread(body, threadId);

        // TODO: test validations
    }
    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#x27;re all completed. All outputs must be submitted in a single request. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitToolOuputsToRunTest() {
        SubmitToolOutputsRunRequest body = null;
        String threadId = null;
        String runId = null;
        RunObject response = api.submitToolOuputsToRun(body, threadId, runId);

        // TODO: test validations
    }
}