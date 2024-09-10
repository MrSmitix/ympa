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

import org.openapitools.client.model.ApiResponseStatusType;
import org.openapitools.client.model.OrderBusinessDocumentsDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetBusinessDocumentsInfoResponse {
  
  @SerializedName("status")
  private ApiResponseStatusType status = null;
  @SerializedName("result")
  private OrderBusinessDocumentsDTO result = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrderBusinessDocumentsDTO getResult() {
    return result;
  }
  public void setResult(OrderBusinessDocumentsDTO result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse = (GetBusinessDocumentsInfoResponse) o;
    return (this.status == null ? getBusinessDocumentsInfoResponse.status == null : this.status.equals(getBusinessDocumentsInfoResponse.status)) &&
        (this.result == null ? getBusinessDocumentsInfoResponse.result == null : this.result.equals(getBusinessDocumentsInfoResponse.result));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.result == null ? 0: this.result.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessDocumentsInfoResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
