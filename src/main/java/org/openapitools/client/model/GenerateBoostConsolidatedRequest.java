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



/**
  * Данные, необходимые для генерации отчета. 
 **/

public class GenerateBoostConsolidatedRequest  {
  
 /**
   * Идентификатор бизнеса.
  **/
  private Long businessId;

 /**
   * Начало периода, включительно.
  **/
  private LocalDate dateFrom;

 /**
   * Конец периода, включительно.
  **/
  private LocalDate dateTo;

 /**
   * Идентификатор бизнеса.
   * @return businessId
  **/
  public Long getBusinessId() {
    return businessId;
  }

  /**
    * Set businessId
  **/
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateBoostConsolidatedRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
   * Начало периода, включительно.
   * @return dateFrom
  **/
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
    * Set dateFrom
  **/
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GenerateBoostConsolidatedRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
   * Конец периода, включительно.
   * @return dateTo
  **/
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
    * Set dateTo
  **/
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GenerateBoostConsolidatedRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBoostConsolidatedRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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
