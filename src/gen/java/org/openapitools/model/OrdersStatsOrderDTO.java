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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;



/**
 * Информация о заказе.
 **/

@ApiModel(description = "Информация о заказе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsOrderDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("creationDate")
  private Date creationDate;

  @JsonProperty("statusUpdateDate")
  private Date statusUpdateDate;

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
   * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   **/
  public OrdersStatsOrderDTO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
   **/
  public OrdersStatsOrderDTO statusUpdateDate(Date statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ")
  @JsonProperty("statusUpdateDate")
  public Date getStatusUpdateDate() {
    return statusUpdateDate;
  }
  public void setStatusUpdateDate(Date statusUpdateDate) {
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
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
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
  public OrdersStatsOrderDTO items(List<OrdersStatsItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @JsonProperty("items")
  public List<OrdersStatsItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrdersStatsItemDTO> items) {
    this.items = items;
  }

  /**
   * Список товаров в заказе до изменений.
   **/
  public OrdersStatsOrderDTO initialItems(List<OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
    return this;
  }

  
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @JsonProperty("initialItems")
  public List<OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }
  public void setInitialItems(List<OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  /**
   * Информация о денежных переводах по заказу.
   **/
  public OrdersStatsOrderDTO payments(List<OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @JsonProperty("payments")
  public List<OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }
  public void setPayments(List<OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  /**
   * Информация о комиссиях за заказ.
   **/
  public OrdersStatsOrderDTO commissions(List<OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @JsonProperty("commissions")
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
    return Objects.equals(id, ordersStatsOrderDTO.id) &&
        Objects.equals(creationDate, ordersStatsOrderDTO.creationDate) &&
        Objects.equals(statusUpdateDate, ordersStatsOrderDTO.statusUpdateDate) &&
        Objects.equals(status, ordersStatsOrderDTO.status) &&
        Objects.equals(partnerOrderId, ordersStatsOrderDTO.partnerOrderId) &&
        Objects.equals(paymentType, ordersStatsOrderDTO.paymentType) &&
        Objects.equals(fake, ordersStatsOrderDTO.fake) &&
        Objects.equals(deliveryRegion, ordersStatsOrderDTO.deliveryRegion) &&
        Objects.equals(items, ordersStatsOrderDTO.items) &&
        Objects.equals(initialItems, ordersStatsOrderDTO.initialItems) &&
        Objects.equals(payments, ordersStatsOrderDTO.payments) &&
        Objects.equals(commissions, ordersStatsOrderDTO.commissions);
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

