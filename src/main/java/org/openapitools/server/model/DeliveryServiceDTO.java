package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Служба доставки.
 */
public class DeliveryServiceDTO   {

    private Long id;
    private String name;

    /**
     * Default constructor.
     */
    public DeliveryServiceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DeliveryServiceDTO.
     *
     * @param id Идентификатор службы доставки.
     * @param name Наименование службы доставки.
     */
    public DeliveryServiceDTO(
        Long id, 
        String name
    ) {
        this.id = id;
        this.name = name;
    }



    /**
     * Идентификатор службы доставки.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Наименование службы доставки.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryServiceDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

