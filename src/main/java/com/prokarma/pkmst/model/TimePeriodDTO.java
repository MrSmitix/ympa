package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.TimeUnitType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
@ApiModel(description = "Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TimePeriodDTO   {
  @JsonProperty("timePeriod")
  private Integer timePeriod;

  @JsonProperty("timeUnit")
  private TimeUnitType timeUnit;

  @JsonProperty("comment")
  private String comment;

  public TimePeriodDTO timePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Продолжительность в указанных единицах.
   * @return timePeriod
   */
  @ApiModelProperty(required = true, value = "Продолжительность в указанных единицах.")
  public Integer getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }

  public TimePeriodDTO timeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  /**
   * Get timeUnit
   * @return timeUnit
   */
  @ApiModelProperty(required = true, value = "")
  public TimeUnitType getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
  }

  public TimePeriodDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Комментарий.
   * @return comment
   */
  @ApiModelProperty(value = "Комментарий.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

