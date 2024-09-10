package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Предложение.
 **/
@ApiModel(description="Предложение.")

public class OfferDTO  {
  
  @ApiModelProperty(value = "Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ")
 /**
   * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
  **/
  private BigDecimal price;

  @ApiModelProperty(value = "Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ")
 /**
   * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
  **/
  private Long feedId;

  @ApiModelProperty(value = "Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ")
 /**
   * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
  **/
  private String id;

  @ApiModelProperty(value = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ")
 /**
   * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
  **/
  private String shopCategoryId;

  @ApiModelProperty(value = "Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ")
 /**
   * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
  **/
  private Integer marketCategoryId;

  @ApiModelProperty(value = "Цена предложения без скидки.")
 /**
   * Цена предложения без скидки.
  **/
  private BigDecimal preDiscountPrice;

  @ApiModelProperty(value = "Скидка на предложение в процентах.")
 /**
   * Скидка на предложение в процентах.
  **/
  private Integer discount;

  @ApiModelProperty(value = "Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ")
 /**
   * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
  **/
  private Boolean cutPrice;

  @ApiModelProperty(value = "URL-адрес предложения на сайте магазина.")
 /**
   * URL-адрес предложения на сайте магазина.
  **/
  private String url;

  @ApiModelProperty(required = true, value = "Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} ")
 /**
   * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
  **/
  private Long modelId;

  @ApiModelProperty(value = "Наименование предложения.")
 /**
   * Наименование предложения.
  **/
  private String name;

  @ApiModelProperty(value = "")
  private CurrencyType currency;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  **/
  private BigDecimal bid;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  **/
  private BigDecimal cbid;

  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ")
 /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
  **/
  private BigDecimal fee;

  @ApiModelProperty(value = "Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. ")
 /**
   * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
  **/
  private Boolean blocked;
 /**
   * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return feedId
  **/
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public OfferDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
   * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return shopCategoryId
  **/
  @JsonProperty("shopCategoryId")
  public String getShopCategoryId() {
    return shopCategoryId;
  }

  public void setShopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }

  public OfferDTO shopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
    return this;
  }

 /**
   * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return marketCategoryId
  **/
  @JsonProperty("marketCategoryId")
  public Integer getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public OfferDTO marketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

 /**
   * Цена предложения без скидки.
   * @return preDiscountPrice
  **/
  @JsonProperty("preDiscountPrice")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  public OfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

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

  public OfferDTO discount(Integer discount) {
    this.discount = discount;
    return this;
  }

 /**
   * Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
   * @return cutPrice
  **/
  @JsonProperty("cutPrice")
  public Boolean getCutPrice() {
    return cutPrice;
  }

  public void setCutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
  }

  public OfferDTO cutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
    return this;
  }

 /**
   * URL-адрес предложения на сайте магазина.
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OfferDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %} 
   * @return modelId
  **/
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public OfferDTO modelId(Long modelId) {
    this.modelId = modelId;
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

  public OfferDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public OfferDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   * @return bid
  **/
  @JsonProperty("bid")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public OfferDTO bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   * @return cbid
  **/
  @JsonProperty("cbid")
  public BigDecimal getCbid() {
    return cbid;
  }

  public void setCbid(BigDecimal cbid) {
    this.cbid = cbid;
  }

  public OfferDTO cbid(BigDecimal cbid) {
    this.cbid = cbid;
    return this;
  }

 /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
   * @return fee
  **/
  @JsonProperty("fee")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public OfferDTO fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

 /**
   * Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
   * @return blocked
  **/
  @JsonProperty("blocked")
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public OfferDTO blocked(Boolean blocked) {
    this.blocked = blocked;
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
    OfferDTO offerDTO = (OfferDTO) o;
    return Objects.equals(this.price, offerDTO.price) &&
        Objects.equals(this.feedId, offerDTO.feedId) &&
        Objects.equals(this.id, offerDTO.id) &&
        Objects.equals(this.shopCategoryId, offerDTO.shopCategoryId) &&
        Objects.equals(this.marketCategoryId, offerDTO.marketCategoryId) &&
        Objects.equals(this.preDiscountPrice, offerDTO.preDiscountPrice) &&
        Objects.equals(this.discount, offerDTO.discount) &&
        Objects.equals(this.cutPrice, offerDTO.cutPrice) &&
        Objects.equals(this.url, offerDTO.url) &&
        Objects.equals(this.modelId, offerDTO.modelId) &&
        Objects.equals(this.name, offerDTO.name) &&
        Objects.equals(this.currency, offerDTO.currency) &&
        Objects.equals(this.bid, offerDTO.bid) &&
        Objects.equals(this.cbid, offerDTO.cbid) &&
        Objects.equals(this.fee, offerDTO.fee) &&
        Objects.equals(this.blocked, offerDTO.blocked);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

