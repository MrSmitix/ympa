package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.TurnoverType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об оборачиваемости товара.
 */

@Schema(name = "TurnoverDTO", description = "Информация об оборачиваемости товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TurnoverDTO {

  private TurnoverType turnover;

  private Double turnoverDays;

  public TurnoverDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TurnoverDTO(TurnoverType turnover) {
    this.turnover = turnover;
  }

  public TurnoverDTO turnover(TurnoverType turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * Get turnover
   * @return turnover
   */
  @NotNull @Valid 
  @Schema(name = "turnover", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("turnover")
  public TurnoverType getTurnover() {
    return turnover;
  }

  public void setTurnover(TurnoverType turnover) {
    this.turnover = turnover;
  }

  public TurnoverDTO turnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
    return this;
  }

  /**
   * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
   * @return turnoverDays
   */
  
  @Schema(name = "turnoverDays", description = "Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("turnoverDays")
  public Double getTurnoverDays() {
    return turnoverDays;
  }

  public void setTurnoverDays(Double turnoverDays) {
    this.turnoverDays = turnoverDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TurnoverDTO turnoverDTO = (TurnoverDTO) o;
    return Objects.equals(this.turnover, turnoverDTO.turnover) &&
        Objects.equals(this.turnoverDays, turnoverDTO.turnoverDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(turnover, turnoverDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurnoverDTO {\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    turnoverDays: ").append(toIndentedString(turnoverDays)).append("\n");
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

