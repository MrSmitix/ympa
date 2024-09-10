package apimodels;

import apimodels.CampaignSettingsScheduleDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о доставке в своем регионе магазина.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignSettingsDeliveryDTO   {
  @JsonProperty("schedule")
  @Valid

  private CampaignSettingsScheduleDTO schedule;

  public CampaignSettingsDeliveryDTO schedule(CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

