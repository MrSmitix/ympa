package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.UpdateGoodsFeedbackCommentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Комментарий к отзыву.
 **/
@ApiModel(description="Комментарий к отзыву.")

public class UpdateGoodsFeedbackCommentRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
 /**
   * Идентификатор отзыва. 
  **/
  private Long feedbackId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private UpdateGoodsFeedbackCommentDTO comment;
 /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
  @JsonProperty("feedbackId")
  @NotNull
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public UpdateGoodsFeedbackCommentRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  @NotNull
  public UpdateGoodsFeedbackCommentDTO getComment() {
    return comment;
  }

  public void setComment(UpdateGoodsFeedbackCommentDTO comment) {
    this.comment = comment;
  }

  public UpdateGoodsFeedbackCommentRequest comment(UpdateGoodsFeedbackCommentDTO comment) {
    this.comment = comment;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

