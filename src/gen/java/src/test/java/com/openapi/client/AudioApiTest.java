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

import com.openapi.client.model.AudioResponseFormat;
import java.math.BigDecimal;
import com.openapi.client.model.CreateSpeechRequest;
import java.io.File;
import com.openapi.client.model.InlineResponse200;
import com.openapi.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AudioApi
 */
@Ignore
public class AudioApiTest {

    private final AudioApi api = new AudioApi();

    /**
     * Generates audio from the input text.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpeechTest() {
        CreateSpeechRequest body = null;
        File response = api.createSpeech(body);

        // TODO: test validations
    }
    /**
     * Transcribes audio into the input language.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranscriptionTest() {
        File file = null;
        Object model = null;
        String language = null;
        String prompt = null;
        AudioResponseFormat responseFormat = null;
        BigDecimal temperature = null;
        List<String> timestampGranularities = null;
        InlineResponse200 response = api.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities);

        // TODO: test validations
    }
    /**
     * Translates audio into English.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTranslationTest() {
        File file = null;
        Object model = null;
        String prompt = null;
        AudioResponseFormat responseFormat = null;
        BigDecimal temperature = null;
        InlineResponse2001 response = api.createTranslation(file, model, prompt, responseFormat, temperature);

        // TODO: test validations
    }
}
