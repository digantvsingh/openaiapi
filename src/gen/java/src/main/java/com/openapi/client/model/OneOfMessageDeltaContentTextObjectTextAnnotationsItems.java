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
* OneOfMessageDeltaContentTextObjectTextAnnotationsItems
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = MessageDeltaContentTextAnnotationsFileCitationObject.class, name = "MessageDeltaContentTextAnnotationsFileCitationObject"),
  @JsonSubTypes.Type(value = MessageDeltaContentTextAnnotationsFilePathObject.class, name = "MessageDeltaContentTextAnnotationsFilePathObject")
})
public interface OneOfMessageDeltaContentTextObjectTextAnnotationsItems {

}
