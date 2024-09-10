package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о предложениях прайс-листа.
 */
@ApiModel(description="Информация о предложениях прайс-листа.")

public class FeedIndexLogsOffersDTO  {
  
 /**
  * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
  */
  @ApiModelProperty(value = "Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.")
  private Long rejectedCount;

 /**
  * Количество предложений в прайс-листе.
  */
  @ApiModelProperty(value = "Количество предложений в прайс-листе.")
  private Long totalCount;
 /**
  * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
  * @return rejectedCount
  */
  @JsonProperty("rejectedCount")
  public Long getRejectedCount() {
    return rejectedCount;
  }

  /**
   * Sets the <code>rejectedCount</code> property.
   */
 public void setRejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
  }

  /**
   * Sets the <code>rejectedCount</code> property.
   */
  public FeedIndexLogsOffersDTO rejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
    return this;
  }

 /**
  * Количество предложений в прайс-листе.
  * @return totalCount
  */
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Sets the <code>totalCount</code> property.
   */
 public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  /**
   * Sets the <code>totalCount</code> property.
   */
  public FeedIndexLogsOffersDTO totalCount(Long totalCount) {
    this.totalCount = totalCount;
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
    FeedIndexLogsOffersDTO feedIndexLogsOffersDTO = (FeedIndexLogsOffersDTO) o;
    return Objects.equals(this.rejectedCount, feedIndexLogsOffersDTO.rejectedCount) &&
        Objects.equals(this.totalCount, feedIndexLogsOffersDTO.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedIndexLogsOffersDTO {\n");
    
    sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

