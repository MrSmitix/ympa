package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferConditionQualityType;
import org.openapitools.server.model.OfferConditionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Состояние уцененного товара. 
 */
public class OfferConditionDTO   {

    private OfferConditionType type;
    private OfferConditionQualityType quality;
    private String reason;

    /**
     * Default constructor.
     */
    public OfferConditionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferConditionDTO.
     *
     * @param type type
     * @param quality quality
     * @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
     */
    public OfferConditionDTO(
        OfferConditionType type, 
        OfferConditionQualityType quality, 
        String reason
    ) {
        this.type = type;
        this.quality = quality;
        this.reason = reason;
    }



    /**
     * Get type
     * @return type
     */
    public OfferConditionType getType() {
        return type;
    }

    public void setType(OfferConditionType type) {
        this.type = type;
    }

    /**
     * Get quality
     * @return quality
     */
    public OfferConditionQualityType getQuality() {
        return quality;
    }

    public void setQuality(OfferConditionQualityType quality) {
        this.quality = quality;
    }

    /**
     * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferConditionDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

