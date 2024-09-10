package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UpdateGoodsFeedbackCommentDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Комментарий к отзыву.
 */

@Schema(name = "UpdateGoodsFeedbackCommentRequest", description = "Комментарий к отзыву.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateGoodsFeedbackCommentRequest {

  private Long feedbackId;

  private UpdateGoodsFeedbackCommentDTO comment;

  public UpdateGoodsFeedbackCommentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGoodsFeedbackCommentRequest(Long feedbackId, UpdateGoodsFeedbackCommentDTO comment) {
    this.feedbackId = feedbackId;
    this.comment = comment;
  }

  public UpdateGoodsFeedbackCommentRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Идентификатор отзыва. 
   * @return feedbackId
   */
  @NotNull 
  @Schema(name = "feedbackId", description = "Идентификатор отзыва. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public UpdateGoodsFeedbackCommentRequest comment(UpdateGoodsFeedbackCommentDTO comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   */
  @NotNull @Valid 
  @Schema(name = "comment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comment")
  public UpdateGoodsFeedbackCommentDTO getComment() {
    return comment;
  }

  public void setComment(UpdateGoodsFeedbackCommentDTO comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = (UpdateGoodsFeedbackCommentRequest) o;
    return Objects.equals(this.feedbackId, updateGoodsFeedbackCommentRequest.feedbackId) &&
        Objects.equals(this.comment, updateGoodsFeedbackCommentRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGoodsFeedbackCommentRequest {\n");
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

