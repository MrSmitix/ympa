package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.TimeUnitType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 **/
@ApiModel(description="Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.")

public class TimePeriodDTO  {
  
  @ApiModelProperty(required = true, value = "Продолжительность в указанных единицах.")
 /**
   * Продолжительность в указанных единицах.
  **/
  private Integer timePeriod;

  @ApiModelProperty(required = true, value = "")
  private TimeUnitType timeUnit;

  @ApiModelProperty(value = "Комментарий.")
 /**
   * Комментарий.
  **/
  private String comment;
 /**
   * Продолжительность в указанных единицах.
   * @return timePeriod
  **/
  @JsonProperty("timePeriod")
  public Integer getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }

  public TimePeriodDTO timePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

 /**
   * Get timeUnit
   * @return timeUnit
  **/
  @JsonProperty("timeUnit")
  public TimeUnitType getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
  }

  public TimePeriodDTO timeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

 /**
   * Комментарий.
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public TimePeriodDTO comment(String comment) {
    this.comment = comment;
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
    TimePeriodDTO timePeriodDTO = (TimePeriodDTO) o;
    return Objects.equals(this.timePeriod, timePeriodDTO.timePeriod) &&
        Objects.equals(this.timeUnit, timePeriodDTO.timeUnit) &&
        Objects.equals(this.comment, timePeriodDTO.comment);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

