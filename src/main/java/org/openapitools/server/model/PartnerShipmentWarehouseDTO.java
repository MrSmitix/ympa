package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Данные о складе отправления.
 */
public class PartnerShipmentWarehouseDTO   {

    private Long id;
    private String name;
    private String address;

    /**
     * Default constructor.
     */
    public PartnerShipmentWarehouseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PartnerShipmentWarehouseDTO.
     *
     * @param id Идентификатор склада отправления.
     * @param name Наименование склада отправления.
     * @param address Адрес склада отправления.
     */
    public PartnerShipmentWarehouseDTO(
        Long id, 
        String name, 
        String address
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    /**
     * Идентификатор склада отправления.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Наименование склада отправления.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Адрес склада отправления.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartnerShipmentWarehouseDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

