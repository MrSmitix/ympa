package org.openapitools.server.model;

import org.openapitools.server.model.CampaignSettingsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос настроек магазина.
 */
public class GetCampaignSettingsResponse   {

    private CampaignSettingsDTO settings;

    /**
     * Default constructor.
     */
    public GetCampaignSettingsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignSettingsResponse.
     *
     * @param settings settings
     */
    public GetCampaignSettingsResponse(
        CampaignSettingsDTO settings
    ) {
        this.settings = settings;
    }



    /**
     * Get settings
     * @return settings
     */
    public CampaignSettingsDTO getSettings() {
        return settings;
    }

    public void setSettings(CampaignSettingsDTO settings) {
        this.settings = settings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignSettingsResponse {\n");
        
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

