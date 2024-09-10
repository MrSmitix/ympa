package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderStatsStatusType;
import com.prokarma.pkmst.model.OrdersStatsCommissionDTO;
import com.prokarma.pkmst.model.OrdersStatsDeliveryRegionDTO;
import com.prokarma.pkmst.model.OrdersStatsItemDTO;
import com.prokarma.pkmst.model.OrdersStatsOrderPaymentType;
import com.prokarma.pkmst.model.OrdersStatsPaymentDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о заказе.
 */
@ApiModel(description = "Информация о заказе.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsOrderDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("statusUpdateDate")
  private OffsetDateTime statusUpdateDate;

  @JsonProperty("status")
  private OrderStatsStatusType status;

  @JsonProperty("partnerOrderId")
  private String partnerOrderId;

  @JsonProperty("paymentType")
  private OrdersStatsOrderPaymentType paymentType;

  @JsonProperty("fake")
  private Boolean fake;

  @JsonProperty("deliveryRegion")
  private OrdersStatsDeliveryRegionDTO deliveryRegion;

  @JsonProperty("items")
  
  private List<OrdersStatsItemDTO> items = new ArrayList<>();

  @JsonProperty("initialItems")
  
  private List<OrdersStatsItemDTO> initialItems = null;

  @JsonProperty("payments")
  
  private List<OrdersStatsPaymentDTO> payments = new ArrayList<>();

  @JsonProperty("commissions")
  
  private List<OrdersStatsCommissionDTO> commissions = new ArrayList<>();

  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор заказа.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return creationDate
   */
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public OrdersStatsOrderDTO statusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
   * @return statusUpdateDate
   */
  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
  public OffsetDateTime getStatusUpdateDate() {
    return statusUpdateDate;
  }

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
  @ApiModelProperty(value = "")
  public OrderStatsStatusType getStatus() {
    return status;
  }

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
  @ApiModelProperty(value = "Идентификатор заказа в информационной системе магазина.")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }

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
  @ApiModelProperty(value = "")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public OrdersStatsOrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

  /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
   */
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  public Boolean getFake() {
    return fake;
  }

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
  @ApiModelProperty(value = "")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }

  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  public OrdersStatsOrderDTO items(List<OrdersStatsItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrdersStatsOrderDTO addItemsItem(OrdersStatsItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в заказе после возможных изменений.
   * @return items
   */
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  public List<OrdersStatsItemDTO> getItems() {
    return items;
  }

  public void setItems(List<OrdersStatsItemDTO> items) {
    this.items = items;
  }

  public OrdersStatsOrderDTO initialItems(List<OrdersStatsItemDTO> initialItems) {
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
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  public List<OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(List<OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  public OrdersStatsOrderDTO payments(List<OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
    return this;
  }

  public OrdersStatsOrderDTO addPaymentsItem(OrdersStatsPaymentDTO paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Информация о денежных переводах по заказу.
   * @return payments
   */
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  public List<OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }

  public void setPayments(List<OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  public OrdersStatsOrderDTO commissions(List<OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  public OrdersStatsOrderDTO addCommissionsItem(OrdersStatsCommissionDTO commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
    this.commissions.add(commissionsItem);
    return this;
  }

  /**
   * Информация о комиссиях за заказ.
   * @return commissions
   */
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  public List<OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<OrdersStatsCommissionDTO> commissions) {
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

