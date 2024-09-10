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
import org.openapitools.client.model.DeleteOffersDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Результат удаления товаров.
 **/
@ApiModel(description = "Результат удаления товаров.")
public class DeleteOffersResponse {
  
  @SerializedName("status")
  private ApiResponseStatusType status = null;
  @SerializedName("result")
  private DeleteOffersDTO result = null;

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
  public DeleteOffersDTO getResult() {
    return result;
  }
  public void setResult(DeleteOffersDTO result) {
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
    DeleteOffersResponse deleteOffersResponse = (DeleteOffersResponse) o;
    return (this.status == null ? deleteOffersResponse.status == null : this.status.equals(deleteOffersResponse.status)) &&
        (this.result == null ? deleteOffersResponse.result == null : this.result.equals(deleteOffersResponse.result));
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
    sb.append("class DeleteOffersResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  result: ").append(result).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
