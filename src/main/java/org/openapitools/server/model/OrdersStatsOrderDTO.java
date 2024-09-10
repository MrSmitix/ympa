package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderStatsStatusType;
import org.openapitools.server.model.OrdersStatsCommissionDTO;
import org.openapitools.server.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.server.model.OrdersStatsItemDTO;
import org.openapitools.server.model.OrdersStatsOrderPaymentType;
import org.openapitools.server.model.OrdersStatsPaymentDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о заказе.
 */
public class OrdersStatsOrderDTO   {

    private Long id;
    private LocalDate creationDate;
    private OffsetDateTime statusUpdateDate;
    private OrderStatsStatusType status;
    private String partnerOrderId;
    private OrdersStatsOrderPaymentType paymentType;
    private Boolean fake;
    private OrdersStatsDeliveryRegionDTO deliveryRegion;
    private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();
    private List<@Valid OrdersStatsItemDTO> initialItems;
    private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();
    private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrdersStatsOrderDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsOrderDTO.
     *
     * @param id Идентификатор заказа.
     * @param creationDate Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
     * @param status status
     * @param partnerOrderId Идентификатор заказа в информационной системе магазина.
     * @param paymentType paymentType
     * @param fake Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
     * @param deliveryRegion deliveryRegion
     * @param items Список товаров в заказе после возможных изменений.
     * @param initialItems Список товаров в заказе до изменений.
     * @param payments Информация о денежных переводах по заказу.
     * @param commissions Информация о комиссиях за заказ.
     */
    public OrdersStatsOrderDTO(
        Long id, 
        LocalDate creationDate, 
        OffsetDateTime statusUpdateDate, 
        OrderStatsStatusType status, 
        String partnerOrderId, 
        OrdersStatsOrderPaymentType paymentType, 
        Boolean fake, 
        OrdersStatsDeliveryRegionDTO deliveryRegion, 
        List<@Valid OrdersStatsItemDTO> items, 
        List<@Valid OrdersStatsItemDTO> initialItems, 
        List<@Valid OrdersStatsPaymentDTO> payments, 
        List<@Valid OrdersStatsCommissionDTO> commissions
    ) {
        this.id = id;
        this.creationDate = creationDate;
        this.statusUpdateDate = statusUpdateDate;
        this.status = status;
        this.partnerOrderId = partnerOrderId;
        this.paymentType = paymentType;
        this.fake = fake;
        this.deliveryRegion = deliveryRegion;
        this.items = items;
        this.initialItems = initialItems;
        this.payments = payments;
        this.commissions = commissions;
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
     * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return creationDate
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
     * @return statusUpdateDate
     */
    public OffsetDateTime getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(OffsetDateTime statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    /**
     * Get status
     * @return status
     */
    public OrderStatsStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatsStatusType status) {
        this.status = status;
    }

    /**
     * Идентификатор заказа в информационной системе магазина.
     * @return partnerOrderId
     */
    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    /**
     * Get paymentType
     * @return paymentType
     */
    public OrdersStatsOrderPaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
        this.paymentType = paymentType;
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
     * Get deliveryRegion
     * @return deliveryRegion
     */
    public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
        return deliveryRegion;
    }

    public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
    }

    /**
     * Список товаров в заказе после возможных изменений.
     * @return items
     */
    public List<@Valid OrdersStatsItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrdersStatsItemDTO> items) {
        this.items = items;
    }

    /**
     * Список товаров в заказе до изменений.
     * @return initialItems
     */
    public List<@Valid OrdersStatsItemDTO> getInitialItems() {
        return initialItems;
    }

    public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
        this.initialItems = initialItems;
    }

    /**
     * Информация о денежных переводах по заказу.
     * @return payments
     */
    public List<@Valid OrdersStatsPaymentDTO> getPayments() {
        return payments;
    }

    public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
        this.payments = payments;
    }

    /**
     * Информация о комиссиях за заказ.
     * @return commissions
     */
    public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
        return commissions;
    }

    public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
        this.commissions = commissions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsOrderDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    statusUpdateDate: ").append(toIndentedString(statusUpdateDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    partnerOrderId: ").append(toIndentedString(partnerOrderId)).append("\n");
        sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
        sb.append("    fake: ").append(toIndentedString(fake)).append("\n");
        sb.append("    deliveryRegion: ").append(toIndentedString(deliveryRegion)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    initialItems: ").append(toIndentedString(initialItems)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
        sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
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

