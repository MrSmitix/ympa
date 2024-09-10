package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.model.OrdersStatsPaymentOrderDTO;
import org.openapitools.model.OrdersStatsPaymentSourceType;
import org.openapitools.model.OrdersStatsPaymentType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о денежных переводах по заказу.
 */

@Schema(name = "OrdersStatsPaymentDTO", description = "Информация о денежных переводах по заказу.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPaymentDTO {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private OrdersStatsPaymentType type;

  private OrdersStatsPaymentSourceType source;

  private BigDecimal total;

  private OrdersStatsPaymentOrderDTO paymentOrder;

  public OrdersStatsPaymentDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор денежного перевода.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор денежного перевода.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  @Valid 
  @Schema(name = "date", description = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
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
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
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
   */
  @Valid 
  @Schema(name = "total", description = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
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
   */
  @Valid 
  @Schema(name = "paymentOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

