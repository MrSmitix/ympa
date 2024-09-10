package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о ценах на модель товара.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ModelPriceDTO   {
  @JsonProperty("avg")
  @Valid

  private BigDecimal avg;

  @JsonProperty("max")
  @Valid

  private BigDecimal max;

  @JsonProperty("min")
  @Valid

  private BigDecimal min;

  public ModelPriceDTO avg(BigDecimal avg) {
    this.avg = avg;
    return this;
  }

   /**
   * Средняя цена предложения для модели в регионе.
   * @return avg
  **/
  public BigDecimal getAvg() {
    return avg;
  }

  public void setAvg(BigDecimal avg) {
    this.avg = avg;
  }

  public ModelPriceDTO max(BigDecimal max) {
    this.max = max;
    return this;
  }

   /**
   * Максимальная цена предложения для модели в регионе.
   * @return max
  **/
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  public ModelPriceDTO min(BigDecimal min) {
    this.min = min;
    return this;
  }

   /**
   * Минимальная цена предложения для модели в регионе.
   * @return min
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

