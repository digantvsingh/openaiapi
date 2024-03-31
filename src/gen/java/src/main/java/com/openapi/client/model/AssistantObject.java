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
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */
@Schema(description = "Represents an `assistant` that can call the model and use tools.")


public class AssistantObject {
  @JsonProperty("id")
  private String id = null;

  /**
   * The object type, which is always &#x60;assistant&#x60;.
   */
  public enum ObjectEnum {
    ASSISTANT("assistant");

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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("instructions")
  private String instructions = null;

  @JsonProperty("tools")
  private List<OneOfAssistantObjectToolsItems> tools = new ArrayList<OneOfAssistantObjectToolsItems>();

  @JsonProperty("file_ids")
  private List<String> fileIds = new ArrayList<String>();

  @JsonProperty("metadata")
  private Object metadata = null;

  public AssistantObject id(String id) {
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

  public AssistantObject object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;assistant&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `assistant`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public AssistantObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the assistant was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the assistant was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public AssistantObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
  **/
  @Schema(required = true, description = "The name of the assistant. The maximum length is 256 characters. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssistantObject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
  **/
  @Schema(required = true, description = "The description of the assistant. The maximum length is 512 characters. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssistantObject model(String model) {
    this.model = model;
    return this;
  }

   /**
   * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
   * @return model
  **/
  @Schema(required = true, description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public AssistantObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The system instructions that the assistant uses. The maximum length is 32768 characters. 
   * @return instructions
  **/
  @Schema(required = true, description = "The system instructions that the assistant uses. The maximum length is 32768 characters. ")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public AssistantObject tools(List<OneOfAssistantObjectToolsItems> tools) {
    this.tools = tools;
    return this;
  }

  public AssistantObject addToolsItem(OneOfAssistantObjectToolsItems toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
   * @return tools
  **/
  @Schema(required = true, description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
  public List<OneOfAssistantObjectToolsItems> getTools() {
    return tools;
  }

  public void setTools(List<OneOfAssistantObjectToolsItems> tools) {
    this.tools = tools;
  }

  public AssistantObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AssistantObject addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
   * @return fileIds
  **/
  @Schema(required = true, description = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public AssistantObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @Schema(required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantObject assistantObject = (AssistantObject) o;
    return Objects.equals(this.id, assistantObject.id) &&
        Objects.equals(this.object, assistantObject.object) &&
        Objects.equals(this.createdAt, assistantObject.createdAt) &&
        Objects.equals(this.name, assistantObject.name) &&
        Objects.equals(this.description, assistantObject.description) &&
        Objects.equals(this.model, assistantObject.model) &&
        Objects.equals(this.instructions, assistantObject.instructions) &&
        Objects.equals(this.tools, assistantObject.tools) &&
        Objects.equals(this.fileIds, assistantObject.fileIds) &&
        Objects.equals(this.metadata, assistantObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, object, createdAt, name, description, model, instructions, tools, fileIds, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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