package apimodels;

import apimodels.AgeUnitType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Возраст в заданных единицах измерения.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AgeDTO   {
  @JsonProperty("value")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal value;

  @JsonProperty("ageUnit")
  @NotNull
@Valid

  private AgeUnitType ageUnit;

  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Значение. 
   * minimum: 0
   * @return value
  **/
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
  **/
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
    return Objects.equals(value, ageDTO.value) &&
        Objects.equals(ageUnit, ageDTO.ageUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, ageUnit);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

