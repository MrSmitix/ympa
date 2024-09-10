package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedPublicationFullDTO;
import org.openapitools.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.model.FeedStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о последней публикации предложений из прайс-листа на Маркете.
 **/
@ApiModel(description="Информация о последней публикации предложений из прайс-листа на Маркете.")

public class FeedPublicationDTO  {
  
  @ApiModelProperty(value = "")
  private FeedStatusType status;

  @ApiModelProperty(value = "")
  private FeedPublicationFullDTO full;

  @ApiModelProperty(value = "")
  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;
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

  public FeedPublicationDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get full
   * @return full
  **/
  @JsonProperty("full")
  public FeedPublicationFullDTO getFull() {
    return full;
  }

  public void setFull(FeedPublicationFullDTO full) {
    this.full = full;
  }

  public FeedPublicationDTO full(FeedPublicationFullDTO full) {
    this.full = full;
    return this;
  }

 /**
   * Get priceAndStockUpdate
   * @return priceAndStockUpdate
  **/
  @JsonProperty("priceAndStockUpdate")
  public FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate() {
    return priceAndStockUpdate;
  }

  public void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
  }

  public FeedPublicationDTO priceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
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
    FeedPublicationDTO feedPublicationDTO = (FeedPublicationDTO) o;
    return Objects.equals(this.status, feedPublicationDTO.status) &&
        Objects.equals(this.full, feedPublicationDTO.full) &&
        Objects.equals(this.priceAndStockUpdate, feedPublicationDTO.priceAndStockUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, full, priceAndStockUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedPublicationDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    priceAndStockUpdate: ").append(toIndentedString(priceAndStockUpdate)).append("\n");
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

