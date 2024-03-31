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
 * Describes an OpenAI model offering that can be used with the API.
 */
@Schema(description = "Describes an OpenAI model offering that can be used with the API.")


public class Model {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created")
  private Integer created = null;

  /**
   * The object type, which is always \&quot;model\&quot;.
   */
  public enum ObjectEnum {
    MODEL("model");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ObjectEnum fromValue(String input) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("object")
  private ObjectEnum object = null;

  @JsonProperty("owned_by")
  private String ownedBy = null;

  public Model id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The model identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @Schema(required = true, description = "The model identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Model created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) when the model was created.
   * @return created
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) when the model was created.")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public Model object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always \&quot;model\&quot;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always \"model\".")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public Model ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * The organization that owns the model.
   * @return ownedBy
  **/
  @Schema(required = true, description = "The organization that owns the model.")
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(this.id, model.id) &&
        Objects.equals(this.created, model.created) &&
        Objects.equals(this.object, model.object) &&
        Objects.equals(this.ownedBy, model.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, object, ownedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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
