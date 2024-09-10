package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferCardRecommendationType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Рекомендация по заполнению карточки товара.
 */
public class OfferCardRecommendationDTO   {

    private OfferCardRecommendationType type;
    private Integer percent;

    /**
     * Default constructor.
     */
    public OfferCardRecommendationDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferCardRecommendationDTO.
     *
     * @param type type
     * @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
     */
    public OfferCardRecommendationDTO(
        OfferCardRecommendationType type, 
        Integer percent
    ) {
        this.type = type;
        this.percent = percent;
    }



    /**
     * Get type
     * @return type
     */
    public OfferCardRecommendationType getType() {
        return type;
    }

    public void setType(OfferCardRecommendationType type) {
        this.type = type;
    }

    /**
     * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
     * minimum: 0
     * maximum: 100
     * @return percent
     */
    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferCardRecommendationDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

