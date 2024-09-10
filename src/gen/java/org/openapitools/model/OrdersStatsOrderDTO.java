package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о заказе.
 **/
@ApiModel(description="Информация о заказе.")

public class OrdersStatsOrderDTO  {
  
  @ApiModelProperty(value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long id;

  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
 /**
   * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  **/
  private LocalDate creationDate;

  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
 /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
  **/
  private Date statusUpdateDate;

  @ApiModelProperty(value = "")
  @Valid
  private OrderStatsStatusType status;

  @ApiModelProperty(value = "Идентификатор заказа в информационной системе магазина.")
 /**
   * Идентификатор заказа в информационной системе магазина.
  **/
  private String partnerOrderId;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsOrderPaymentType paymentType;

  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
 /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  **/
  private Boolean fake;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsDeliveryRegionDTO deliveryRegion;

  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @Valid
 /**
   * Список товаров в заказе после возможных изменений.
  **/
  private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @Valid
 /**
   * Список товаров в заказе до изменений.
  **/
  private List<@Valid OrdersStatsItemDTO> initialItems;

  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @Valid
 /**
   * Информация о денежных переводах по заказу.
  **/
  private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @Valid
 /**
   * Информация о комиссиях за заказ.
  **/
  private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();
 /**
   * Идентификатор заказа.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
   * @return statusUpdateDate
  **/
  @JsonProperty("statusUpdateDate")
  public Date getStatusUpdateDate() {
    return statusUpdateDate;
  }

  public void setStatusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  public OrdersStatsOrderDTO statusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public OrderStatsStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }

  public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Идентификатор заказа в информационной системе магазина.
   * @return partnerOrderId
  **/
  @JsonProperty("partnerOrderId")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }

  public void setPartnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
  }

  public OrdersStatsOrderDTO partnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
    return this;
  }

 /**
   * Get paymentType
   * @return paymentType
  **/
  @JsonProperty("paymentType")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public OrdersStatsOrderDTO paymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

 /**
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
  **/
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  public OrdersStatsOrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

 /**
   * Get deliveryRegion
   * @return deliveryRegion
  **/
  @JsonProperty("deliveryRegion")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }

  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  public OrdersStatsOrderDTO deliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
    return this;
  }

 /**
   * Список товаров в заказе после возможных изменений.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
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
   * Список товаров в заказе до изменений.
   * @return initialItems
  **/
  @JsonProperty("initialItems")
  public List<@Valid OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  public OrdersStatsOrderDTO initialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
    return this;
  }

  public OrdersStatsOrderDTO addInitialItemsItem(OrdersStatsItemDTO initialItemsItem) {
    this.initialItems.add(initialItemsItem);
    return this;
  }

 /**
   * Информация о денежных переводах по заказу.
   * @return payments
  **/
  @JsonProperty("payments")
  @NotNull
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
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
   * Информация о комиссиях за заказ.
   * @return commissions
  **/
  @JsonProperty("commissions")
  @NotNull
  public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
  }

  public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  public OrdersStatsOrderDTO addCommissionsItem(OrdersStatsCommissionDTO commissionsItem) {
    this.commissions.add(commissionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

