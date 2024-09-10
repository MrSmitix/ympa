package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
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

/**
 * Информация о заказе.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о заказе.")
public class OrdersStatsOrderDTO   {
  
  private Long id;

  private LocalDate creationDate;

  private java.util.Date statusUpdateDate;

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
   * Идентификатор заказа.
   **/
  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор заказа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   **/
  public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("creationDate")
  public LocalDate getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }


  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
   **/
  public OrdersStatsOrderDTO statusUpdateDate(java.util.Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
  @JsonProperty("statusUpdateDate")
  public java.util.Date getStatusUpdateDate() {
    return statusUpdateDate;
  }
  public void setStatusUpdateDate(java.util.Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }


  /**
   **/
  public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OrderStatsStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }


  /**
   * Идентификатор заказа в информационной системе магазина.
   **/
  public OrdersStatsOrderDTO partnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор заказа в информационной системе магазина.")
  @JsonProperty("partnerOrderId")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }
  public void setPartnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
  }


  /**
   **/
  public OrdersStatsOrderDTO paymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentType")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }


  /**
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   **/
  public OrdersStatsOrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

  
  @ApiModelProperty(value = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ")
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }
  public void setFake(Boolean fake) {
    this.fake = fake;
  }


  /**
   **/
  public OrdersStatsOrderDTO deliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryRegion")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }
  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }


  /**
   * Список товаров в заказе после возможных изменений.
   **/
  public OrdersStatsOrderDTO items(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
  }

  public OrdersStatsOrderDTO addItemsItem(OrdersStatsItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * Список товаров в заказе до изменений.
   **/
  public OrdersStatsOrderDTO initialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @JsonProperty("initialItems")
  public List<@Valid OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }
  public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  public OrdersStatsOrderDTO addInitialItemsItem(OrdersStatsItemDTO initialItemsItem) {
    if (this.initialItems == null) {
      this.initialItems = new ArrayList<>();
    }
    this.initialItems.add(initialItemsItem);
    return this;
  }


  /**
   * Информация о денежных переводах по заказу.
   **/
  public OrdersStatsOrderDTO payments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @JsonProperty("payments")
  @NotNull
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }
  public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  public OrdersStatsOrderDTO addPaymentsItem(OrdersStatsPaymentDTO paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }


  /**
   * Информация о комиссиях за заказ.
   **/
  public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @JsonProperty("commissions")
  @NotNull
  public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }
  public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
  }

  public OrdersStatsOrderDTO addCommissionsItem(OrdersStatsCommissionDTO commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

