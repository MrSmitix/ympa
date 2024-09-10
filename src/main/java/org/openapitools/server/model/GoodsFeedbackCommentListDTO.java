package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.GoodsFeedbackCommentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Комментарии к отзыву.
 */
public class GoodsFeedbackCommentListDTO   {

    private List<@Valid GoodsFeedbackCommentDTO> comments = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GoodsFeedbackCommentListDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackCommentListDTO.
     *
     * @param comments Список комментариев.
     * @param paging paging
     */
    public GoodsFeedbackCommentListDTO(
        List<@Valid GoodsFeedbackCommentDTO> comments, 
        ForwardScrollingPagerDTO paging
    ) {
        this.comments = comments;
        this.paging = paging;
    }



    /**
     * Список комментариев.
     * @return comments
     */
    public List<@Valid GoodsFeedbackCommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<@Valid GoodsFeedbackCommentDTO> comments) {
        this.comments = comments;
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
        sb.append("class GoodsFeedbackCommentListDTO {\n");
        
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

