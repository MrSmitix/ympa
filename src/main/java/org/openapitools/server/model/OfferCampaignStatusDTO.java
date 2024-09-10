package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferCampaignStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Статус товара в магазине.
 */
public class OfferCampaignStatusDTO   {

    private Long campaignId;
    private OfferCampaignStatusType status;

    /**
     * Default constructor.
     */
    public OfferCampaignStatusDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferCampaignStatusDTO.
     *
     * @param campaignId Идентификатор кампании. 
     * @param status status
     */
    public OfferCampaignStatusDTO(
        Long campaignId, 
        OfferCampaignStatusType status
    ) {
        this.campaignId = campaignId;
        this.status = status;
    }



    /**
     * Идентификатор кампании. 
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Get status
     * @return status
     */
    public OfferCampaignStatusType getStatus() {
        return status;
    }

    public void setStatus(OfferCampaignStatusType status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferCampaignStatusDTO {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

