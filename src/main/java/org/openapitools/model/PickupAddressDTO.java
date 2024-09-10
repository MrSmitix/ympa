/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Адрес доставки.
 */

@ApiModel(description = "Адрес доставки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PickupAddressDTO   {
  
  private String country;
  private String city;
  private String street;
  private String house;
  private String postcode;

  /**
   * Страна.
   */
  public PickupAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  
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
   */
  public PickupAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
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
   */
  public PickupAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  
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
   */
  public PickupAddressDTO house(String house) {
    this.house = house;
    return this;
  }

  
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
   */
  public PickupAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  
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
    return Objects.equals(country, pickupAddressDTO.country) &&
        Objects.equals(city, pickupAddressDTO.city) &&
        Objects.equals(street, pickupAddressDTO.street) &&
        Objects.equals(house, pickupAddressDTO.house) &&
        Objects.equals(postcode, pickupAddressDTO.postcode);
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

