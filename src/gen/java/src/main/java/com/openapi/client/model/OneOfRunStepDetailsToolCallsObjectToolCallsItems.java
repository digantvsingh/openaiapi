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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfRunStepDetailsToolCallsObjectToolCallsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = RunStepDetailsToolCallsCodeObject.class, name = "RunStepDetailsToolCallsCodeObject"),
  @JsonSubTypes.Type(value = RunStepDetailsToolCallsRetrievalObject.class, name = "RunStepDetailsToolCallsRetrievalObject"),
  @JsonSubTypes.Type(value = RunStepDetailsToolCallsFunctionObject.class, name = "RunStepDetailsToolCallsFunctionObject")
})
public interface OneOfRunStepDetailsToolCallsObjectToolCallsItems {

}
