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
import com.openapi.client.model.RunCompletionUsageCompletionTokenDetails;
import com.openapi.client.model.RunCompletionUsagePromptTokenDetails;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#x27;s status is &#x60;in_progress&#x60;.
 */
@Schema(description = "Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.")


public class RunStepCompletionUsage {
  @JsonProperty("completion_tokens")
  private Integer completionTokens = null;

  @JsonProperty("prompt_tokens")
  private Integer promptTokens = null;

  @JsonProperty("total_tokens")
  private Integer totalTokens = null;

  @JsonProperty("completion_token_details")
  private RunCompletionUsageCompletionTokenDetails completionTokenDetails = null;

  @JsonProperty("prompt_token_details")
  private RunCompletionUsagePromptTokenDetails promptTokenDetails = null;

  public RunStepCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

   /**
   * Number of completion tokens used over the course of the run step.
   * @return completionTokens
  **/
  @Schema(required = true, description = "Number of completion tokens used over the course of the run step.")
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public RunStepCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Number of prompt tokens used over the course of the run step.
   * @return promptTokens
  **/
  @Schema(required = true, description = "Number of prompt tokens used over the course of the run step.")
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public RunStepCompletionUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * Total number of tokens used (prompt + completion).
   * @return totalTokens
  **/
  @Schema(required = true, description = "Total number of tokens used (prompt + completion).")
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  public RunStepCompletionUsage completionTokenDetails(RunCompletionUsageCompletionTokenDetails completionTokenDetails) {
    this.completionTokenDetails = completionTokenDetails;
    return this;
  }

   /**
   * Get completionTokenDetails
   * @return completionTokenDetails
  **/
  @Schema(description = "")
  public RunCompletionUsageCompletionTokenDetails getCompletionTokenDetails() {
    return completionTokenDetails;
  }

  public void setCompletionTokenDetails(RunCompletionUsageCompletionTokenDetails completionTokenDetails) {
    this.completionTokenDetails = completionTokenDetails;
  }

  public RunStepCompletionUsage promptTokenDetails(RunCompletionUsagePromptTokenDetails promptTokenDetails) {
    this.promptTokenDetails = promptTokenDetails;
    return this;
  }

   /**
   * Get promptTokenDetails
   * @return promptTokenDetails
  **/
  @Schema(description = "")
  public RunCompletionUsagePromptTokenDetails getPromptTokenDetails() {
    return promptTokenDetails;
  }

  public void setPromptTokenDetails(RunCompletionUsagePromptTokenDetails promptTokenDetails) {
    this.promptTokenDetails = promptTokenDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepCompletionUsage runStepCompletionUsage = (RunStepCompletionUsage) o;
    return Objects.equals(this.completionTokens, runStepCompletionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, runStepCompletionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, runStepCompletionUsage.totalTokens) &&
        Objects.equals(this.completionTokenDetails, runStepCompletionUsage.completionTokenDetails) &&
        Objects.equals(this.promptTokenDetails, runStepCompletionUsage.promptTokenDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens, completionTokenDetails, promptTokenDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepCompletionUsage {\n");
    
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
    sb.append("    completionTokenDetails: ").append(toIndentedString(completionTokenDetails)).append("\n");
    sb.append("    promptTokenDetails: ").append(toIndentedString(promptTokenDetails)).append("\n");
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
