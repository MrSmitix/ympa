package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ограничения на значения характеристик.
 */
@ApiModel(description = "Ограничения на значения характеристик.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueConstraintsDTO   {
  @JsonProperty("minValue")
  private Double minValue;

  @JsonProperty("maxValue")
  private Double maxValue;

  @JsonProperty("maxLength")
  private Integer maxLength;

  public ParameterValueConstraintsDTO minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Минимальное число.
   * @return minValue
   */
  @ApiModelProperty(value = "Минимальное число.")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public ParameterValueConstraintsDTO maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Максимальное число.
   * @return maxValue
   */
  @ApiModelProperty(value = "Максимальное число.")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public ParameterValueConstraintsDTO maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Максимальная длина текста.
   * @return maxLength
   */
  @ApiModelProperty(value = "Максимальная длина текста.")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

