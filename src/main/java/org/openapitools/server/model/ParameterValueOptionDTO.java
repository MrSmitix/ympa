package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Значение характеристики.
 */
public class ParameterValueOptionDTO   {

    private Long id;
    private String value;
    private String description;

    /**
     * Default constructor.
     */
    public ParameterValueOptionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ParameterValueOptionDTO.
     *
     * @param id Идентификатор значения.
     * @param value Значение.
     * @param description Описание значения.
     */
    public ParameterValueOptionDTO(
        Long id, 
        String value, 
        String description
    ) {
        this.id = id;
        this.value = value;
        this.description = description;
    }



    /**
     * Идентификатор значения.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Значение.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Описание значения.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterValueOptionDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

