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
import com.openapi.client.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * RunStepDeltaStepDetailsToolCallsFunctionObject
 */



public class RunStepDeltaStepDetailsToolCallsFunctionObject implements OneOfRunStepDeltaStepDetailsToolCallsObjectToolCallsItems {
  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
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
  private RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function = null;

  public RunStepDeltaStepDetailsToolCallsFunctionObject index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the tool call in the tool calls array.
   * @return index
  **/
  @Schema(required = true, description = "The index of the tool call in the tool calls array.")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsFunctionObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the tool call object.
   * @return id
  **/
  @Schema(description = "The ID of the tool call object.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaStepDetailsToolCallsFunctionObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
   * @return type
  **/
  @Schema(required = true, description = "The type of tool call. This is always going to be `function` for this type of tool call.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsFunctionObject function(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @Schema(description = "")
  public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }

  public void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function) {
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
    RunStepDeltaStepDetailsToolCallsFunctionObject runStepDeltaStepDetailsToolCallsFunctionObject = (RunStepDeltaStepDetailsToolCallsFunctionObject) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsFunctionObject.index) &&
        Objects.equals(this.id, runStepDeltaStepDetailsToolCallsFunctionObject.id) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsFunctionObject.type) &&
        Objects.equals(this.function, runStepDeltaStepDetailsToolCallsFunctionObject.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, id, type, function);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsFunctionObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
