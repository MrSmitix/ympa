package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о курьере.
 */
@ApiModel(description="Информация о курьере.")

public class OrderCourierDTO  {
  
 /**
  * Полное имя курьера.
  */
  @ApiModelProperty(value = "Полное имя курьера.")
  private String fullName;

 /**
  * Номер телефона курьера.
  */
  @ApiModelProperty(value = "Номер телефона курьера.")
  private String phone;

 /**
  * Добавочный номер телефона.
  */
  @ApiModelProperty(value = "Добавочный номер телефона.")
  private String phoneExtension;

 /**
  * Номер транспортного средства.
  */
  @ApiModelProperty(value = "Номер транспортного средства.")
  private String vehicleNumber;

 /**
  * Описание машины. Например, модель и цвет.
  */
  @ApiModelProperty(value = "Описание машины. Например, модель и цвет.")
  private String vehicleDescription;
 /**
  * Полное имя курьера.
  * @return fullName
  */
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
 public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Sets the <code>fullName</code> property.
   */
  public OrderCourierDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

 /**
  * Номер телефона курьера.
  * @return phone
  */
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
 public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
  public OrderCourierDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
  * Добавочный номер телефона.
  * @return phoneExtension
  */
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  /**
   * Sets the <code>phoneExtension</code> property.
   */
 public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  /**
   * Sets the <code>phoneExtension</code> property.
   */
  public OrderCourierDTO phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

 /**
  * Номер транспортного средства.
  * @return vehicleNumber
  */
  @JsonProperty("vehicleNumber")
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  /**
   * Sets the <code>vehicleNumber</code> property.
   */
 public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  /**
   * Sets the <code>vehicleNumber</code> property.
   */
  public OrderCourierDTO vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

 /**
  * Описание машины. Например, модель и цвет.
  * @return vehicleDescription
  */
  @JsonProperty("vehicleDescription")
  public String getVehicleDescription() {
    return vehicleDescription;
  }

  /**
   * Sets the <code>vehicleDescription</code> property.
   */
 public void setVehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
  }

  /**
   * Sets the <code>vehicleDescription</code> property.
   */
  public OrderCourierDTO vehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCourierDTO orderCourierDTO = (OrderCourierDTO) o;
    return Objects.equals(this.fullName, orderCourierDTO.fullName) &&
        Objects.equals(this.phone, orderCourierDTO.phone) &&
        Objects.equals(this.phoneExtension, orderCourierDTO.phoneExtension) &&
        Objects.equals(this.vehicleNumber, orderCourierDTO.vehicleNumber) &&
        Objects.equals(this.vehicleDescription, orderCourierDTO.vehicleDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, phone, phoneExtension, vehicleNumber, vehicleDescription);
  }

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

