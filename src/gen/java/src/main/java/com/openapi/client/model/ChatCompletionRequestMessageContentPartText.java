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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ChatCompletionRequestMessageContentPartText
 */



public class ChatCompletionRequestMessageContentPartText implements ChatCompletionRequestAssistantMessageContentPart, ChatCompletionRequestSystemMessageContentPart, ChatCompletionRequestToolMessageContentPart, ChatCompletionRequestUserMessageContentPart {
  /**
   * The type of the content part.
   */
  public enum TypeEnum {
    TEXT("text");

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

  @JsonProperty("text")
  private String text = null;

  public ChatCompletionRequestMessageContentPartText type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the content part.
   * @return type
  **/
  @Schema(required = true, description = "The type of the content part.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChatCompletionRequestMessageContentPartText text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text content.
   * @return text
  **/
  @Schema(required = true, description = "The text content.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageContentPartText chatCompletionRequestMessageContentPartText = (ChatCompletionRequestMessageContentPartText) o;
    return Objects.equals(this.type, chatCompletionRequestMessageContentPartText.type) &&
        Objects.equals(this.text, chatCompletionRequestMessageContentPartText.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageContentPartText {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
