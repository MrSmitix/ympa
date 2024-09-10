package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;



/**
 * Расписание работы службы доставки в своем регионе.
 **/

@ApiModel(description = "Расписание работы службы доставки в своем регионе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsScheduleDTO   {
  @JsonProperty("availableOnHolidays")
  private Boolean availableOnHolidays;

  @JsonProperty("customHolidays")
  private List<String> customHolidays = new ArrayList<>();

  @JsonProperty("customWorkingDays")
  private List<String> customWorkingDays = new ArrayList<>();

  @JsonProperty("period")
  private CampaignSettingsTimePeriodDTO period;

  @JsonProperty("totalHolidays")
  private List<String> totalHolidays = new ArrayList<>();

  @JsonProperty("weeklyHolidays")
  private List<Integer> weeklyHolidays = new ArrayList<>();

  /**
   * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
   **/
  public CampaignSettingsScheduleDTO availableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
    return this;
  }

  
  @ApiModelProperty(value = "Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. ")
  @JsonProperty("availableOnHolidays")
  public Boolean getAvailableOnHolidays() {
    return availableOnHolidays;
  }
  public void setAvailableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
  }

  /**
   * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
   **/
  public CampaignSettingsScheduleDTO customHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.")
  @JsonProperty("customHolidays")
  public List<String> getCustomHolidays() {
    return customHolidays;
  }
  public void setCustomHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
  }

  /**
   * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
   **/
  public CampaignSettingsScheduleDTO customWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.")
  @JsonProperty("customWorkingDays")
  public List<String> getCustomWorkingDays() {
    return customWorkingDays;
  }
  public void setCustomWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
  }

  /**
   **/
  public CampaignSettingsScheduleDTO period(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("period")
  public CampaignSettingsTimePeriodDTO getPeriod() {
    return period;
  }
  public void setPeriod(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
  }

  /**
   * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
   **/
  public CampaignSettingsScheduleDTO totalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.")
  @JsonProperty("totalHolidays")
  public List<String> getTotalHolidays() {
    return totalHolidays;
  }
  public void setTotalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
  }

  /**
   * Список выходных дней недели и государственных праздников.
   **/
  public CampaignSettingsScheduleDTO weeklyHolidays(List<Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список выходных дней недели и государственных праздников.")
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

