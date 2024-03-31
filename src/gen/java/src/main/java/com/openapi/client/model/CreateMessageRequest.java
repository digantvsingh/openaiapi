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
 * CreateMessageRequest
 */



public class CreateMessageRequest {
  /**
   * The role of the entity that is creating the message. Currently only &#x60;user&#x60; is supported.
   */
  public enum RoleEnum {
    USER("user");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String input) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("file_ids")
  private List<String> fileIds = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public CreateMessageRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the entity that is creating the message. Currently only &#x60;user&#x60; is supported.
   * @return role
  **/
  @Schema(required = true, description = "The role of the entity that is creating the message. Currently only `user` is supported.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public CreateMessageRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the message.
   * @return content
  **/
  @Schema(required = true, description = "The content of the message.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CreateMessageRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateMessageRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<String>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access and use files.
   * @return fileIds
  **/
  @Schema(description = "A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateMessageRequest metadata(Object metadata) {
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
    CreateMessageRequest createMessageRequest = (CreateMessageRequest) o;
    return Objects.equals(this.role, createMessageRequest.role) &&
        Objects.equals(this.content, createMessageRequest.content) &&
        Objects.equals(this.fileIds, createMessageRequest.fileIds) &&
        Objects.equals(this.metadata, createMessageRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, fileIds, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMessageRequest {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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