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
 * ProjectCreateRequest
 */



public class ProjectCreateRequest {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("app_use_case")
  private String appUseCase = null;

  @JsonProperty("business_website")
  private String businessWebsite = null;

  public ProjectCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The friendly name of the project, this name appears in reports.
   * @return name
  **/
  @Schema(required = true, description = "The friendly name of the project, this name appears in reports.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectCreateRequest appUseCase(String appUseCase) {
    this.appUseCase = appUseCase;
    return this;
  }

   /**
   * A description of your business, project, or use case. [Why we need this information](https://help.openai.com/en/articles/9824607-api-platform-verifications).
   * @return appUseCase
  **/
  @Schema(description = "A description of your business, project, or use case. [Why we need this information](https://help.openai.com/en/articles/9824607-api-platform-verifications).")
  public String getAppUseCase() {
    return appUseCase;
  }

  public void setAppUseCase(String appUseCase) {
    this.appUseCase = appUseCase;
  }

  public ProjectCreateRequest businessWebsite(String businessWebsite) {
    this.businessWebsite = businessWebsite;
    return this;
  }

   /**
   * Your business URL, or if you don&#x27;t have one yet, a URL to your LinkedIn or other social media. [Why we need this information](https://help.openai.com/en/articles/9824607-api-platform-verifications).
   * @return businessWebsite
  **/
  @Schema(description = "Your business URL, or if you don't have one yet, a URL to your LinkedIn or other social media. [Why we need this information](https://help.openai.com/en/articles/9824607-api-platform-verifications).")
  public String getBusinessWebsite() {
    return businessWebsite;
  }

  public void setBusinessWebsite(String businessWebsite) {
    this.businessWebsite = businessWebsite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateRequest projectCreateRequest = (ProjectCreateRequest) o;
    return Objects.equals(this.name, projectCreateRequest.name) &&
        Objects.equals(this.appUseCase, projectCreateRequest.appUseCase) &&
        Objects.equals(this.businessWebsite, projectCreateRequest.businessWebsite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appUseCase, businessWebsite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appUseCase: ").append(toIndentedString(appUseCase)).append("\n");
    sb.append("    businessWebsite: ").append(toIndentedString(businessWebsite)).append("\n");
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
