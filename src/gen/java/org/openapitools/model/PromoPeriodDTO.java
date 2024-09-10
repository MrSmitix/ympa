package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Время проведения акции.
 */
@ApiModel(description="Время проведения акции.")

public class PromoPeriodDTO  {
  
 /**
  * Дата и время начала акции.
  */
  @ApiModelProperty(required = true, value = "Дата и время начала акции.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeFrom;

 /**
  * Дата и время окончания акции.
  */
  @ApiModelProperty(required = true, value = "Дата и время окончания акции.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date dateTimeTo;
 /**
  * Дата и время начала акции.
  * @return dateTimeFrom
  */
  @JsonProperty("dateTimeFrom")
  @NotNull
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
 public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * Sets the <code>dateTimeFrom</code> property.
   */
  public PromoPeriodDTO dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

 /**
  * Дата и время окончания акции.
  * @return dateTimeTo
  */
  @JsonProperty("dateTimeTo")
  @NotNull
  public Date getDateTimeTo() {
    return dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
 public void setDateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
  }

  /**
   * Sets the <code>dateTimeTo</code> property.
   */
  public PromoPeriodDTO dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

