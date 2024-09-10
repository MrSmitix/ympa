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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Запрос информации о моделях.
 **/
@ApiModel(description = "Запрос информации о моделях.")
public class GetModelsRequest {
  
  @SerializedName("models")
  private List<Long> models = null;

  /**
   * Список моделей.
   **/
  @ApiModelProperty(required = true, value = "Список моделей.")
  public List<Long> getModels() {
    return models;
  }
  public void setModels(List<Long> models) {
    this.models = models;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetModelsRequest getModelsRequest = (GetModelsRequest) o;
    return (this.models == null ? getModelsRequest.models == null : this.models.equals(getModelsRequest.models));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.models == null ? 0: this.models.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetModelsRequest {\n");
    
    sb.append("  models: ").append(models).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
