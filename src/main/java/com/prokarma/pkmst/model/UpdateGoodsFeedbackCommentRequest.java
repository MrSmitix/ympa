package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateGoodsFeedbackCommentDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Комментарий к отзыву.
 */
@ApiModel(description = "Комментарий к отзыву.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateGoodsFeedbackCommentRequest   {
  @JsonProperty("feedbackId")
  private Long feedbackId;

  @JsonProperty("comment")
  private UpdateGoodsFeedbackCommentDTO comment;

  public UpdateGoodsFeedbackCommentRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  /**
   * Идентификатор отзыва. 
   * @return feedbackId
   */
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
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
  @ApiModelProperty(required = true, value = "")
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

