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
import java.math.BigDecimal;
/**
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information. 
 */
@Schema(description = "The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search/customizing-file-search-settings) for more information. ")


public class FileSearchRankingOptions {
  /**
   * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
   */
  public enum RankerEnum {
    AUTO("auto"),
    DEFAULT_2024_08_21("default_2024_08_21");

    private String value;

    RankerEnum(String value) {
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
    public static RankerEnum fromValue(String input) {
      for (RankerEnum b : RankerEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("ranker")
  private RankerEnum ranker = null;

  @JsonProperty("score_threshold")
  private BigDecimal scoreThreshold = null;

  public FileSearchRankingOptions ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

   /**
   * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
   * @return ranker
  **/
  @Schema(description = "The ranker to use for the file search. If not specified will use the `auto` ranker.")
  public RankerEnum getRanker() {
    return ranker;
  }

  public void setRanker(RankerEnum ranker) {
    this.ranker = ranker;
  }

  public FileSearchRankingOptions scoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

   /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return scoreThreshold
  **/
  @Schema(required = true, description = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
  public BigDecimal getScoreThreshold() {
    return scoreThreshold;
  }

  public void setScoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSearchRankingOptions fileSearchRankingOptions = (FileSearchRankingOptions) o;
    return Objects.equals(this.ranker, fileSearchRankingOptions.ranker) &&
        Objects.equals(this.scoreThreshold, fileSearchRankingOptions.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranker, scoreThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSearchRankingOptions {\n");
    
    sb.append("    ranker: ").append(toIndentedString(ranker)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
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
