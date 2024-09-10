package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Адрес склада.
 **/
@ApiModel(description = "Адрес склада.")
@JsonTypeName("WarehouseAddressDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseAddressDTO   {
  private String city;
  private String street;
  private String number;
  private String building;
  private String block;
  private GpsDTO gps;

  /**
   * Город.
   **/
  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Город.")
  @JsonProperty("city")
  @NotNull  @Size(max=200)public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Улица.
   **/
  public WarehouseAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(value = "Улица.")
  @JsonProperty("street")
   @Size(max=512)public String getStreet() {
    return street;
  }

  @JsonProperty("street")
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Номер дома.
   **/
  public WarehouseAddressDTO number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Номер дома.")
  @JsonProperty("number")
   @Size(max=256)public String getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Номер строения.
   **/
  public WarehouseAddressDTO building(String building) {
    this.building = building;
    return this;
  }

  
  @ApiModelProperty(value = "Номер строения.")
  @JsonProperty("building")
   @Size(max=16)public String getBuilding() {
    return building;
  }

  @JsonProperty("building")
  public void setBuilding(String building) {
    this.building = building;
  }

  /**
   * Номер корпуса.
   **/
  public WarehouseAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  
  @ApiModelProperty(value = "Номер корпуса.")
  @JsonProperty("block")
   @Size(max=16)public String getBlock() {
    return block;
  }

  @JsonProperty("block")
  public void setBlock(String block) {
    this.block = block;
  }

  /**
   **/
  public WarehouseAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gps")
  @NotNull @Valid public GpsDTO getGps() {
    return gps;
  }

  @JsonProperty("gps")
  public void setGps(GpsDTO gps) {
    this.gps = gps;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

