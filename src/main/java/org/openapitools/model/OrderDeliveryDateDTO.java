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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;



/**
 * Информация о новой дате доставки заказа.
 */

@ApiModel(description = "Информация о новой дате доставки заказа.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryDateDTO   {
  
  private Date toDate;

  /**
   * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   */
  public OrderDeliveryDateDTO toDate(Date toDate) {
    this.toDate = toDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("toDate")
  public Date getToDate() {
    return toDate;
  }
  public void setToDate(Date toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryDateDTO orderDeliveryDateDTO = (OrderDeliveryDateDTO) o;
    return Objects.equals(toDate, orderDeliveryDateDTO.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryDateDTO {\n");
    
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

