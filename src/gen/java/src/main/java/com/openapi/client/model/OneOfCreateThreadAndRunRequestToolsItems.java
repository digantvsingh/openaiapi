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
* OneOfCreateThreadAndRunRequestToolsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = AssistantToolsCode.class, name = "AssistantToolsCode"),
  @JsonSubTypes.Type(value = AssistantToolsRetrieval.class, name = "AssistantToolsRetrieval"),
  @JsonSubTypes.Type(value = AssistantToolsFunction.class, name = "AssistantToolsFunction")
})
public interface OneOfCreateThreadAndRunRequestToolsItems {

}
