package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentDTO;

/**
 * Комментарий к отзыву.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateGoodsFeedbackCommentRequest   {
  
  private Long feedbackId;
  private UpdateGoodsFeedbackCommentDTO comment;

  public UpdateGoodsFeedbackCommentRequest () {

  }

  public UpdateGoodsFeedbackCommentRequest (Long feedbackId, UpdateGoodsFeedbackCommentDTO comment) {
    this.feedbackId = feedbackId;
    this.comment = comment;
  }

    
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }
  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

    
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
    return Objects.equals(feedbackId, updateGoodsFeedbackCommentRequest.feedbackId) &&
        Objects.equals(comment, updateGoodsFeedbackCommentRequest.comment);
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
