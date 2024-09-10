package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignSettingsTimePeriodDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Расписание работы службы доставки в своем регионе.
 */
public class CampaignSettingsScheduleDTO   {

    private Boolean availableOnHolidays;
    private List<String> customHolidays = new ArrayList<>();
    private List<String> customWorkingDays = new ArrayList<>();
    private CampaignSettingsTimePeriodDTO period;
    private List<String> totalHolidays = new ArrayList<>();
    private List<@Min(1) @Max(7)Integer> weeklyHolidays = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignSettingsScheduleDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignSettingsScheduleDTO.
     *
     * @param availableOnHolidays Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни. 
     * @param customHolidays Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
     * @param customWorkingDays Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
     * @param period period
     * @param totalHolidays Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
     * @param weeklyHolidays Список выходных дней недели и государственных праздников.
     */
    public CampaignSettingsScheduleDTO(
        Boolean availableOnHolidays, 
        List<String> customHolidays, 
        List<String> customWorkingDays, 
        CampaignSettingsTimePeriodDTO period, 
        List<String> totalHolidays, 
        List<@Min(1) @Max(7)Integer> weeklyHolidays
    ) {
        this.availableOnHolidays = availableOnHolidays;
        this.customHolidays = customHolidays;
        this.customWorkingDays = customWorkingDays;
        this.period = period;
        this.totalHolidays = totalHolidays;
        this.weeklyHolidays = weeklyHolidays;
    }



    /**
     * Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
     * @return availableOnHolidays
     */
    public Boolean getAvailableOnHolidays() {
        return availableOnHolidays;
    }

    public void setAvailableOnHolidays(Boolean availableOnHolidays) {
        this.availableOnHolidays = availableOnHolidays;
    }

    /**
     * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
     * @return customHolidays
     */
    public List<String> getCustomHolidays() {
        return customHolidays;
    }

    public void setCustomHolidays(List<String> customHolidays) {
        this.customHolidays = customHolidays;
    }

    /**
     * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
     * @return customWorkingDays
     */
    public List<String> getCustomWorkingDays() {
        return customWorkingDays;
    }

    public void setCustomWorkingDays(List<String> customWorkingDays) {
        this.customWorkingDays = customWorkingDays;
    }

    /**
     * Get period
     * @return period
     */
    public CampaignSettingsTimePeriodDTO getPeriod() {
        return period;
    }

    public void setPeriod(CampaignSettingsTimePeriodDTO period) {
        this.period = period;
    }

    /**
     * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
     * @return totalHolidays
     */
    public List<String> getTotalHolidays() {
        return totalHolidays;
    }

    public void setTotalHolidays(List<String> totalHolidays) {
        this.totalHolidays = totalHolidays;
    }

    /**
     * Список выходных дней недели и государственных праздников.
     * @return weeklyHolidays
     */
    public List<@Min(1) @Max(7)Integer> getWeeklyHolidays() {
        return weeklyHolidays;
    }

    public void setWeeklyHolidays(List<@Min(1) @Max(7)Integer> weeklyHolidays) {
        this.weeklyHolidays = weeklyHolidays;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

