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
 * ModifyAssistantRequest
 */



public class ModifyAssistantRequest {
  @JsonProperty("model")
  private AnyOfModifyAssistantRequestModel model = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("instructions")
  private String instructions = null;

  @JsonProperty("tools")
  private List<OneOfModifyAssistantRequestToolsItems> tools = null;

  @JsonProperty("file_ids")
  private List<String> fileIds = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public ModifyAssistantRequest model(AnyOfModifyAssistantRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
   * @return model
  **/
  @Schema(description = "ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. ")
  public AnyOfModifyAssistantRequestModel getModel() {
    return model;
  }

  public void setModel(AnyOfModifyAssistantRequestModel model) {
    this.model = model;
  }

  public ModifyAssistantRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
  **/
  @Schema(description = "The name of the assistant. The maximum length is 256 characters. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModifyAssistantRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
  **/
  @Schema(description = "The description of the assistant. The maximum length is 512 characters. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyAssistantRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The system instructions that the assistant uses. The maximum length is 32768 characters. 
   * @return instructions
  **/
  @Schema(description = "The system instructions that the assistant uses. The maximum length is 32768 characters. ")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public ModifyAssistantRequest tools(List<OneOfModifyAssistantRequestToolsItems> tools) {
    this.tools = tools;
    return this;
  }

  public ModifyAssistantRequest addToolsItem(OneOfModifyAssistantRequestToolsItems toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<OneOfModifyAssistantRequestToolsItems>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
   * @return tools
  **/
  @Schema(description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
  public List<OneOfModifyAssistantRequestToolsItems> getTools() {
    return tools;
  }

  public void setTools(List<OneOfModifyAssistantRequestToolsItems> tools) {
    this.tools = tools;
  }

  public ModifyAssistantRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public ModifyAssistantRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<String>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
   * @return fileIds
  **/
  @Schema(description = "A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. ")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public ModifyAssistantRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @Schema(description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
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
    ModifyAssistantRequest modifyAssistantRequest = (ModifyAssistantRequest) o;
    return Objects.equals(this.model, modifyAssistantRequest.model) &&
        Objects.equals(this.name, modifyAssistantRequest.name) &&
        Objects.equals(this.description, modifyAssistantRequest.description) &&
        Objects.equals(this.instructions, modifyAssistantRequest.instructions) &&
        Objects.equals(this.tools, modifyAssistantRequest.tools) &&
        Objects.equals(this.fileIds, modifyAssistantRequest.fileIds) &&
        Objects.equals(this.metadata, modifyAssistantRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name, description, instructions, tools, fileIds, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAssistantRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
