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

import org.openapitools.client.model.OfferMappingErrorType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Текст ошибки.
 **/
@ApiModel(description = "Текст ошибки.")
public class OfferMappingErrorDTO {
  
  @SerializedName("type")
  private OfferMappingErrorType type = null;
  @SerializedName("parameterId")
  private Long parameterId = null;
  @SerializedName("message")
  private String message = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OfferMappingErrorType getType() {
    return type;
  }
  public void setType(OfferMappingErrorType type) {
    this.type = type;
  }

  /**
   * Идентификатор характеристики, с которой связана ошибка.
   **/
  @ApiModelProperty(value = "Идентификатор характеристики, с которой связана ошибка.")
  public Long getParameterId() {
    return parameterId;
  }
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  /**
   * Текст ошибки.
   **/
  @ApiModelProperty(required = true, value = "Текст ошибки.")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingErrorDTO offerMappingErrorDTO = (OfferMappingErrorDTO) o;
    return (this.type == null ? offerMappingErrorDTO.type == null : this.type.equals(offerMappingErrorDTO.type)) &&
        (this.parameterId == null ? offerMappingErrorDTO.parameterId == null : this.parameterId.equals(offerMappingErrorDTO.parameterId)) &&
        (this.message == null ? offerMappingErrorDTO.message == null : this.message.equals(offerMappingErrorDTO.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.parameterId == null ? 0: this.parameterId.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingErrorDTO {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  parameterId: ").append(parameterId).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
