package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.PriceQuarantineVerdictParameterDTO;
import org.openapitools.server.model.PriceQuarantineVerdictType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Причина попадания товара в карантин.
 */
public class PriceQuarantineVerdictDTO   {

    private PriceQuarantineVerdictType type;
    private List<@Valid PriceQuarantineVerdictParameterDTO> params = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PriceQuarantineVerdictDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceQuarantineVerdictDTO.
     *
     * @param type type
     * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
     */
    public PriceQuarantineVerdictDTO(
        PriceQuarantineVerdictType type, 
        List<@Valid PriceQuarantineVerdictParameterDTO> params
    ) {
        this.type = type;
        this.params = params;
    }



    /**
     * Get type
     * @return type
     */
    public PriceQuarantineVerdictType getType() {
        return type;
    }

    public void setType(PriceQuarantineVerdictType type) {
        this.type = type;
    }

    /**
     * Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
     * @return params
     */
    public List<@Valid PriceQuarantineVerdictParameterDTO> getParams() {
        return params;
    }

    public void setParams(List<@Valid PriceQuarantineVerdictParameterDTO> params) {
        this.params = params;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceQuarantineVerdictDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

