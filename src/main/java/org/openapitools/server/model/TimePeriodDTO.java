package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.TimeUnitType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
public class TimePeriodDTO   {

    private Integer timePeriod;
    private TimeUnitType timeUnit;
    private String comment;

    /**
     * Default constructor.
     */
    public TimePeriodDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create TimePeriodDTO.
     *
     * @param timePeriod Продолжительность в указанных единицах.
     * @param timeUnit timeUnit
     * @param comment Комментарий.
     */
    public TimePeriodDTO(
        Integer timePeriod, 
        TimeUnitType timeUnit, 
        String comment
    ) {
        this.timePeriod = timePeriod;
        this.timeUnit = timeUnit;
        this.comment = comment;
    }



    /**
     * Продолжительность в указанных единицах.
     * @return timePeriod
     */
    public Integer getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * Get timeUnit
     * @return timeUnit
     */
    public TimeUnitType getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitType timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * Комментарий.
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimePeriodDTO {\n");
        
        sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

