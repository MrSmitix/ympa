package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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

  /**
   * Страна.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Страна.  Обязательный параметр. ")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
   **/
  
  @ApiModelProperty(value = "Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). ")
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  /**
   * Город или населенный пункт.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Город или населенный пункт.  Обязательный параметр. ")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Район.
   **/
  
  @ApiModelProperty(value = "Район.")
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }

  /**
   * Станция метро.
   **/
  
  @ApiModelProperty(value = "Станция метро.")
  @JsonProperty("subway")
  public String getSubway() {
    return subway;
  }
  public void setSubway(String subway) {
    this.subway = subway;
  }

  /**
   * Улица.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Улица.  Обязательный параметр. ")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   * Дом или владение.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Дом или владение.  Обязательный параметр. ")
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }
  public void setHouse(String house) {
    this.house = house;
  }

  /**
   * Корпус или строение.
   **/
  
  @ApiModelProperty(value = "Корпус или строение.")
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

  /**
   * Подъезд.
   **/
  
  @ApiModelProperty(value = "Подъезд.")
  @JsonProperty("entrance")
  public String getEntrance() {
    return entrance;
  }
  public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

  /**
   * Код домофона.
   **/
  
  @ApiModelProperty(value = "Код домофона.")
  @JsonProperty("entryphone")
  public String getEntryphone() {
    return entryphone;
  }
  public void setEntryphone(String entryphone) {
    this.entryphone = entryphone;
  }

  /**
   * Этаж.
   **/
  
  @ApiModelProperty(value = "Этаж.")
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }
  public void setFloor(String floor) {
    this.floor = floor;
  }

  /**
   * Квартира или офис.
   **/
  
  @ApiModelProperty(value = "Квартира или офис.")
  @JsonProperty("apartment")
  public String getApartment() {
    return apartment;
  }
  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  /**
   * Телефон получателя заказа.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Телефон получателя заказа.  Обязательный параметр. ")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
   **/
  
  @ApiModelProperty(value = "Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ")
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.country, orderDeliveryAddressDTO.country) &&
        Objects.equals(this.postcode, orderDeliveryAddressDTO.postcode) &&
        Objects.equals(this.city, orderDeliveryAddressDTO.city) &&
        Objects.equals(this.district, orderDeliveryAddressDTO.district) &&
        Objects.equals(this.subway, orderDeliveryAddressDTO.subway) &&
        Objects.equals(this.street, orderDeliveryAddressDTO.street) &&
        Objects.equals(this.house, orderDeliveryAddressDTO.house) &&
        Objects.equals(this.block, orderDeliveryAddressDTO.block) &&
        Objects.equals(this.entrance, orderDeliveryAddressDTO.entrance) &&
        Objects.equals(this.entryphone, orderDeliveryAddressDTO.entryphone) &&
        Objects.equals(this.floor, orderDeliveryAddressDTO.floor) &&
        Objects.equals(this.apartment, orderDeliveryAddressDTO.apartment) &&
        Objects.equals(this.phone, orderDeliveryAddressDTO.phone) &&
        Objects.equals(this.recipient, orderDeliveryAddressDTO.recipient) &&
        Objects.equals(this.gps, orderDeliveryAddressDTO.gps);
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

