package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.GpsDTO;

/**
 * Адрес склада.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseAddressDTO   {
  
  private String city;
  private String street;
  private String number;
  private String building;
  private String block;
  private GpsDTO gps;

  public WarehouseAddressDTO () {

  }

  public WarehouseAddressDTO (String city, String street, String number, String building, String block, GpsDTO gps) {
    this.city = city;
    this.street = street;
    this.number = number;
    this.building = building;
    this.block = block;
    this.gps = gps;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

    
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

    
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

    
  @JsonProperty("building")
  public String getBuilding() {
    return building;
  }
  public void setBuilding(String building) {
    this.building = building;
  }

    
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

    
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
