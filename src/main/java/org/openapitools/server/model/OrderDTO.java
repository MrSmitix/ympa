package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CurrencyType;
import org.openapitools.server.model.OrderBuyerDTO;
import org.openapitools.server.model.OrderDeliveryDTO;
import org.openapitools.server.model.OrderItemDTO;
import org.openapitools.server.model.OrderPaymentMethodType;
import org.openapitools.server.model.OrderPaymentType;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubsidyDTO;
import org.openapitools.server.model.OrderSubstatusType;
import org.openapitools.server.model.OrderTaxSystemType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Заказ.
 */
public class OrderDTO   {

    private Long id;
    private OrderStatusType status;
    private OrderSubstatusType substatus;
    private String creationDate;
    private String updatedAt;
    private CurrencyType currency;
    private BigDecimal itemsTotal;
    private BigDecimal deliveryTotal;
    private BigDecimal buyerItemsTotal;
    private BigDecimal buyerTotal;
    private BigDecimal buyerItemsTotalBeforeDiscount;
    private BigDecimal buyerTotalBeforeDiscount;
    private OrderPaymentType paymentType;
    private OrderPaymentMethodType paymentMethod;
    private Boolean fake;
    private List<@Valid OrderItemDTO> items = new ArrayList<>();
    private List<@Valid OrderSubsidyDTO> subsidies;
    private OrderDeliveryDTO delivery;
    private OrderBuyerDTO buyer;
    private String notes;
    private OrderTaxSystemType taxSystem;
    private Boolean cancelRequested;
    private String expiryDate;

