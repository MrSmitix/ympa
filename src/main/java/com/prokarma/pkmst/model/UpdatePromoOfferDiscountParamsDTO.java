package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */
@ApiModel(description = "Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOfferDiscountParamsDTO   {
  @JsonProperty("price")
  private Long price;

  @JsonProperty("promoPrice")
  private Long promoPrice;

  public UpdatePromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return price
   */
  @ApiModelProperty(value = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. ")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public UpdatePromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

  /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
   * minimum: 1
   * @return promoPrice
   */
  @ApiModelProperty(value = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. ")
  public Long getPromoPrice() {
    return promoPrice;
  }

  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

