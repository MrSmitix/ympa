package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.GpsDTO;

/**
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDeliveryAddressDTO   {
  
  private String country;
  private String postcode;
  private String city;
  private String district;
  private String subway;
  private String street;
  private String house;
  private String block;
  private String entrance;
  private String entryphone;
  private String floor;
  private String apartment;
  private String phone;
  private String recipient;
  private GpsDTO gps;

  public OrderDeliveryAddressDTO () {

  }

  public OrderDeliveryAddressDTO (String country, String postcode, String city, String district, String subway, String street, String house, String block, String entrance, String entryphone, String floor, String apartment, String phone, String recipient, GpsDTO gps) {
    this.country = country;
    this.postcode = postcode;
    this.city = city;
    this.district = district;
    this.subway = subway;
    this.street = street;
    this.house = house;
    this.block = block;
    this.entrance = entrance;
    this.entryphone = entryphone;
    this.floor = floor;
    this.apartment = apartment;
    this.phone = phone;
    this.recipient = recipient;
    this.gps = gps;
  }

    
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

    
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

    
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }

    
  @JsonProperty("subway")
  public String getSubway() {
    return subway;
  }
  public void setSubway(String subway) {
    this.subway = subway;
  }

    
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

    
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }
  public void setHouse(String house) {
    this.house = house;
  }

    
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

    
  @JsonProperty("entrance")
  public String getEntrance() {
    return entrance;
  }
  public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

    
  @JsonProperty("entryphone")
  public String getEntryphone() {
    return entryphone;
  }
  public void setEntryphone(String entryphone) {
    this.entryphone = entryphone;
  }

    
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }
  public void setFloor(String floor) {
    this.floor = floor;
  }

    
  @JsonProperty("apartment")
  public String getApartment() {
    return apartment;
  }
  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

    
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

    
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }
  public void setRecipient(String recipient) {
    this.recipient = recipient;
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
    OrderDeliveryAddressDTO orderDeliveryAddressDTO = (OrderDeliveryAddressDTO) o;
    return Objects.equals(country, orderDeliveryAddressDTO.country) &&
        Objects.equals(postcode, orderDeliveryAddressDTO.postcode) &&
        Objects.equals(city, orderDeliveryAddressDTO.city) &&
        Objects.equals(district, orderDeliveryAddressDTO.district) &&
        Objects.equals(subway, orderDeliveryAddressDTO.subway) &&
        Objects.equals(street, orderDeliveryAddressDTO.street) &&
        Objects.equals(house, orderDeliveryAddressDTO.house) &&
        Objects.equals(block, orderDeliveryAddressDTO.block) &&
        Objects.equals(entrance, orderDeliveryAddressDTO.entrance) &&
        Objects.equals(entryphone, orderDeliveryAddressDTO.entryphone) &&
        Objects.equals(floor, orderDeliveryAddressDTO.floor) &&
        Objects.equals(apartment, orderDeliveryAddressDTO.apartment) &&
        Objects.equals(phone, orderDeliveryAddressDTO.phone) &&
        Objects.equals(recipient, orderDeliveryAddressDTO.recipient) &&
        Objects.equals(gps, orderDeliveryAddressDTO.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, postcode, city, district, subway, street, house, block, entrance, entryphone, floor, apartment, phone, recipient, gps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryAddressDTO {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    subway: ").append(toIndentedString(subway)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    entrance: ").append(toIndentedString(entrance)).append("\n");
    sb.append("    entryphone: ").append(toIndentedString(entryphone)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    apartment: ").append(toIndentedString(apartment)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
