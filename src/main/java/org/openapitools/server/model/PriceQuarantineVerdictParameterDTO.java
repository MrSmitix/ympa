package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.PriceQuarantineVerdictParamNameType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметр карантина.
 */
public class PriceQuarantineVerdictParameterDTO   {

    private PriceQuarantineVerdictParamNameType name;
    private String value;

    /**
     * Default constructor.
     */
    public PriceQuarantineVerdictParameterDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceQuarantineVerdictParameterDTO.
     *
     * @param name name
     * @param value Значение параметра.
     */
    public PriceQuarantineVerdictParameterDTO(
        PriceQuarantineVerdictParamNameType name, 
        String value
    ) {
        this.name = name;
        this.value = value;
    }



    /**
     * Get name
     * @return name
     */
    public PriceQuarantineVerdictParamNameType getName() {
        return name;
    }

    public void setName(PriceQuarantineVerdictParamNameType name) {
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
        sb.append("class PriceQuarantineVerdictParameterDTO {\n");
        
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

