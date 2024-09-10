package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Адрес доставки.
 **/
@ApiModel(description="Адрес доставки.")

public class PickupAddressDTO  {
  
  @ApiModelProperty(example = "Россия", value = "Страна.")
 /**
   * Страна.
  **/
  private String country;

  @ApiModelProperty(example = "Москва", value = "Город.")
 /**
   * Город.
  **/
  private String city;

  @ApiModelProperty(example = "Стрелецкая улица", value = "Улица.")
 /**
   * Улица.
  **/
  private String street;

  @ApiModelProperty(example = "9к2", value = "Номер дома.")
 /**
   * Номер дома.
  **/
  private String house;

  @ApiModelProperty(example = "123518", value = "Почтовый индекс.")
 /**
   * Почтовый индекс.
  **/
  private String postcode;
 /**
   * Страна.
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PickupAddressDTO country(String country) {
    this.country = country;
    return this;
  }

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

  public PickupAddressDTO city(String city) {
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

  public PickupAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
   * Номер дома.
   * @return house
  **/
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public PickupAddressDTO house(String house) {
    this.house = house;
    return this;
  }

 /**
   * Почтовый индекс.
   * @return postcode
  **/
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public PickupAddressDTO postcode(String postcode) {
    this.postcode = postcode;
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
    PickupAddressDTO pickupAddressDTO = (PickupAddressDTO) o;
    return Objects.equals(this.country, pickupAddressDTO.country) &&
        Objects.equals(this.city, pickupAddressDTO.city) &&
        Objects.equals(this.street, pickupAddressDTO.street) &&
        Objects.equals(this.house, pickupAddressDTO.house) &&
        Objects.equals(this.postcode, pickupAddressDTO.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, city, street, house, postcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickupAddressDTO {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    house: ").append(toIndentedString(house)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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

