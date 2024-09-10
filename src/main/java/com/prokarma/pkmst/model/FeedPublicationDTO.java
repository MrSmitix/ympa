package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.FeedPublicationFullDTO;
import com.prokarma.pkmst.model.FeedPublicationPriceAndStockUpdateDTO;
import com.prokarma.pkmst.model.FeedStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */
@ApiModel(description = "Информация о последней публикации предложений из прайс-листа на Маркете.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedPublicationDTO   {
  @JsonProperty("status")
  private FeedStatusType status;

  @JsonProperty("full")
  private FeedPublicationFullDTO full;

  @JsonProperty("priceAndStockUpdate")
  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

  public FeedPublicationDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedPublicationDTO full(FeedPublicationFullDTO full) {
    this.full = full;
    return this;
  }

  /**
   * Get full
   * @return full
   */
  @ApiModelProperty(value = "")
  public FeedPublicationFullDTO getFull() {
    return full;
  }

  public void setFull(FeedPublicationFullDTO full) {
    this.full = full;
  }

  public FeedPublicationDTO priceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
    return this;
  }

  /**
   * Get priceAndStockUpdate
   * @return priceAndStockUpdate
   */
  @ApiModelProperty(value = "")
  public FeedPublicationPriceAndStockUpdateDTO getPriceAndStockUpdate() {
    return priceAndStockUpdate;
  }

  public void setPriceAndStockUpdate(FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.priceAndStockUpdate = priceAndStockUpdate;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

