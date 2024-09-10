package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Идентификаторы отзывов.
 */
public class SkipGoodsFeedbackReactionRequest   {

    private Set<Long> feedbackIds = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public SkipGoodsFeedbackReactionRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SkipGoodsFeedbackReactionRequest.
     *
     * @param feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.
     */
    public SkipGoodsFeedbackReactionRequest(
        Set<Long> feedbackIds
    ) {
        this.feedbackIds = feedbackIds;
    }



    /**
     * Список идентификаторов отзывов, на которые магазин не будет отвечать.
     * @return feedbackIds
     */
    public Set<Long> getFeedbackIds() {
        return feedbackIds;
    }

    public void setFeedbackIds(Set<Long> feedbackIds) {
        this.feedbackIds = feedbackIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkipGoodsFeedbackReactionRequest {\n");
        
        sb.append("    feedbackIds: ").append(toIndentedString(feedbackIds)).append("\n");
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

