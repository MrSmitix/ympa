package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.AgeUnitType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Возраст в заданных единицах измерения.
 */
@ApiModel(description="Возраст в заданных единицах измерения.")

public class AgeDTO  {
  
 /**
  * Значение. 
  */
  @ApiModelProperty(required = true, value = "Значение. ")
  @Valid
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AgeUnitType ageUnit;
 /**
  * Значение. 
  * minimum: 0
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0")  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
  * Get ageUnit
  * @return ageUnit
  */
  @JsonProperty("ageUnit")
  @NotNull
  public AgeUnitType getAgeUnit() {
    return ageUnit;
  }

  /**
   * Sets the <code>ageUnit</code> property.
   */
 public void setAgeUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
  }

  /**
   * Sets the <code>ageUnit</code> property.
   */
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

