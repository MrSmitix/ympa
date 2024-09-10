package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о курьере.
 **/
@ApiModel(description="Информация о курьере.")

public class OrderCourierDTO  {
  
  @ApiModelProperty(value = "Полное имя курьера.")
 /**
   * Полное имя курьера.
  **/
  private String fullName;

  @ApiModelProperty(value = "Номер телефона курьера.")
 /**
   * Номер телефона курьера.
  **/
  private String phone;

  @ApiModelProperty(value = "Добавочный номер телефона.")
 /**
   * Добавочный номер телефона.
  **/
  private String phoneExtension;

  @ApiModelProperty(value = "Номер транспортного средства.")
 /**
   * Номер транспортного средства.
  **/
  private String vehicleNumber;

  @ApiModelProperty(value = "Описание машины. Например, модель и цвет.")
 /**
   * Описание машины. Например, модель и цвет.
  **/
  private String vehicleDescription;
 /**
   * Полное имя курьера.
   * @return fullName
  **/
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

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
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

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
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }

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
  @JsonProperty("vehicleNumber")
  public String getVehicleNumber() {
    return vehicleNumber;
  }

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
  @JsonProperty("vehicleDescription")
  public String getVehicleDescription() {
    return vehicleDescription;
  }

  public void setVehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
  }

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

