package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.PriceDTO;

/**
 * Товар с информацией о новой цене на него.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferPriceDTO   {
  
  private String offerId;
  private PriceDTO price;

  public OfferPriceDTO () {

  }

  public OfferPriceDTO (String offerId, PriceDTO price) {
    this.offerId = offerId;
    this.price = price;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceDTO offerPriceDTO = (OfferPriceDTO) o;
    return Objects.equals(offerId, offerPriceDTO.offerId) &&
        Objects.equals(price, offerPriceDTO.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
