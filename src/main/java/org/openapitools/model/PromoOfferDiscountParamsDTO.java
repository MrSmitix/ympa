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
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */

@Schema(name = "PromoOfferDiscountParamsDTO", description = "Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoOfferDiscountParamsDTO {

  private Long price;

  private Long promoPrice;

  private Long maxPromoPrice;

  public PromoOfferDiscountParamsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PromoOfferDiscountParamsDTO(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
  }

  public PromoOfferDiscountParamsDTO price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   * @return price
   */
  
  @Schema(name = "price", description = "Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public PromoOfferDiscountParamsDTO promoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
    return this;
  }

  /**
   * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
   * @return promoPrice
   */
  
  @Schema(name = "promoPrice", description = "Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promoPrice")
  public Long getPromoPrice() {
    return promoPrice;
  }

  public void setPromoPrice(Long promoPrice) {
    this.promoPrice = promoPrice;
  }

  public PromoOfferDiscountParamsDTO maxPromoPrice(Long maxPromoPrice) {
    this.maxPromoPrice = maxPromoPrice;
    return this;
  }

  /**
   * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
   * @return maxPromoPrice
   */
  @NotNull 
  @Schema(name = "maxPromoPrice", description = "Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

