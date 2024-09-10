package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Статистическая информация по отзыву.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackStatisticsDTO   {
  @JsonProperty("rating")
  @NotNull
@Min(1)
@Max(5)

  private Integer rating;

  @JsonProperty("commentsCount")
  @NotNull

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
    return Objects.equals(rating, goodsFeedbackStatisticsDTO.rating) &&
        Objects.equals(commentsCount, goodsFeedbackStatisticsDTO.commentsCount) &&
        Objects.equals(recommended, goodsFeedbackStatisticsDTO.recommended) &&
        Objects.equals(paidAmount, goodsFeedbackStatisticsDTO.paidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, commentsCount, recommended, paidAmount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

