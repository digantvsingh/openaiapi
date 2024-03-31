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

package com.openapi.client.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* ChatCompletionRequestMessage
*/
@JsonSubTypes({
  @JsonSubTypes.Type(value = ChatCompletionRequestSystemMessage.class, name = "ChatCompletionRequestSystemMessage"),
  @JsonSubTypes.Type(value = ChatCompletionRequestUserMessage.class, name = "ChatCompletionRequestUserMessage"),
  @JsonSubTypes.Type(value = ChatCompletionRequestAssistantMessage.class, name = "ChatCompletionRequestAssistantMessage"),
  @JsonSubTypes.Type(value = ChatCompletionRequestToolMessage.class, name = "ChatCompletionRequestToolMessage"),
  @JsonSubTypes.Type(value = ChatCompletionRequestFunctionMessage.class, name = "ChatCompletionRequestFunctionMessage")
})
public interface ChatCompletionRequestMessage {

}