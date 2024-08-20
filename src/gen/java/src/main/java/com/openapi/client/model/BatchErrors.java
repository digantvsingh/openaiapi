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
import com.openapi.client.model.BatchErrorsData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * BatchErrors
 */



public class BatchErrors {
  @JsonProperty("object")
  private String object = null;

  @JsonProperty("data")
  private List<BatchErrorsData> data = null;

  public BatchErrors object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;list&#x60;.
   * @return object
  **/
  @Schema(description = "The object type, which is always `list`.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public BatchErrors data(List<BatchErrorsData> data) {
    this.data = data;
    return this;
  }

  public BatchErrors addDataItem(BatchErrorsData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<BatchErrorsData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<BatchErrorsData> getData() {
    return data;
  }

  public void setData(List<BatchErrorsData> data) {
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
    BatchErrors batchErrors = (BatchErrors) o;
    return Objects.equals(this.object, batchErrors.object) &&
        Objects.equals(this.data, batchErrors.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchErrors {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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
