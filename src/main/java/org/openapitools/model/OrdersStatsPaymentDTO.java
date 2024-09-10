/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPaymentDTO   {
  
  private String id;
  private Date date;
  private OrdersStatsPaymentType type;
  private OrdersStatsPaymentSourceType source;
  private BigDecimal total;
  private OrdersStatsPaymentOrderDTO paymentOrder;

  /**
   * Идентификатор денежного перевода.
   */
  public OrdersStatsPaymentDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор денежного перевода.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
   */
  public OrdersStatsPaymentDTO date(Date date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   */
  public OrdersStatsPaymentDTO type(OrdersStatsPaymentType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OrdersStatsPaymentType getType() {
    return type;
  }
  public void setType(OrdersStatsPaymentType type) {
    this.type = type;
  }

  /**
   */
  public OrdersStatsPaymentDTO source(OrdersStatsPaymentSourceType source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public OrdersStatsPaymentSourceType getSource() {
    return source;
  }
  public void setSource(OrdersStatsPaymentSourceType source) {
    this.source = source;
  }

  /**
   * Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
   */
  public OrdersStatsPaymentDTO total(BigDecimal total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  /**
   */
  public OrdersStatsPaymentDTO paymentOrder(OrdersStatsPaymentOrderDTO paymentOrder) {
    this.paymentOrder = paymentOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

