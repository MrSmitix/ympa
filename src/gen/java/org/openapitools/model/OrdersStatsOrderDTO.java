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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о заказе.
 */
@ApiModel(description = "Информация о заказе.")
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsOrderDTO   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Long id;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  private Date creationDate;

  public static final String JSON_PROPERTY_STATUS_UPDATE_DATE = "statusUpdateDate";
  @JsonProperty(JSON_PROPERTY_STATUS_UPDATE_DATE)
  private Date statusUpdateDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private OrderStatsStatusType status;

  public static final String JSON_PROPERTY_PARTNER_ORDER_ID = "partnerOrderId";
  @JsonProperty(JSON_PROPERTY_PARTNER_ORDER_ID)
  private String partnerOrderId;

  public static final String JSON_PROPERTY_PAYMENT_TYPE = "paymentType";
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  private OrdersStatsOrderPaymentType paymentType;

  public static final String JSON_PROPERTY_FAKE = "fake";
  @JsonProperty(JSON_PROPERTY_FAKE)
  private Boolean fake;

  public static final String JSON_PROPERTY_DELIVERY_REGION = "deliveryRegion";
  @JsonProperty(JSON_PROPERTY_DELIVERY_REGION)
  private OrdersStatsDeliveryRegionDTO deliveryRegion;

  public static final String JSON_PROPERTY_ITEMS = "items";
  @JsonProperty(JSON_PROPERTY_ITEMS)
  private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();

  public static final String JSON_PROPERTY_INITIAL_ITEMS = "initialItems";
  @JsonProperty(JSON_PROPERTY_INITIAL_ITEMS)
  private List<@Valid OrdersStatsItemDTO> initialItems;

  public static final String JSON_PROPERTY_PAYMENTS = "payments";
  @JsonProperty(JSON_PROPERTY_PAYMENTS)
  private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();

  public static final String JSON_PROPERTY_COMMISSIONS = "commissions";
  @JsonProperty(JSON_PROPERTY_COMMISSIONS)
  private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();

  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "Идентификатор заказа.")
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrdersStatsOrderDTO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return creationDate
   **/
  @JsonProperty(value = "creationDate")
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public OrdersStatsOrderDTO statusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
   * @return statusUpdateDate
   **/
  @JsonProperty(value = "statusUpdateDate")
  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
  
  public Date getStatusUpdateDate() {
    return statusUpdateDate;
  }

  public void setStatusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
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
   **/
  @JsonProperty(value = "partnerOrderId")
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
   **/
  @JsonProperty(value = "paymentType")
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
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
   **/
  @JsonProperty(value = "fake")
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
   **/
  @JsonProperty(value = "deliveryRegion")
  @ApiModelProperty(value = "")
  @Valid 
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }

  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  public OrdersStatsOrderDTO items(List<@Valid OrdersStatsItemDTO> items) {
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
   **/
  @JsonProperty(value = "items")
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @NotNull @Valid 
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }

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
   **/
  @JsonProperty(value = "initialItems")
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @Valid 
  public List<@Valid OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  public OrdersStatsOrderDTO payments(List<@Valid OrdersStatsPaymentDTO> payments) {
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
   **/
  @JsonProperty(value = "payments")
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @NotNull @Valid 
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
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
   **/
  @JsonProperty(value = "commissions")
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @NotNull @Valid 
  public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }

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

