package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.server.api.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.server.api.model.OrdersStatsPaymentSourceType;
import org.openapitools.server.api.model.OrdersStatsPaymentType;

/**
 * Информация о денежных переводах по заказу.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsPaymentDTO   {
  
  private String id;
  private LocalDate date;
  private OrdersStatsPaymentType type;
  private OrdersStatsPaymentSourceType source;
  private BigDecimal total;
  private OrdersStatsPaymentOrderDTO paymentOrder;

  public OrdersStatsPaymentDTO () {

  }

  public OrdersStatsPaymentDTO (String id, LocalDate date, OrdersStatsPaymentType type, OrdersStatsPaymentSourceType source, BigDecimal total, OrdersStatsPaymentOrderDTO paymentOrder) {
    this.id = id;
    this.date = date;
    this.type = type;
    this.source = source;
    this.total = total;
    this.paymentOrder = paymentOrder;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

    
  @JsonProperty("type")
  public OrdersStatsPaymentType getType() {
    return type;
  }
  public void setType(OrdersStatsPaymentType type) {
    this.type = type;
  }

    
  @JsonProperty("source")
  public OrdersStatsPaymentSourceType getSource() {
    return source;
  }
  public void setSource(OrdersStatsPaymentSourceType source) {
    this.source = source;
  }

    
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

    
  @JsonProperty("paymentOrder")
  public OrdersStatsPaymentOrderDTO getPaymentOrder() {
    return paymentOrder;
  }
  public void setPaymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
    this.paymentOrder = paymentOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsPaymentDTO ordersStatsPaymentDTO = (OrdersStatsPaymentDTO) o;
    return Objects.equals(id, ordersStatsPaymentDTO.id) &&
        Objects.equals(date, ordersStatsPaymentDTO.date) &&
        Objects.equals(type, ordersStatsPaymentDTO.type) &&
        Objects.equals(source, ordersStatsPaymentDTO.source) &&
        Objects.equals(total, ordersStatsPaymentDTO.total) &&
        Objects.equals(paymentOrder, ordersStatsPaymentDTO.paymentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, type, source, total, paymentOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsPaymentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    paymentOrder: ").append(toIndentedString(paymentOrder)).append("\n");
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
