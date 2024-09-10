package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CampaignSettingsTimePeriodDTO;

/**
 * Расписание работы службы доставки в своем регионе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignSettingsScheduleDTO   {
  
  private Boolean availableOnHolidays;
  private List<String> customHolidays = new ArrayList<>();
  private List<String> customWorkingDays = new ArrayList<>();
  private CampaignSettingsTimePeriodDTO period;
  private List<String> totalHolidays = new ArrayList<>();
  private List<Integer> weeklyHolidays = new ArrayList<>();

  public CampaignSettingsScheduleDTO () {

  }

  public CampaignSettingsScheduleDTO (Boolean availableOnHolidays, List<String> customHolidays, List<String> customWorkingDays, CampaignSettingsTimePeriodDTO period, List<String> totalHolidays, List<Integer> weeklyHolidays) {
    this.availableOnHolidays = availableOnHolidays;
    this.customHolidays = customHolidays;
    this.customWorkingDays = customWorkingDays;
    this.period = period;
    this.totalHolidays = totalHolidays;
    this.weeklyHolidays = weeklyHolidays;
  }

    
  @JsonProperty("availableOnHolidays")
  public Boolean getAvailableOnHolidays() {
    return availableOnHolidays;
  }
  public void setAvailableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
  }

    
  @JsonProperty("customHolidays")
  public List<String> getCustomHolidays() {
    return customHolidays;
  }
  public void setCustomHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
  }

    
  @JsonProperty("customWorkingDays")
  public List<String> getCustomWorkingDays() {
    return customWorkingDays;
  }
  public void setCustomWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
  }

    
  @JsonProperty("period")
  public CampaignSettingsTimePeriodDTO getPeriod() {
    return period;
  }
  public void setPeriod(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
  }

    
  @JsonProperty("totalHolidays")
  public List<String> getTotalHolidays() {
    return totalHolidays;
  }
  public void setTotalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
  }

    
  @JsonProperty("weeklyHolidays")
  public List<Integer> getWeeklyHolidays() {
    return weeklyHolidays;
  }
  public void setWeeklyHolidays(List<Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSettingsScheduleDTO campaignSettingsScheduleDTO = (CampaignSettingsScheduleDTO) o;
    return Objects.equals(availableOnHolidays, campaignSettingsScheduleDTO.availableOnHolidays) &&
        Objects.equals(customHolidays, campaignSettingsScheduleDTO.customHolidays) &&
        Objects.equals(customWorkingDays, campaignSettingsScheduleDTO.customWorkingDays) &&
        Objects.equals(period, campaignSettingsScheduleDTO.period) &&
        Objects.equals(totalHolidays, campaignSettingsScheduleDTO.totalHolidays) &&
        Objects.equals(weeklyHolidays, campaignSettingsScheduleDTO.weeklyHolidays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableOnHolidays, customHolidays, customWorkingDays, period, totalHolidays, weeklyHolidays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSettingsScheduleDTO {\n");
    
    sb.append("    availableOnHolidays: ").append(toIndentedString(availableOnHolidays)).append("\n");
    sb.append("    customHolidays: ").append(toIndentedString(customHolidays)).append("\n");
    sb.append("    customWorkingDays: ").append(toIndentedString(customWorkingDays)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalHolidays: ").append(toIndentedString(totalHolidays)).append("\n");
    sb.append("    weeklyHolidays: ").append(toIndentedString(weeklyHolidays)).append("\n");
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
