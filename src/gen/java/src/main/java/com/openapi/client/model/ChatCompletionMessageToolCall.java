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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openapi.client.model.ChatCompletionMessageToolCallFunction;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ChatCompletionMessageToolCall
 */



public class ChatCompletionMessageToolCall {
  @JsonProperty("id")
  private String id = null;

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   */
  public enum TypeEnum {
    FUNCTION("function");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("function")
  private ChatCompletionMessageToolCallFunction function = null;

  public ChatCompletionMessageToolCall id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the tool call.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChatCompletionMessageToolCall type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   * @return type
  **/
  @Schema(required = true, description = "The type of the tool. Currently, only `function` is supported.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionMessageToolCall function(ChatCompletionMessageToolCallFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @Schema(required = true, description = "")
  public ChatCompletionMessageToolCallFunction getFunction() {
    return function;
  }

  public void setFunction(ChatCompletionMessageToolCallFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionMessageToolCall chatCompletionMessageToolCall = (ChatCompletionMessageToolCall) o;
    return Objects.equals(this.id, chatCompletionMessageToolCall.id) &&
        Objects.equals(this.type, chatCompletionMessageToolCall.type) &&
        Objects.equals(this.function, chatCompletionMessageToolCall.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, function);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionMessageToolCall {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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
