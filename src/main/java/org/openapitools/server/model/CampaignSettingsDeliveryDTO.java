package org.openapitools.server.model;

import org.openapitools.server.model.CampaignSettingsScheduleDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о доставке в своем регионе магазина.
 */
public class CampaignSettingsDeliveryDTO   {

    private CampaignSettingsScheduleDTO schedule;

    /**
     * Default constructor.
     */
    public CampaignSettingsDeliveryDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignSettingsDeliveryDTO.
     *
     * @param schedule schedule
     */
    public CampaignSettingsDeliveryDTO(
        CampaignSettingsScheduleDTO schedule
    ) {
        this.schedule = schedule;
    }



    /**
     * Get schedule
     * @return schedule
     */
    public CampaignSettingsScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(CampaignSettingsScheduleDTO schedule) {
        this.schedule = schedule;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSettingsDeliveryDTO {\n");
        
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

