package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Данные о складе отправления.
 **/
@ApiModel(description="Данные о складе отправления.")

public class PartnerShipmentWarehouseDTO  {
  
  @ApiModelProperty(value = "Идентификатор склада отправления.")
 /**
   * Идентификатор склада отправления.
  **/
  private Long id;

  @ApiModelProperty(value = "Наименование склада отправления.")
 /**
   * Наименование склада отправления.
  **/
  private String name;

  @ApiModelProperty(value = "Адрес склада отправления.")
 /**
   * Адрес склада отправления.
  **/
  private String address;
 /**
   * Идентификатор склада отправления.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

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
  @JsonProperty("name")
  public String getName() {
    return name;
  }

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
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PartnerShipmentWarehouseDTO address(String address) {
    this.address = address;
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
    PartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO = (PartnerShipmentWarehouseDTO) o;
    return Objects.equals(this.id, partnerShipmentWarehouseDTO.id) &&
        Objects.equals(this.name, partnerShipmentWarehouseDTO.name) &&
        Objects.equals(this.address, partnerShipmentWarehouseDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address);
  }

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

