package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Адрес доставки.
 */
public class PickupAddressDTO   {

    private String country;
    private String city;
    private String street;
    private String house;
    private String postcode;

    /**
     * Default constructor.
     */
    public PickupAddressDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PickupAddressDTO.
     *
     * @param country Страна.
     * @param city Город.
     * @param street Улица.
     * @param house Номер дома.
     * @param postcode Почтовый индекс.
     */
    public PickupAddressDTO(
        String country, 
        String city, 
        String street, 
        String house, 
        String postcode
    ) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.postcode = postcode;
    }



    /**
     * Страна.
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Город.
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Улица.
     * @return street
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Номер дома.
     * @return house
     */
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * Почтовый индекс.
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

