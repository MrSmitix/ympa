/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о заказе.
 */
@JsonPropertyOrder({
  OrdersStatsOrderDTO.JSON_PROPERTY_ID,
  OrdersStatsOrderDTO.JSON_PROPERTY_CREATION_DATE,
  OrdersStatsOrderDTO.JSON_PROPERTY_STATUS_UPDATE_DATE,
  OrdersStatsOrderDTO.JSON_PROPERTY_STATUS,
  OrdersStatsOrderDTO.JSON_PROPERTY_PARTNER_ORDER_ID,
  OrdersStatsOrderDTO.JSON_PROPERTY_PAYMENT_TYPE,
  OrdersStatsOrderDTO.JSON_PROPERTY_FAKE,
  OrdersStatsOrderDTO.JSON_PROPERTY_DELIVERY_REGION,
  OrdersStatsOrderDTO.JSON_PROPERTY_ITEMS,
  OrdersStatsOrderDTO.JSON_PROPERTY_INITIAL_ITEMS,
  OrdersStatsOrderDTO.JSON_PROPERTY_PAYMENTS,
  OrdersStatsOrderDTO.JSON_PROPERTY_COMMISSIONS
})
@JsonTypeName("OrdersStatsOrderDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrdersStatsOrderDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
    private LocalDate creationDate;

    public static final String JSON_PROPERTY_STATUS_UPDATE_DATE = "statusUpdateDate";
    private OffsetDateTime statusUpdateDate;

    public static final String JSON_PROPERTY_STATUS = "status";
    private OrderStatsStatusType status;

    public static final String JSON_PROPERTY_PARTNER_ORDER_ID = "partnerOrderId";
    private String partnerOrderId;

    public static final String JSON_PROPERTY_PAYMENT_TYPE = "paymentType";
    private OrdersStatsOrderPaymentType paymentType;

    public static final String JSON_PROPERTY_FAKE = "fake";
    private Boolean fake;

    public static final String JSON_PROPERTY_DELIVERY_REGION = "deliveryRegion";
    private OrdersStatsDeliveryRegionDTO deliveryRegion;

    public static final String JSON_PROPERTY_ITEMS = "items";
    private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();

    public static final String JSON_PROPERTY_INITIAL_ITEMS = "initialItems";
    private List<@Valid OrdersStatsItemDTO> initialItems = null;

    public static final String JSON_PROPERTY_PAYMENTS = "payments";
    private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();

    public static final String JSON_PROPERTY_COMMISSIONS = "commissions";
    private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();

    public OrdersStatsOrderDTO(List<@Valid OrdersStatsItemDTO> items, List<@Valid OrdersStatsPaymentDTO> payments, List<@Valid OrdersStatsCommissionDTO> commissions) {
        this.items = items;
        this.payments = payments;
        this.commissions = commissions;
    }

    public OrdersStatsOrderDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор заказа.
     * @return id
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(Long id) {
        this.id = id;
    }

    public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @return creationDate
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public OrdersStatsOrderDTO statusUpdateDate(OffsetDateTime statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
        return this;
    }

    /**
     * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
     * @return statusUpdateDate
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS_UPDATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getStatusUpdateDate() {
        return statusUpdateDate;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_UPDATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setStatusUpdateDate(OffsetDateTime statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderStatsStatusType getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(OrderStatsStatusType status) {
        this.status = status;
    }

    public OrdersStatsOrderDTO partnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
        return this;
    }

    /**
     * Идентификатор заказа в информационной системе магазина.
     * @return partnerOrderId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARTNER_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    @JsonProperty(JSON_PROPERTY_PARTNER_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public OrdersStatsOrderDTO paymentType(OrdersStatsOrderPaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Get paymentType
     * @return paymentType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersStatsOrderPaymentType getPaymentType() {
        return paymentType;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public OrdersStatsOrderDTO fake(Boolean fake) {
        this.fake = fake;
        return this;
    }

    /**
     * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
     * @return fake
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getFake() {
        return fake;
    }

    @JsonProperty(JSON_PROPERTY_FAKE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFake(Boolean fake) {
        this.fake = fake;
    }

    public OrdersStatsOrderDTO deliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
        return this;
    }

    /**
     * Get deliveryRegion
     * @return deliveryRegion
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_DELIVERY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
        return deliveryRegion;
    }

    @JsonProperty(JSON_PROPERTY_DELIVERY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
        this.deliveryRegion = deliveryRegion;
    }

    public OrdersStatsOrderDTO items(List<@Valid OrdersStatsItemDTO> items) {
        this.items = items;
        return this;
    }

    public OrdersStatsOrderDTO addItemsItem(OrdersStatsItemDTO itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Список товаров в заказе после возможных изменений.
     * @return items
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid OrdersStatsItemDTO> getItems() {
        return items;
    }

    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItems(List<@Valid OrdersStatsItemDTO> items) {
        this.items = items;
    }

    public OrdersStatsOrderDTO initialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
        this.initialItems = initialItems;
        return this;
    }

    public OrdersStatsOrderDTO addInitialItemsItem(OrdersStatsItemDTO initialItemsItem) {
        if (this.initialItems == null) {
            this.initialItems = new ArrayList<>();
        }
        this.initialItems.add(initialItemsItem);
        return this;
    }

    /**
     * Список товаров в заказе до изменений.
     * @return initialItems
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_INITIAL_ITEMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OrdersStatsItemDTO> getInitialItems() {
        return initialItems;
    }

    @JsonProperty(JSON_PROPERTY_INITIAL_ITEMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
        this.initialItems = initialItems;
    }

    public OrdersStatsOrderDTO payments(List<@Valid OrdersStatsPaymentDTO> payments) {
        this.payments = payments;
        return this;
    }

    public OrdersStatsOrderDTO addPaymentsItem(OrdersStatsPaymentDTO paymentsItem) {
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * Информация о денежных переводах по заказу.
     * @return payments
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_PAYMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid OrdersStatsPaymentDTO> getPayments() {
        return payments;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
        this.payments = payments;
    }

    public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
        this.commissions = commissions;
        return this;
    }

    public OrdersStatsOrderDTO addCommissionsItem(OrdersStatsCommissionDTO commissionsItem) {
        this.commissions.add(commissionsItem);
        return this;
    }

    /**
     * Информация о комиссиях за заказ.
     * @return commissions
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_COMMISSIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
        return commissions;
    }

    @JsonProperty(JSON_PROPERTY_COMMISSIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
        this.commissions = commissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrdersStatsOrderDTO ordersStatsOrderDTO = (OrdersStatsOrderDTO) o;
        return Objects.equals(this.id, ordersStatsOrderDTO.id) &&
            Objects.equals(this.creationDate, ordersStatsOrderDTO.creationDate) &&
            Objects.equals(this.statusUpdateDate, ordersStatsOrderDTO.statusUpdateDate) &&
            Objects.equals(this.status, ordersStatsOrderDTO.status) &&
            Objects.equals(this.partnerOrderId, ordersStatsOrderDTO.partnerOrderId) &&
            Objects.equals(this.paymentType, ordersStatsOrderDTO.paymentType) &&
            Objects.equals(this.fake, ordersStatsOrderDTO.fake) &&
            Objects.equals(this.deliveryRegion, ordersStatsOrderDTO.deliveryRegion) &&
            Objects.equals(this.items, ordersStatsOrderDTO.items) &&
            Objects.equals(this.initialItems, ordersStatsOrderDTO.initialItems) &&
            Objects.equals(this.payments, ordersStatsOrderDTO.payments) &&
            Objects.equals(this.commissions, ordersStatsOrderDTO.commissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate, statusUpdateDate, status, partnerOrderId, paymentType, fake, deliveryRegion, items, initialItems, payments, commissions);
    }

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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

