package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.QualityRatingComponentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Составляющая индекса качества.
 */
public class QualityRatingComponentDTO   {

    private Double value;
    private QualityRatingComponentType componentType;

    /**
     * Default constructor.
     */
    public QualityRatingComponentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityRatingComponentDTO.
     *
     * @param value Значение составляющей в процентах.
     * @param componentType componentType
     */
    public QualityRatingComponentDTO(
        Double value, 
        QualityRatingComponentType componentType
    ) {
        this.value = value;
        this.componentType = componentType;
    }



    /**
     * Значение составляющей в процентах.
     * minimum: 0
     * maximum: 100
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Get componentType
     * @return componentType
     */
    public QualityRatingComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(QualityRatingComponentType componentType) {
        this.componentType = componentType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingComponentDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

