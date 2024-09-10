/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TimeUnitType;



/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */

@ApiModel(description = "Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TimePeriodDTO   {
  
  private Integer timePeriod;
  private TimeUnitType timeUnit;
  private String comment;

  /**
   * Продолжительность в указанных единицах.
   */
  public TimePeriodDTO timePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Продолжительность в указанных единицах.")
  @JsonProperty("timePeriod")
  public Integer getTimePeriod() {
    return timePeriod;
  }
  public void setTimePeriod(Integer timePeriod) {
    this.timePeriod = timePeriod;
  }

  /**
   */
  public TimePeriodDTO timeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timeUnit")
  public TimeUnitType getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(TimeUnitType timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   * Комментарий.
   */
  public TimePeriodDTO comment(String comment) {
    this.comment = comment;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий.")
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

