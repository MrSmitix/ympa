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



/**
  * Информация о трек-номерах.
 **/

public class TrackDTO  {
  
 /**
   * Трек-код почтового отправления.
  **/
  private String trackCode;

 /**
   * Трек-код почтового отправления.
   * @return trackCode
  **/
  public String getTrackCode() {
    return trackCode;
  }

  /**
    * Set trackCode
  **/
  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  public TrackDTO trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackDTO {\n");
    
    sb.append("    trackCode: ").append(toIndentedString(trackCode)).append("\n");
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

