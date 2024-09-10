package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.DayOfWeekType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Расписание работы точки продаж.
 */
public class OutletWorkingScheduleItemDTO   {

    private DayOfWeekType startDay;
    private DayOfWeekType endDay;
    private String startTime;
    private String endTime;

    /**
     * Default constructor.
     */
    public OutletWorkingScheduleItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OutletWorkingScheduleItemDTO.
     *
     * @param startDay startDay
     * @param endDay endDay
     * @param startTime Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
     * @param endTime Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;. 
     */
    public OutletWorkingScheduleItemDTO(
        DayOfWeekType startDay, 
        DayOfWeekType endDay, 
        String startTime, 
        String endTime
    ) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }



    /**
     * Get startDay
     * @return startDay
     */
    public DayOfWeekType getStartDay() {
        return startDay;
    }

    public void setStartDay(DayOfWeekType startDay) {
        this.startDay = startDay;
    }

    /**
     * Get endDay
     * @return endDay
     */
    public DayOfWeekType getEndDay() {
        return endDay;
    }

    public void setEndDay(DayOfWeekType endDay) {
        this.endDay = endDay;
    }

    /**
     * Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutletWorkingScheduleItemDTO {\n");
        
        sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
        sb.append("    endDay: ").append(toIndentedString(endDay)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

