package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Адрес доставки.
 */

@Schema(name = "PickupAddressDTO", description = "Адрес доставки.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PickupAddressDTO {

  private String country;

  private String city;

  private String street;

  private String house;

  private String postcode;

  public PickupAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Страна.
   * @return country
   */
  
  @Schema(name = "country", example = "Россия", description = "Страна.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PickupAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город.
   * @return city
   */
  
  @Schema(name = "city", example = "Москва", description = "Город.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PickupAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Улица.
   * @return street
   */
  
  @Schema(name = "street", example = "Стрелецкая улица", description = "Улица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public PickupAddressDTO house(String house) {
    this.house = house;
    return this;
  }

  /**
   * Номер дома.
   * @return house
   */
  
  @Schema(name = "house", example = "9к2", description = "Номер дома.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public PickupAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Почтовый индекс.
   * @return postcode
   */
  
  @Schema(name = "postcode", example = "123518", description = "Почтовый индекс.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
