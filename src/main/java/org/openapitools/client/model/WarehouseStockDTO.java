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
import org.openapitools.client.model.WarehouseStockType;



/**
  * Информация об остатках товара.
 **/

public class WarehouseStockDTO  {
  
  private WarehouseStockType type;

 /**
   * Значение остатков.
  **/
  private Long count;

 /**
   * Get type
   * @return type
  **/
  public WarehouseStockType getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(WarehouseStockType type) {
    this.type = type;
  }

  public WarehouseStockDTO type(WarehouseStockType type) {
    this.type = type;
    return this;
  }

 /**
   * Значение остатков.
   * @return count
  **/
  public Long getCount() {
    return count;
  }

  /**
    * Set count
  **/
  public void setCount(Long count) {
    this.count = count;
  }

  public WarehouseStockDTO count(Long count) {
    this.count = count;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseStockDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

