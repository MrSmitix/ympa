package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Расписание работы службы доставки в своем регионе.
 */

@Schema(name = "CampaignSettingsScheduleDTO", description = "Расписание работы службы доставки в своем регионе.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignSettingsScheduleDTO {

  private Boolean availableOnHolidays;

  @Valid
  private List<String> customHolidays = new ArrayList<>();

  @Valid
  private List<String> customWorkingDays = new ArrayList<>();

  private CampaignSettingsTimePeriodDTO period;

  @Valid
  private List<String> totalHolidays = new ArrayList<>();

  @Valid
  private List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();

  public CampaignSettingsScheduleDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignSettingsScheduleDTO(List<String> customHolidays, List<String> customWorkingDays, List<String> totalHolidays, List<@Min(1) @Max(7)Integer> weeklyHolidays) {
    this.customHolidays = customHolidays;
    this.customWorkingDays = customWorkingDays;
    this.totalHolidays = totalHolidays;
    this.weeklyHolidays = weeklyHolidays;
  }

  public CampaignSettingsScheduleDTO availableOnHolidays(Boolean availableOnHolidays) {
    this.availableOnHolidays = availableOnHolidays;
    return this;
  }

  /**
   * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
   * @return availableOnHolidays
   */
  
  @Schema(name = "availableOnHolidays", description = "Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableOnHolidays")
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
   */
  @NotNull 
  @Schema(name = "customHolidays", description = "Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customHolidays")
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
   */
  @NotNull 
  @Schema(name = "customWorkingDays", description = "Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customWorkingDays")
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
   */
  @Valid 
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
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
   */
  @NotNull 
  @Schema(name = "totalHolidays", description = "Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalHolidays")
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
   */
  @NotNull 
  @Schema(name = "weeklyHolidays", description = "Список выходных дней недели и государственных праздников.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weeklyHolidays")
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

