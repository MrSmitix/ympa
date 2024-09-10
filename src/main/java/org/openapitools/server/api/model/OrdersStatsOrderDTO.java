package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OrderStatsStatusType;
import org.openapitools.server.api.model.OrdersStatsCommissionDTO;
import org.openapitools.server.api.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.server.api.model.OrdersStatsItemDTO;
import org.openapitools.server.api.model.OrdersStatsOrderPaymentType;
import org.openapitools.server.api.model.OrdersStatsPaymentDTO;

/**
 * Информация о заказе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsOrderDTO   {
  
  private Long id;
  private LocalDate creationDate;
  private OffsetDateTime statusUpdateDate;
  private OrderStatsStatusType status;
  private String partnerOrderId;
  private OrdersStatsOrderPaymentType paymentType;
  private Boolean fake;
  private OrdersStatsDeliveryRegionDTO deliveryRegion;
  private List<OrdersStatsItemDTO> items = new ArrayList<>();
  private List<OrdersStatsItemDTO> initialItems;
  private List<OrdersStatsPaymentDTO> payments = new ArrayList<>();
  private List<OrdersStatsCommissionDTO> commissions = new ArrayList<>();

  public OrdersStatsOrderDTO () {

  }

  public OrdersStatsOrderDTO (Long id, LocalDate creationDate, OffsetDateTime statusUpdateDate, OrderStatsStatusType status, String partnerOrderId, OrdersStatsOrderPaymentType paymentType, Boolean fake, OrdersStatsDeliveryRegionDTO deliveryRegion, List<OrdersStatsItemDTO> items, List<OrdersStatsItemDTO> initialItems, List<OrdersStatsPaymentDTO> payments, List<OrdersStatsCommissionDTO> commissions) {
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

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("creationDate")
  public LocalDate getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

    
  @JsonProperty("statusUpdateDate")
  public OffsetDateTime getStatusUpdateDate() {
    return statusUpdateDate;
  }
  public void setStatusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

    
  @JsonProperty("status")
  public OrderStatsStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("partnerOrderId")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }
  public void setPartnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
  }

    
  @JsonProperty("paymentType")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }
  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

    
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }
  public void setFake(Boolean fake) {
    this.fake = fake;
  }

    
  @JsonProperty("deliveryRegion")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }
  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

    
  @JsonProperty("items")
  public List<OrdersStatsItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrdersStatsItemDTO> items) {
    this.items = items;
  }

    
  @JsonProperty("initialItems")
  public List<OrdersStatsItemDTO> getInitialItems() {
    return initialItems;
  }
  public void setInitialItems(List<OrdersStatsItemDTO> initialItems) {
    this.initialItems = initialItems;
  }

    
  @JsonProperty("payments")
  public List<OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }
  public void setPayments(List<OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

    
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
