package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.UpdatePriceWithDiscountDTO;

/**
 * Товар с новой ценой.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBusinessOfferPriceDTO   {
  
  private String offerId;
  private UpdatePriceWithDiscountDTO price;

  public UpdateBusinessOfferPriceDTO () {

  }

  public UpdateBusinessOfferPriceDTO (String offerId, UpdatePriceWithDiscountDTO price) {
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
  public UpdatePriceWithDiscountDTO getPrice() {
    return price;
  }
  public void setPrice(UpdatePriceWithDiscountDTO price) {
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
    UpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO = (UpdateBusinessOfferPriceDTO) o;
    return Objects.equals(offerId, updateBusinessOfferPriceDTO.offerId) &&
        Objects.equals(price, updateBusinessOfferPriceDTO.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessOfferPriceDTO {\n");
    
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
