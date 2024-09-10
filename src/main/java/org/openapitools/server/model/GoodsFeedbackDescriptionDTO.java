package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Текстовая часть отзыва.
 */
public class GoodsFeedbackDescriptionDTO   {

    private String advantages;
    private String disadvantages;
    private String comment;

    /**
     * Default constructor.
     */
    public GoodsFeedbackDescriptionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackDescriptionDTO.
     *
     * @param advantages Описание плюсов товара в отзыве.
     * @param disadvantages Описание минусов товара в отзыве.
     * @param comment Комментарий в отзыве.
     */
    public GoodsFeedbackDescriptionDTO(
        String advantages, 
        String disadvantages, 
        String comment
    ) {
        this.advantages = advantages;
        this.disadvantages = disadvantages;
        this.comment = comment;
    }



    /**
     * Описание плюсов товара в отзыве.
     * @return advantages
     */
    public String getAdvantages() {
        return advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    /**
     * Описание минусов товара в отзыве.
     * @return disadvantages
     */
    public String getDisadvantages() {
        return disadvantages;
    }

    public void setDisadvantages(String disadvantages) {
        this.disadvantages = disadvantages;
    }

    /**
     * Комментарий в отзыве.
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackDescriptionDTO {\n");
        
        sb.append("    advantages: ").append(toIndentedString(advantages)).append("\n");
        sb.append("    disadvantages: ").append(toIndentedString(disadvantages)).append("\n");
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

