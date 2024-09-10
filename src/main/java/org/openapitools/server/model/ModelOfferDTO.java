/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.math.BigDecimal;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Информация о предложении.
  */

public class ModelOfferDTO  {
  
 /**
  * Скидка на предложение в процентах.
  */
  @JsonbProperty("discount")
  private Integer discount;

 /**
  * Наименование предложения.
  */
  @JsonbProperty("name")
  private String name;

 /**
  * Позиция предложения в выдаче Маркета на карточке модели.
  */
  @JsonbProperty("pos")
  private Integer pos;

 /**
  * Цена предложения без скидки магазина.
  */
  @JsonbProperty("preDiscountPrice")
  private BigDecimal preDiscountPrice;

 /**
  * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  */
  @JsonbProperty("price")
  private BigDecimal price;

 /**
  * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  */
  @JsonbProperty("regionId")
  private Long regionId;

 /**
  * Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  */
  @JsonbProperty("shippingCost")
  private BigDecimal shippingCost;

 /**
  * Название магазина (в том виде, в котором отображается на Маркете).
  */
  @JsonbProperty("shopName")
  private String shopName;

 /**
  * Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  */
  @JsonbProperty("shopRating")
  private Integer shopRating;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
  @JsonbProperty("inStock")
  private Integer inStock;

  /**
   * Скидка на предложение в процентах.
   * @return discount
   **/
  public Integer getDiscount() {
    return discount;
  }

  /**
   * Set discount
   */
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
  public String getName() {
    return name;
  }

  /**
   * Set name
   */
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
  public Integer getPos() {
    return pos;
  }

  /**
   * Set pos
   */
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
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  /**
   * Set preDiscountPrice
   */
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
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Set price
   */
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
  public Long getRegionId() {
    return regionId;
  }

  /**
   * Set regionId
   */
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
  public BigDecimal getShippingCost() {
    return shippingCost;
  }

  /**
   * Set shippingCost
   */
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
  public String getShopName() {
    return shopName;
  }

  /**
   * Set shopName
   */
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
  public Integer getShopRating() {
    return shopRating;
  }

  /**
   * Set shopRating
   */
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
   * @deprecated
   **/
  @Deprecated
  public Integer getInStock() {
    return inStock;
  }

  /**
   * Set inStock
   */
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

  public ModelOfferDTO inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
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

