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
import java.io.File;
/**
 * AddUploadPartRequest
 */



public class AddUploadPartRequest {
  @JsonProperty("data")
  private File data = null;

  public AddUploadPartRequest data(File data) {
    this.data = data;
    return this;
  }

   /**
   * The chunk of bytes for this Part. 
   * @return data
  **/
  @Schema(required = true, description = "The chunk of bytes for this Part. ")
  public File getData() {
    return data;
  }

  public void setData(File data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUploadPartRequest addUploadPartRequest = (AddUploadPartRequest) o;
    return Objects.equals(this.data, addUploadPartRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(data));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUploadPartRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
