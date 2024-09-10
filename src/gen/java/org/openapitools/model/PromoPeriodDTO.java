package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Время проведения акции.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoPeriodDTO   {
  
  private Date dateTimeFrom;
  private Date dateTimeTo;

  /**
   * Дата и время начала акции.
   **/
  
  @ApiModelProperty(required = true, value = "Дата и время начала акции.")
  @JsonProperty("dateTimeFrom")
  @NotNull
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  /**
   * Дата и время окончания акции.
   **/
  
  @ApiModelProperty(required = true, value = "Дата и время окончания акции.")
  @JsonProperty("dateTimeTo")
  @NotNull
  public Date getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(Date dateTimeTo) {
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
