package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GpsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 */
@ApiModel(description="Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). ")

public class OrderDeliveryAddressDTO  {
  
 /**
  * Страна.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Страна.  Обязательный параметр. ")
  private String country;

 /**
  * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
  */
  @ApiModelProperty(value = "Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). ")
  private String postcode;

 /**
  * Город или населенный пункт.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Город или населенный пункт.  Обязательный параметр. ")
  private String city;

 /**
  * Район.
  */
  @ApiModelProperty(value = "Район.")
  private String district;

 /**
  * Станция метро.
  */
  @ApiModelProperty(value = "Станция метро.")
  private String subway;

 /**
  * Улица.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Улица.  Обязательный параметр. ")
  private String street;

 /**
  * Дом или владение.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Дом или владение.  Обязательный параметр. ")
  private String house;

 /**
  * Корпус или строение.
  */
  @ApiModelProperty(value = "Корпус или строение.")
  private String block;

 /**
  * Подъезд.
  */
  @ApiModelProperty(value = "Подъезд.")
  private String entrance;

 /**
  * Код домофона.
  */
  @ApiModelProperty(value = "Код домофона.")
  private String entryphone;

 /**
  * Этаж.
  */
  @ApiModelProperty(value = "Этаж.")
  private String floor;

 /**
  * Квартира или офис.
  */
  @ApiModelProperty(value = "Квартира или офис.")
  private String apartment;

 /**
  * Телефон получателя заказа.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Телефон получателя заказа.  Обязательный параметр. ")
  private String phone;

 /**
  * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
  */
  @ApiModelProperty(value = "Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ")
  private String recipient;

  @ApiModelProperty(value = "")
  @Valid
  private GpsDTO gps;
 /**
  * Страна.  Обязательный параметр. 
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
  public OrderDeliveryAddressDTO country(String country) {
    this.country = country;
    return this;
  }

 /**
  * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
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
  public OrderDeliveryAddressDTO postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
  * Город или населенный пункт.  Обязательный параметр. 
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
  public OrderDeliveryAddressDTO city(String city) {
    this.city = city;
    return this;
  }

 /**
  * Район.
  * @return district
  */
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  /**
   * Sets the <code>district</code> property.
   */
 public void setDistrict(String district) {
    this.district = district;
  }

  /**
   * Sets the <code>district</code> property.
   */
  public OrderDeliveryAddressDTO district(String district) {
    this.district = district;
    return this;
  }

 /**
  * Станция метро.
  * @return subway
  */
  @JsonProperty("subway")
  public String getSubway() {
    return subway;
  }

  /**
   * Sets the <code>subway</code> property.
   */
 public void setSubway(String subway) {
    this.subway = subway;
  }

  /**
   * Sets the <code>subway</code> property.
   */
  public OrderDeliveryAddressDTO subway(String subway) {
    this.subway = subway;
    return this;
  }

 /**
  * Улица.  Обязательный параметр. 
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
  public OrderDeliveryAddressDTO street(String street) {
    this.street = street;
    return this;
  }

 /**
  * Дом или владение.  Обязательный параметр. 
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
  public OrderDeliveryAddressDTO house(String house) {
    this.house = house;
    return this;
  }

 /**
  * Корпус или строение.
  * @return block
  */
  @JsonProperty("block")
  public String getBlock() {
    return block;
  }

  /**
   * Sets the <code>block</code> property.
   */
 public void setBlock(String block) {
    this.block = block;
  }

  /**
   * Sets the <code>block</code> property.
   */
  public OrderDeliveryAddressDTO block(String block) {
    this.block = block;
    return this;
  }

 /**
  * Подъезд.
  * @return entrance
  */
  @JsonProperty("entrance")
  public String getEntrance() {
    return entrance;
  }

  /**
   * Sets the <code>entrance</code> property.
   */
 public void setEntrance(String entrance) {
    this.entrance = entrance;
  }

  /**
   * Sets the <code>entrance</code> property.
   */
  public OrderDeliveryAddressDTO entrance(String entrance) {
    this.entrance = entrance;
    return this;
  }

 /**
  * Код домофона.
  * @return entryphone
  */
  @JsonProperty("entryphone")
  public String getEntryphone() {
    return entryphone;
  }

  /**
   * Sets the <code>entryphone</code> property.
   */
 public void setEntryphone(String entryphone) {
    this.entryphone = entryphone;
  }

  /**
   * Sets the <code>entryphone</code> property.
   */
  public OrderDeliveryAddressDTO entryphone(String entryphone) {
    this.entryphone = entryphone;
    return this;
  }

 /**
  * Этаж.
  * @return floor
  */
  @JsonProperty("floor")
  public String getFloor() {
    return floor;
  }

  /**
   * Sets the <code>floor</code> property.
   */
 public void setFloor(String floor) {
    this.floor = floor;
  }

  /**
   * Sets the <code>floor</code> property.
   */
  public OrderDeliveryAddressDTO floor(String floor) {
    this.floor = floor;
    return this;
  }

 /**
  * Квартира или офис.
  * @return apartment
  */
  @JsonProperty("apartment")
  public String getApartment() {
    return apartment;
  }

  /**
   * Sets the <code>apartment</code> property.
   */
 public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  /**
   * Sets the <code>apartment</code> property.
   */
  public OrderDeliveryAddressDTO apartment(String apartment) {
    this.apartment = apartment;
    return this;
  }

 /**
  * Телефон получателя заказа.  Обязательный параметр. 
  * @return phone
  */
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
 public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Sets the <code>phone</code> property.
   */
  public OrderDeliveryAddressDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
  * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
  * @return recipient
  */
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }

  /**
   * Sets the <code>recipient</code> property.
   */
 public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * Sets the <code>recipient</code> property.
   */
  public OrderDeliveryAddressDTO recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

 /**
  * Get gps
  * @return gps
  */
  @JsonProperty("gps")
  public GpsDTO getGps() {
    return gps;
  }

  /**
   * Sets the <code>gps</code> property.
   */
 public void setGps(GpsDTO gps) {
    this.gps = gps;
  }

  /**
   * Sets the <code>gps</code> property.
   */
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

