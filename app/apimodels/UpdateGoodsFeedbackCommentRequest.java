package apimodels;

import apimodels.UpdateGoodsFeedbackCommentDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Комментарий к отзыву.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateGoodsFeedbackCommentRequest   {
  @JsonProperty("feedbackId")
  @NotNull

  private Long feedbackId;

  @JsonProperty("comment")
  @NotNull
@Valid

  private UpdateGoodsFeedbackCommentDTO comment;

  public UpdateGoodsFeedbackCommentRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

   /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

