package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Предложение.
 */

@Schema(name = "OfferDTO", description = "Предложение.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferDTO {

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

  public OfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferDTO(Long modelId) {
    this.modelId = modelId;
  }

  public OfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
   * @return price
   */
  @Valid 
  @Schema(name = "price", description = "Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
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
  
  @Schema(name = "feedId", description = "Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feedId")
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
  
  @Schema(name = "id", description = "Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "shopCategoryId", description = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopCategoryId")
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
  
  @Schema(name = "marketCategoryId", description = "Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketCategoryId")
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
  @Valid 
  @Schema(name = "preDiscountPrice", description = "Цена предложения без скидки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDiscountPrice")
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
  
  @Schema(name = "discount", description = "Скидка на предложение в процентах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discount")
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
  
  @Schema(name = "cutPrice", description = "Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cutPrice")
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
  
  @Schema(name = "url", description = "URL-адрес предложения на сайте магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
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
  @NotNull 
  @Schema(name = "modelId", description = "Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("modelId")
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
  
  @Schema(name = "name", description = "Наименование предложения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
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
  @Valid 
  @Schema(name = "bid", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid")
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
  @Valid 
  @Schema(name = "cbid", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cbid")
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
  @Valid 
  @Schema(name = "fee", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fee")
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
  
  @Schema(name = "blocked", description = "Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

