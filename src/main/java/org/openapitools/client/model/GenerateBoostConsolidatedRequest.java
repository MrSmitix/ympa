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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Данные, необходимые для генерации отчета. 
 **/
@ApiModel(description = "Данные, необходимые для генерации отчета. ")
public class GenerateBoostConsolidatedRequest {
  
  @SerializedName("businessId")
  private Long businessId = null;
  @SerializedName("dateFrom")
  private Date dateFrom = null;
  @SerializedName("dateTo")
  private Date dateTo = null;

  /**
   * Идентификатор бизнеса.
   **/
  @ApiModelProperty(required = true, value = "Идентификатор бизнеса.")
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Начало периода, включительно.
   **/
  @ApiModelProperty(required = true, value = "Начало периода, включительно.")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конец периода, включительно.
   **/
  @ApiModelProperty(required = true, value = "Конец периода, включительно.")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = (GenerateBoostConsolidatedRequest) o;
    return (this.businessId == null ? generateBoostConsolidatedRequest.businessId == null : this.businessId.equals(generateBoostConsolidatedRequest.businessId)) &&
        (this.dateFrom == null ? generateBoostConsolidatedRequest.dateFrom == null : this.dateFrom.equals(generateBoostConsolidatedRequest.dateFrom)) &&
        (this.dateTo == null ? generateBoostConsolidatedRequest.dateTo == null : this.dateTo.equals(generateBoostConsolidatedRequest.dateTo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.businessId == null ? 0: this.businessId.hashCode());
    result = 31 * result + (this.dateFrom == null ? 0: this.dateFrom.hashCode());
    result = 31 * result + (this.dateTo == null ? 0: this.dateTo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBoostConsolidatedRequest {\n");
    
    sb.append("  businessId: ").append(businessId).append("\n");
    sb.append("  dateFrom: ").append(dateFrom).append("\n");
    sb.append("  dateTo: ").append(dateTo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
