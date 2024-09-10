package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о курьере.
 */

@Schema(name = "OrderCourierDTO", description = "Информация о курьере.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderCourierDTO {

  private String fullName;

  private String phone;

  private String phoneExtension;

  private String vehicleNumber;

  private String vehicleDescription;

  public OrderCourierDTO fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Полное имя курьера.
   * @return fullName
   */
  
  @Schema(name = "fullName", description = "Полное имя курьера.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public OrderCourierDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Номер телефона курьера.
   * @return phone
   */
  
  @Schema(name = "phone", description = "Номер телефона курьера.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderCourierDTO phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

  /**
   * Добавочный номер телефона.
   * @return phoneExtension
   */
  
  @Schema(name = "phoneExtension", description = "Добавочный номер телефона.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneExtension")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public OrderCourierDTO vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  /**
   * Номер транспортного средства.
   * @return vehicleNumber
   */
  
  @Schema(name = "vehicleNumber", description = "Номер транспортного средства.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleNumber")
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public OrderCourierDTO vehicleDescription(String vehicleDescription) {
    this.vehicleDescription = vehicleDescription;
    return this;
  }

  /**
   * Описание машины. Например, модель и цвет.
   * @return vehicleDescription
   */
  
  @Schema(name = "vehicleDescription", description = "Описание машины. Например, модель и цвет.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

