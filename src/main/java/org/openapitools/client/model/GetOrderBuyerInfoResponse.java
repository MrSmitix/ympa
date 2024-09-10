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
import org.openapitools.client.model.OrderBuyerInfoDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetOrderBuyerInfoResponse {
  
  @SerializedName("status")
  private ApiResponseStatusType status = null;
  @SerializedName("result")
  private OrderBuyerInfoDTO result = null;

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
  public OrderBuyerInfoDTO getResult() {
    return result;
  }
  public void setResult(OrderBuyerInfoDTO result) {
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
    GetOrderBuyerInfoResponse getOrderBuyerInfoResponse = (GetOrderBuyerInfoResponse) o;
    return (this.status == null ? getOrderBuyerInfoResponse.status == null : this.status.equals(getOrderBuyerInfoResponse.status)) &&
        (this.result == null ? getOrderBuyerInfoResponse.result == null : this.result.equals(getOrderBuyerInfoResponse.result));
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
    sb.append("class GetOrderBuyerInfoResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
