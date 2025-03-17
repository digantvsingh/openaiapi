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
import com.openapi.client.model.RunStepDetailsToolCallsFileSearchResultObjectContent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * A result instance of the file search.
 */
@Schema(description = "A result instance of the file search.")


public class RunStepDetailsToolCallsFileSearchResultObject {
  @JsonProperty("file_id")
  private String fileId = null;

  @JsonProperty("file_name")
  private String fileName = null;

  @JsonProperty("score")
  private BigDecimal score = null;

  @JsonProperty("content")
  private List<RunStepDetailsToolCallsFileSearchResultObjectContent> content = null;

  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The ID of the file that result was found in.
   * @return fileId
  **/
  @Schema(required = true, description = "The ID of the file that result was found in.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the file that result was found in.
   * @return fileName
  **/
  @Schema(required = true, description = "The name of the file that result was found in.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public RunStepDetailsToolCallsFileSearchResultObject score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return score
  **/
  @Schema(required = true, description = "The score of the result. All values must be a floating point number between 0 and 1.")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject content(List<RunStepDetailsToolCallsFileSearchResultObjectContent> content) {
    this.content = content;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchResultObject addContentItem(RunStepDetailsToolCallsFileSearchResultObjectContent contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<RunStepDetailsToolCallsFileSearchResultObjectContent>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   * @return content
  **/
  @Schema(description = "The content of the result that was found. The content is only included if requested via the include query parameter.")
  public List<RunStepDetailsToolCallsFileSearchResultObjectContent> getContent() {
    return content;
  }

  public void setContent(List<RunStepDetailsToolCallsFileSearchResultObjectContent> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchResultObject runStepDetailsToolCallsFileSearchResultObject = (RunStepDetailsToolCallsFileSearchResultObject) o;
    return Objects.equals(this.fileId, runStepDetailsToolCallsFileSearchResultObject.fileId) &&
        Objects.equals(this.fileName, runStepDetailsToolCallsFileSearchResultObject.fileName) &&
        Objects.equals(this.score, runStepDetailsToolCallsFileSearchResultObject.score) &&
        Objects.equals(this.content, runStepDetailsToolCallsFileSearchResultObject.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, fileName, score, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObject {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
