/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.client.model.OrderDocumentStatusType;



/**
  * Информация о документе.
 **/

public class DocumentDTO  {
  
  private OrderDocumentStatusType status;

 /**
   * Номер документа.
  **/
  private String number;

 /**
   * Дата создания документа.
  **/
  private LocalDate date;

 /**
   * Get status
   * @return status
  **/
  public OrderDocumentStatusType getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(OrderDocumentStatusType status) {
    this.status = status;
  }

  public DocumentDTO status(OrderDocumentStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Номер документа.
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  /**
    * Set number
  **/
  public void setNumber(String number) {
    this.number = number;
  }

  public DocumentDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Дата создания документа.
   * @return date
  **/
  public LocalDate getDate() {
    return date;
  }

  /**
    * Set date
  **/
  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DocumentDTO date(LocalDate date) {
    this.date = date;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

