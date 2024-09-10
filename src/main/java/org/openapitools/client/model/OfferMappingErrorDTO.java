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
import org.openapitools.client.model.OfferMappingErrorType;



/**
  * Текст ошибки.
 **/

public class OfferMappingErrorDTO  {
  
  private OfferMappingErrorType type;

 /**
   * Идентификатор характеристики, с которой связана ошибка.
  **/
  private Long parameterId;

 /**
   * Текст ошибки.
  **/
  private String message;

 /**
   * Get type
   * @return type
  **/
  public OfferMappingErrorType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(OfferMappingErrorType type) {
    this.type = type;
  }

  public OfferMappingErrorDTO type(OfferMappingErrorType type) {
    this.type = type;
    return this;
  }

 /**
   * Идентификатор характеристики, с которой связана ошибка.
   * @return parameterId
  **/
  public Long getParameterId() {
    return parameterId;
  }

  /**
    * Set parameterId
  **/
  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  public OfferMappingErrorDTO parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

 /**
   * Текст ошибки.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  /**
    * Set message
  **/
  public void setMessage(String message) {
    this.message = message;
  }

  public OfferMappingErrorDTO message(String message) {
    this.message = message;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingErrorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

