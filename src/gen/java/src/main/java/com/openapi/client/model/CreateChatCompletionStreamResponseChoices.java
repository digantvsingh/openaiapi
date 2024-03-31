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
import com.openapi.client.model.ChatCompletionStreamResponseDelta;
import com.openapi.client.model.CreateChatCompletionResponseLogprobs;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CreateChatCompletionStreamResponseChoices
 */



public class CreateChatCompletionStreamResponseChoices {
  @JsonProperty("delta")
  private ChatCompletionStreamResponseDelta delta = null;

  @JsonProperty("logprobs")
  private CreateChatCompletionResponseLogprobs logprobs = null;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   */
  public enum FinishReasonEnum {
    STOP("stop"),
    LENGTH("length"),
    TOOL_CALLS("tool_calls"),
    CONTENT_FILTER("content_filter"),
    FUNCTION_CALL("function_call");

    private String value;

    FinishReasonEnum(String value) {
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
    public static FinishReasonEnum fromValue(String input) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("finish_reason")
  private FinishReasonEnum finishReason = null;

  @JsonProperty("index")
  private Integer index = null;

  public CreateChatCompletionStreamResponseChoices delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @Schema(required = true, description = "")
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }

  public CreateChatCompletionStreamResponseChoices logprobs(CreateChatCompletionResponseLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Get logprobs
   * @return logprobs
  **/
  @Schema(description = "")
  public CreateChatCompletionResponseLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateChatCompletionResponseLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  public CreateChatCompletionStreamResponseChoices finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   * @return finishReason
  **/
  @Schema(required = true, description = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. ")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  public CreateChatCompletionStreamResponseChoices index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the choice in the list of choices.
   * @return index
  **/
  @Schema(required = true, description = "The index of the choice in the list of choices.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponseChoices createChatCompletionStreamResponseChoices = (CreateChatCompletionStreamResponseChoices) o;
    return Objects.equals(this.delta, createChatCompletionStreamResponseChoices.delta) &&
        Objects.equals(this.logprobs, createChatCompletionStreamResponseChoices.logprobs) &&
        Objects.equals(this.finishReason, createChatCompletionStreamResponseChoices.finishReason) &&
        Objects.equals(this.index, createChatCompletionStreamResponseChoices.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, logprobs, finishReason, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponseChoices {\n");
    
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
