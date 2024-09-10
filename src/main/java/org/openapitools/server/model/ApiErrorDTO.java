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

package org.openapitools.server.model;

import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Общий формат ошибки.
  */

public class ApiErrorDTO  {
  
 /**
  * Код ошибки.
  */
  @JsonbProperty("code")
  private String code;

 /**
  * Описание ошибки.
  */
  @JsonbProperty("message")
  private String message;

  /**
   * Код ошибки.
   * @return code
   **/
  public String getCode() {
    return code;
  }

  /**
   * Set code
   */
  public void setCode(String code) {
    this.code = code;
  }

  public ApiErrorDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Описание ошибки.
   * @return message
   **/
  public String getMessage() {
    return message;
  }

  /**
   * Set message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  public ApiErrorDTO message(String message) {
    this.message = message;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

