package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferDiscountParamsDTO   {
  
  private Long price;
  private Long promoPrice;
  private Long maxPromoPrice;

  /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   **/
  
  @ApiModelProperty(value = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
  }

  /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   **/
  
  @ApiModelProperty(value = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }
  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  /**
   * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
   **/
  
  @ApiModelProperty(required = true, value = "Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ")
  @JsonProperty("maxPromoPrice")
  @NotNull
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
    return Objects.equals(this.price, promoOfferDiscountParamsDTO.price) &&
        Objects.equals(this.promoPrice, promoOfferDiscountParamsDTO.promoPrice) &&
        Objects.equals(this.maxPromoPrice, promoOfferDiscountParamsDTO.maxPromoPrice);
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

