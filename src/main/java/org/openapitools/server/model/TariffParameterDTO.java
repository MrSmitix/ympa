package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Детали расчета конкретной услуги Маркета.
 */
public class TariffParameterDTO   {

    private String name;
    private String value;

    /**
     * Default constructor.
     */
    public TariffParameterDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create TariffParameterDTO.
     *
     * @param name Название параметра.
     * @param value Значение параметра.
     */
    public TariffParameterDTO(
        String name, 
        String value
    ) {
        this.name = name;
        this.value = value;
    }



    /**
     * Название параметра.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Значение параметра.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TariffParameterDTO {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

