package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о ценах на модель товара.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelPriceDTO   {
  
  private BigDecimal avg;
  private BigDecimal max;
  private BigDecimal min;

  /**
   * Средняя цена предложения для модели в регионе.
   **/
  
  @ApiModelProperty(value = "Средняя цена предложения для модели в регионе.")
  @JsonProperty("avg")
  @Valid
  public BigDecimal getAvg() {
    return avg;
  }
  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

  /**
   * Максимальная цена предложения для модели в регионе.
   **/
  
  @ApiModelProperty(value = "Максимальная цена предложения для модели в регионе.")
  @JsonProperty("max")
  @Valid
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  /**
   * Минимальная цена предложения для модели в регионе.
   **/
  
  @ApiModelProperty(value = "Минимальная цена предложения для модели в регионе.")
  @JsonProperty("min")
  @Valid
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPriceDTO modelPriceDTO = (ModelPriceDTO) o;
    return Objects.equals(this.avg, modelPriceDTO.avg) &&
        Objects.equals(this.max, modelPriceDTO.max) &&
        Objects.equals(this.min, modelPriceDTO.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avg, max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPriceDTO {\n");
    
    sb.append("    avg: ").append(toIndentedString(avg)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

