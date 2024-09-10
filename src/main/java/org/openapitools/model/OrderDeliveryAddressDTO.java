package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GpsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 */

@Schema(name = "OrderDeliveryAddressDTO", description = "Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryAddressDTO {

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

  public OrderDeliveryAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Страна.  Обязательный параметр. 
   * @return country
   */
  
  @Schema(name = "country", description = "Страна.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OrderDeliveryAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
   * @return postcode
   */
  
  @Schema(name = "postcode", description = "Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public OrderDeliveryAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Город или населенный пункт.  Обязательный параметр. 
   * @return city
   */
  
  @Schema(name = "city", description = "Город или населенный пункт.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderDeliveryAddressDTO district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Район.
   * @return district
   */
  
  @Schema(name = "district", description = "Район.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public OrderDeliveryAddressDTO subway(String subway) {
    this.subway = subway;
    return this;
  }

  /**
   * Станция метро.
   * @return subway
   */
  
  @Schema(name = "subway", description = "Станция метро.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subway")
  public String getSubway() {
    return subway;
  }

  public void setSubway(String subway) {
    this.subway = subway;
  }

  public OrderDeliveryAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Улица.  Обязательный параметр. 
   * @return street
   */
  
  @Schema(name = "street", description = "Улица.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public OrderDeliveryAddressDTO house(String house) {
    this.house = house;
    return this;
  }

  /**
   * Дом или владение.  Обязательный параметр. 
   * @return house
   */
  
  @Schema(name = "house", description = "Дом или владение.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("house")
  public String getHouse() {
    return house;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public OrderDeliveryAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  /**
   * Корпус или строение.
   * @return block
   */
  
  @Schema(name = "block", description = "Корпус или строение.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public OrderDeliveryAddressDTO entrance(String entrance) {
    this.entrance = entrance;
    return this;
  }

  /**
   * Подъезд.
   * @return entrance
   */
  
  @Schema(name = "entrance", description = "Подъезд.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entrance")
  public String getEntrance() {
    return entrance;
  }

  public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

  public OrderDeliveryAddressDTO entryphone(String entryphone) {
    this.entryphone = entryphone;
    return this;
  }

  /**
   * Код домофона.
   * @return entryphone
   */
  
  @Schema(name = "entryphone", description = "Код домофона.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryphone")
  public String getEntryphone() {
    return entryphone;
  }

  public void setEntryphone(String entryphone) {
    this.entryphone = entryphone;
  }

  public OrderDeliveryAddressDTO floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * Этаж.
   * @return floor
   */
  
  @Schema(name = "floor", description = "Этаж.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public OrderDeliveryAddressDTO apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

  /**
   * Квартира или офис.
   * @return apartment
   */
  
  @Schema(name = "apartment", description = "Квартира или офис.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apartment")
  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public OrderDeliveryAddressDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Телефон получателя заказа.  Обязательный параметр. 
   * @return phone
   */
  
  @Schema(name = "phone", description = "Телефон получателя заказа.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderDeliveryAddressDTO recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
   * @return recipient
   */
  
  @Schema(name = "recipient", description = "Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public OrderDeliveryAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Get gps
   * @return gps
   */
  @Valid 
  @Schema(name = "gps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
