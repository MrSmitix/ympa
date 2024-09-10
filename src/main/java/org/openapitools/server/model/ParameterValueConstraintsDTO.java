package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ограничения на значения характеристик.
 */
public class ParameterValueConstraintsDTO   {

    private Double minValue;
    private Double maxValue;
    private Integer maxLength;

    /**
     * Default constructor.
     */
    public ParameterValueConstraintsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ParameterValueConstraintsDTO.
     *
     * @param minValue Минимальное число.
     * @param maxValue Максимальное число.
     * @param maxLength Максимальная длина текста.
     */
    public ParameterValueConstraintsDTO(
        Double minValue, 
        Double maxValue, 
        Integer maxLength
    ) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.maxLength = maxLength;
    }



    /**
     * Минимальное число.
     * @return minValue
     */
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    /**
     * Максимальное число.
     * @return maxValue
     */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Максимальная длина текста.
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterValueConstraintsDTO {\n");
        
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

