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
 * SubmitToolOutputsRunRequestToolOutputs
 */



public class SubmitToolOutputsRunRequestToolOutputs {
  @JsonProperty("tool_call_id")
  private String toolCallId = null;

  @JsonProperty("output")
  private String output = null;

  public SubmitToolOutputsRunRequestToolOutputs toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
  }

   /**
   * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
   * @return toolCallId
  **/
  @Schema(description = "The ID of the tool call in the `required_action` object within the run object the output is being submitted for.")
  public String getToolCallId() {
    return toolCallId;
  }

  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public SubmitToolOutputsRunRequestToolOutputs output(String output) {
    this.output = output;
    return this;
  }

   /**
   * The output of the tool call to be submitted to continue the run.
   * @return output
  **/
  @Schema(description = "The output of the tool call to be submitted to continue the run.")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequestToolOutputs submitToolOutputsRunRequestToolOutputs = (SubmitToolOutputsRunRequestToolOutputs) o;
    return Objects.equals(this.toolCallId, submitToolOutputsRunRequestToolOutputs.toolCallId) &&
        Objects.equals(this.output, submitToolOutputsRunRequestToolOutputs.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCallId, output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitToolOutputsRunRequestToolOutputs {\n");
    
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
