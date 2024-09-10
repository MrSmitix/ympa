package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.AgeUnitType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Возраст в заданных единицах измерения.
 **/
@ApiModel(description="Возраст в заданных единицах измерения.")

public class AgeDTO  {
  
  @ApiModelProperty(required = true, value = "Значение. ")
 /**
   * Значение. 
  **/
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  private AgeUnitType ageUnit;
 /**
   * Значение. 
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
   * Get ageUnit
   * @return ageUnit
  **/
  @JsonProperty("ageUnit")
  public AgeUnitType getAgeUnit() {
    return ageUnit;
  }

  public void setAgeUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
  }

  public AgeDTO ageUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

