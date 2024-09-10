package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.AgeUnitType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Возраст в заданных единицах измерения.
 */

@Schema(name = "AgeDTO", description = "Возраст в заданных единицах измерения.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AgeDTO {

  private BigDecimal value;

  private AgeUnitType ageUnit;

  public AgeDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AgeDTO(BigDecimal value, AgeUnitType ageUnit) {
    this.value = value;
    this.ageUnit = ageUnit;
  }

  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Значение. 
   * minimum: 0
   * @return value
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "value", description = "Значение. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AgeDTO ageUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
    return this;
  }

  /**
   * Get ageUnit
   * @return ageUnit
   */
  @NotNull @Valid 
  @Schema(name = "ageUnit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ageUnit")
  public AgeUnitType getAgeUnit() {
    return ageUnit;
  }

  public void setAgeUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeDTO ageDTO = (AgeDTO) o;
    return Objects.equals(this.value, ageDTO.value) &&
        Objects.equals(this.ageUnit, ageDTO.ageUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, ageUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeDTO {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ageUnit: ").append(toIndentedString(ageUnit)).append("\n");
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

