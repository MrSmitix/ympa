package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedbackDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */
public class FeedbackListDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FeedbackListDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackListDTO.
     *
     * @param paging paging
     * @param feedbackList Список отзывов.  Содержит не более 20 отзывов. 
     */
    public FeedbackListDTO(
        ScrollingPagerDTO paging, 
        List<@Valid FeedbackDTO> feedbackList
    ) {
        this.paging = paging;
        this.feedbackList = feedbackList;
    }



    /**
     * Get paging
     * @return paging
     */
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
     * Список отзывов.  Содержит не более 20 отзывов. 
     * @return feedbackList
     */
    public List<@Valid FeedbackDTO> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
        this.feedbackList = feedbackList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackListDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
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

