package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.AgeUnitType;



/**
 * Возраст в заданных единицах измерения.
 **/

@ApiModel(description = "Возраст в заданных единицах измерения.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AgeDTO   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("ageUnit")
  private AgeUnitType ageUnit;

  /**
   * Значение. 
   * minimum: 0
   **/
  public AgeDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение. ")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  public AgeDTO ageUnit(AgeUnitType ageUnit) {
    this.ageUnit = ageUnit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(value, ageDTO.value) &&
        Objects.equals(ageUnit, ageDTO.ageUnit);
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

