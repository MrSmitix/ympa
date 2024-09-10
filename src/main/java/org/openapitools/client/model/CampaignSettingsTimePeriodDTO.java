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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 **/
@ApiModel(description = "Период, за который рассчитывается итоговый список нерабочих дней службы доставки.")
public class CampaignSettingsTimePeriodDTO {
  
  @SerializedName("fromDate")
  private String fromDate = null;
  @SerializedName("toDate")
  private String toDate = null;

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  @ApiModelProperty(value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  public String getFromDate() {
    return fromDate;
  }
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  /**
   * Формат даты: `ДД-ММ-ГГГГ`. 
   **/
  @ApiModelProperty(value = "Формат даты: `ДД-ММ-ГГГГ`. ")
  public String getToDate() {
    return toDate;
  }
  public void setToDate(String toDate) {
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
    CampaignSettingsTimePeriodDTO campaignSettingsTimePeriodDTO = (CampaignSettingsTimePeriodDTO) o;
    return (this.fromDate == null ? campaignSettingsTimePeriodDTO.fromDate == null : this.fromDate.equals(campaignSettingsTimePeriodDTO.fromDate)) &&
        (this.toDate == null ? campaignSettingsTimePeriodDTO.toDate == null : this.toDate.equals(campaignSettingsTimePeriodDTO.toDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fromDate == null ? 0: this.fromDate.hashCode());
    result = 31 * result + (this.toDate == null ? 0: this.toDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsTimePeriodDTO {\n");
    
    sb.append("  fromDate: ").append(fromDate).append("\n");
    sb.append("  toDate: ").append(toDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
