package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.AgeUnitType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Возраст в заданных единицах измерения.
 */
public class AgeDTO   {

    private BigDecimal value;
    private AgeUnitType ageUnit;

    /**
     * Default constructor.
     */
    public AgeDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create AgeDTO.
     *
     * @param value Значение. 
     * @param ageUnit ageUnit
     */
    public AgeDTO(
        BigDecimal value, 
        AgeUnitType ageUnit
    ) {
        this.value = value;
        this.ageUnit = ageUnit;
    }



    /**
     * Значение. 
     * minimum: 0
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Get ageUnit
     * @return ageUnit
     */
    public AgeUnitType getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(AgeUnitType ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgeDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    ageUnit: ").append(toIndentedString(ageUnit)).append("\n");
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

