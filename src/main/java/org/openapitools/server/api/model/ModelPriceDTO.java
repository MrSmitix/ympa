package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Информация о ценах на модель товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelPriceDTO   {
  
  private BigDecimal avg;
  private BigDecimal max;
  private BigDecimal min;

  public ModelPriceDTO () {

  }

  public ModelPriceDTO (BigDecimal avg, BigDecimal max, BigDecimal min) {
    this.avg = avg;
    this.max = max;
    this.min = min;
  }

    
  @JsonProperty("avg")
  public BigDecimal getAvg() {
    return avg;
  }
  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

    
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

    
  @JsonProperty("min")
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
    return Objects.equals(avg, modelPriceDTO.avg) &&
        Objects.equals(max, modelPriceDTO.max) &&
        Objects.equals(min, modelPriceDTO.min);
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