    /**
     * Default constructor.
     */
    public OrderDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDTO.
     *
     * @param id Идентификатор заказа.
     * @param status status
     * @param substatus substatus
     * @param creationDate creationDate
     * @param updatedAt updatedAt
     * @param currency currency
     * @param itemsTotal Платеж покупателя. 
     * @param deliveryTotal Стоимость доставки. 
     * @param buyerItemsTotal {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
     * @param buyerTotal {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
     * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
     * @param buyerTotalBeforeDiscount {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
     * @param paymentType paymentType
     * @param paymentMethod paymentMethod
     * @param fake Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
     * @param items Список товаров в заказе.
     * @param subsidies Список субсидий по типам.
     * @param delivery delivery
     * @param buyer buyer
     * @param notes Комментарий к заказу.
     * @param taxSystem taxSystem
     * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена. 
     * @param expiryDate expiryDate
     */
    public OrderDTO(
        Long id, 
        OrderStatusType status, 
        OrderSubstatusType substatus, 
        String creationDate, 
        String updatedAt, 
        CurrencyType currency, 
        BigDecimal itemsTotal, 
        BigDecimal deliveryTotal, 
        BigDecimal buyerItemsTotal, 
        BigDecimal buyerTotal, 
        BigDecimal buyerItemsTotalBeforeDiscount, 
        BigDecimal buyerTotalBeforeDiscount, 
        OrderPaymentType paymentType, 
        OrderPaymentMethodType paymentMethod, 
        Boolean fake, 
        List<@Valid OrderItemDTO> items, 
        List<@Valid OrderSubsidyDTO> subsidies, 
        OrderDeliveryDTO delivery, 
        OrderBuyerDTO buyer, 
        String notes, 
        OrderTaxSystemType taxSystem, 
        Boolean cancelRequested, 
        String expiryDate
    ) {
        this.id = id;
        this.status = status;
        this.substatus = substatus;
        this.creationDate = creationDate;
        this.updatedAt = updatedAt;
        this.currency = currency;
        this.itemsTotal = itemsTotal;
        this.deliveryTotal = deliveryTotal;
        this.buyerItemsTotal = buyerItemsTotal;
        this.buyerTotal = buyerTotal;
        this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
        this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
        this.paymentType = paymentType;
        this.paymentMethod = paymentMethod;
        this.fake = fake;
        this.items = items;
        this.subsidies = subsidies;
        this.delivery = delivery;
        this.buyer = buyer;
        this.notes = notes;
        this.taxSystem = taxSystem;
        this.cancelRequested = cancelRequested;
        this.expiryDate = expiryDate;
    }



    /**
     * Идентификатор заказа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get status
     * @return status
     */
    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    /**
     * Get substatus
     * @return substatus
     */
    public OrderSubstatusType getSubstatus() {
        return substatus;
    }

    public void setSubstatus(OrderSubstatusType substatus) {
        this.substatus = substatus;
    }

    /**
     * Get creationDate
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
     * Платеж покупателя. 
     * @return itemsTotal
     */
    public BigDecimal getItemsTotal() {
        return itemsTotal;
    }

    public void setItemsTotal(BigDecimal itemsTotal) {
        this.itemsTotal = itemsTotal;
    }

    /**
     * Стоимость доставки. 
     * @return deliveryTotal
     */
    public BigDecimal getDeliveryTotal() {
        return deliveryTotal;
    }

    public void setDeliveryTotal(BigDecimal deliveryTotal) {
        this.deliveryTotal = deliveryTotal;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
     * @return buyerItemsTotal
     */
    public BigDecimal getBuyerItemsTotal() {
        return buyerItemsTotal;
    }

    public void setBuyerItemsTotal(BigDecimal buyerItemsTotal) {
        this.buyerItemsTotal = buyerItemsTotal;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
     * @return buyerTotal
     */
    public BigDecimal getBuyerTotal() {
        return buyerTotal;
    }

    public void setBuyerTotal(BigDecimal buyerTotal) {
        this.buyerTotal = buyerTotal;
    }

    /**
     * Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
     * @return buyerItemsTotalBeforeDiscount
     */
    public BigDecimal getBuyerItemsTotalBeforeDiscount() {
        return buyerItemsTotalBeforeDiscount;
    }

    public void setBuyerItemsTotalBeforeDiscount(BigDecimal buyerItemsTotalBeforeDiscount) {
        this.buyerItemsTotalBeforeDiscount = buyerItemsTotalBeforeDiscount;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
     * @return buyerTotalBeforeDiscount
     */
    public BigDecimal getBuyerTotalBeforeDiscount() {
        return buyerTotalBeforeDiscount;
    }

    public void setBuyerTotalBeforeDiscount(BigDecimal buyerTotalBeforeDiscount) {
        this.buyerTotalBeforeDiscount = buyerTotalBeforeDiscount;
    }

    /**
     * Get paymentType
     * @return paymentType
     */
    public OrderPaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(OrderPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Get paymentMethod
     * @return paymentMethod
     */
    public OrderPaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(OrderPaymentMethodType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
     * @return fake
     */
    public Boolean getFake() {
        return fake;
    }

    public void setFake(Boolean fake) {
        this.fake = fake;
    }

    /**
     * Список товаров в заказе.
     * @return items
     */
    public List<@Valid OrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrderItemDTO> items) {
        this.items = items;
    }

    /**
     * Список субсидий по типам.
     * @return subsidies
     */
    public List<@Valid OrderSubsidyDTO> getSubsidies() {
        return subsidies;
    }

    public void setSubsidies(List<@Valid OrderSubsidyDTO> subsidies) {
        this.subsidies = subsidies;
    }

    /**
     * Get delivery
     * @return delivery
     */
    public OrderDeliveryDTO getDelivery() {
        return delivery;
    }

    public void setDelivery(OrderDeliveryDTO delivery) {
        this.delivery = delivery;
    }

    /**
     * Get buyer
     * @return buyer
     */
    public OrderBuyerDTO getBuyer() {
        return buyer;
    }

    public void setBuyer(OrderBuyerDTO buyer) {
        this.buyer = buyer;
    }

    /**
     * Комментарий к заказу.
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Get taxSystem
     * @return taxSystem
     */
    public OrderTaxSystemType getTaxSystem() {
        return taxSystem;
    }

    public void setTaxSystem(OrderTaxSystemType taxSystem) {
        this.taxSystem = taxSystem;
    }

    /**
     * **Только для модели DBS**  Запрошена ли отмена. 
     * @return cancelRequested
     */
    public Boolean getCancelRequested() {
        return cancelRequested;
    }

    public void setCancelRequested(Boolean cancelRequested) {
        this.cancelRequested = cancelRequested;
    }

    /**
     * Get expiryDate
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
        sb.append("    deliveryTotal: ").append(toIndentedString(deliveryTotal)).append("\n");
        sb.append("    buyerItemsTotal: ").append(toIndentedString(buyerItemsTotal)).append("\n");
        sb.append("    buyerTotal: ").append(toIndentedString(buyerTotal)).append("\n");
        sb.append("    buyerItemsTotalBeforeDiscount: ").append(toIndentedString(buyerItemsTotalBeforeDiscount)).append("\n");
        sb.append("    buyerTotalBeforeDiscount: ").append(toIndentedString(buyerTotalBeforeDiscount)).append("\n");
        sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    fake: ").append(toIndentedString(fake)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    subsidies: ").append(toIndentedString(subsidies)).append("\n");
        sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
        sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    taxSystem: ").append(toIndentedString(taxSystem)).append("\n");
        sb.append("    cancelRequested: ").append(toIndentedString(cancelRequested)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

