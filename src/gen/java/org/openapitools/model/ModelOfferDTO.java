package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о предложении.
 */
@ApiModel(description="Информация о предложении.")

public class ModelOfferDTO  {
  
 /**
  * Скидка на предложение в процентах.
  */
  @ApiModelProperty(value = "Скидка на предложение в процентах.")
  private Integer discount;

 /**
  * Наименование предложения.
  */
  @ApiModelProperty(value = "Наименование предложения.")
  private String name;

 /**
  * Позиция предложения в выдаче Маркета на карточке модели.
  */
  @ApiModelProperty(value = "Позиция предложения в выдаче Маркета на карточке модели.")
  private Integer pos;

 /**
  * Цена предложения без скидки магазина.
  */
  @ApiModelProperty(value = "Цена предложения без скидки магазина.")
  @Valid
  private BigDecimal preDiscountPrice;

 /**
  * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  */
  @ApiModelProperty(value = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.")
  @Valid
  private BigDecimal price;

 /**
  * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  */
  @ApiModelProperty(value = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ")
  private Long regionId;

 /**
  * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  */
  @ApiModelProperty(value = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ")
  @Valid
  private BigDecimal shippingCost;

 /**
  * Название магазина (в том виде, в котором отображается на Маркете).
  */
  @ApiModelProperty(value = "Название магазина (в том виде, в котором отображается на Маркете).")
  private String shopName;

 /**
  * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  */
  @ApiModelProperty(value = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ")
  private Integer shopRating;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
  private Integer inStock;
 /**
  * Скидка на предложение в процентах.
  * @return discount
  */
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }

  /**
   * Sets the <code>discount</code> property.
   */
 public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  /**
   * Sets the <code>discount</code> property.
   */
  public ModelOfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

 /**
  * Наименование предложения.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ModelOfferDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Позиция предложения в выдаче Маркета на карточке модели.
  * @return pos
  */
  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }

  /**
   * Sets the <code>pos</code> property.
   */
 public void setPos(Integer pos) {
    this.pos = pos;
  }

  /**
   * Sets the <code>pos</code> property.
   */
  public ModelOfferDTO pos(Integer pos) {
    this.pos = pos;
    return this;
  }

 /**
  * Цена предложения без скидки магазина.
  * @return preDiscountPrice
  */
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  /**
   * Sets the <code>preDiscountPrice</code> property.
   */
 public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  /**
   * Sets the <code>preDiscountPrice</code> property.
   */
  public ModelOfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

 /**
  * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  * @return price
  */
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public ModelOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. 
  * @return regionId
  */
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
 public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   * Sets the <code>regionId</code> property.
   */
  public ModelOfferDTO regionId(Long regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
  * Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  * @return shippingCost
  */
  @JsonProperty("shippingCost")
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  /**
   * Sets the <code>shippingCost</code> property.
   */
 public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  /**
   * Sets the <code>shippingCost</code> property.
   */
  public ModelOfferDTO shippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

 /**
  * Название магазина (в том виде, в котором отображается на Маркете).
  * @return shopName
  */
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }

  /**
   * Sets the <code>shopName</code> property.
   */
 public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Sets the <code>shopName</code> property.
   */
  public ModelOfferDTO shopName(String shopName) {
    this.shopName = shopName;
    return this;
  }

 /**
  * Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. 
  * @return shopRating
  */
  @JsonProperty("shopRating")
  public Integer getShopRating() {
    return shopRating;
  }

  /**
   * Sets the <code>shopRating</code> property.
   */
 public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }

  /**
   * Sets the <code>shopRating</code> property.
   */
  public ModelOfferDTO shopRating(Integer shopRating) {
    this.shopRating = shopRating;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  * @return inStock
  */
  @JsonProperty("inStock")
  public Integer getInStock() {
    return inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
 public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  /**
   * Sets the <code>inStock</code> property.
   */
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

