package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Адрес доставки.
 **/
@ApiModel(description = "Адрес доставки.")
@JsonTypeName("PickupAddressDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PickupAddressDTO   {
  private String country;
  private String city;
  private String street;
  private String house;
  private String postcode;

  /**
   * Страна.
   **/
  public PickupAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "Россия", value = "Страна.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Город.
   **/
  public PickupAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "Москва", value = "Город.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Улица.
   **/
  public PickupAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(example = "Стрелецкая улица", value = "Улица.")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  @JsonProperty("street")
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Номер дома.
   **/
  public PickupAddressDTO house(String house) {
    this.house = house;
    return this;
  }

  
  @ApiModelProperty(example = "9к2", value = "Номер дома.")
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  @JsonProperty("house")
  public void setHouse(String house) {
    this.house = house;
  }

  /**
   * Почтовый индекс.
   **/
  public PickupAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  
  @ApiModelProperty(example = "123518", value = "Почтовый индекс.")
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  @JsonProperty("postcode")
  public void setPostcode(String postcode) {
    this.postcode = postcode;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

