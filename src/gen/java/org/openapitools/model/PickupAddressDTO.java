package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Адрес доставки.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PickupAddressDTO   {
  
  private String country;
  private String city;
  private String street;
  private String house;
  private String postcode;

  /**
   * Страна.
   **/
  
  @ApiModelProperty(example = "Россия", value = "Страна.")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Город.
   **/
  
  @ApiModelProperty(example = "Москва", value = "Город.")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Улица.
   **/
  
  @ApiModelProperty(example = "Стрелецкая улица", value = "Улица.")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Номер дома.
   **/
  
  @ApiModelProperty(example = "9к2", value = "Номер дома.")
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }
  public void setHouse(String house) {
    this.house = house;
  }

  /**
   * Почтовый индекс.
   **/
  
  @ApiModelProperty(example = "123518", value = "Почтовый индекс.")
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }
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

