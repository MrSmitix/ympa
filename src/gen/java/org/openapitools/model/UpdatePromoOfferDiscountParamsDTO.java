package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 **/
@ApiModel(description="Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. ")

public class UpdatePromoOfferDiscountParamsDTO  {
  
  @ApiModelProperty(value = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. ")
 /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
  **/
  private Long price;

  @ApiModelProperty(value = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. ")
 /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
  **/
  private Long promoPrice;
 /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return price
  **/
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public UpdatePromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

 /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return promoPrice
  **/
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }

  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  public UpdatePromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
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
    UpdatePromoOfferDiscountParamsDTO updatePromoOfferDiscountParamsDTO = (UpdatePromoOfferDiscountParamsDTO) o;
    return Objects.equals(this.price, updatePromoOfferDiscountParamsDTO.price) &&
        Objects.equals(this.promoPrice, updatePromoOfferDiscountParamsDTO.promoPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, promoPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePromoOfferDiscountParamsDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
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

