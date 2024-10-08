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
import java.util.ArrayList;
import java.util.List;
/**
 * CreateAssistantRequestToolResourcesFileSearchVectorStores
 */



public class CreateAssistantRequestToolResourcesFileSearchVectorStores {
  @JsonProperty("file_ids")
  private List<String> fileIds = null;

  @JsonProperty("chunking_strategy")
  private OneOfCreateAssistantRequestToolResourcesFileSearchVectorStoresChunkingStrategy chunkingStrategy = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public CreateAssistantRequestToolResourcesFileSearchVectorStores fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStores addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<String>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
   * @return fileIds
  **/
  @Schema(description = "A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. ")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStores chunkingStrategy(OneOfCreateAssistantRequestToolResourcesFileSearchVectorStoresChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

   /**
   * The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
   * @return chunkingStrategy
  **/
  @Schema(description = "The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.")
  public OneOfCreateAssistantRequestToolResourcesFileSearchVectorStoresChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(OneOfCreateAssistantRequestToolResourcesFileSearchVectorStoresChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStores metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @Schema(description = "Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
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
    CreateAssistantRequestToolResourcesFileSearchVectorStores createAssistantRequestToolResourcesFileSearchVectorStores = (CreateAssistantRequestToolResourcesFileSearchVectorStores) o;
    return Objects.equals(this.fileIds, createAssistantRequestToolResourcesFileSearchVectorStores.fileIds) &&
        Objects.equals(this.chunkingStrategy, createAssistantRequestToolResourcesFileSearchVectorStores.chunkingStrategy) &&
        Objects.equals(this.metadata, createAssistantRequestToolResourcesFileSearchVectorStores.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesFileSearchVectorStores {\n");
    
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
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
