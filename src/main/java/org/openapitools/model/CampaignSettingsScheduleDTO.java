/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSettingsTimePeriodDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Расписание работы службы доставки в своем регионе.
 */
@JsonPropertyOrder({
  CampaignSettingsScheduleDTO.JSON_PROPERTY_AVAILABLE_ON_HOLIDAYS,
  CampaignSettingsScheduleDTO.JSON_PROPERTY_CUSTOM_HOLIDAYS,
  CampaignSettingsScheduleDTO.JSON_PROPERTY_CUSTOM_WORKING_DAYS,
  CampaignSettingsScheduleDTO.JSON_PROPERTY_PERIOD,
  CampaignSettingsScheduleDTO.JSON_PROPERTY_TOTAL_HOLIDAYS,
  CampaignSettingsScheduleDTO.JSON_PROPERTY_WEEKLY_HOLIDAYS
})
@JsonTypeName("CampaignSettingsScheduleDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class CampaignSettingsScheduleDTO {
    public static final String JSON_PROPERTY_AVAILABLE_ON_HOLIDAYS = "availableOnHolidays";
    private Boolean availableOnHolidays;

    public static final String JSON_PROPERTY_CUSTOM_HOLIDAYS = "customHolidays";
    private List<String> customHolidays = new ArrayList<>();

    public static final String JSON_PROPERTY_CUSTOM_WORKING_DAYS = "customWorkingDays";
    private List<String> customWorkingDays = new ArrayList<>();

    public static final String JSON_PROPERTY_PERIOD = "period";
    private CampaignSettingsTimePeriodDTO period;

    public static final String JSON_PROPERTY_TOTAL_HOLIDAYS = "totalHolidays";
    private List<String> totalHolidays = new ArrayList<>();

    public static final String JSON_PROPERTY_WEEKLY_HOLIDAYS = "weeklyHolidays";
    private List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();

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
     * Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. 
     * @return availableOnHolidays
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_AVAILABLE_ON_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAvailableOnHolidays() {
        return availableOnHolidays;
    }

    @JsonProperty(JSON_PROPERTY_AVAILABLE_ON_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAvailableOnHolidays(Boolean availableOnHolidays) {
        this.availableOnHolidays = availableOnHolidays;
    }

    public CampaignSettingsScheduleDTO customHolidays(List<String> customHolidays) {
        this.customHolidays = customHolidays;
        return this;
    }

    public CampaignSettingsScheduleDTO addCustomHolidaysItem(String customHolidaysItem) {
        this.customHolidays.add(customHolidaysItem);
        return this;
    }

    /**
     * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
     * @return customHolidays
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CUSTOM_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getCustomHolidays() {
        return customHolidays;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCustomHolidays(List<String> customHolidays) {
        this.customHolidays = customHolidays;
    }

    public CampaignSettingsScheduleDTO customWorkingDays(List<String> customWorkingDays) {
        this.customWorkingDays = customWorkingDays;
        return this;
    }

    public CampaignSettingsScheduleDTO addCustomWorkingDaysItem(String customWorkingDaysItem) {
        this.customWorkingDays.add(customWorkingDaysItem);
        return this;
    }

    /**
     * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
     * @return customWorkingDays
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CUSTOM_WORKING_DAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getCustomWorkingDays() {
        return customWorkingDays;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_WORKING_DAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CampaignSettingsTimePeriodDTO getPeriod() {
        return period;
    }

    @JsonProperty(JSON_PROPERTY_PERIOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPeriod(CampaignSettingsTimePeriodDTO period) {
        this.period = period;
    }

    public CampaignSettingsScheduleDTO totalHolidays(List<String> totalHolidays) {
        this.totalHolidays = totalHolidays;
        return this;
    }

    public CampaignSettingsScheduleDTO addTotalHolidaysItem(String totalHolidaysItem) {
        this.totalHolidays.add(totalHolidaysItem);
        return this;
    }

    /**
     * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
     * @return totalHolidays
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOTAL_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getTotalHolidays() {
        return totalHolidays;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTotalHolidays(List<String> totalHolidays) {
        this.totalHolidays = totalHolidays;
    }

    public CampaignSettingsScheduleDTO weeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
        this.weeklyHolidays = weeklyHolidays;
        return this;
    }

    public CampaignSettingsScheduleDTO addWeeklyHolidaysItem(Integer weeklyHolidaysItem) {
        this.weeklyHolidays.add(weeklyHolidaysItem);
        return this;
    }

    /**
     * Список выходных дней недели и государственных праздников.
     * @return weeklyHolidays
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_WEEKLY_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Min(1) @Max(7)Integer> getWeeklyHolidays() {
        return weeklyHolidays;
    }

    @JsonProperty(JSON_PROPERTY_WEEKLY_HOLIDAYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

