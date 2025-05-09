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

package com.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openapi.client.model.ChatCompletionMessageToolCalls;
import com.openapi.client.model.ChatCompletionRequestAssistantMessage;
import com.openapi.client.model.ChatCompletionRequestAssistantMessageFunctionCall;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * FineTuneChatCompletionRequestAssistantMessage
 */



public class FineTuneChatCompletionRequestAssistantMessage implements OneOfFinetuneChatRequestInputMessagesItems {
  @JsonProperty("content")
  private Object content = null;

  @JsonProperty("refusal")
  private String refusal = null;

  /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   */
  public enum RoleEnum {
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static RoleEnum fromValue(String input) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tool_calls")
  private ChatCompletionMessageToolCalls toolCalls = null;

  @JsonProperty("function_call")
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall = null;

  public FineTuneChatCompletionRequestAssistantMessage content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
   * @return content
  **/
  @Schema(description = "The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. ")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public FineTuneChatCompletionRequestAssistantMessage refusal(String refusal) {
    this.refusal = refusal;
    return this;
  }

   /**
   * The refusal message by the assistant.
   * @return refusal
  **/
  @Schema(description = "The refusal message by the assistant.")
  public String getRefusal() {
    return refusal;
  }

  public void setRefusal(String refusal) {
    this.refusal = refusal;
  }

  public FineTuneChatCompletionRequestAssistantMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   * @return role
  **/
  @Schema(required = true, description = "The role of the messages author, in this case `assistant`.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public FineTuneChatCompletionRequestAssistantMessage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
  **/
  @Schema(description = "An optional name for the participant. Provides the model information to differentiate between participants of the same role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FineTuneChatCompletionRequestAssistantMessage toolCalls(ChatCompletionMessageToolCalls toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

   /**
   * Get toolCalls
   * @return toolCalls
  **/
  @Schema(description = "")
  public ChatCompletionMessageToolCalls getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(ChatCompletionMessageToolCalls toolCalls) {
    this.toolCalls = toolCalls;
  }

  public FineTuneChatCompletionRequestAssistantMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  @Schema(description = "")
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneChatCompletionRequestAssistantMessage fineTuneChatCompletionRequestAssistantMessage = (FineTuneChatCompletionRequestAssistantMessage) o;
    return Objects.equals(this.content, fineTuneChatCompletionRequestAssistantMessage.content) &&
        Objects.equals(this.refusal, fineTuneChatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(this.role, fineTuneChatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, fineTuneChatCompletionRequestAssistantMessage.name) &&
        Objects.equals(this.toolCalls, fineTuneChatCompletionRequestAssistantMessage.toolCalls) &&
        Objects.equals(this.functionCall, fineTuneChatCompletionRequestAssistantMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, refusal, role, name, toolCalls, functionCall);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneChatCompletionRequestAssistantMessage {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
