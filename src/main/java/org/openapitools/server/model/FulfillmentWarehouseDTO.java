package org.openapitools.server.model;

import org.openapitools.server.model.WarehouseAddressDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Склад Маркета (FBY).
 */
public class FulfillmentWarehouseDTO   {

    private Long id;
    private String name;
    private WarehouseAddressDTO address;

    /**
     * Default constructor.
     */
    public FulfillmentWarehouseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FulfillmentWarehouseDTO.
     *
     * @param id Идентификатор склада.
     * @param name Название склада.
     * @param address address
     */
    public FulfillmentWarehouseDTO(
        Long id, 
        String name, 
        WarehouseAddressDTO address
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    /**
     * Идентификатор склада.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название склада.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address
     * @return address
     */
    public WarehouseAddressDTO getAddress() {
        return address;
    }

    public void setAddress(WarehouseAddressDTO address) {
        this.address = address;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentWarehouseDTO {\n");
        
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

