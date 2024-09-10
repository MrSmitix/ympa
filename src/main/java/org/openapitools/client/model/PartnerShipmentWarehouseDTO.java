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
  * Данные о складе отправления.
 **/

public class PartnerShipmentWarehouseDTO  {
  
 /**
   * Идентификатор склада отправления.
  **/
  private Long id;

 /**
   * Наименование склада отправления.
  **/
  private String name;

 /**
   * Адрес склада отправления.
  **/
  private String address;

 /**
   * Идентификатор склада отправления.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(Long id) {
    this.id = id;
  }

  public PartnerShipmentWarehouseDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Наименование склада отправления.
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

  public PartnerShipmentWarehouseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Адрес склада отправления.
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  /**
    * Set address
  **/
  public void setAddress(String address) {
    this.address = address;
  }

  public PartnerShipmentWarehouseDTO address(String address) {
    this.address = address;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerShipmentWarehouseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
