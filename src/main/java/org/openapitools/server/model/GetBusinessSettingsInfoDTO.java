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

import org.openapitools.server.model.BusinessDTO;
import org.openapitools.server.model.BusinessSettingsDTO;
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
  * Информация о кабинете и его настройках.
  */

public class GetBusinessSettingsInfoDTO  {
  
  @JsonbProperty("info")
  private BusinessDTO info;

  @JsonbProperty("settings")
  private BusinessSettingsDTO settings;

  /**
   * Get info
   * @return info
   **/
  public BusinessDTO getInfo() {
    return info;
  }

  /**
   * Set info
   */
  public void setInfo(BusinessDTO info) {
    this.info = info;
  }

  public GetBusinessSettingsInfoDTO info(BusinessDTO info) {
    this.info = info;
    return this;
  }

  /**
   * Get settings
   * @return settings
   **/
  public BusinessSettingsDTO getSettings() {
    return settings;
  }

  /**
   * Set settings
   */
  public void setSettings(BusinessSettingsDTO settings) {
    this.settings = settings;
  }

  public GetBusinessSettingsInfoDTO settings(BusinessSettingsDTO settings) {
    this.settings = settings;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessSettingsInfoDTO {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

