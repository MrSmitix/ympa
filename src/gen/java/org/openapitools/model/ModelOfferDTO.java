package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о предложении.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelOfferDTO   {
  
  private Integer discount;
  private String name;
  private Integer pos;
  private BigDecimal preDiscountPrice;
  private BigDecimal price;
  private Long regionId;
  private BigDecimal shippingCost;
  private String shopName;
  private Integer shopRating;
  private Integer inStock;

  /**
   * Скидка на предложение в процентах.
   **/
  
  @ApiModelProperty(value = "Скидка на предложение в процентах.")
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  /**
   * Наименование предложения.
   **/
  
  @ApiModelProperty(value = "Наименование предложения.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Позиция предложения в выдаче Маркета на карточке модели.
   **/
  
  @ApiModelProperty(value = "Позиция предложения в выдаче Маркета на карточке модели.")
  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }
  public void setPos(Integer pos) {
    this.pos = pos;
  }

  /**
   * Цена предложения без скидки магазина.
   **/
  
  @ApiModelProperty(value = "Цена предложения без скидки магазина.")
  @JsonProperty("preDiscountPrice")
  @Valid
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }
  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  /**
   * Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
   **/
  
  @ApiModelProperty(value = "Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.")
  @JsonProperty("price")
  @Valid
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них. 
   **/
  
  @ApiModelProperty(value = "Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. ")
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  /**
   * Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
   **/
  
  @ApiModelProperty(value = "Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. ")
  @JsonProperty("shippingCost")
  @Valid
  public BigDecimal getShippingCost() {
    return shippingCost;
  }
  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }

  /**
   * Название магазина (в том виде, в котором отображается на Маркете).
   **/
  
  @ApiModelProperty(value = "Название магазина (в том виде, в котором отображается на Маркете).")
  @JsonProperty("shopName")
  public String getShopName() {
    return shopName;
  }
  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  /**
   * Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;. 
   **/
  
  @ApiModelProperty(value = "Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. ")
  @JsonProperty("shopRating")
  public Integer getShopRating() {
    return shopRating;
  }
  public void setShopRating(Integer shopRating) {
    this.shopRating = shopRating;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   **/
  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
  @JsonProperty("inStock")
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

