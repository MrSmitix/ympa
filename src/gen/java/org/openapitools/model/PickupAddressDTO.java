package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Адрес доставки.
 */
@ApiModel(description="Адрес доставки.")

public class PickupAddressDTO  {
  
 /**
  * Страна.
  */
  @ApiModelProperty(example = "Россия", value = "Страна.")
  private String country;

 /**
  * Город.
  */
  @ApiModelProperty(example = "Москва", value = "Город.")
  private String city;

 /**
  * Улица.
  */
  @ApiModelProperty(example = "Стрелецкая улица", value = "Улица.")
  private String street;

 /**
  * Номер дома.
  */
  @ApiModelProperty(example = "9к2", value = "Номер дома.")
  private String house;

 /**
  * Почтовый индекс.
  */
  @ApiModelProperty(example = "123518", value = "Почтовый индекс.")
  private String postcode;
 /**
  * Страна.
  * @return country
  */
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public PickupAddressDTO country(String country) {
    this.country = country;
    return this;
  }

 /**
  * Город.
  * @return city
  */
  @JsonProperty("city")
  public String getCity() {
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
  public PickupAddressDTO city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Улица.
  * @return street
  */
  @JsonProperty("street")
  public String getStreet() {
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
  public PickupAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
  * Номер дома.
  * @return house
  */
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  /**
   * Sets the <code>house</code> property.
   */
 public void setHouse(String house) {
    this.house = house;
  }

  /**
   * Sets the <code>house</code> property.
   */
  public PickupAddressDTO house(String house) {
    this.house = house;
    return this;
  }

 /**
  * Почтовый индекс.
  * @return postcode
  */
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  /**
   * Sets the <code>postcode</code> property.
   */
 public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * Sets the <code>postcode</code> property.
   */
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

