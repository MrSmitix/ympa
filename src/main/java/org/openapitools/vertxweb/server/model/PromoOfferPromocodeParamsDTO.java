package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOfferPromocodeParamsDTO   {
  
  private Long maxPrice;

  public PromoOfferPromocodeParamsDTO () {

  }

  public PromoOfferPromocodeParamsDTO (Long maxPrice) {
    this.maxPrice = maxPrice;
  }

    
  @JsonProperty("maxPrice")
  public Long getMaxPrice() {
    return maxPrice;
  }
  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoOfferPromocodeParamsDTO promoOfferPromocodeParamsDTO = (PromoOfferPromocodeParamsDTO) o;
    return Objects.equals(maxPrice, promoOfferPromocodeParamsDTO.maxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoOfferPromocodeParamsDTO {\n");
    
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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
