package apimodels;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Время проведения акции.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromoPeriodDTO   {
  @JsonProperty("dateTimeFrom")
  @NotNull
@Valid

  private OffsetDateTime dateTimeFrom;

  @JsonProperty("dateTimeTo")
  @NotNull
@Valid

  private OffsetDateTime dateTimeTo;

  public PromoPeriodDTO dateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
    return this;
  }

   /**
   * Дата и время начала акции.
   * @return dateTimeFrom
  **/
  public OffsetDateTime getDateTimeFrom() {
    return dateTimeFrom;
  }

  public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
    this.dateTimeFrom = dateTimeFrom;
  }

  public PromoPeriodDTO dateTimeTo(OffsetDateTime dateTimeTo) {
    this.dateTimeTo = dateTimeTo;
    return this;
  }

   /**
   * Дата и время окончания акции.
   * @return dateTimeTo
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

