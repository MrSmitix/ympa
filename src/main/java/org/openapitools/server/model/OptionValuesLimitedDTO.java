package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */
public class OptionValuesLimitedDTO   {

    private Long limitingOptionValueId;
    private List<Long> optionValueIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OptionValuesLimitedDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OptionValuesLimitedDTO.
     *
     * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
     * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. 
     */
    public OptionValuesLimitedDTO(
        Long limitingOptionValueId, 
        List<Long> optionValueIds
    ) {
        this.limitingOptionValueId = limitingOptionValueId;
        this.optionValueIds = optionValueIds;
    }



    /**
     * Идентификатор значения ограничивающей характеристики.
     * @return limitingOptionValueId
     */
    public Long getLimitingOptionValueId() {
        return limitingOptionValueId;
    }

    public void setLimitingOptionValueId(Long limitingOptionValueId) {
        this.limitingOptionValueId = limitingOptionValueId;
    }

    /**
     * Идентификаторы допустимых значений ограничиваемой характеристики. 
     * @return optionValueIds
     */
    public List<Long> getOptionValueIds() {
        return optionValueIds;
    }

    public void setOptionValueIds(List<Long> optionValueIds) {
        this.optionValueIds = optionValueIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionValuesLimitedDTO {\n");
        
        sb.append("    limitingOptionValueId: ").append(toIndentedString(limitingOptionValueId)).append("\n");
        sb.append("    optionValueIds: ").append(toIndentedString(optionValueIds)).append("\n");
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

