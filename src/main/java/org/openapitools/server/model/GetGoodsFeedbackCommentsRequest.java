package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтр запроса комментариев отзыва. 
 */
public class GetGoodsFeedbackCommentsRequest   {

    private Long feedbackId;

    /**
     * Default constructor.
     */
    public GetGoodsFeedbackCommentsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetGoodsFeedbackCommentsRequest.
     *
     * @param feedbackId Идентификатор отзыва. 
     */
    public GetGoodsFeedbackCommentsRequest(
        Long feedbackId
    ) {
        this.feedbackId = feedbackId;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetGoodsFeedbackCommentsRequest {\n");
        
        sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
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

