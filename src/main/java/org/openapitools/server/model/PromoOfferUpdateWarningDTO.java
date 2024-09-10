package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PromoOfferUpdateWarningCodeType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */
public class PromoOfferUpdateWarningDTO   {

    private PromoOfferUpdateWarningCodeType code;
    private List<Long> campaignIds;

    /**
     * Default constructor.
     */
    public PromoOfferUpdateWarningDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoOfferUpdateWarningDTO.
     *
     * @param code code
     * @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
     */
    public PromoOfferUpdateWarningDTO(
        PromoOfferUpdateWarningCodeType code, 
        List<Long> campaignIds
    ) {
        this.code = code;
        this.campaignIds = campaignIds;
    }



    /**
     * Get code
     * @return code
     */
    public PromoOfferUpdateWarningCodeType getCode() {
        return code;
    }

    public void setCode(PromoOfferUpdateWarningCodeType code) {
        this.code = code;
    }

    /**
     * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
     * @return campaignIds
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferUpdateWarningDTO {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

