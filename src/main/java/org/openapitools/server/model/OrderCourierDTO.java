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
  * Информация о курьере.
  */

public class OrderCourierDTO  {
  
 /**
  * Полное имя курьера.
  */
  @JsonbProperty("fullName")
  private String fullName;

 /**
  * Номер телефона курьера.
  */
  @JsonbProperty("phone")
  private String phone;

 /**
  * Добавочный номер телефона.
  */
  @JsonbProperty("phoneExtension")
  private String phoneExtension;

 /**
  * Номер транспортного средства.
  */
  @JsonbProperty("vehicleNumber")
  private String vehicleNumber;

 /**
  * Описание машины. Например, модель и цвет.
  */
  @JsonbProperty("vehicleDescription")
  private String vehicleDescription;

  /**
   * Полное имя курьера.
   * @return fullName
   **/
  public String getFullName() {
    return fullName;
  }

  /**
   * Set fullName
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public OrderCourierDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Номер телефона курьера.
   * @return phone
   **/
  public String getPhone() {
    return phone;
  }

  /**
   * Set phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderCourierDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Добавочный номер телефона.
   * @return phoneExtension
   **/
  public String getPhoneExtension() {
    return phoneExtension;
  }

  /**
   * Set phoneExtension
   */
  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public OrderCourierDTO phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

  /**
   * Номер транспортного средства.
   * @return vehicleNumber
   **/
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  /**
   * Set vehicleNumber
   */
  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public OrderCourierDTO vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  /**
   * Описание машины. Например, модель и цвет.
   * @return vehicleDescription
   **/
  public String getVehicleDescription() {
    return vehicleDescription;
  }

  /**
   * Set vehicleDescription
   */
  public void setVehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
  }

  public OrderCourierDTO vehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCourierDTO {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
    sb.append("    vehicleDescription: ").append(toIndentedString(vehicleDescription)).append("\n");
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

