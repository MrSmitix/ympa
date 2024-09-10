package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о курьере.
 **/

@ApiModel(description = "Информация о курьере.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderCourierDTO   {
  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("phoneExtension")
  private String phoneExtension;

  @JsonProperty("vehicleNumber")
  private String vehicleNumber;

  @JsonProperty("vehicleDescription")
  private String vehicleDescription;

  /**
   * Полное имя курьера.
   **/
  public OrderCourierDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "Полное имя курьера.")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Номер телефона курьера.
   **/
  public OrderCourierDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "Номер телефона курьера.")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Добавочный номер телефона.
   **/
  public OrderCourierDTO phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

  
  @ApiModelProperty(value = "Добавочный номер телефона.")
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }
  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  /**
   * Номер транспортного средства.
   **/
  public OrderCourierDTO vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Номер транспортного средства.")
  @JsonProperty("vehicleNumber")
  public String getVehicleNumber() {
    return vehicleNumber;
  }
  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  /**
   * Описание машины. Например, модель и цвет.
   **/
  public OrderCourierDTO vehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
    return this;
  }

  
  @ApiModelProperty(value = "Описание машины. Например, модель и цвет.")
  @JsonProperty("vehicleDescription")
  public String getVehicleDescription() {
    return vehicleDescription;
  }
  public void setVehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
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
    return Objects.equals(fullName, orderCourierDTO.fullName) &&
        Objects.equals(phone, orderCourierDTO.phone) &&
        Objects.equals(phoneExtension, orderCourierDTO.phoneExtension) &&
        Objects.equals(vehicleNumber, orderCourierDTO.vehicleNumber) &&
        Objects.equals(vehicleDescription, orderCourierDTO.vehicleDescription);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

