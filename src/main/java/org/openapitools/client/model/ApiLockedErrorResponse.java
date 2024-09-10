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

import java.util.*;
import org.openapitools.client.model.ApiErrorDTO;
import org.openapitools.client.model.ApiResponseStatusType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Ресурс из запроса заблокирован от применения к нему указанного метода.
 **/
@ApiModel(description = "Ресурс из запроса заблокирован от применения к нему указанного метода.")
public class ApiLockedErrorResponse {
  
  @SerializedName("status")
  private ApiResponseStatusType status = null;
  @SerializedName("errors")
  private List<ApiErrorDTO> errors = null;

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
   * Список ошибок.
   **/
  @ApiModelProperty(value = "Список ошибок.")
  public List<ApiErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<ApiErrorDTO> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiLockedErrorResponse apiLockedErrorResponse = (ApiLockedErrorResponse) o;
    return (this.status == null ? apiLockedErrorResponse.status == null : this.status.equals(apiLockedErrorResponse.status)) &&
        (this.errors == null ? apiLockedErrorResponse.errors == null : this.errors.equals(apiLockedErrorResponse.errors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.errors == null ? 0: this.errors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLockedErrorResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
