package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Расписание работы службы доставки в своем регионе.
 **/
@ApiModel(description = "Расписание работы службы доставки в своем регионе.")
@JsonTypeName("CampaignSettingsScheduleDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsScheduleDTO   {
  private Boolean availableOnHolidays;
  private @Valid List<String> customHolidays = new ArrayList<>();
  private @Valid List<String> customWorkingDays = new ArrayList<>();
  private CampaignSettingsTimePeriodDTO period;
  private @Valid List<String> totalHolidays = new ArrayList<>();
  private @Valid List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();

  /**
   * Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. 
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

  @JsonProperty("availableOnHolidays")
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
  @NotNull public List<String> getCustomHolidays() {
    return customHolidays;
  }

  @JsonProperty("customHolidays")
  public void setCustomHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
  }

  public CampaignSettingsScheduleDTO addCustomHolidaysItem(String customHolidaysItem) {
    if (this.customHolidays == null) {
      this.customHolidays = new ArrayList<>();
    }

    this.customHolidays.add(customHolidaysItem);
    return this;
  }

  public CampaignSettingsScheduleDTO removeCustomHolidaysItem(String customHolidaysItem) {
    if (customHolidaysItem != null && this.customHolidays != null) {
      this.customHolidays.remove(customHolidaysItem);
    }

    return this;
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
  @NotNull public List<String> getCustomWorkingDays() {
    return customWorkingDays;
  }

  @JsonProperty("customWorkingDays")
  public void setCustomWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
  }

  public CampaignSettingsScheduleDTO addCustomWorkingDaysItem(String customWorkingDaysItem) {
    if (this.customWorkingDays == null) {
      this.customWorkingDays = new ArrayList<>();
    }

    this.customWorkingDays.add(customWorkingDaysItem);
    return this;
  }

  public CampaignSettingsScheduleDTO removeCustomWorkingDaysItem(String customWorkingDaysItem) {
    if (customWorkingDaysItem != null && this.customWorkingDays != null) {
      this.customWorkingDays.remove(customWorkingDaysItem);
    }

    return this;
  }
  /**
   **/
  public CampaignSettingsScheduleDTO period(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("period")
  @Valid public CampaignSettingsTimePeriodDTO getPeriod() {
    return period;
  }

  @JsonProperty("period")
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
  @NotNull public List<String> getTotalHolidays() {
    return totalHolidays;
  }

  @JsonProperty("totalHolidays")
  public void setTotalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
  }

  public CampaignSettingsScheduleDTO addTotalHolidaysItem(String totalHolidaysItem) {
    if (this.totalHolidays == null) {
      this.totalHolidays = new ArrayList<>();
    }

    this.totalHolidays.add(totalHolidaysItem);
    return this;
  }

  public CampaignSettingsScheduleDTO removeTotalHolidaysItem(String totalHolidaysItem) {
    if (totalHolidaysItem != null && this.totalHolidays != null) {
      this.totalHolidays.remove(totalHolidaysItem);
    }

    return this;
  }
  /**
   * Список выходных дней недели и государственных праздников.
   **/
  public CampaignSettingsScheduleDTO weeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список выходных дней недели и государственных праздников.")
  @JsonProperty("weeklyHolidays")
  @NotNull public List< @Min(1) @Max(7)Integer> getWeeklyHolidays() {
    return weeklyHolidays;
  }

  @JsonProperty("weeklyHolidays")
  public void setWeeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
  }

  public CampaignSettingsScheduleDTO addWeeklyHolidaysItem(Integer weeklyHolidaysItem) {
    if (this.weeklyHolidays == null) {
      this.weeklyHolidays = new ArrayList<>();
    }

    this.weeklyHolidays.add(weeklyHolidaysItem);
    return this;
  }

  public CampaignSettingsScheduleDTO removeWeeklyHolidaysItem(Integer weeklyHolidaysItem) {
    if (weeklyHolidaysItem != null && this.weeklyHolidays != null) {
      this.weeklyHolidays.remove(weeklyHolidaysItem);
    }

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
    CampaignSettingsScheduleDTO campaignSettingsScheduleDTO = (CampaignSettingsScheduleDTO) o;
    return Objects.equals(this.availableOnHolidays, campaignSettingsScheduleDTO.availableOnHolidays) &&
        Objects.equals(this.customHolidays, campaignSettingsScheduleDTO.customHolidays) &&
        Objects.equals(this.customWorkingDays, campaignSettingsScheduleDTO.customWorkingDays) &&
        Objects.equals(this.period, campaignSettingsScheduleDTO.period) &&
        Objects.equals(this.totalHolidays, campaignSettingsScheduleDTO.totalHolidays) &&
        Objects.equals(this.weeklyHolidays, campaignSettingsScheduleDTO.weeklyHolidays);
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

