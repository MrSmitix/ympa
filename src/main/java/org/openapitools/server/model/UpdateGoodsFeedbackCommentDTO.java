package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Комментарий к отзыву или другому комментарию.
 */
public class UpdateGoodsFeedbackCommentDTO   {

    private Long id;
    private Long parentId;
    private String text;

    /**
     * Default constructor.
     */
    public UpdateGoodsFeedbackCommentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateGoodsFeedbackCommentDTO.
     *
     * @param id Идентификатор комментария к отзыву. 
     * @param parentId Идентификатор комментария к отзыву. 
     * @param text Текст комментария.
     */
    public UpdateGoodsFeedbackCommentDTO(
        Long id, 
        Long parentId, 
        String text
    ) {
        this.id = id;
        this.parentId = parentId;
        this.text = text;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGoodsFeedbackCommentDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

