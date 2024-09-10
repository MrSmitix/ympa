package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOfferDiscountParamsDTO   {
  
  private Long price;
  private Long promoPrice;
  private Long maxPromoPrice;

  public PromoOfferDiscountParamsDTO () {

  }

  public PromoOfferDiscountParamsDTO (Long price, Long promoPrice, Long maxPromoPrice) {
    this.price = price;
    this.promoPrice = promoPrice;
    this.maxPromoPrice = maxPromoPrice;
  }

    
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
  }

    
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }
  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

    
  @JsonProperty("maxPromoPrice")
  public Long getMaxPromoPrice() {
    return maxPromoPrice;
  }
  public void setMaxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferDiscountParamsDTO promoOfferDiscountParamsDTO = (PromoOfferDiscountParamsDTO) o;
    return Objects.equals(price, promoOfferDiscountParamsDTO.price) &&
        Objects.equals(promoPrice, promoOfferDiscountParamsDTO.promoPrice) &&
        Objects.equals(maxPromoPrice, promoOfferDiscountParamsDTO.maxPromoPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, promoPrice, maxPromoPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferDiscountParamsDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
    sb.append("    maxPromoPrice: ").append(toIndentedString(maxPromoPrice)).append("\n");
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
