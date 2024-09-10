package org.openapitools.server.model;

import org.openapitools.server.model.GpsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Адрес склада.
 */
public class WarehouseAddressDTO   {

    private String city;
    private String street;
    private String number;
    private String building;
    private String block;
    private GpsDTO gps;

    /**
     * Default constructor.
     */
    public WarehouseAddressDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseAddressDTO.
     *
     * @param city Город.
     * @param street Улица.
     * @param number Номер дома.
     * @param building Номер строения.
     * @param block Номер корпуса.
     * @param gps gps
     */
    public WarehouseAddressDTO(
        String city, 
        String street, 
        String number, 
        String building, 
        String block, 
        GpsDTO gps
    ) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.building = building;
        this.block = block;
        this.gps = gps;
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
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Номер строения.
     * @return building
     */
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * Номер корпуса.
     * @return block
     */
    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
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
        sb.append("class WarehouseAddressDTO {\n");
        
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    building: ").append(toIndentedString(building)).append("\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
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

