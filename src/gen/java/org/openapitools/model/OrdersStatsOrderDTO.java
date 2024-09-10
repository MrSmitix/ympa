package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о заказе.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsOrderDTO   {
  
  private Long id;
  private Date creationDate;
  private Date statusUpdateDate;
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
  
  @ApiModelProperty(value = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  @Valid
  public OrderStatsStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }

  /**
   * Идентификатор заказа в информационной системе магазина.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentType")
  @Valid
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  /**
   * Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryRegion")
  @Valid
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }
  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  /**
   * Список товаров в заказе после возможных изменений.
   **/
  
  @ApiModelProperty(required = true, value = "Список товаров в заказе после возможных изменений.")
  @JsonProperty("items")
  @NotNull
  @Valid
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
  }

  /**
   * Список товаров в заказе до изменений.
   **/
  
  @ApiModelProperty(value = "Список товаров в заказе до изменений.")
  @JsonProperty("initialItems")
  @Valid
  public List<@Valid OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }
  public void setInitialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

  /**
   * Информация о денежных переводах по заказу.
   **/
  
  @ApiModelProperty(required = true, value = "Информация о денежных переводах по заказу.")
  @JsonProperty("payments")
  @NotNull
  @Valid
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }
  public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  /**
   * Информация о комиссиях за заказ.
   **/
  
  @ApiModelProperty(required = true, value = "Информация о комиссиях за заказ.")
  @JsonProperty("commissions")
  @NotNull
  @Valid
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

