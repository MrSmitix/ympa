package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GpsDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Адрес склада.
 **/
@ApiModel(description="Адрес склада.")

public class WarehouseAddressDTO  {
  
  @ApiModelProperty(required = true, value = "Город.")
 /**
   * Город.
  **/
  private String city;

  @ApiModelProperty(value = "Улица.")
 /**
   * Улица.
  **/
  private String street;

  @ApiModelProperty(value = "Номер дома.")
 /**
   * Номер дома.
  **/
  private String number;

  @ApiModelProperty(value = "Номер строения.")
 /**
   * Номер строения.
  **/
  private String building;

  @ApiModelProperty(value = "Номер корпуса.")
 /**
   * Номер корпуса.
  **/
  private String block;

  @ApiModelProperty(required = true, value = "")
  private GpsDTO gps;
 /**
   * Город.
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

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
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

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
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

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
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }

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
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }

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
  @JsonProperty("gps")
  public GpsDTO getGps() {
    return gps;
  }

  public void setGps(GpsDTO gps) {
    this.gps = gps;
  }

  public WarehouseAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
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
    WarehouseAddressDTO warehouseAddressDTO = (WarehouseAddressDTO) o;
    return Objects.equals(this.city, warehouseAddressDTO.city) &&
        Objects.equals(this.street, warehouseAddressDTO.street) &&
        Objects.equals(this.number, warehouseAddressDTO.number) &&
        Objects.equals(this.building, warehouseAddressDTO.building) &&
        Objects.equals(this.block, warehouseAddressDTO.block) &&
        Objects.equals(this.gps, warehouseAddressDTO.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, number, building, block, gps);
  }

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

