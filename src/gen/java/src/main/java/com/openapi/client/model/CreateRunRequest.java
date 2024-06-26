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
 * CreateRunRequest
 */



public class CreateRunRequest {
  @JsonProperty("assistant_id")
  private String assistantId = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("instructions")
  private String instructions = null;

  @JsonProperty("additional_instructions")
  private String additionalInstructions = null;

  @JsonProperty("tools")
  private List<OneOfCreateRunRequestToolsItems> tools = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public CreateRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
  **/
  @Schema(required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public CreateRunRequest model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
   * @return model
  **/
  @Schema(description = "The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateRunRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
  **/
  @Schema(description = "Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public CreateRunRequest additionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
    return this;
  }

   /**
   * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
   * @return additionalInstructions
  **/
  @Schema(description = "Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.")
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }

  public void setAdditionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }

  public CreateRunRequest tools(List<OneOfCreateRunRequestToolsItems> tools) {
    this.tools = tools;
    return this;
  }

  public CreateRunRequest addToolsItem(OneOfCreateRunRequestToolsItems toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<OneOfCreateRunRequestToolsItems>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
  **/
  @Schema(description = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
  public List<OneOfCreateRunRequestToolsItems> getTools() {
    return tools;
  }

  public void setTools(List<OneOfCreateRunRequestToolsItems> tools) {
    this.tools = tools;
  }

  public CreateRunRequest metadata(Object metadata) {
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
    CreateRunRequest createRunRequest = (CreateRunRequest) o;
    return Objects.equals(this.assistantId, createRunRequest.assistantId) &&
        Objects.equals(this.model, createRunRequest.model) &&
        Objects.equals(this.instructions, createRunRequest.instructions) &&
        Objects.equals(this.additionalInstructions, createRunRequest.additionalInstructions) &&
        Objects.equals(this.tools, createRunRequest.tools) &&
        Objects.equals(this.metadata, createRunRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, model, instructions, additionalInstructions, tools, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRunRequest {\n");
    
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    additionalInstructions: ").append(toIndentedString(additionalInstructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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
