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
 * MessageContentTextObjectText
 */



public class MessageContentTextObjectText {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("annotations")
  private List<OneOfMessageContentTextObjectTextAnnotationsItems> annotations = new ArrayList<OneOfMessageContentTextObjectTextAnnotationsItems>();

  public MessageContentTextObjectText value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The data that makes up the text.
   * @return value
  **/
  @Schema(required = true, description = "The data that makes up the text.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MessageContentTextObjectText annotations(List<OneOfMessageContentTextObjectTextAnnotationsItems> annotations) {
    this.annotations = annotations;
    return this;
  }

  public MessageContentTextObjectText addAnnotationsItem(OneOfMessageContentTextObjectTextAnnotationsItems annotationsItem) {
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @Schema(required = true, description = "")
  public List<OneOfMessageContentTextObjectTextAnnotationsItems> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<OneOfMessageContentTextObjectTextAnnotationsItems> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextObjectText messageContentTextObjectText = (MessageContentTextObjectText) o;
    return Objects.equals(this.value, messageContentTextObjectText.value) &&
        Objects.equals(this.annotations, messageContentTextObjectText.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, annotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextObjectText {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
