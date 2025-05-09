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
/**
 * StaticChunkingStrategy
 */



public class StaticChunkingStrategy {
  @JsonProperty("max_chunk_size_tokens")
  private Integer maxChunkSizeTokens = null;

  @JsonProperty("chunk_overlap_tokens")
  private Integer chunkOverlapTokens = null;

  public StaticChunkingStrategy maxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

   /**
   * The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;.
   * minimum: 100
   * maximum: 4096
   * @return maxChunkSizeTokens
  **/
  @Schema(required = true, description = "The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.")
  public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }

  public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

  public StaticChunkingStrategy chunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
    return this;
  }

   /**
   * The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;. 
   * @return chunkOverlapTokens
  **/
  @Schema(required = true, description = "The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. ")
  public Integer getChunkOverlapTokens() {
    return chunkOverlapTokens;
  }

  public void setChunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticChunkingStrategy staticChunkingStrategy = (StaticChunkingStrategy) o;
    return Objects.equals(this.maxChunkSizeTokens, staticChunkingStrategy.maxChunkSizeTokens) &&
        Objects.equals(this.chunkOverlapTokens, staticChunkingStrategy.chunkOverlapTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChunkSizeTokens, chunkOverlapTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticChunkingStrategy {\n");
    
    sb.append("    maxChunkSizeTokens: ").append(toIndentedString(maxChunkSizeTokens)).append("\n");
    sb.append("    chunkOverlapTokens: ").append(toIndentedString(chunkOverlapTokens)).append("\n");
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
