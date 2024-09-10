package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.TimeUnitType;

/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimePeriodDTO   {
  
  private Integer timePeriod;
  private TimeUnitType timeUnit;
  private String comment;

  public TimePeriodDTO () {

  }

  public TimePeriodDTO (Integer timePeriod, TimeUnitType timeUnit, String comment) {
    this.timePeriod = timePeriod;
    this.timeUnit = timeUnit;
    this.comment = comment;
  }

    
  @JsonProperty("timePeriod")
  public Integer getTimePeriod() {
    return timePeriod;
  }
  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }

    
  @JsonProperty("timeUnit")
  public TimeUnitType getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
  }

    
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriodDTO timePeriodDTO = (TimePeriodDTO) o;
    return Objects.equals(timePeriod, timePeriodDTO.timePeriod) &&
        Objects.equals(timeUnit, timePeriodDTO.timeUnit) &&
        Objects.equals(comment, timePeriodDTO.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timePeriod, timeUnit, comment);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
