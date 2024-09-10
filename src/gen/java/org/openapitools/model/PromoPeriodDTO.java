package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Время проведения акции.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Время проведения акции.")
public class PromoPeriodDTO   {
  
  private java.util.Date dateTimeFrom;

  private java.util.Date dateTimeTo;

  /**
   * Дата и время начала акции.
   **/
  public PromoPeriodDTO dateTimeFrom(java.util.Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время начала акции.")
  @JsonProperty("dateTimeFrom")
  @NotNull
  public java.util.Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(java.util.Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }


  /**
   * Дата и время окончания акции.
   **/
  public PromoPeriodDTO dateTimeTo(java.util.Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Дата и время окончания акции.")
  @JsonProperty("dateTimeTo")
  @NotNull
  public java.util.Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(java.util.Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoPeriodDTO promoPeriodDTO = (PromoPeriodDTO) o;
    return Objects.equals(this.dateTimeFrom, promoPeriodDTO.dateTimeFrom) &&
        Objects.equals(this.dateTimeTo, promoPeriodDTO.dateTimeTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTimeFrom, dateTimeTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoPeriodDTO {\n");
    
    sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
    sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
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

