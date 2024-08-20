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
import com.openapi.client.model.CreateCompletionResponseLogprobs;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CreateCompletionResponseChoices
 */



public class CreateCompletionResponseChoices {
  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
   */
  public enum FinishReasonEnum {
    STOP("stop"),
    LENGTH("length"),
    CONTENT_FILTER("content_filter");

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

  @JsonProperty("logprobs")
  private CreateCompletionResponseLogprobs logprobs = null;

  @JsonProperty("text")
  private String text = null;

  public CreateCompletionResponseChoices finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
   * @return finishReason
  **/
  @Schema(required = true, description = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. ")
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }

  public CreateCompletionResponseChoices index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(required = true, description = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public CreateCompletionResponseChoices logprobs(CreateCompletionResponseLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Get logprobs
   * @return logprobs
  **/
  @Schema(required = true, description = "")
  public CreateCompletionResponseLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateCompletionResponseLogprobs logprobs) {
    this.logprobs = logprobs;
  }

  public CreateCompletionResponseChoices text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(required = true, description = "")
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
    CreateCompletionResponseChoices createCompletionResponseChoices = (CreateCompletionResponseChoices) o;
    return Objects.equals(this.finishReason, createCompletionResponseChoices.finishReason) &&
        Objects.equals(this.index, createCompletionResponseChoices.index) &&
        Objects.equals(this.logprobs, createCompletionResponseChoices.logprobs) &&
        Objects.equals(this.text, createCompletionResponseChoices.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishReason, index, logprobs, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoices {\n");
    
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
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
