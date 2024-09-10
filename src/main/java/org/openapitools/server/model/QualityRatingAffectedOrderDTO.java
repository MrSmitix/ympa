package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AffectedOrderQualityRatingComponentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о заказе, который повлиял на индекс качества.
 */
public class QualityRatingAffectedOrderDTO   {

    private Long orderId;
    private String description;
    private AffectedOrderQualityRatingComponentType componentType;

    /**
     * Default constructor.
     */
    public QualityRatingAffectedOrderDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityRatingAffectedOrderDTO.
     *
     * @param orderId Идентификатор заказа.
     * @param description Описание проблемы.
     * @param componentType componentType
     */
    public QualityRatingAffectedOrderDTO(
        Long orderId, 
        String description, 
        AffectedOrderQualityRatingComponentType componentType
    ) {
        this.orderId = orderId;
        this.description = description;
        this.componentType = componentType;
    }



    /**
     * Идентификатор заказа.
     * minimum: 0
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Описание проблемы.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get componentType
     * @return componentType
     */
    public AffectedOrderQualityRatingComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(AffectedOrderQualityRatingComponentType componentType) {
        this.componentType = componentType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingAffectedOrderDTO {\n");
        
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

