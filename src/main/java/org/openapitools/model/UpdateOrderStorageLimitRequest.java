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
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */

@ApiModel(description = "Запрос на обновление срока хранения заказа в ПВЗ.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStorageLimitRequest   {
  
  private Date newDate;

  /**
   * Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
   */
  public UpdateOrderStorageLimitRequest newDate(Date newDate) {
    this.newDate = newDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. ")
  @JsonProperty("newDate")
  public Date getNewDate() {
    return newDate;
  }
  public void setNewDate(Date newDate) {
    this.newDate = newDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderStorageLimitRequest updateOrderStorageLimitRequest = (UpdateOrderStorageLimitRequest) o;
    return Objects.equals(newDate, updateOrderStorageLimitRequest.newDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStorageLimitRequest {\n");
    
    sb.append("    newDate: ").append(toIndentedString(newDate)).append("\n");
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

