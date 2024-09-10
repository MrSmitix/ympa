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
import org.openapitools.client.model.GpsDTO;



/**
  * Адрес склада.
 **/

public class WarehouseAddressDTO  {
  
 /**
   * Город.
  **/
  private String city;

 /**
   * Улица.
  **/
  private String street;

 /**
   * Номер дома.
  **/
  private String number;

 /**
   * Номер строения.
  **/
  private String building;

 /**
   * Номер корпуса.
  **/
  private String block;

  private GpsDTO gps;

 /**
   * Город.
   * @return city
  **/
  public String getCity() {
    return city;
  }

  /**
    * Set city
  **/
  public void setCity(String city) {
    this.city = city;
  }

  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Улица.
   * @return street
  **/
  public String getStreet() {
    return street;
  }

  /**
    * Set street
  **/
  public void setStreet(String street) {
    this.street = street;
  }

  public WarehouseAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
   * Номер дома.
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  /**
    * Set number
  **/
  public void setNumber(String number) {
    this.number = number;
  }

  public WarehouseAddressDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Номер строения.
   * @return building
  **/
  public String getBuilding() {
    return building;
  }

  /**
    * Set building
  **/
  public void setBuilding(String building) {
    this.building = building;
  }

  public WarehouseAddressDTO building(String building) {
    this.building = building;
    return this;
  }

 /**
   * Номер корпуса.
   * @return block
  **/
  public String getBlock() {
    return block;
  }

  /**
    * Set block
  **/
  public void setBlock(String block) {
    this.block = block;
  }

  public WarehouseAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
   * Get gps
   * @return gps
  **/
  public GpsDTO getGps() {
    return gps;
  }

  /**
    * Set gps
  **/
  public void setGps(GpsDTO gps) {
    this.gps = gps;
  }

  public WarehouseAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarehouseAddressDTO {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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
