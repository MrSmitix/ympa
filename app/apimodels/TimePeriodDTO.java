package apimodels;

import apimodels.TimeUnitType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TimePeriodDTO   {
  @JsonProperty("timePeriod")
  @NotNull

  private Integer timePeriod;

  @JsonProperty("timeUnit")
  @NotNull
@Valid

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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

