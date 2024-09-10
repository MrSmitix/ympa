package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о предложении.
 */
@ApiModel(description = "Информация о предложении.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelOfferDTO   {
  @JsonProperty("discount")
  private Integer discount;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pos")
  private Integer pos;

  @JsonProperty("preDiscountPrice")
  private BigDecimal preDiscountPrice;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("regionId")
  private Long regionId;

  @JsonProperty("shippingCost")
  private BigDecimal shippingCost;

  @JsonProperty("shopName")
  private String shopName;

  @JsonProperty("shopRating")
  private Integer shopRating;

  @JsonProperty("inStock")
  private Integer inStock;

  public ModelOfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Скидка на предложение в процентах.
   * @return discount
   */
  @ApiModelProperty(value = "Скидка на предложение в процентах.")
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
  @ApiModelProperty(value = "Наименование предложения.")
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
  @ApiModelProperty(value = "Позиция предложения в выдаче Маркета на карточке модели.")
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
  @ApiModelProperty(value = "Цена предложения без скидки магазина.")
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
  @ApiModelProperty(value = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.")
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
  @ApiModelProperty(value = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ")
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
  @ApiModelProperty(value = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ")
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
  @ApiModelProperty(value = "Название магазина (в том виде, в котором отображается на Маркете).")
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
  @ApiModelProperty(value = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ")
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
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
  public Integer getInStock() {
    return inStock;
  }

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

