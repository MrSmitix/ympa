package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Предложение.
 */
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
     * Default constructor.
     */
    public OfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferDTO.
     *
     * @param price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
     * @param feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @param id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @param shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @param marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
     * @param preDiscountPrice Цена предложения без скидки.
     * @param discount Скидка на предложение в процентах.
     * @param cutPrice Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
     * @param url URL-адрес предложения на сайте магазина.
     * @param modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %} 
     * @param name Наименование предложения.
     * @param currency currency
     * @param bid {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @param cbid {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @param fee {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
     * @param blocked Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
     */
    public OfferDTO(
        BigDecimal price, 
        Long feedId, 
        String id, 
        String shopCategoryId, 
        Integer marketCategoryId, 
        BigDecimal preDiscountPrice, 
        Integer discount, 
        Boolean cutPrice, 
        String url, 
        Long modelId, 
        String name, 
        CurrencyType currency, 
        BigDecimal bid, 
        BigDecimal cbid, 
        BigDecimal fee, 
        Boolean blocked
    ) {
        this.price = price;
        this.feedId = feedId;
        this.id = id;
        this.shopCategoryId = shopCategoryId;
        this.marketCategoryId = marketCategoryId;
        this.preDiscountPrice = preDiscountPrice;
        this.discount = discount;
        this.cutPrice = cutPrice;
        this.url = url;
        this.modelId = modelId;
        this.name = name;
        this.currency = currency;
        this.bid = bid;
        this.cbid = cbid;
        this.fee = fee;
        this.blocked = blocked;
    }



    /**
     * Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @return feedId
     */
    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    /**
     * Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
     * @return shopCategoryId
     */
    public String getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(String shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    /**
     * Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
     * @return marketCategoryId
     */
    public Integer getMarketCategoryId() {
        return marketCategoryId;
    }

    public void setMarketCategoryId(Integer marketCategoryId) {
        this.marketCategoryId = marketCategoryId;
    }

    /**
     * Цена предложения без скидки.
     * @return preDiscountPrice
     */
    public BigDecimal getPreDiscountPrice() {
        return preDiscountPrice;
    }

    public void setPreDiscountPrice(BigDecimal preDiscountPrice) {
        this.preDiscountPrice = preDiscountPrice;
    }

    /**
     * Скидка на предложение в процентах.
     * @return discount
     */
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
     * @return cutPrice
     */
    public Boolean getCutPrice() {
        return cutPrice;
    }

    public void setCutPrice(Boolean cutPrice) {
        this.cutPrice = cutPrice;
    }

    /**
     * URL-адрес предложения на сайте магазина.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
     * @return modelId
     */
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /**
     * Наименование предложения.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get currency
     * @return currency
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @return bid
     */
    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
     * @return cbid
     */
    public BigDecimal getCbid() {
        return cbid;
    }

    public void setCbid(BigDecimal cbid) {
        this.cbid = cbid;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
     * @return fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
     * @return blocked
     */
    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

