package apimodels;

import apimodels.GpsDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Адрес склада.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WarehouseAddressDTO   {
  @JsonProperty("city")
  @NotNull
@Size(max=200)

  private String city;

  @JsonProperty("street")
  @Size(max=512)

  private String street;

  @JsonProperty("number")
  @Size(max=256)

  private String number;

  @JsonProperty("building")
  @Size(max=16)

  private String building;

  @JsonProperty("block")
  @Size(max=16)

  private String block;

  @JsonProperty("gps")
  @NotNull
@Valid

  private GpsDTO gps;

  public WarehouseAddressDTO city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Город.
   * @return city
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(city, warehouseAddressDTO.city) &&
        Objects.equals(street, warehouseAddressDTO.street) &&
        Objects.equals(number, warehouseAddressDTO.number) &&
        Objects.equals(building, warehouseAddressDTO.building) &&
        Objects.equals(block, warehouseAddressDTO.block) &&
        Objects.equals(gps, warehouseAddressDTO.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, number, building, block, gps);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

