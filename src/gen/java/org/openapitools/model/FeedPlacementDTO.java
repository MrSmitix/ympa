package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */
@ApiModel(description="Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.")

public class FeedPlacementDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FeedStatusType status;

 /**
  * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  */
  @ApiModelProperty(value = "Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.")
  private Integer totalOffersCount;
 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public FeedPlacementDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  * @return totalOffersCount
  */
  @JsonProperty("totalOffersCount")
  public Integer getTotalOffersCount() {
    return totalOffersCount;
  }

  /**
   * Sets the <code>totalOffersCount</code> property.
   */
 public void setTotalOffersCount(Integer totalOffersCount) {
    this.totalOffersCount = totalOffersCount;
  }

  /**
   * Sets the <code>totalOffersCount</code> property.
   */
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

