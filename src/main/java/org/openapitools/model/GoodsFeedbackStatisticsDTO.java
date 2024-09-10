package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Статистическая информация по отзыву.
 */

@Schema(name = "GoodsFeedbackStatisticsDTO", description = "Статистическая информация по отзыву.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackStatisticsDTO {

  private Integer rating;

  private Long commentsCount;

  private Boolean recommended;

  private Long paidAmount;

  public GoodsFeedbackStatisticsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsFeedbackStatisticsDTO(Integer rating, Long commentsCount) {
    this.rating = rating;
    this.commentsCount = commentsCount;
  }

  public GoodsFeedbackStatisticsDTO rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Оценка товара.
   * minimum: 1
   * maximum: 5
   * @return rating
   */
  @NotNull @Min(1) @Max(5) 
  @Schema(name = "rating", description = "Оценка товара.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rating")
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
   */
  @NotNull 
  @Schema(name = "commentsCount", description = "Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("commentsCount")
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
   */
  
  @Schema(name = "recommended", description = "Рекомендуют ли этот товар.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommended")
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
   */
  
  @Schema(name = "paidAmount", description = "Количество баллов Плюса, которое автор получил за отзыв.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

