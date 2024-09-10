package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GpsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Адрес склада.
 */
@ApiModel(description="Адрес склада.")

public class WarehouseAddressDTO  {
  
 /**
  * Город.
  */
  @ApiModelProperty(required = true, value = "Город.")
  private String city;

 /**
  * Улица.
  */
  @ApiModelProperty(value = "Улица.")
  private String street;

 /**
  * Номер дома.
  */
  @ApiModelProperty(value = "Номер дома.")
  private String number;

 /**
  * Номер строения.
  */
  @ApiModelProperty(value = "Номер строения.")
  private String building;

 /**
  * Номер корпуса.
  */
  @ApiModelProperty(value = "Номер корпуса.")
  private String block;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GpsDTO gps;
 /**
  * Город.
  * @return city
  */
  @JsonProperty("city")
  @NotNull
 @Size(max=200)  public String getCity() {
    return city;
  }

  /**
   * Sets the <code>city</code> property.
   */
 public void setCity(String city) {
    this.city = city;
  }

  /**
   * Sets the <code>city</code> property.
   */
  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Улица.
  * @return street
  */
  @JsonProperty("street")
 @Size(max=512)  public String getStreet() {
    return street;
  }

  /**
   * Sets the <code>street</code> property.
   */
 public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Sets the <code>street</code> property.
   */
  public WarehouseAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
  * Номер дома.
  * @return number
  */
  @JsonProperty("number")
 @Size(max=256)  public String getNumber() {
    return number;
  }

  /**
   * Sets the <code>number</code> property.
   */
 public void setNumber(String number) {
    this.number = number;
  }

  /**
   * Sets the <code>number</code> property.
   */
  public WarehouseAddressDTO number(String number) {
    this.number = number;
    return this;
  }

 /**
  * Номер строения.
  * @return building
  */
  @JsonProperty("building")
 @Size(max=16)  public String getBuilding() {
    return building;
  }

  /**
   * Sets the <code>building</code> property.
   */
 public void setBuilding(String building) {
    this.building = building;
  }

  /**
   * Sets the <code>building</code> property.
   */
  public WarehouseAddressDTO building(String building) {
    this.building = building;
    return this;
  }

 /**
  * Номер корпуса.
  * @return block
  */
  @JsonProperty("block")
 @Size(max=16)  public String getBlock() {
    return block;
  }

  /**
   * Sets the <code>block</code> property.
   */
 public void setBlock(String block) {
    this.block = block;
  }

  /**
   * Sets the <code>block</code> property.
   */
  public WarehouseAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
  * Get gps
  * @return gps
  */
  @JsonProperty("gps")
  @NotNull
  public GpsDTO getGps() {
    return gps;
  }

  /**
   * Sets the <code>gps</code> property.
   */
 public void setGps(GpsDTO gps) {
    this.gps = gps;
  }

  /**
   * Sets the <code>gps</code> property.
   */
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

