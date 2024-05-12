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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The Code Interpreter tool call definition.
 */
@Schema(description = "The Code Interpreter tool call definition.")


public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  @JsonProperty("input")
  private String input = null;

  @JsonProperty("outputs")
  private List<OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems> outputs = null;

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter input(String input) {
    this.input = input;
    return this;
  }

   /**
   * The input to the Code Interpreter tool call.
   * @return input
  **/
  @Schema(description = "The input to the Code Interpreter tool call.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter outputs(List<OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems> outputs) {
    this.outputs = outputs;
    return this;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter addOutputsItem(OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
   * @return outputs
  **/
  @Schema(description = "The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.")
  public List<OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<OneOfRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsItems> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter) o;
    return Objects.equals(this.input, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.input) &&
        Objects.equals(this.outputs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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