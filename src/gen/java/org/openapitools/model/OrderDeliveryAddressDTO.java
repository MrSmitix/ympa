package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GpsDTO;



/**
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 **/

@ApiModel(description = "Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderDeliveryAddressDTO   {
  @JsonProperty("country")
  private String country;

  @JsonProperty("postcode")
  private String postcode;

  @JsonProperty("city")
  private String city;

  @JsonProperty("district")
  private String district;

  @JsonProperty("subway")
  private String subway;

  @JsonProperty("street")
  private String street;

  @JsonProperty("house")
  private String house;

  @JsonProperty("block")
  private String block;

  @JsonProperty("entrance")
  private String entrance;

  @JsonProperty("entryphone")
  private String entryphone;

  @JsonProperty("floor")
  private String floor;

  @JsonProperty("apartment")
  private String apartment;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("recipient")
  private String recipient;

  @JsonProperty("gps")
  private GpsDTO gps;

  /**
   * Страна.  Обязательный параметр. 
   **/
  public OrderDeliveryAddressDTO country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "Страна.  Обязательный параметр. ")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
   **/
  public OrderDeliveryAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO city(String city) {
    this.city = city;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO district(String district) {
    this.district = district;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO subway(String subway) {
    this.subway = subway;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO street(String street) {
    this.street = street;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO house(String house) {
    this.house = house;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO block(String block) {
    this.block = block;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO entrance(String entrance) {
    this.entrance = entrance;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO entryphone(String entryphone) {
    this.entryphone = entryphone;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO floor(String floor) {
    this.floor = floor;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

  
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
  public OrderDeliveryAddressDTO gps(GpsDTO gps) {
    this.gps = gps;
    return this;
  }

  
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

