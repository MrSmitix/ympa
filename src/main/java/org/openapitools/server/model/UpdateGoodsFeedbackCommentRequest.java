package org.openapitools.server.model;

import org.openapitools.server.model.UpdateGoodsFeedbackCommentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Комментарий к отзыву.
 */
public class UpdateGoodsFeedbackCommentRequest   {

    private Long feedbackId;
    private UpdateGoodsFeedbackCommentDTO comment;

    /**
     * Default constructor.
     */
    public UpdateGoodsFeedbackCommentRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateGoodsFeedbackCommentRequest.
     *
     * @param feedbackId Идентификатор отзыва. 
     * @param comment comment
     */
    public UpdateGoodsFeedbackCommentRequest(
        Long feedbackId, 
        UpdateGoodsFeedbackCommentDTO comment
    ) {
        this.feedbackId = feedbackId;
        this.comment = comment;
    }



    /**
     * Идентификатор отзыва. 
     * @return feedbackId
     */
    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * Get comment
     * @return comment
     */
    public UpdateGoodsFeedbackCommentDTO getComment() {
        return comment;
    }

    public void setComment(UpdateGoodsFeedbackCommentDTO comment) {
        this.comment = comment;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

