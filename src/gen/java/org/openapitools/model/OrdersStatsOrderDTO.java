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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о заказе.
 */
@ApiModel(description="Информация о заказе.")

public class OrdersStatsOrderDTO  {
  
 /**
  * Идентификатор заказа.
  */
  @ApiModelProperty(value = "Идентификатор заказа.")
  private Long id;

 /**
  * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate creationDate;

 /**
  * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
  */
  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date statusUpdateDate;

  @ApiModelProperty(value = "")
  @Valid
  private OrderStatsStatusType status;

 /**
  * Идентификатор заказа в информационной системе магазина.
  */
  @ApiModelProperty(value = "Идентификатор заказа в информационной системе магазина.")
  private String partnerOrderId;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsOrderPaymentType paymentType;

 /**
  * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  */
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  private Boolean fake;

  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsDeliveryRegionDTO deliveryRegion;

 /**
  * Список товаров в заказе после возможных изменений.
  */
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @Valid
  private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();

 /**
  * Список товаров в заказе до изменений.
  */
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @Valid
  private List<@Valid OrdersStatsItemDTO> initialItems;

 /**
  * Информация о денежных переводах по заказу.
  */
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @Valid
  private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();

 /**
  * Информация о комиссиях за заказ.
  */
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @Valid
  private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();
 /**
  * Идентификатор заказа.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
  * @return creationDate
  */
  @JsonProperty("creationDate")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
 public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
  public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
  * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
  * @return statusUpdateDate
  */
  @JsonProperty("statusUpdateDate")
  public Date getStatusUpdateDate() {
    return statusUpdateDate;
  }

  /**
   * Sets the <code>statusUpdateDate</code> property.
   */
 public void setStatusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  /**
   * Sets the <code>statusUpdateDate</code> property.
   */
  public OrdersStatsOrderDTO statusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public OrderStatsStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Идентификатор заказа в информационной системе магазина.
  * @return partnerOrderId
  */
  @JsonProperty("partnerOrderId")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }

  /**
   * Sets the <code>partnerOrderId</code> property.
   */
 public void setPartnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
  }

  /**
   * Sets the <code>partnerOrderId</code> property.
   */
  public OrdersStatsOrderDTO partnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
    return this;
  }

 /**
  * Get paymentType
  * @return paymentType
  */
  @JsonProperty("paymentType")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the <code>paymentType</code> property.
   */
 public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Sets the <code>paymentType</code> property.
   */
  public OrdersStatsOrderDTO paymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

 /**
  * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  * @return fake
  */
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  /**
   * Sets the <code>fake</code> property.
   */
 public void setFake(Boolean fake) {
    this.fake = fake;
  }

  /**
   * Sets the <code>fake</code> property.
   */
  public OrdersStatsOrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

 /**
  * Get deliveryRegion
  * @return deliveryRegion
  */
  @JsonProperty("deliveryRegion")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }

  /**
   * Sets the <code>deliveryRegion</code> property.
   */
 public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  /**
   * Sets the <code>deliveryRegion</code> property.
   */
  public OrdersStatsOrderDTO deliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
    return this;
  }

 /**
  * Список товаров в заказе после возможных изменений.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public OrdersStatsOrderDTO items(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public OrdersStatsOrderDTO addItemsItem(OrdersStatsItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Список товаров в заказе до изменений.
  * @return initialItems
  */
  @JsonProperty("initialItems")
  public List<@Valid OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }

  /**
   * Sets the <code>initialItems</code> property.
   */
 public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  /**
   * Sets the <code>initialItems</code> property.
   */
  public OrdersStatsOrderDTO initialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
    return this;
  }

  /**
   * Adds a new item to the <code>initialItems</code> list.
   */
  public OrdersStatsOrderDTO addInitialItemsItem(OrdersStatsItemDTO initialItemsItem) {
    this.initialItems.add(initialItemsItem);
    return this;
  }

 /**
  * Информация о денежных переводах по заказу.
  * @return payments
  */
  @JsonProperty("payments")
  @NotNull
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }

  /**
   * Sets the <code>payments</code> property.
   */
 public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  /**
   * Sets the <code>payments</code> property.
   */
  public OrdersStatsOrderDTO payments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Adds a new item to the <code>payments</code> list.
   */
  public OrdersStatsOrderDTO addPaymentsItem(OrdersStatsPaymentDTO paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

 /**
  * Информация о комиссиях за заказ.
  * @return commissions
  */
  @JsonProperty("commissions")
  @NotNull
  public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }

  /**
   * Sets the <code>commissions</code> property.
   */
 public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
  }

  /**
   * Sets the <code>commissions</code> property.
   */
  public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  /**
   * Adds a new item to the <code>commissions</code> list.
   */
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

