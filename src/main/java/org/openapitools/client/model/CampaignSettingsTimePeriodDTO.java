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



/**
  * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 **/

public class CampaignSettingsTimePeriodDTO  {
  
 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String fromDate;

 /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
  **/
  private String toDate;

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return fromDate
  **/
  public String getFromDate() {
    return fromDate;
  }

  /**
    * Set fromDate
  **/
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public CampaignSettingsTimePeriodDTO fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

 /**
   * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   * @return toDate
  **/
  public String getToDate() {
    return toDate;
  }

  /**
    * Set toDate
  **/
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public CampaignSettingsTimePeriodDTO toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsTimePeriodDTO {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

