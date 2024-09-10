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
import org.openapitools.client.model.GoodsFeedbackCommentAuthorType;



/**
  * Информация об авторе комментария.
 **/

public class GoodsFeedbackCommentAuthorDTO  {
  
  private GoodsFeedbackCommentAuthorType type;

 /**
   * Имя автора или название кабинета.
  **/
  private String name;

 /**
   * Get type
   * @return type
  **/
  public GoodsFeedbackCommentAuthorType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
  }

  public GoodsFeedbackCommentAuthorDTO type(GoodsFeedbackCommentAuthorType type) {
    this.type = type;
    return this;
  }

 /**
   * Имя автора или название кабинета.
   * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public GoodsFeedbackCommentAuthorDTO name(String name) {
    this.name = name;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackCommentAuthorDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

