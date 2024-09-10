package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Статистическая информация по отзыву.
 */
@ApiModel(description = "Статистическая информация по отзыву.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackStatisticsDTO   {
  @JsonProperty("rating")
  private Integer rating;

  @JsonProperty("commentsCount")
  private Long commentsCount;

  @JsonProperty("recommended")
  private Boolean recommended;

  @JsonProperty("paidAmount")
  private Long paidAmount;

  public GoodsFeedbackStatisticsDTO rating(Integer rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Оценка товара.
   * minimum: 1
   * maximum: 5
   * @return rating
  **/
  @ApiModelProperty(required = true, value = "Оценка товара.")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public GoodsFeedbackStatisticsDTO commentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
    return this;
  }

   /**
   * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
   * @return commentsCount
  **/
  @ApiModelProperty(required = true, value = "Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ")
  public Long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public GoodsFeedbackStatisticsDTO recommended(Boolean recommended) {
    this.recommended = recommended;
    return this;
  }

   /**
   * Рекомендуют ли этот товар.
   * @return recommended
  **/
  @ApiModelProperty(value = "Рекомендуют ли этот товар.")
  public Boolean getRecommended() {
    return recommended;
  }

  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

  public GoodsFeedbackStatisticsDTO paidAmount(Long paidAmount) {
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Количество баллов Плюса, которое автор получил за отзыв.
   * @return paidAmount
  **/
  @ApiModelProperty(value = "Количество баллов Плюса, которое автор получил за отзыв.")
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

