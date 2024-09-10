package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о курьере.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderCourierDTO   {
  
  private String fullName;
  private String phone;
  private String phoneExtension;
  private String vehicleNumber;
  private String vehicleDescription;

  public OrderCourierDTO () {

  }

  public OrderCourierDTO (String fullName, String phone, String phoneExtension, String vehicleNumber, String vehicleDescription) {
    this.fullName = fullName;
    this.phone = phone;
    this.phoneExtension = phoneExtension;
    this.vehicleNumber = vehicleNumber;
    this.vehicleDescription = vehicleDescription;
  }

    
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

    
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

    
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }
  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

    
  @JsonProperty("vehicleNumber")
  public String getVehicleNumber() {
    return vehicleNumber;
  }
  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

    
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
