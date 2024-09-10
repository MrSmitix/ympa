package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GpsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 **/
@ApiModel(description="Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). ")

public class OrderDeliveryAddressDTO  {
  
  @ApiModelProperty(value = "Страна.  Обязательный параметр. ")
 /**
   * Страна.  Обязательный параметр. 
  **/
  private String country;

  @ApiModelProperty(value = "Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). ")
 /**
   * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
  **/
  private String postcode;

  @ApiModelProperty(value = "Город или населенный пункт.  Обязательный параметр. ")
 /**
   * Город или населенный пункт.  Обязательный параметр. 
  **/
  private String city;

  @ApiModelProperty(value = "Район.")
 /**
   * Район.
  **/
  private String district;

  @ApiModelProperty(value = "Станция метро.")
 /**
   * Станция метро.
  **/
  private String subway;

  @ApiModelProperty(value = "Улица.  Обязательный параметр. ")
 /**
   * Улица.  Обязательный параметр. 
  **/
  private String street;

  @ApiModelProperty(value = "Дом или владение.  Обязательный параметр. ")
 /**
   * Дом или владение.  Обязательный параметр. 
  **/
  private String house;

  @ApiModelProperty(value = "Корпус или строение.")
 /**
   * Корпус или строение.
  **/
  private String block;

  @ApiModelProperty(value = "Подъезд.")
 /**
   * Подъезд.
  **/
  private String entrance;

  @ApiModelProperty(value = "Код домофона.")
 /**
   * Код домофона.
  **/
  private String entryphone;

  @ApiModelProperty(value = "Этаж.")
 /**
   * Этаж.
  **/
  private String floor;

  @ApiModelProperty(value = "Квартира или офис.")
 /**
   * Квартира или офис.
  **/
  private String apartment;

  @ApiModelProperty(value = "Телефон получателя заказа.  Обязательный параметр. ")
 /**
   * Телефон получателя заказа.  Обязательный параметр. 
  **/
  private String phone;

  @ApiModelProperty(value = "Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ")
 /**
   * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
  **/
  private String recipient;

  @ApiModelProperty(value = "")
  @Valid
  private GpsDTO gps;
 /**
   * Страна.  Обязательный параметр. 
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrderDeliveryAddressDTO country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
   * @return postcode
  **/
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public OrderDeliveryAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
   * Город или населенный пункт.  Обязательный параметр. 
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderDeliveryAddressDTO city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Район.
   * @return district
  **/
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public OrderDeliveryAddressDTO district(String district) {
    this.district = district;
    return this;
  }

 /**
   * Станция метро.
   * @return subway
  **/
  @JsonProperty("subway")
  public String getSubway() {
    return subway;
  }

  public void setSubway(String subway) {
    this.subway = subway;
  }

  public OrderDeliveryAddressDTO subway(String subway) {
    this.subway = subway;
    return this;
  }

 /**
   * Улица.  Обязательный параметр. 
   * @return street
  **/
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OrderDeliveryAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
   * Дом или владение.  Обязательный параметр. 
   * @return house
  **/
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public OrderDeliveryAddressDTO house(String house) {
    this.house = house;
    return this;
  }

 /**
   * Корпус или строение.
   * @return block
  **/
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public OrderDeliveryAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
   * Подъезд.
   * @return entrance
  **/
  @JsonProperty("entrance")
  public String getEntrance() {
    return entrance;
  }

  public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

  public OrderDeliveryAddressDTO entrance(String entrance) {
    this.entrance = entrance;
    return this;
  }

 /**
   * Код домофона.
   * @return entryphone
  **/
  @JsonProperty("entryphone")
  public String getEntryphone() {
    return entryphone;
  }

  public void setEntryphone(String entryphone) {
    this.entryphone = entryphone;
  }

  public OrderDeliveryAddressDTO entryphone(String entryphone) {
    this.entryphone = entryphone;
    return this;
  }

 /**
   * Этаж.
   * @return floor
  **/
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public OrderDeliveryAddressDTO floor(String floor) {
    this.floor = floor;
    return this;
  }

 /**
   * Квартира или офис.
   * @return apartment
  **/
  @JsonProperty("apartment")
  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public OrderDeliveryAddressDTO apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

 /**
   * Телефон получателя заказа.  Обязательный параметр. 
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderDeliveryAddressDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
   * @return recipient
  **/
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public OrderDeliveryAddressDTO recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

 /**
   * Get gps
   * @return gps
  **/
  @JsonProperty("gps")
  public GpsDTO getGps() {
    return gps;
  }

  public void setGps(GpsDTO gps) {
    this.gps = gps;
  }

  public OrderDeliveryAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

