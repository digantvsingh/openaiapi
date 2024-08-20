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
import com.openapi.client.model.RunToolCallObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details on the tool outputs needed for this run to continue.
 */
@Schema(description = "Details on the tool outputs needed for this run to continue.")


public class RunObjectRequiredActionSubmitToolOutputs {
  @JsonProperty("tool_calls")
  private List<RunToolCallObject> toolCalls = new ArrayList<RunToolCallObject>();

  public RunObjectRequiredActionSubmitToolOutputs toolCalls(List<RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public RunObjectRequiredActionSubmitToolOutputs addToolCallsItem(RunToolCallObject toolCallsItem) {
    this.toolCalls.add(toolCallsItem);
    return this;
  }

   /**
   * A list of the relevant tool calls.
   * @return toolCalls
  **/
  @Schema(required = true, description = "A list of the relevant tool calls.")
  public List<RunToolCallObject> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<RunToolCallObject> toolCalls) {
    this.toolCalls = toolCalls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObjectRequiredActionSubmitToolOutputs runObjectRequiredActionSubmitToolOutputs = (RunObjectRequiredActionSubmitToolOutputs) o;
    return Objects.equals(this.toolCalls, runObjectRequiredActionSubmitToolOutputs.toolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCalls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObjectRequiredActionSubmitToolOutputs {\n");
    
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
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
