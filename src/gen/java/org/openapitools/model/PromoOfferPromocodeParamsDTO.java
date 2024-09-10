package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметры товара в акции с типом `MARKET_PROMOCODE`.
 **/
@ApiModel(description="Параметры товара в акции с типом `MARKET_PROMOCODE`.")

public class PromoOfferPromocodeParamsDTO  {
  
  @ApiModelProperty(required = true, value = "Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. ")
 /**
   * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
  **/
  private Long maxPrice;
 /**
   * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
   * @return maxPrice
  **/
  @JsonProperty("maxPrice")
  @NotNull
  public Long getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }

  public PromoOfferPromocodeParamsDTO maxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

