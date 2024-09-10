package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о грузоместе.
 */
public class OrderParcelBoxDTO   {

    private Long id;
    private String fulfilmentId;

    /**
     * Default constructor.
     */
    public OrderParcelBoxDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderParcelBoxDTO.
     *
     * @param id Идентификатор грузоместа.
     * @param fulfilmentId Идентификатор грузового места в информационной системе магазина.
     */
    public OrderParcelBoxDTO(
        Long id, 
        String fulfilmentId
    ) {
        this.id = id;
        this.fulfilmentId = fulfilmentId;
    }



    /**
     * Идентификатор грузоместа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Идентификатор грузового места в информационной системе магазина.
     * @return fulfilmentId
     */
    public String getFulfilmentId() {
        return fulfilmentId;
    }

    public void setFulfilmentId(String fulfilmentId) {
        this.fulfilmentId = fulfilmentId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderParcelBoxDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
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

