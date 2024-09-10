package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 **/
@ApiModel(description = "Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.")
@JsonTypeName("PromoOfferDiscountParamsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferDiscountParamsDTO   {
  private Long price;
  private Long promoPrice;
  private Long maxPromoPrice;

  /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   **/
  public PromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(Long price) {
    this.price = price;
  }

  /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   **/
  public PromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }

  @JsonProperty("promoPrice")
  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  /**
   * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
   **/
  public PromoOfferDiscountParamsDTO maxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ")
  @JsonProperty("maxPromoPrice")
  @NotNull public Long getMaxPromoPrice() {
    return maxPromoPrice;
  }

  @JsonProperty("maxPromoPrice")
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

