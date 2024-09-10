package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Время проведения акции.
 */

@Schema(name = "PromoPeriodDTO", description = "Время проведения акции.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PromoPeriodDTO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date dateTimeTo;

  public PromoPeriodDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PromoPeriodDTO(Date dateTimeFrom, Date dateTimeTo) {
    this.dateTimeFrom = dateTimeFrom;
    this.dateTimeTo = dateTimeTo;
  }

  public PromoPeriodDTO dateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

  /**
   * Дата и время начала акции.
   * @return dateTimeFrom
   */
  @NotNull @Valid 
  @Schema(name = "dateTimeFrom", description = "Дата и время начала акции.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateTimeFrom")
  public Date getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(Date dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public PromoPeriodDTO dateTimeTo(Date dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

  /**
   * Дата и время окончания акции.
   * @return dateTimeTo
   */
  @NotNull @Valid 
  @Schema(name = "dateTimeTo", description = "Дата и время окончания акции.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateTimeTo")
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

