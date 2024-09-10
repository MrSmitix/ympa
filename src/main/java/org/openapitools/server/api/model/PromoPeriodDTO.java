package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Время проведения акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoPeriodDTO   {
  
  private OffsetDateTime dateTimeFrom;
  private OffsetDateTime dateTimeTo;

  public PromoPeriodDTO () {

  }

  public PromoPeriodDTO (OffsetDateTime dateTimeFrom, OffsetDateTime dateTimeTo) {
    this.dateTimeFrom = dateTimeFrom;
    this.dateTimeTo = dateTimeTo;
  }

    
  @JsonProperty("dateTimeFrom")
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }
  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

    
  @JsonProperty("dateTimeTo")
  public OffsetDateTime getDateTimeTo() {
    return dateTimeTo;
  }
  public void setDateTimeTo(OffsetDateTime dateTimeTo) {
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
    return Objects.equals(dateTimeFrom, promoPeriodDTO.dateTimeFrom) &&
        Objects.equals(dateTimeTo, promoPeriodDTO.dateTimeTo);
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
