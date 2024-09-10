package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о ценах на модель товара.
 */
@ApiModel(description="Информация о ценах на модель товара.")

public class ModelPriceDTO  {
  
 /**
  * Средняя цена предложения для модели в регионе.
  */
  @ApiModelProperty(value = "Средняя цена предложения для модели в регионе.")
  @Valid
  private BigDecimal avg;

 /**
  * Максимальная цена предложения для модели в регионе.
  */
  @ApiModelProperty(value = "Максимальная цена предложения для модели в регионе.")
  @Valid
  private BigDecimal max;

 /**
  * Минимальная цена предложения для модели в регионе.
  */
  @ApiModelProperty(value = "Минимальная цена предложения для модели в регионе.")
  @Valid
  private BigDecimal min;
 /**
  * Средняя цена предложения для модели в регионе.
  * @return avg
  */
  @JsonProperty("avg")
  public BigDecimal getAvg() {
    return avg;
  }

  /**
   * Sets the <code>avg</code> property.
   */
 public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

  /**
   * Sets the <code>avg</code> property.
   */
  public ModelPriceDTO avg(BigDecimal avg) {
    this.avg = avg;
    return this;
  }

 /**
  * Максимальная цена предложения для модели в регионе.
  * @return max
  */
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  /**
   * Sets the <code>max</code> property.
   */
 public void setMax(BigDecimal max) {
    this.max = max;
  }

  /**
   * Sets the <code>max</code> property.
   */
  public ModelPriceDTO max(BigDecimal max) {
    this.max = max;
    return this;
  }

 /**
  * Минимальная цена предложения для модели в регионе.
  * @return min
  */
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }

  /**
   * Sets the <code>min</code> property.
   */
 public void setMin(BigDecimal min) {
    this.min = min;
  }

  /**
   * Sets the <code>min</code> property.
   */
  public ModelPriceDTO min(BigDecimal min) {
    this.min = min;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

