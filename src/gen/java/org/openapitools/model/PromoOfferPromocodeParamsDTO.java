package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Параметры товара в акции с типом `MARKET_PROMOCODE`.")
public class PromoOfferPromocodeParamsDTO   {
  
  private Long maxPrice;

  /**
   * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
   **/
  public PromoOfferPromocodeParamsDTO maxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. ")
  @JsonProperty("maxPrice")
  @NotNull
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
    return Objects.equals(this.maxPrice, promoOfferPromocodeParamsDTO.maxPrice);
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

