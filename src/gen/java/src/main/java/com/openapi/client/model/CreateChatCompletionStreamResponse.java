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
import com.openapi.client.model.CreateChatCompletionStreamResponseChoices;
import com.openapi.client.model.CreateChatCompletionStreamResponseUsage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a streamed chunk of a chat completion response returned by the model, based on the provided input.  [Learn more](/docs/guides/streaming-responses). 
 */
@Schema(description = "Represents a streamed chunk of a chat completion response returned by the model, based on the provided input.  [Learn more](/docs/guides/streaming-responses). ")


public class CreateChatCompletionStreamResponse {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("choices")
  private List<CreateChatCompletionStreamResponseChoices> choices = new ArrayList<CreateChatCompletionStreamResponseChoices>();

  @JsonProperty("created")
  private Integer created = null;

  @JsonProperty("model")
  private String model = null;

  /**
   * The service tier used for processing the request.
   */
  public enum ServiceTierEnum {
    SCALE("scale"),
    DEFAULT("default");

    private String value;

    ServiceTierEnum(String value) {
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
    public static ServiceTierEnum fromValue(String input) {
      for (ServiceTierEnum b : ServiceTierEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("service_tier")
  private ServiceTierEnum serviceTier = null;

  @JsonProperty("system_fingerprint")
  private String systemFingerprint = null;

  /**
   * The object type, which is always &#x60;chat.completion.chunk&#x60;.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION_CHUNK("chat.completion.chunk");

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

  @JsonProperty("usage")
  private CreateChatCompletionStreamResponseUsage usage = null;

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the chat completion. Each chunk has the same ID.
   * @return id
  **/
  @Schema(required = true, description = "A unique identifier for the chat completion. Each chunk has the same ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionStreamResponse choices(List<CreateChatCompletionStreamResponseChoices> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoices choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;. 
   * @return choices
  **/
  @Schema(required = true, description = "A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. ")
  public List<CreateChatCompletionStreamResponseChoices> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateChatCompletionStreamResponseChoices> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
   * @return created
  **/
  @Schema(required = true, description = "The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model to generate the completion.
   * @return model
  **/
  @Schema(required = true, description = "The model to generate the completion.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionStreamResponse serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

   /**
   * The service tier used for processing the request.
   * @return serviceTier
  **/
  @Schema(example = "scale", description = "The service tier used for processing the request.")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  public CreateChatCompletionStreamResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

   /**
   * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
  **/
  @Schema(description = "This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionStreamResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * The object type, which is always &#x60;chat.completion.chunk&#x60;.
   * @return object
  **/
  @Schema(required = true, description = "The object type, which is always `chat.completion.chunk`.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public CreateChatCompletionStreamResponse usage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")
  public CreateChatCompletionStreamResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponse createChatCompletionStreamResponse = (CreateChatCompletionStreamResponse) o;
    return Objects.equals(this.id, createChatCompletionStreamResponse.id) &&
        Objects.equals(this.choices, createChatCompletionStreamResponse.choices) &&
        Objects.equals(this.created, createChatCompletionStreamResponse.created) &&
        Objects.equals(this.model, createChatCompletionStreamResponse.model) &&
        Objects.equals(this.serviceTier, createChatCompletionStreamResponse.serviceTier) &&
        Objects.equals(this.systemFingerprint, createChatCompletionStreamResponse.systemFingerprint) &&
        Objects.equals(this.object, createChatCompletionStreamResponse.object) &&
        Objects.equals(this.usage, createChatCompletionStreamResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, serviceTier, systemFingerprint, object, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
    sb.append("    systemFingerprint: ").append(toIndentedString(systemFingerprint)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
