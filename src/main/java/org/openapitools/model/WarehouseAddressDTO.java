package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GpsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Адрес склада.
 */

@Schema(name = "WarehouseAddressDTO", description = "Адрес склада.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseAddressDTO {

  private String city;

  private String street;

  private String number;

  private String building;

  private String block;

  private GpsDTO gps;

  public WarehouseAddressDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseAddressDTO(String city, GpsDTO gps) {
    this.city = city;
    this.gps = gps;
  }

  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город.
   * @return city
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "city", description = "Город.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public WarehouseAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Улица.
   * @return street
   */
  @Size(max = 512) 
  @Schema(name = "street", description = "Улица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public WarehouseAddressDTO number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Номер дома.
   * @return number
   */
  @Size(max = 256) 
  @Schema(name = "number", description = "Номер дома.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public WarehouseAddressDTO building(String building) {
    this.building = building;
    return this;
  }

  /**
   * Номер строения.
   * @return building
   */
  @Size(max = 16) 
  @Schema(name = "building", description = "Номер строения.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public WarehouseAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  /**
   * Номер корпуса.
   * @return block
   */
  @Size(max = 16) 
  @Schema(name = "block", description = "Номер корпуса.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public WarehouseAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Get gps
   * @return gps
   */
  @NotNull @Valid 
  @Schema(name = "gps", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gps")
  public GpsDTO getGps() {
    return gps;
  }

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

