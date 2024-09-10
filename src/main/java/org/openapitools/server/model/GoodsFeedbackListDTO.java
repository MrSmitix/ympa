package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.GoodsFeedbackDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список отзывов о товарах. 
 */
public class GoodsFeedbackListDTO   {

    private List<@Valid GoodsFeedbackDTO> feedbacks = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GoodsFeedbackListDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackListDTO.
     *
     * @param feedbacks Список отзывов.
     * @param paging paging
     */
    public GoodsFeedbackListDTO(
        List<@Valid GoodsFeedbackDTO> feedbacks, 
        ForwardScrollingPagerDTO paging
    ) {
        this.feedbacks = feedbacks;
        this.paging = paging;
    }



    /**
     * Список отзывов.
     * @return feedbacks
     */
    public List<@Valid GoodsFeedbackDTO> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
        this.feedbacks = feedbacks;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackListDTO {\n");
        
        sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

