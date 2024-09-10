package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Статистическая информация по отзыву.
 */
@ApiModel(description="Статистическая информация по отзыву.")

public class GoodsFeedbackStatisticsDTO  {
  
 /**
  * Оценка товара.
  */
  @ApiModelProperty(required = true, value = "Оценка товара.")
  private Integer rating;

 /**
  * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
  */
  @ApiModelProperty(required = true, value = "Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ")
  private Long commentsCount;

 /**
  * Рекомендуют ли этот товар.
  */
  @ApiModelProperty(value = "Рекомендуют ли этот товар.")
  private Boolean recommended;

 /**
  * Количество баллов Плюса, которое автор получил за отзыв.
  */
  @ApiModelProperty(value = "Количество баллов Плюса, которое автор получил за отзыв.")
  private Long paidAmount;
 /**
  * Оценка товара.
  * minimum: 1
  * maximum: 5
  * @return rating
  */
  @JsonProperty("rating")
  @NotNull
 @Min(1) @Max(5)  public Integer getRating() {
    return rating;
  }

  /**
   * Sets the <code>rating</code> property.
   */
 public void setRating(Integer rating) {
    this.rating = rating;
  }

  /**
   * Sets the <code>rating</code> property.
   */
  public GoodsFeedbackStatisticsDTO rating(Integer rating) {
    this.rating = rating;
    return this;
  }

 /**
  * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
  * @return commentsCount
  */
  @JsonProperty("commentsCount")
  @NotNull
  public Long getCommentsCount() {
    return commentsCount;
  }

  /**
   * Sets the <code>commentsCount</code> property.
   */
 public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  /**
   * Sets the <code>commentsCount</code> property.
   */
  public GoodsFeedbackStatisticsDTO commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

 /**
  * Рекомендуют ли этот товар.
  * @return recommended
  */
  @JsonProperty("recommended")
  public Boolean getRecommended() {
    return recommended;
  }

  /**
   * Sets the <code>recommended</code> property.
   */
 public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  /**
   * Sets the <code>recommended</code> property.
   */
  public GoodsFeedbackStatisticsDTO recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

 /**
  * Количество баллов Плюса, которое автор получил за отзыв.
  * @return paidAmount
  */
  @JsonProperty("paidAmount")
  public Long getPaidAmount() {
    return paidAmount;
  }

  /**
   * Sets the <code>paidAmount</code> property.
   */
 public void setPaidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
  }

  /**
   * Sets the <code>paidAmount</code> property.
   */
  public GoodsFeedbackStatisticsDTO paidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackStatisticsDTO goodsFeedbackStatisticsDTO = (GoodsFeedbackStatisticsDTO) o;
    return Objects.equals(this.rating, goodsFeedbackStatisticsDTO.rating) &&
        Objects.equals(this.commentsCount, goodsFeedbackStatisticsDTO.commentsCount) &&
        Objects.equals(this.recommended, goodsFeedbackStatisticsDTO.recommended) &&
        Objects.equals(this.paidAmount, goodsFeedbackStatisticsDTO.paidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, commentsCount, recommended, paidAmount);
  }

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

