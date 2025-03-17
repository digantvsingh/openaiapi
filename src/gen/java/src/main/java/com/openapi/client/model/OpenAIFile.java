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
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */
@Schema(description = "The `File` object represents a document that has been uploaded to OpenAI.")


public class OpenAIFile {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("bytes")
  private Integer bytes = null;

  @JsonProperty("created_at")
  private Integer createdAt = null;

  @JsonProperty("expires_at")
  private Integer expiresAt = null;

  @JsonProperty("filename")
  private String filename = null;

  /**
   * The object type, which is always &#x60;file&#x60;.
   */
  public enum ObjectEnum {
    FILE("file");

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

  /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   */
  public enum PurposeEnum {
    ASSISTANTS("assistants"),
    ASSISTANTS_OUTPUT("assistants_output"),
    BATCH("batch"),
    BATCH_OUTPUT("batch_output"),
    FINE_TUNE("fine-tune"),
    FINE_TUNE_RESULTS("fine-tune-results"),
    VISION("vision");

    private String value;

    PurposeEnum(String value) {
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
    public static PurposeEnum fromValue(String input) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("purpose")
  private PurposeEnum purpose = null;

  /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   */
  public enum StatusEnum {
    UPLOADED("uploaded"),
    PROCESSED("processed"),
    ERROR("error");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("status_details")
  private String statusDetails = null;

  public OpenAIFile id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The file identifier, which can be referenced in the API endpoints.
   * @return id
  **/
  @Schema(required = true, description = "The file identifier, which can be referenced in the API endpoints.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OpenAIFile bytes(Integer bytes) {
    this.bytes = bytes;
    return this;
  }

   /**
   * The size of the file, in bytes.
   * @return bytes
  **/
  @Schema(required = true, description = "The size of the file, in bytes.")
  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public OpenAIFile createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the file was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) for when the file was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public OpenAIFile expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the file will expire.
   * @return expiresAt
  **/
  @Schema(description = "The Unix timestamp (in seconds) for when the file will expire.")
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public OpenAIFile filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The name of the file.
   * @return filename
  **/
  @Schema(required = true, description = "The name of the file.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public OpenAIFile object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;file&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `file`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public OpenAIFile purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   * @return purpose
  **/
  @Schema(required = true, description = "The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public OpenAIFile status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   * @return status
  **/
  @Schema(required = true, description = "Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OpenAIFile statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
   * @return statusDetails
  **/
  @Schema(description = "Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.")
  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAIFile openAIFile = (OpenAIFile) o;
    return Objects.equals(this.id, openAIFile.id) &&
        Objects.equals(this.bytes, openAIFile.bytes) &&
        Objects.equals(this.createdAt, openAIFile.createdAt) &&
        Objects.equals(this.expiresAt, openAIFile.expiresAt) &&
        Objects.equals(this.filename, openAIFile.filename) &&
        Objects.equals(this.object, openAIFile.object) &&
        Objects.equals(this.purpose, openAIFile.purpose) &&
        Objects.equals(this.status, openAIFile.status) &&
        Objects.equals(this.statusDetails, openAIFile.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bytes, createdAt, expiresAt, filename, object, purpose, status, statusDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAIFile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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
