package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 */
public class OutletResponseDTO   {

    private Long id;

    /**
     * Default constructor.
     */
    public OutletResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletResponseDTO.
     *
     * @param id Идентификатор точки продаж, присвоенный Маркетом.
     */
    public OutletResponseDTO(
        Long id
    ) {
        this.id = id;
    }



    /**
     * Идентификатор точки продаж, присвоенный Маркетом.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutletResponseDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

