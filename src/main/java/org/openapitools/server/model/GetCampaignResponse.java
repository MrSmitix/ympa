package org.openapitools.server.model;

import org.openapitools.server.model.CampaignDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о магазине к данным идентификатора кампании.
 */
public class GetCampaignResponse   {

    private CampaignDTO campaign;

    /**
     * Default constructor.
     */
    public GetCampaignResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignResponse.
     *
     * @param campaign campaign
     */
    public GetCampaignResponse(
        CampaignDTO campaign
    ) {
        this.campaign = campaign;
    }



    /**
     * Get campaign
     * @return campaign
     */
    public CampaignDTO getCampaign() {
        return campaign;
    }

    public void setCampaign(CampaignDTO campaign) {
        this.campaign = campaign;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignResponse {\n");
        
        sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

