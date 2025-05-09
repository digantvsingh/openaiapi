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
import com.openapi.client.model.RunStepDeltaObjectDelta;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */
@Schema(description = "Represents a run step delta i.e. any changed fields on a run step during streaming. ")


public class RunStepDeltaObject implements  AssistantStreamEvent {
  @JsonProperty("id")
  private String id = null;

  /**
   * The object type, which is always &#x60;thread.run.step.delta&#x60;.
   */
  public enum ObjectEnum {
    THREAD_RUN_STEP_DELTA("thread.run.step.delta");

    private String value;

    ObjectEnum(String value) {
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
    public static ObjectEnum fromValue(String input) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("object")
  private ObjectEnum object = null;

  @JsonProperty("delta")
  private RunStepDeltaObjectDelta delta = null;

  public RunStepDeltaObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
  **/
  @Schema(required = true, description = "The identifier of the run step, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepDeltaObject object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;thread.run.step.delta&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `thread.run.step.delta`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public RunStepDeltaObject delta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @Schema(required = true, description = "")
  public RunStepDeltaObjectDelta getDelta() {
    return delta;
  }

  public void setDelta(RunStepDeltaObjectDelta delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaObject runStepDeltaObject = (RunStepDeltaObject) o;
    return Objects.equals(this.id, runStepDeltaObject.id) &&
        Objects.equals(this.object, runStepDeltaObject.object) &&
        Objects.equals(this.delta, runStepDeltaObject.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, object, delta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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
