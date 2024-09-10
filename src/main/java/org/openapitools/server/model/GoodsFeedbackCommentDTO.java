package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.server.model.GoodsFeedbackCommentStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Комментарий к отзыву.
 */
public class GoodsFeedbackCommentDTO   {

    private Long id;
    private String text;
    private Boolean canModify;
    private Long parentId;
    private GoodsFeedbackCommentAuthorDTO author;
    private GoodsFeedbackCommentStatusType status;

    /**
     * Default constructor.
     */
    public GoodsFeedbackCommentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackCommentDTO.
     *
     * @param id Идентификатор комментария к отзыву. 
     * @param text Текст комментария.
     * @param canModify Может ли продавец изменять комментарий или удалять его.
     * @param parentId Идентификатор комментария к отзыву. 
     * @param author author
     * @param status status
     */
    public GoodsFeedbackCommentDTO(
        Long id, 
        String text, 
        Boolean canModify, 
        Long parentId, 
        GoodsFeedbackCommentAuthorDTO author, 
        GoodsFeedbackCommentStatusType status
    ) {
        this.id = id;
        this.text = text;
        this.canModify = canModify;
        this.parentId = parentId;
        this.author = author;
        this.status = status;
    }



    /**
     * Идентификатор комментария к отзыву. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Текст комментария.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Может ли продавец изменять комментарий или удалять его.
     * @return canModify
     */
    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    /**
     * Идентификатор комментария к отзыву. 
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * Get author
     * @return author
     */
    public GoodsFeedbackCommentAuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(GoodsFeedbackCommentAuthorDTO author) {
        this.author = author;
    }

    /**
     * Get status
     * @return status
     */
    public GoodsFeedbackCommentStatusType getStatus() {
        return status;
    }

    public void setStatus(GoodsFeedbackCommentStatusType status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackCommentDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

