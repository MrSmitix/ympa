package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статистическая информация по отзыву.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Статистическая информация по отзыву.")
public class GoodsFeedbackStatisticsDTO   {
  
  private Integer rating;

  private Long commentsCount;

  private Boolean recommended;

  private Long paidAmount;

  /**
   * Оценка товара.
   * minimum: 1
   * maximum: 5
   **/
  public GoodsFeedbackStatisticsDTO rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Оценка товара.")
  @JsonProperty("rating")
  @NotNull
 @Min(1) @Max(5)  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }


  /**
   * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
   **/
  public GoodsFeedbackStatisticsDTO commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ")
  @JsonProperty("commentsCount")
  @NotNull
  public Long getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }


  /**
   * Рекомендуют ли этот товар.
   **/
  public GoodsFeedbackStatisticsDTO recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

  
  @ApiModelProperty(value = "Рекомендуют ли этот товар.")
  @JsonProperty("recommended")
  public Boolean getRecommended() {
    return recommended;
  }
  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }


  /**
   * Количество баллов Плюса, которое автор получил за отзыв.
   **/
  public GoodsFeedbackStatisticsDTO paidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество баллов Плюса, которое автор получил за отзыв.")
  @JsonProperty("paidAmount")
  public Long getPaidAmount() {
    return paidAmount;
  }
  public void setPaidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

