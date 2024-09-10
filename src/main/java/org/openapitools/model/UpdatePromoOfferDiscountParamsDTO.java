package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */

@Schema(name = "UpdatePromoOfferDiscountParamsDTO", description = "Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdatePromoOfferDiscountParamsDTO {

  private Long price;

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
  @Min(1L) 
  @Schema(name = "price", description = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
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
  @Min(1L) 
  @Schema(name = "promoPrice", description = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoPrice")
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
