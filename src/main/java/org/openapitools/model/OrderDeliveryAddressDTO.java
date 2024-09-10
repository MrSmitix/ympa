/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.model.GpsDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 */
@JsonPropertyOrder({
  OrderDeliveryAddressDTO.JSON_PROPERTY_COUNTRY,
  OrderDeliveryAddressDTO.JSON_PROPERTY_POSTCODE,
  OrderDeliveryAddressDTO.JSON_PROPERTY_CITY,
  OrderDeliveryAddressDTO.JSON_PROPERTY_DISTRICT,
  OrderDeliveryAddressDTO.JSON_PROPERTY_SUBWAY,
  OrderDeliveryAddressDTO.JSON_PROPERTY_STREET,
  OrderDeliveryAddressDTO.JSON_PROPERTY_HOUSE,
  OrderDeliveryAddressDTO.JSON_PROPERTY_BLOCK,
  OrderDeliveryAddressDTO.JSON_PROPERTY_ENTRANCE,
  OrderDeliveryAddressDTO.JSON_PROPERTY_ENTRYPHONE,
  OrderDeliveryAddressDTO.JSON_PROPERTY_FLOOR,
  OrderDeliveryAddressDTO.JSON_PROPERTY_APARTMENT,
  OrderDeliveryAddressDTO.JSON_PROPERTY_PHONE,
  OrderDeliveryAddressDTO.JSON_PROPERTY_RECIPIENT,
  OrderDeliveryAddressDTO.JSON_PROPERTY_GPS
})
@JsonTypeName("OrderDeliveryAddressDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderDeliveryAddressDTO {
    public static final String JSON_PROPERTY_COUNTRY = "country";
    private String country;

    public static final String JSON_PROPERTY_POSTCODE = "postcode";
    private String postcode;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_DISTRICT = "district";
    private String district;

    public static final String JSON_PROPERTY_SUBWAY = "subway";
    private String subway;

    public static final String JSON_PROPERTY_STREET = "street";
    private String street;

    public static final String JSON_PROPERTY_HOUSE = "house";
    private String house;

    public static final String JSON_PROPERTY_BLOCK = "block";
    private String block;

    public static final String JSON_PROPERTY_ENTRANCE = "entrance";
    private String entrance;

    public static final String JSON_PROPERTY_ENTRYPHONE = "entryphone";
    private String entryphone;

    public static final String JSON_PROPERTY_FLOOR = "floor";
    private String floor;

    public static final String JSON_PROPERTY_APARTMENT = "apartment";
    private String apartment;

    public static final String JSON_PROPERTY_PHONE = "phone";
    private String phone;

    public static final String JSON_PROPERTY_RECIPIENT = "recipient";
    private String recipient;

    public static final String JSON_PROPERTY_GPS = "gps";
    private GpsDTO gps;

    public OrderDeliveryAddressDTO() {
    }

    public OrderDeliveryAddressDTO country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Страна.  Обязательный параметр. 
     * @return country
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountry() {
        return country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountry(String country) {
        this.country = country;
    }

    public OrderDeliveryAddressDTO postcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    /**
     * Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
     * @return postcode
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_POSTCODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty(JSON_PROPERTY_POSTCODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCity() {
        return city;
    }

    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISTRICT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDistrict() {
        return district;
    }

    @JsonProperty(JSON_PROPERTY_DISTRICT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUBWAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSubway() {
        return subway;
    }

    @JsonProperty(JSON_PROPERTY_SUBWAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStreet() {
        return street;
    }

    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_HOUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHouse() {
        return house;
    }

    @JsonProperty(JSON_PROPERTY_HOUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_BLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBlock() {
        return block;
    }

    @JsonProperty(JSON_PROPERTY_BLOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_ENTRANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEntrance() {
        return entrance;
    }

    @JsonProperty(JSON_PROPERTY_ENTRANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_ENTRYPHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEntryphone() {
        return entryphone;
    }

    @JsonProperty(JSON_PROPERTY_ENTRYPHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_FLOOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFloor() {
        return floor;
    }

    @JsonProperty(JSON_PROPERTY_FLOOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_APARTMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getApartment() {
        return apartment;
    }

    @JsonProperty(JSON_PROPERTY_APARTMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhone() {
        return phone;
    }

    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_RECIPIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecipient() {
        return recipient;
    }

    @JsonProperty(JSON_PROPERTY_RECIPIENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_GPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GpsDTO getGps() {
        return gps;
    }

    @JsonProperty(JSON_PROPERTY_GPS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

