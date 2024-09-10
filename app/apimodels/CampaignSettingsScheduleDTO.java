package apimodels;

import apimodels.CampaignSettingsTimePeriodDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Расписание работы службы доставки в своем регионе.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignSettingsScheduleDTO   {
  @JsonProperty("availableOnHolidays")
  
  private Boolean availableOnHolidays;

  @JsonProperty("customHolidays")
  @NotNull

  private List<String> customHolidays = new ArrayList<>();

  @JsonProperty("customWorkingDays")
  @NotNull

  private List<String> customWorkingDays = new ArrayList<>();

  @JsonProperty("period")
  @Valid

  private CampaignSettingsTimePeriodDTO period;

  @JsonProperty("totalHolidays")
  @NotNull

  private List<String> totalHolidays = new ArrayList<>();

  @JsonProperty("weeklyHolidays")
  @NotNull

  private List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();

  public CampaignSettingsScheduleDTO availableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
    return this;
  }

   /**
   * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
   * @return availableOnHolidays
  **/
  public Boolean getAvailableOnHolidays() {
    return availableOnHolidays;
  }

  public void setAvailableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
  }

  public CampaignSettingsScheduleDTO customHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
    return this;
  }

  public CampaignSettingsScheduleDTO addCustomHolidaysItem(String customHolidaysItem) {
    if (this.customHolidays == null) {
      this.customHolidays = new ArrayList<>();
    }
    this.customHolidays.add(customHolidaysItem);
    return this;
  }

   /**
   * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
   * @return customHolidays
  **/
  public List<String> getCustomHolidays() {
    return customHolidays;
  }

  public void setCustomHolidays(List<String> customHolidays) {
    this.customHolidays = customHolidays;
  }

  public CampaignSettingsScheduleDTO customWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
    return this;
  }

  public CampaignSettingsScheduleDTO addCustomWorkingDaysItem(String customWorkingDaysItem) {
    if (this.customWorkingDays == null) {
      this.customWorkingDays = new ArrayList<>();
    }
    this.customWorkingDays.add(customWorkingDaysItem);
    return this;
  }

   /**
   * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
   * @return customWorkingDays
  **/
  public List<String> getCustomWorkingDays() {
    return customWorkingDays;
  }

  public void setCustomWorkingDays(List<String> customWorkingDays) {
    this.customWorkingDays = customWorkingDays;
  }

  public CampaignSettingsScheduleDTO period(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  public CampaignSettingsTimePeriodDTO getPeriod() {
    return period;
  }

  public void setPeriod(CampaignSettingsTimePeriodDTO period) {
    this.period = period;
  }

  public CampaignSettingsScheduleDTO totalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
    return this;
  }

  public CampaignSettingsScheduleDTO addTotalHolidaysItem(String totalHolidaysItem) {
    if (this.totalHolidays == null) {
      this.totalHolidays = new ArrayList<>();
    }
    this.totalHolidays.add(totalHolidaysItem);
    return this;
  }

   /**
   * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
   * @return totalHolidays
  **/
  public List<String> getTotalHolidays() {
    return totalHolidays;
  }

  public void setTotalHolidays(List<String> totalHolidays) {
    this.totalHolidays = totalHolidays;
  }

  public CampaignSettingsScheduleDTO weeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.weeklyHolidays = weeklyHolidays;
    return this;
  }

  public CampaignSettingsScheduleDTO addWeeklyHolidaysItem(Integer weeklyHolidaysItem) {
    if (this.weeklyHolidays == null) {
      this.weeklyHolidays = new ArrayList<>();
    }
    this.weeklyHolidays.add(weeklyHolidaysItem);
    return this;
  }

   /**
   * Список выходных дней недели и государственных праздников.
   * @return weeklyHolidays
  **/
  public List<@Min(1) @Max(7)Integer> getWeeklyHolidays() {
    return weeklyHolidays;
  }

  public void setWeeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

