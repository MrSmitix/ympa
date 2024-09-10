package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 **/
@ApiModel(description="Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.")

public class FeedPlacementDTO  {
  
  @ApiModelProperty(value = "")
  private FeedStatusType status;

  @ApiModelProperty(value = "Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.")
 /**
   * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  **/
  private Integer totalOffersCount;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedPlacementDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
   * @return totalOffersCount
  **/
  @JsonProperty("totalOffersCount")
  public Integer getTotalOffersCount() {
    return totalOffersCount;
  }

  public void setTotalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  public FeedPlacementDTO totalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
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
    FeedPlacementDTO feedPlacementDTO = (FeedPlacementDTO) o;
    return Objects.equals(this.status, feedPlacementDTO.status) &&
        Objects.equals(this.totalOffersCount, feedPlacementDTO.totalOffersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, totalOffersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPlacementDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalOffersCount: ").append(toIndentedString(totalOffersCount)).append("\n");
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

