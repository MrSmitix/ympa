package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.model.OrdersStatsPaymentSourceType;
import org.openapitools.model.OrdersStatsPaymentType;

/**
 * Информация о денежных переводах по заказу.
 */
@ApiModel(description = "Информация о денежных переводах по заказу.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPaymentDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("date")
  private Date date;

  @JsonProperty("type")
  private OrdersStatsPaymentType type;

  @JsonProperty("source")
  private OrdersStatsPaymentSourceType source;

  @JsonProperty("total")
  private BigDecimal total;

  @JsonProperty("paymentOrder")
  private OrdersStatsPaymentOrderDTO paymentOrder;

  public OrdersStatsPaymentDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор денежного перевода.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор денежного перевода.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrdersStatsPaymentDTO date(Date date) {
    this.date = date;
    return this;
  }

   /**
   * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return date
  **/
  @ApiModelProperty(value = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ")
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
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

