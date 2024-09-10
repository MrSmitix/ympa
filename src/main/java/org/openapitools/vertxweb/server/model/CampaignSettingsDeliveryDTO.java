package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignSettingsScheduleDTO;

/**
 * Информация о доставке в своем регионе магазина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignSettingsDeliveryDTO   {
  
  private CampaignSettingsScheduleDTO schedule;

  public CampaignSettingsDeliveryDTO () {

  }

  public CampaignSettingsDeliveryDTO (CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
  }

    
  @JsonProperty("schedule")
  public CampaignSettingsScheduleDTO getSchedule() {
    return schedule;
  }
  public void setSchedule(CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettingsDeliveryDTO campaignSettingsDeliveryDTO = (CampaignSettingsDeliveryDTO) o;
    return Objects.equals(schedule, campaignSettingsDeliveryDTO.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
