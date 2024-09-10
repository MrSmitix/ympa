/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Ограничения на значения характеристик.
 */

@ApiModel(description = "Ограничения на значения характеристик.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParameterValueConstraintsDTO   {
  
  private Double minValue;
  private Double maxValue;
  private Integer maxLength;

  /**
   * Минимальное число.
   */
  public ParameterValueConstraintsDTO minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

  
  @ApiModelProperty(value = "Минимальное число.")
  @JsonProperty("minValue")
  public Double getMinValue() {
    return minValue;
  }
  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  /**
   * Максимальное число.
   */
  public ParameterValueConstraintsDTO maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  
  @ApiModelProperty(value = "Максимальное число.")
  @JsonProperty("maxValue")
  public Double getMaxValue() {
    return maxValue;
  }
  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * Максимальная длина текста.
   */
  public ParameterValueConstraintsDTO maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  
  @ApiModelProperty(value = "Максимальная длина текста.")
  @JsonProperty("maxLength")
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
    return Objects.equals(minValue, parameterValueConstraintsDTO.minValue) &&
        Objects.equals(maxValue, parameterValueConstraintsDTO.maxValue) &&
        Objects.equals(maxLength, parameterValueConstraintsDTO.maxLength);
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

