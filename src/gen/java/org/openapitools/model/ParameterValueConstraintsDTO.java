package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ограничения на значения характеристик.
 **/
@ApiModel(description="Ограничения на значения характеристик.")

public class ParameterValueConstraintsDTO  {
  
  @ApiModelProperty(value = "Минимальное число.")
 /**
   * Минимальное число.
  **/
  private Double minValue;

  @ApiModelProperty(value = "Максимальное число.")
 /**
   * Максимальное число.
  **/
  private Double maxValue;

  @ApiModelProperty(value = "Максимальная длина текста.")
 /**
   * Максимальная длина текста.
  **/
  private Integer maxLength;
 /**
   * Минимальное число.
   * @return minValue
  **/
  @JsonProperty("minValue")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public ParameterValueConstraintsDTO minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

 /**
   * Максимальное число.
   * @return maxValue
  **/
  @JsonProperty("maxValue")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public ParameterValueConstraintsDTO maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

 /**
   * Максимальная длина текста.
   * @return maxLength
  **/
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

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

