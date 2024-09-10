package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ограничения на значения характеристик.
 */
@ApiModel(description="Ограничения на значения характеристик.")

public class ParameterValueConstraintsDTO  {
  
 /**
  * Минимальное число.
  */
  @ApiModelProperty(value = "Минимальное число.")
  private Double minValue;

 /**
  * Максимальное число.
  */
  @ApiModelProperty(value = "Максимальное число.")
  private Double maxValue;

 /**
  * Максимальная длина текста.
  */
  @ApiModelProperty(value = "Максимальная длина текста.")
  private Integer maxLength;
 /**
  * Минимальное число.
  * @return minValue
  */
  @JsonProperty("minValue")
  public Double getMinValue() {
    return minValue;
  }

  /**
   * Sets the <code>minValue</code> property.
   */
 public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  /**
   * Sets the <code>minValue</code> property.
   */
  public ParameterValueConstraintsDTO minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

 /**
  * Максимальное число.
  * @return maxValue
  */
  @JsonProperty("maxValue")
  public Double getMaxValue() {
    return maxValue;
  }

  /**
   * Sets the <code>maxValue</code> property.
   */
 public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * Sets the <code>maxValue</code> property.
   */
  public ParameterValueConstraintsDTO maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

 /**
  * Максимальная длина текста.
  * @return maxLength
  */
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }

  /**
   * Sets the <code>maxLength</code> property.
   */
 public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * Sets the <code>maxLength</code> property.
   */
  public ParameterValueConstraintsDTO maxLength(Integer maxLength) {
    this.maxLength = maxLength;
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
    ParameterValueConstraintsDTO parameterValueConstraintsDTO = (ParameterValueConstraintsDTO) o;
    return Objects.equals(this.minValue, parameterValueConstraintsDTO.minValue) &&
        Objects.equals(this.maxValue, parameterValueConstraintsDTO.maxValue) &&
        Objects.equals(this.maxLength, parameterValueConstraintsDTO.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minValue, maxValue, maxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterValueConstraintsDTO {\n");
    
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

