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
import org.openapitools.client.model.ApiResponseStatusType;
import org.openapitools.client.model.UpdateOfferContentResultDTO;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Описывает проблемы, которые появились при сохранении товара.
 **/
@ApiModel(description = "Описывает проблемы, которые появились при сохранении товара.")
public class UpdateOfferContentResponse {
  
  @SerializedName("status")
  private ApiResponseStatusType status = null;
  @SerializedName("results")
  private List<UpdateOfferContentResultDTO> results = null;

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
   * Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
   **/
  @ApiModelProperty(value = "Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
  public List<UpdateOfferContentResultDTO> getResults() {
    return results;
  }
  public void setResults(List<UpdateOfferContentResultDTO> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentResponse updateOfferContentResponse = (UpdateOfferContentResponse) o;
    return (this.status == null ? updateOfferContentResponse.status == null : this.status.equals(updateOfferContentResponse.status)) &&
        (this.results == null ? updateOfferContentResponse.results == null : this.results.equals(updateOfferContentResponse.results));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.results == null ? 0: this.results.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  results: ").append(results).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
