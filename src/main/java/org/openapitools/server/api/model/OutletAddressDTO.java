package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Адрес точки продаж. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutletAddressDTO   {
  
  private Long regionId;
  private String street;
  private String number;
  private String building;
  private String estate;
  private String block;
  private String additional;
  private Integer km;
  private String city;

  public OutletAddressDTO () {

  }

  public OutletAddressDTO (Long regionId, String street, String number, String building, String estate, String block, String additional, Integer km, String city) {
    this.regionId = regionId;
    this.street = street;
    this.number = number;
    this.building = building;
    this.estate = estate;
    this.block = block;
    this.additional = additional;
    this.km = km;
    this.city = city;
  }

    
  @JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
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

    
  @JsonProperty("estate")
  public String getEstate() {
    return estate;
  }
  public void setEstate(String estate) {
    this.estate = estate;
  }

    
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

    
  @JsonProperty("additional")
  public String getAdditional() {
    return additional;
  }
  public void setAdditional(String additional) {
    this.additional = additional;
  }

    
  @JsonProperty("km")
  public Integer getKm() {
    return km;
  }
  public void setKm(Integer km) {
    this.km = km;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutletAddressDTO outletAddressDTO = (OutletAddressDTO) o;
    return Objects.equals(regionId, outletAddressDTO.regionId) &&
        Objects.equals(street, outletAddressDTO.street) &&
        Objects.equals(number, outletAddressDTO.number) &&
        Objects.equals(building, outletAddressDTO.building) &&
        Objects.equals(estate, outletAddressDTO.estate) &&
        Objects.equals(block, outletAddressDTO.block) &&
        Objects.equals(additional, outletAddressDTO.additional) &&
        Objects.equals(km, outletAddressDTO.km) &&
        Objects.equals(city, outletAddressDTO.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, street, number, building, estate, block, additional, km, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutletAddressDTO {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    estate: ").append(toIndentedString(estate)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    additional: ").append(toIndentedString(additional)).append("\n");
    sb.append("    km: ").append(toIndentedString(km)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
