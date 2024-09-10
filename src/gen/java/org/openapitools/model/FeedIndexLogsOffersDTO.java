package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о предложениях прайс-листа.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о предложениях прайс-листа.")
public class FeedIndexLogsOffersDTO   {
  
  private Long rejectedCount;

  private Long totalCount;

  /**
   * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
   **/
  public FeedIndexLogsOffersDTO rejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.")
  @JsonProperty("rejectedCount")
  public Long getRejectedCount() {
    return rejectedCount;
  }
  public void setRejectedCount(Long rejectedCount) {
    this.rejectedCount = rejectedCount;
  }


  /**
   * Количество предложений в прайс-листе.
   **/
  public FeedIndexLogsOffersDTO totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество предложений в прайс-листе.")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

