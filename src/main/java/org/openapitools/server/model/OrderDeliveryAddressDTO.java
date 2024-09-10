package org.openapitools.server.model;

import org.openapitools.server.model.GpsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 */
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
     * Default constructor.
     */
    public OrderDeliveryAddressDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDeliveryAddressDTO.
     *
     * @param country Страна.  Обязательный параметр. 
     * @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;). 
     * @param city Город или населенный пункт.  Обязательный параметр. 
     * @param district Район.
     * @param subway Станция метро.
     * @param street Улица.  Обязательный параметр. 
     * @param house Дом или владение.  Обязательный параметр. 
     * @param block Корпус или строение.
     * @param entrance Подъезд.
     * @param entryphone Код домофона.
     * @param floor Этаж.
     * @param apartment Квартира или офис.
     * @param phone Телефон получателя заказа.  Обязательный параметр. 
     * @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
     * @param gps gps
     */
    public OrderDeliveryAddressDTO(
        String country, 
        String postcode, 
        String city, 
        String district, 
        String subway, 
        String street, 
        String house, 
        String block, 
        String entrance, 
        String entryphone, 
        String floor, 
        String apartment, 
        String phone, 
        String recipient, 
        GpsDTO gps
    ) {
        this.country = country;
        this.postcode = postcode;
        this.city = city;
        this.district = district;
        this.subway = subway;
        this.street = street;
        this.house = house;
        this.block = block;
        this.entrance = entrance;
        this.entryphone = entryphone;
        this.floor = floor;
        this.apartment = apartment;
        this.phone = phone;
        this.recipient = recipient;
        this.gps = gps;
    }



    /**
     * Страна.  Обязательный параметр. 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Город или населенный пункт.  Обязательный параметр. 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Район.
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Станция метро.
     * @return subway
     */
    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    /**
     * Улица.  Обязательный параметр. 
     * @return street
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Дом или владение.  Обязательный параметр. 
     * @return house
     */
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * Корпус или строение.
     * @return block
     */
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    /**
     * Подъезд.
     * @return entrance
     */
    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    /**
     * Код домофона.
     * @return entryphone
     */
    public String getEntryphone() {
        return entryphone;
    }

    public void setEntryphone(String entryphone) {
        this.entryphone = entryphone;
    }

    /**
     * Этаж.
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * Квартира или офис.
     * @return apartment
     */
    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    /**
     * Телефон получателя заказа.  Обязательный параметр. 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Get gps
     * @return gps
     */
    public GpsDTO getGps() {
        return gps;
    }

    public void setGps(GpsDTO gps) {
        this.gps = gps;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

