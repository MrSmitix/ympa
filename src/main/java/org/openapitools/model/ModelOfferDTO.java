package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о предложении.
 */

@Schema(name = "ModelOfferDTO", description = "Информация о предложении.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelOfferDTO {

  private Integer discount;

  private String name;

  private Integer pos;

  private BigDecimal preDiscountPrice;

  private BigDecimal price;

  private Long regionId;

  private BigDecimal shippingCost;

  private String shopName;

  private Integer shopRating;

  @Deprecated
  private Integer inStock;

  public ModelOfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Скидка на предложение в процентах.
   * @return discount
   */
  
  @Schema(name = "discount", description = "Скидка на предложение в процентах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public ModelOfferDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Наименование предложения.
   * @return name
   */
  
  @Schema(name = "name", description = "Наименование предложения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelOfferDTO pos(Integer pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Позиция предложения в выдаче Маркета на карточке модели.
   * @return pos
   */
  
  @Schema(name = "pos", description = "Позиция предложения в выдаче Маркета на карточке модели.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public ModelOfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

  /**
   * Цена предложения без скидки магазина.
   * @return preDiscountPrice
   */
  @Valid 
  @Schema(name = "preDiscountPrice", description = "Цена предложения без скидки магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  public ModelOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
   * @return price
   */
  @Valid 
  @Schema(name = "price", description = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ModelOfferDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
   * @return regionId
   */
  
  @Schema(name = "regionId", description = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public ModelOfferDTO shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
   * @return shippingCost
   */
  @Valid 
  @Schema(name = "shippingCost", description = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  public ModelOfferDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

  /**
   * Название магазина (в том виде, в котором отображается на Маркете).
   * @return shopName
   */
  
  @Schema(name = "shopName", description = "Название магазина (в том виде, в котором отображается на Маркете).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public ModelOfferDTO shopRating(Integer shopRating) {
    this.shopRating = shopRating;
    return this;
  }

  /**
   * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
   * @return shopRating
   */
  
  @Schema(name = "shopRating", description = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopRating")
  public Integer getShopRating() {
    return shopRating;
  }

  public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }

  public ModelOfferDTO inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return inStock
   * @deprecated
   */
  
  @Schema(name = "inStock", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inStock")
  @Deprecated
  public Integer getInStock() {
    return inStock;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOfferDTO modelOfferDTO = (ModelOfferDTO) o;
    return Objects.equals(this.discount, modelOfferDTO.discount) &&
        Objects.equals(this.name, modelOfferDTO.name) &&
        Objects.equals(this.pos, modelOfferDTO.pos) &&
        Objects.equals(this.preDiscountPrice, modelOfferDTO.preDiscountPrice) &&
        Objects.equals(this.price, modelOfferDTO.price) &&
        Objects.equals(this.regionId, modelOfferDTO.regionId) &&
        Objects.equals(this.shippingCost, modelOfferDTO.shippingCost) &&
        Objects.equals(this.shopName, modelOfferDTO.shopName) &&
        Objects.equals(this.shopRating, modelOfferDTO.shopRating) &&
        Objects.equals(this.inStock, modelOfferDTO.inStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, name, pos, preDiscountPrice, price, regionId, shippingCost, shopName, shopRating, inStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOfferDTO {\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    shopRating: ").append(toIndentedString(shopRating)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
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

