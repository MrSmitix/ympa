package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CampaignSettingsScheduleDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о доставке в своем регионе магазина.
 */

@Schema(name = "CampaignSettingsDeliveryDTO", description = "Информация о доставке в своем регионе магазина.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsDeliveryDTO {

  private CampaignSettingsScheduleDTO schedule;

  public CampaignSettingsDeliveryDTO schedule(CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   */
  @Valid 
  @Schema(name = "schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.schedule, campaignSettingsDeliveryDTO.schedule);
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

