package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderItemDetailDTO;
import org.openapitools.server.model.OrderItemInstanceDTO;
import org.openapitools.server.model.OrderItemInstanceType;
import org.openapitools.server.model.OrderItemPromoDTO;
import org.openapitools.server.model.OrderItemSubsidyDTO;
import org.openapitools.server.model.OrderVatType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров в заказе.
 */
public class OrderItemDTO   {

    private Long id;
    private String offerId;
    private String offerName;
    private BigDecimal price;
    private BigDecimal buyerPrice;
    private BigDecimal buyerPriceBeforeDiscount;
    private BigDecimal priceBeforeDiscount;
    private Integer count;
    private OrderVatType vat;
    private String shopSku;
    private BigDecimal subsidy;
    private String partnerWarehouseId;
    private List<@Valid OrderItemPromoDTO> promos;
    private List<@Valid OrderItemInstanceDTO> instances;
    private List<@Valid OrderItemDetailDTO> details;
    private List<@Valid OrderItemSubsidyDTO> subsidies;
    private List<OrderItemInstanceType> requiredInstanceTypes;

    /**
     * Default constructor.
     */
    public OrderItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemDTO.
     *
     * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param offerName Название товара.
     * @param price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;). 
     * @param buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
     * @param buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
     * @param priceBeforeDiscount {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
     * @param count Количество единиц товара.
     * @param vat vat
     * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param subsidy {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
     * @param partnerWarehouseId {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
     * @param promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
     * @param instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует. 
     * @param details Информация об удалении товара из заказа. 
     * @param subsidies Список субсидий по типам.
     * @param requiredInstanceTypes Список необходимых маркировок товара.
     */
    public OrderItemDTO(
        Long id, 
        String offerId, 
        String offerName, 
        BigDecimal price, 
        BigDecimal buyerPrice, 
        BigDecimal buyerPriceBeforeDiscount, 
        BigDecimal priceBeforeDiscount, 
        Integer count, 
        OrderVatType vat, 
        String shopSku, 
        BigDecimal subsidy, 
        String partnerWarehouseId, 
        List<@Valid OrderItemPromoDTO> promos, 
        List<@Valid OrderItemInstanceDTO> instances, 
        List<@Valid OrderItemDetailDTO> details, 
        List<@Valid OrderItemSubsidyDTO> subsidies, 
        List<OrderItemInstanceType> requiredInstanceTypes
    ) {
        this.id = id;
        this.offerId = offerId;
        this.offerName = offerName;
        this.price = price;
        this.buyerPrice = buyerPrice;
        this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
        this.priceBeforeDiscount = priceBeforeDiscount;
        this.count = count;
        this.vat = vat;
        this.shopSku = shopSku;
        this.subsidy = subsidy;
        this.partnerWarehouseId = partnerWarehouseId;
        this.promos = promos;
        this.instances = instances;
        this.details = details;
        this.subsidies = subsidies;
        this.requiredInstanceTypes = requiredInstanceTypes;
    }



    /**
     * Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * Название товара.
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
     * @return buyerPrice
     */
    public BigDecimal getBuyerPrice() {
        return buyerPrice;
    }

    public void setBuyerPrice(BigDecimal buyerPrice) {
        this.buyerPrice = buyerPrice;
    }

    /**
     * Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
     * @return buyerPriceBeforeDiscount
     */
    public BigDecimal getBuyerPriceBeforeDiscount() {
        return buyerPriceBeforeDiscount;
    }

    public void setBuyerPriceBeforeDiscount(BigDecimal buyerPriceBeforeDiscount) {
        this.buyerPriceBeforeDiscount = buyerPriceBeforeDiscount;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
     * @return priceBeforeDiscount
     */
    public BigDecimal getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    public void setPriceBeforeDiscount(BigDecimal priceBeforeDiscount) {
        this.priceBeforeDiscount = priceBeforeDiscount;
    }

    /**
     * Количество единиц товара.
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Get vat
     * @return vat
     */
    public OrderVatType getVat() {
        return vat;
    }

    public void setVat(OrderVatType vat) {
        this.vat = vat;
    }

    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return shopSku
     */
    public String getShopSku() {
        return shopSku;
    }

    public void setShopSku(String shopSku) {
        this.shopSku = shopSku;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
     * @return subsidy
     */
    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
     * @return partnerWarehouseId
     */
    public String getPartnerWarehouseId() {
        return partnerWarehouseId;
    }

    public void setPartnerWarehouseId(String partnerWarehouseId) {
        this.partnerWarehouseId = partnerWarehouseId;
    }

    /**
     * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
     * @return promos
     */
    public List<@Valid OrderItemPromoDTO> getPromos() {
        return promos;
    }

    public void setPromos(List<@Valid OrderItemPromoDTO> promos) {
        this.promos = promos;
    }

    /**
     * Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
     * @return instances
     */
    public List<@Valid OrderItemInstanceDTO> getInstances() {
        return instances;
    }

    public void setInstances(List<@Valid OrderItemInstanceDTO> instances) {
        this.instances = instances;
    }

    /**
     * Информация об удалении товара из заказа. 
     * @return details
     */
    public List<@Valid OrderItemDetailDTO> getDetails() {
        return details;
    }

    public void setDetails(List<@Valid OrderItemDetailDTO> details) {
        this.details = details;
    }

    /**
     * Список субсидий по типам.
     * @return subsidies
     */
    public List<@Valid OrderItemSubsidyDTO> getSubsidies() {
        return subsidies;
    }

    public void setSubsidies(List<@Valid OrderItemSubsidyDTO> subsidies) {
        this.subsidies = subsidies;
    }

    /**
     * Список необходимых маркировок товара.
     * @return requiredInstanceTypes
     */
    public List<OrderItemInstanceType> getRequiredInstanceTypes() {
        return requiredInstanceTypes;
    }

    public void setRequiredInstanceTypes(List<OrderItemInstanceType> requiredInstanceTypes) {
        this.requiredInstanceTypes = requiredInstanceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    buyerPrice: ").append(toIndentedString(buyerPrice)).append("\n");
        sb.append("    buyerPriceBeforeDiscount: ").append(toIndentedString(buyerPriceBeforeDiscount)).append("\n");
        sb.append("    priceBeforeDiscount: ").append(toIndentedString(priceBeforeDiscount)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
        sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
        sb.append("    subsidy: ").append(toIndentedString(subsidy)).append("\n");
        sb.append("    partnerWarehouseId: ").append(toIndentedString(partnerWarehouseId)).append("\n");
        sb.append("    promos: ").append(toIndentedString(promos)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    subsidies: ").append(toIndentedString(subsidies)).append("\n");
        sb.append("    requiredInstanceTypes: ").append(toIndentedString(requiredInstanceTypes)).append("\n");
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

