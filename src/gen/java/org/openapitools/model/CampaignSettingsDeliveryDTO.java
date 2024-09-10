package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CampaignSettingsScheduleDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о доставке в своем регионе магазина.
 */
@ApiModel(description="Информация о доставке в своем регионе магазина.")

public class CampaignSettingsDeliveryDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsScheduleDTO schedule;
 /**
  * Get schedule
  * @return schedule
  */
  @JsonProperty("schedule")
  public CampaignSettingsScheduleDTO getSchedule() {
    return schedule;
  }

  /**
   * Sets the <code>schedule</code> property.
   */
 public void setSchedule(CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
  }

  /**
   * Sets the <code>schedule</code> property.
   */
  public CampaignSettingsDeliveryDTO schedule(CampaignSettingsScheduleDTO schedule) {
    this.schedule = schedule;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

