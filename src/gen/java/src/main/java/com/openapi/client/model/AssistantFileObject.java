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
/**
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */
@Schema(description = "A list of [Files](/docs/api-reference/files) attached to an `assistant`.")


public class AssistantFileObject {
  @JsonProperty("id")
  private String id = null;

  /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   */
  public enum ObjectEnum {
    ASSISTANT_FILE("assistant.file");

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

  @JsonProperty("created_at")
  private Integer createdAt = null;

  @JsonProperty("assistant_id")
  private String assistantId = null;

  public AssistantFileObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @Schema(required = true, description = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssistantFileObject object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;assistant.file&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `assistant.file`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public AssistantFileObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the assistant file was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the assistant file was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public AssistantFileObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The assistant ID that the file is attached to.
   * @return assistantId
  **/
  @Schema(required = true, description = "The assistant ID that the file is attached to.")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantFileObject assistantFileObject = (AssistantFileObject) o;
    return Objects.equals(this.id, assistantFileObject.id) &&
        Objects.equals(this.object, assistantFileObject.object) &&
        Objects.equals(this.createdAt, assistantFileObject.createdAt) &&
        Objects.equals(this.assistantId, assistantFileObject.assistantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, object, createdAt, assistantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantFileObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
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