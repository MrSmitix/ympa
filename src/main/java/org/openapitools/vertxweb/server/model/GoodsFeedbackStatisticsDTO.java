package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Статистическая информация по отзыву.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackStatisticsDTO   {
  
  private Integer rating;
  private Long commentsCount;
  private Boolean recommended;
  private Long paidAmount;

  public GoodsFeedbackStatisticsDTO () {

  }

  public GoodsFeedbackStatisticsDTO (Integer rating, Long commentsCount, Boolean recommended, Long paidAmount) {
    this.rating = rating;
    this.commentsCount = commentsCount;
    this.recommended = recommended;
    this.paidAmount = paidAmount;
  }

    
  @JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

    
  @JsonProperty("commentsCount")
  public Long getCommentsCount() {
    return commentsCount;
  }
  public void setCommentsCount(Long commentsCount) {
    this.commentsCount = commentsCount;
  }

    
  @JsonProperty("recommended")
  public Boolean getRecommended() {
    return recommended;
  }
  public void setRecommended(Boolean recommended) {
    this.recommended = recommended;
  }

    
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
    return Objects.equals(rating, goodsFeedbackStatisticsDTO.rating) &&
        Objects.equals(commentsCount, goodsFeedbackStatisticsDTO.commentsCount) &&
        Objects.equals(recommended, goodsFeedbackStatisticsDTO.recommended) &&
        Objects.equals(paidAmount, goodsFeedbackStatisticsDTO.paidAmount);
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
