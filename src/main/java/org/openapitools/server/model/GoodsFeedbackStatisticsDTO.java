package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Статистическая информация по отзыву.
 */
public class GoodsFeedbackStatisticsDTO   {

    private Integer rating;
    private Long commentsCount;
    private Boolean recommended;
    private Long paidAmount;

    /**
     * Default constructor.
     */
    public GoodsFeedbackStatisticsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackStatisticsDTO.
     *
     * @param rating Оценка товара.
     * @param commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
     * @param recommended Рекомендуют ли этот товар.
     * @param paidAmount Количество баллов Плюса, которое автор получил за отзыв.
     */
    public GoodsFeedbackStatisticsDTO(
        Integer rating, 
        Long commentsCount, 
        Boolean recommended, 
        Long paidAmount
    ) {
        this.rating = rating;
        this.commentsCount = commentsCount;
        this.recommended = recommended;
        this.paidAmount = paidAmount;
    }



    /**
     * Оценка товара.
     * minimum: 1
     * maximum: 5
     * @return rating
     */
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
     * @return commentsCount
     */
    public Long getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * Рекомендуют ли этот товар.
     * @return recommended
     */
    public Boolean getRecommended() {
        return recommended;
    }

    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }

    /**
     * Количество баллов Плюса, которое автор получил за отзыв.
     * @return paidAmount
     */
    public Long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackStatisticsDTO {\n");
        
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("    commentsCount: ").append(toIndentedString(commentsCount)).append("\n");
        sb.append("    recommended: ").append(toIndentedString(recommended)).append("\n");
        sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
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

