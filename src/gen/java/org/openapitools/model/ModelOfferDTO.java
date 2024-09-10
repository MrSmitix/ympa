package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о предложении.
 **/
@ApiModel(description="Информация о предложении.")

public class ModelOfferDTO  {
  
  @ApiModelProperty(value = "Скидка на предложение в процентах.")
 /**
   * Скидка на предложение в процентах.
  **/
  private Integer discount;

  @ApiModelProperty(value = "Наименование предложения.")
 /**
   * Наименование предложения.
  **/
  private String name;

  @ApiModelProperty(value = "Позиция предложения в выдаче Маркета на карточке модели.")
 /**
   * Позиция предложения в выдаче Маркета на карточке модели.
  **/
  private Integer pos;

  @ApiModelProperty(value = "Цена предложения без скидки магазина.")
  @Valid
 /**
   * Цена предложения без скидки магазина.
  **/
  private BigDecimal preDiscountPrice;

  @ApiModelProperty(value = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.")
  @Valid
 /**
   * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  **/
  private BigDecimal price;

  @ApiModelProperty(value = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ")
 /**
   * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  **/
  private Long regionId;

  @ApiModelProperty(value = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ")
  @Valid
 /**
   * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  **/
  private BigDecimal shippingCost;

  @ApiModelProperty(value = "Название магазина (в том виде, в котором отображается на Маркете).")
 /**
   * Название магазина (в том виде, в котором отображается на Маркете).
  **/
  private String shopName;

  @ApiModelProperty(value = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ")
 /**
   * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  **/
  private Integer shopRating;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  **/
  private Integer inStock;
 /**
   * Скидка на предложение в процентах.
   * @return discount
  **/
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public ModelOfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

 /**
   * Наименование предложения.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelOfferDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Позиция предложения в выдаче Маркета на карточке модели.
   * @return pos
  **/
  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public ModelOfferDTO pos(Integer pos) {
    this.pos = pos;
    return this;
  }

 /**
   * Цена предложения без скидки магазина.
   * @return preDiscountPrice
  **/
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  public ModelOfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

 /**
   * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ModelOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. 
   * @return regionId
  **/
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public ModelOfferDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
   * Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
   * @return shippingCost
  **/
  @JsonProperty("shippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  public ModelOfferDTO shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

 /**
   * Название магазина (в том виде, в котором отображается на Маркете).
   * @return shopName
  **/
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public ModelOfferDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

 /**
   * Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. 
   * @return shopRating
  **/
  @JsonProperty("shopRating")
  public Integer getShopRating() {
    return shopRating;
  }

  public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }

  public ModelOfferDTO shopRating(Integer shopRating) {
    this.shopRating = shopRating;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return inStock
  **/
  @JsonProperty("inStock")
  public Integer getInStock() {
    return inStock;
  }

  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  public ModelOfferDTO inStock(Integer inStock) {
    this.inStock = inStock;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

