package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.PriceDTO;

/**
 * Информация об установленной цене.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferPriceByOfferIdsResponseDTO   {
  
  private String offerId;
  private PriceDTO price;
  private OffsetDateTime updatedAt;

  public OfferPriceByOfferIdsResponseDTO () {

  }

  public OfferPriceByOfferIdsResponseDTO (String offerId, PriceDTO price, OffsetDateTime updatedAt) {
    this.offerId = offerId;
    this.price = price;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("price")
  public PriceDTO getPrice() {
    return price;
  }
  public void setPrice(PriceDTO price) {
    this.price = price;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceByOfferIdsResponseDTO offerPriceByOfferIdsResponseDTO = (OfferPriceByOfferIdsResponseDTO) o;
    return Objects.equals(offerId, offerPriceByOfferIdsResponseDTO.offerId) &&
        Objects.equals(price, offerPriceByOfferIdsResponseDTO.price) &&
        Objects.equals(updatedAt, offerPriceByOfferIdsResponseDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, price, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceByOfferIdsResponseDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
