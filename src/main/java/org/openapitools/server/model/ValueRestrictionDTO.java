package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OptionValuesLimitedDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
 */
public class ValueRestrictionDTO   {

    private Long limitingParameterId;
    private List<@Valid OptionValuesLimitedDTO> limitedValues = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ValueRestrictionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ValueRestrictionDTO.
     *
     * @param limitingParameterId Идентификатор ограничивающей характеристики.
     * @param limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
     */
    public ValueRestrictionDTO(
        Long limitingParameterId, 
        List<@Valid OptionValuesLimitedDTO> limitedValues
    ) {
        this.limitingParameterId = limitingParameterId;
        this.limitedValues = limitedValues;
    }



    /**
     * Идентификатор ограничивающей характеристики.
     * @return limitingParameterId
     */
    public Long getLimitingParameterId() {
        return limitingParameterId;
    }

    public void setLimitingParameterId(Long limitingParameterId) {
        this.limitingParameterId = limitingParameterId;
    }

    /**
     * Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
     * @return limitedValues
     */
    public List<@Valid OptionValuesLimitedDTO> getLimitedValues() {
        return limitedValues;
    }

    public void setLimitedValues(List<@Valid OptionValuesLimitedDTO> limitedValues) {
        this.limitedValues = limitedValues;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueRestrictionDTO {\n");
        
        sb.append("    limitingParameterId: ").append(toIndentedString(limitingParameterId)).append("\n");
        sb.append("    limitedValues: ").append(toIndentedString(limitedValues)).append("\n");
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

