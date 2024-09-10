package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CurrencyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Предложение.
 */
@ApiModel(description = "Предложение.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferDTO   {
  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("feedId")
  private Long feedId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("shopCategoryId")
  private String shopCategoryId;

  @JsonProperty("marketCategoryId")
  private Integer marketCategoryId;

  @JsonProperty("preDiscountPrice")
  private BigDecimal preDiscountPrice;

  @JsonProperty("discount")
  private Integer discount;

  @JsonProperty("cutPrice")
  private Boolean cutPrice;

  @JsonProperty("url")
  private String url;

  @JsonProperty("modelId")
  private Long modelId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("currency")
  private CurrencyType currency;

  @JsonProperty("bid")
  private BigDecimal bid;

  @JsonProperty("cbid")
  private BigDecimal cbid;

  @JsonProperty("fee")
  private BigDecimal fee;

  @JsonProperty("blocked")
  private Boolean blocked;

  public OfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
   * @return price
   */
  @ApiModelProperty(value = "Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OfferDTO feedId(Long feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return feedId
   */
  @ApiModelProperty(value = "Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  public Long getFeedId() {
    return feedId;
  }

  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

  public OfferDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferDTO shopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
    return this;
  }

  /**
   * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return shopCategoryId
   */
  @ApiModelProperty(value = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ")
  public String getShopCategoryId() {
    return shopCategoryId;
  }

  public void setShopCategoryId(String shopCategoryId) {
    this.shopCategoryId = shopCategoryId;
  }

  public OfferDTO marketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

  /**
   * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
   * @return marketCategoryId
   */
  @ApiModelProperty(value = "Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ")
  public Integer getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Integer marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public OfferDTO preDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
    return this;
  }

  /**
   * Цена предложения без скидки.
   * @return preDiscountPrice
   */
  @ApiModelProperty(value = "Цена предложения без скидки.")
  public BigDecimal getPreDiscountPrice() {
    return preDiscountPrice;
  }

  public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
    this.preDiscountPrice = preDiscountPrice;
  }

  public OfferDTO discount(Integer discount) {
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

  public OfferDTO cutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
    return this;
  }

  /**
   * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
   * @return cutPrice
   */
  @ApiModelProperty(value = "Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ")
  public Boolean getCutPrice() {
    return cutPrice;
  }

  public void setCutPrice(Boolean cutPrice) {
    this.cutPrice = cutPrice;
  }

  public OfferDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL-адрес предложения на сайте магазина.
   * @return url
   */
  @ApiModelProperty(value = "URL-адрес предложения на сайте магазина.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OfferDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
   * @return modelId
   */
  @ApiModelProperty(required = true, value = "Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} ")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public OfferDTO name(String name) {
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

  public OfferDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @ApiModelProperty(value = "")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  public OfferDTO bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   * @return bid
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public OfferDTO cbid(BigDecimal cbid) {
    this.cbid = cbid;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
   * @return cbid
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ")
  public BigDecimal getCbid() {
    return cbid;
  }

  public void setCbid(BigDecimal cbid) {
    this.cbid = cbid;
  }

  public OfferDTO fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
   * @return fee
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public OfferDTO blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
   * @return blocked
   */
  @ApiModelProperty(value = "Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

