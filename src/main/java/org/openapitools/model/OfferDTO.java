/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;



/**
 * Предложение.
 */

@ApiModel(description = "Предложение.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferDTO   {
  
  private BigDecimal price;
  private Long feedId;
  private String id;
  private String shopCategoryId;
  private Integer marketCategoryId;
  private BigDecimal preDiscountPrice;
  private Integer discount;
  private Boolean cutPrice;
  private String url;
  private Long modelId;
  private String name;
  private CurrencyType currency;
  private BigDecimal bid;
  private BigDecimal cbid;
  private BigDecimal fee;
  private Boolean blocked;

  /**
   * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
   */
  public OfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
   */
  public OfferDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  /**
   * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
   */
  public OfferDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
   */
  public OfferDTO shopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  @JsonProperty("shopCategoryId")
  public String getShopCategoryId() {
    return shopCategoryId;
  }
  public void setShopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }

  /**
   * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
   */
  public OfferDTO marketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ")
  @JsonProperty("marketCategoryId")
  public Integer getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  /**
   * Цена предложения без скидки.
   */
  public OfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Цена предложения без скидки.")
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }
  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  /**
   * Скидка на предложение в процентах.
   */
  public OfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  
  @ApiModelProperty(value = "Скидка на предложение в процентах.")
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  /**
   * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
   */
  public OfferDTO cutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ")
  @JsonProperty("cutPrice")
  public Boolean getCutPrice() {
    return cutPrice;
  }
  public void setCutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
  }

  /**
   * URL-адрес предложения на сайте магазина.
   */
  public OfferDTO url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "URL-адрес предложения на сайте магазина.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
   */
  public OfferDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} ")
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }
  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  /**
   * Наименование предложения.
   */
  public OfferDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Наименование предложения.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public OfferDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   */
  public OfferDTO bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
  @JsonProperty("bid")
  public BigDecimal getBid() {
    return bid;
  }
  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   */
  public OfferDTO cbid(BigDecimal cbid) {
    this.cbid = cbid;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
  @JsonProperty("cbid")
  public BigDecimal getCbid() {
    return cbid;
  }
  public void setCbid(BigDecimal cbid) {
    this.cbid = cbid;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
   */
  public OfferDTO fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ")
  @JsonProperty("fee")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  /**
   * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
   */
  public OfferDTO blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  
  @ApiModelProperty(value = "Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. ")
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }
  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDTO offerDTO = (OfferDTO) o;
    return Objects.equals(price, offerDTO.price) &&
        Objects.equals(feedId, offerDTO.feedId) &&
        Objects.equals(id, offerDTO.id) &&
        Objects.equals(shopCategoryId, offerDTO.shopCategoryId) &&
        Objects.equals(marketCategoryId, offerDTO.marketCategoryId) &&
        Objects.equals(preDiscountPrice, offerDTO.preDiscountPrice) &&
        Objects.equals(discount, offerDTO.discount) &&
        Objects.equals(cutPrice, offerDTO.cutPrice) &&
        Objects.equals(url, offerDTO.url) &&
        Objects.equals(modelId, offerDTO.modelId) &&
        Objects.equals(name, offerDTO.name) &&
        Objects.equals(currency, offerDTO.currency) &&
        Objects.equals(bid, offerDTO.bid) &&
        Objects.equals(cbid, offerDTO.cbid) &&
        Objects.equals(fee, offerDTO.fee) &&
        Objects.equals(blocked, offerDTO.blocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, feedId, id, shopCategoryId, marketCategoryId, preDiscountPrice, discount, cutPrice, url, modelId, name, currency, bid, cbid, fee, blocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDTO {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shopCategoryId: ").append(toIndentedString(shopCategoryId)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    preDiscountPrice: ").append(toIndentedString(preDiscountPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    cutPrice: ").append(toIndentedString(cutPrice)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    cbid: ").append(toIndentedString(cbid)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
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

