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
 * RunStepDetailsMessageCreationObjectMessageCreation
 */



public class RunStepDetailsMessageCreationObjectMessageCreation {
  @JsonProperty("message_id")
  private String messageId = null;

  public RunStepDetailsMessageCreationObjectMessageCreation messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * The ID of the message that was created by this run step.
   * @return messageId
  **/
  @Schema(required = true, description = "The ID of the message that was created by this run step.")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsMessageCreationObjectMessageCreation runStepDetailsMessageCreationObjectMessageCreation = (RunStepDetailsMessageCreationObjectMessageCreation) o;
    return Objects.equals(this.messageId, runStepDetailsMessageCreationObjectMessageCreation.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsMessageCreationObjectMessageCreation {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
