package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import org.openapitools.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.model.OrdersStatsPaymentSourceType;
import org.openapitools.model.OrdersStatsPaymentType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о денежных переводах по заказу.
 **/
@ApiModel(description="Информация о денежных переводах по заказу.")

public class OrdersStatsPaymentDTO  {
  
  @ApiModelProperty(value = "Идентификатор денежного перевода.")
 /**
   * Идентификатор денежного перевода.
  **/
  private String id;

  @ApiModelProperty(value = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ")
 /**
   * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
  **/
  private LocalDate date;

  @ApiModelProperty(value = "")
  private OrdersStatsPaymentType type;

  @ApiModelProperty(value = "")
  private OrdersStatsPaymentSourceType source;

  @ApiModelProperty(value = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ")
 /**
   * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
  **/
  private BigDecimal total;

  @ApiModelProperty(value = "")
  private OrdersStatsPaymentOrderDTO paymentOrder;
 /**
   * Идентификатор денежного перевода.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrdersStatsPaymentDTO id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
   * @return date
  **/
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public OrdersStatsPaymentDTO date(LocalDate date) {
    this.date = date;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OrdersStatsPaymentType getType() {
    return type;
  }

  public void setType(OrdersStatsPaymentType type) {
    this.type = type;
  }

  public OrdersStatsPaymentDTO type(OrdersStatsPaymentType type) {
    this.type = type;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public OrdersStatsPaymentSourceType getSource() {
    return source;
  }

  public void setSource(OrdersStatsPaymentSourceType source) {
    this.source = source;
  }

  public OrdersStatsPaymentDTO source(OrdersStatsPaymentSourceType source) {
    this.source = source;
    return this;
  }

 /**
   * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
   * @return total
  **/
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public OrdersStatsPaymentDTO total(BigDecimal total) {
    this.total = total;
    return this;
  }

 /**
   * Get paymentOrder
   * @return paymentOrder
  **/
  @JsonProperty("paymentOrder")
  public OrdersStatsPaymentOrderDTO getPaymentOrder() {
    return paymentOrder;
  }

  public void setPaymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
    this.paymentOrder = paymentOrder;
  }

  public OrdersStatsPaymentDTO paymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
    this.paymentOrder = paymentOrder;
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
    OrdersStatsPaymentDTO ordersStatsPaymentDTO = (OrdersStatsPaymentDTO) o;
    return Objects.equals(this.id, ordersStatsPaymentDTO.id) &&
        Objects.equals(this.date, ordersStatsPaymentDTO.date) &&
        Objects.equals(this.type, ordersStatsPaymentDTO.type) &&
        Objects.equals(this.source, ordersStatsPaymentDTO.source) &&
        Objects.equals(this.total, ordersStatsPaymentDTO.total) &&
        Objects.equals(this.paymentOrder, ordersStatsPaymentDTO.paymentOrder);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

