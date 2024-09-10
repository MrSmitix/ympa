package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Расписание работы службы доставки в своем регионе.
 */
@ApiModel(description="Расписание работы службы доставки в своем регионе.")

public class CampaignSettingsScheduleDTO  {
  
 /**
  * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
  */
  @ApiModelProperty(value = "Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. ")
  private Boolean availableOnHolidays;

 /**
  * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  */
  @ApiModelProperty(required = true, value = "Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.")
  private List<String> customHolidays = new ArrayList<>();

 /**
  * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  */
  @ApiModelProperty(required = true, value = "Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.")
  private List<String> customWorkingDays = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private CampaignSettingsTimePeriodDTO period;

 /**
  * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  */
  @ApiModelProperty(required = true, value = "Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.")
  private List<String> totalHolidays = new ArrayList<>();

 /**
  * Список выходных дней недели и государственных праздников.
  */
  @ApiModelProperty(required = true, value = "Список выходных дней недели и государственных праздников.")
  private List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();
 /**
  * Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. 
  * @return availableOnHolidays
  */
  @JsonProperty("availableOnHolidays")
  public Boolean getAvailableOnHolidays() {
    return availableOnHolidays;
  }

  /**
   * Sets the <code>availableOnHolidays</code> property.
   */
 public void setAvailableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
  }

  /**
   * Sets the <code>availableOnHolidays</code> property.
   */
  public CampaignSettingsScheduleDTO availableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
    return this;
  }

 /**
  * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  * @return customHolidays
  */
  @JsonProperty("customHolidays")
  @NotNull
  public List<String> getCustomHolidays() {
    return customHolidays;
  }

  /**
   * Sets the <code>customHolidays</code> property.
   */
 public void setCustomHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
  }

  /**
   * Sets the <code>customHolidays</code> property.
   */
  public CampaignSettingsScheduleDTO customHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
    return this;
  }

  /**
   * Adds a new item to the <code>customHolidays</code> list.
   */
  public CampaignSettingsScheduleDTO addCustomHolidaysItem(String customHolidaysItem) {
    this.customHolidays.add(customHolidaysItem);
    return this;
  }

 /**
  * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  * @return customWorkingDays
  */
  @JsonProperty("customWorkingDays")
  @NotNull
  public List<String> getCustomWorkingDays() {
    return customWorkingDays;
  }

  /**
   * Sets the <code>customWorkingDays</code> property.
   */
 public void setCustomWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
  }

  /**
   * Sets the <code>customWorkingDays</code> property.
   */
  public CampaignSettingsScheduleDTO customWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
    return this;
  }

  /**
   * Adds a new item to the <code>customWorkingDays</code> list.
   */
  public CampaignSettingsScheduleDTO addCustomWorkingDaysItem(String customWorkingDaysItem) {
    this.customWorkingDays.add(customWorkingDaysItem);
    return this;
  }

 /**
  * Get period
  * @return period
  */
  @JsonProperty("period")
  public CampaignSettingsTimePeriodDTO getPeriod() {
    return period;
  }

  /**
   * Sets the <code>period</code> property.
   */
 public void setPeriod(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
  }

  /**
   * Sets the <code>period</code> property.
   */
  public CampaignSettingsScheduleDTO period(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
    return this;
  }

 /**
  * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  * @return totalHolidays
  */
  @JsonProperty("totalHolidays")
  @NotNull
  public List<String> getTotalHolidays() {
    return totalHolidays;
  }

  /**
   * Sets the <code>totalHolidays</code> property.
   */
 public void setTotalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
  }

  /**
   * Sets the <code>totalHolidays</code> property.
   */
  public CampaignSettingsScheduleDTO totalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
    return this;
  }

  /**
   * Adds a new item to the <code>totalHolidays</code> list.
   */
  public CampaignSettingsScheduleDTO addTotalHolidaysItem(String totalHolidaysItem) {
    this.totalHolidays.add(totalHolidaysItem);
    return this;
  }

 /**
  * Список выходных дней недели и государственных праздников.
  * @return weeklyHolidays
  */
  @JsonProperty("weeklyHolidays")
  @NotNull
  public List<@Min(1) @Max(7)Integer> getWeeklyHolidays() {
    return weeklyHolidays;
  }

  /**
   * Sets the <code>weeklyHolidays</code> property.
   */
 public void setWeeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
  }

  /**
   * Sets the <code>weeklyHolidays</code> property.
   */
  public CampaignSettingsScheduleDTO weeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
    return this;
  }

  /**
   * Adds a new item to the <code>weeklyHolidays</code> list.
   */
  public CampaignSettingsScheduleDTO addWeeklyHolidaysItem(Integer weeklyHolidaysItem) {
    this.weeklyHolidays.add(weeklyHolidaysItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

