package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 */
@ApiModel(description="Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.")

public class PromoOfferDiscountParamsDTO  {
  
 /**
  * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  */
  @ApiModelProperty(value = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  private Long price;

 /**
  * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  */
  @ApiModelProperty(value = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ")
  private Long promoPrice;

 /**
  * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
  */
  @ApiModelProperty(required = true, value = "Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ")
  private Long maxPromoPrice;
 /**
  * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  * @return price
  */
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(Long price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public PromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

 /**
  * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  * @return promoPrice
  */
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }

  /**
   * Sets the <code>promoPrice</code> property.
   */
 public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  /**
   * Sets the <code>promoPrice</code> property.
   */
  public PromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

 /**
  * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
  * @return maxPromoPrice
  */
  @JsonProperty("maxPromoPrice")
  @NotNull
  public Long getMaxPromoPrice() {
    return maxPromoPrice;
  }

  /**
   * Sets the <code>maxPromoPrice</code> property.
   */
 public void setMaxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
  }

  /**
   * Sets the <code>maxPromoPrice</code> property.
   */
  public PromoOfferDiscountParamsDTO maxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

