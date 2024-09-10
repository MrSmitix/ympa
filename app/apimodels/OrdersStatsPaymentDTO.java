package apimodels;

import apimodels.OrdersStatsPaymentOrderDTO;
import apimodels.OrdersStatsPaymentSourceType;
import apimodels.OrdersStatsPaymentType;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о денежных переводах по заказу.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsPaymentDTO   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("date")
  @Valid

  private LocalDate date;

  @JsonProperty("type")
  @Valid

  private OrdersStatsPaymentType type;

  @JsonProperty("source")
  @Valid

  private OrdersStatsPaymentSourceType source;

  @JsonProperty("total")
  @Valid

  private BigDecimal total;

  @JsonProperty("paymentOrder")
  @Valid

  private OrdersStatsPaymentOrderDTO paymentOrder;

  public OrdersStatsPaymentDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор денежного перевода.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrdersStatsPaymentDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return date
  **/
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public OrdersStatsPaymentDTO type(OrdersStatsPaymentType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OrdersStatsPaymentType getType() {
    return type;
  }

  public void setType(OrdersStatsPaymentType type) {
    this.type = type;
  }

  public OrdersStatsPaymentDTO source(OrdersStatsPaymentSourceType source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public OrdersStatsPaymentSourceType getSource() {
    return source;
  }

  public void setSource(OrdersStatsPaymentSourceType source) {
    this.source = source;
  }

  public OrdersStatsPaymentDTO total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
   * @return total
  **/
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public OrdersStatsPaymentDTO paymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
    this.paymentOrder = paymentOrder;
    return this;
  }

   /**
   * Get paymentOrder
   * @return paymentOrder
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

