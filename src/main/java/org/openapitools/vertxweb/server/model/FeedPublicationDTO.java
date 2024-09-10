package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FeedPublicationFullDTO;
import org.openapitools.vertxweb.server.model.FeedPublicationPriceAndStockUpdateDTO;
import org.openapitools.vertxweb.server.model.FeedStatusType;

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedPublicationDTO   {
  
  private FeedStatusType status;
  private FeedPublicationFullDTO full;
  private FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate;

  public FeedPublicationDTO () {

  }

  public FeedPublicationDTO (FeedStatusType status, FeedPublicationFullDTO full, FeedPublicationPriceAndStockUpdateDTO priceAndStockUpdate) {
    this.status = status;
    this.full = full;
    this.priceAndStockUpdate = priceAndStockUpdate;
  }

    
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("full")
  public FeedPublicationFullDTO getFull() {
    return full;
  }
  public void setFull(FeedPublicationFullDTO full) {
    this.full = full;
  }

    
  @JsonProperty("priceAndStockUpdate")
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
    return Objects.equals(status, feedPublicationDTO.status) &&
        Objects.equals(full, feedPublicationDTO.full) &&
        Objects.equals(priceAndStockUpdate, feedPublicationDTO.priceAndStockUpdate);
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
