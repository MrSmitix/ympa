package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о ценах на модель товара.
 */

@Schema(name = "ModelPriceDTO", description = "Информация о ценах на модель товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ModelPriceDTO {

  private BigDecimal avg;

  private BigDecimal max;

  private BigDecimal min;

  public ModelPriceDTO avg(BigDecimal avg) {
    this.avg = avg;
    return this;
  }

  /**
   * Средняя цена предложения для модели в регионе.
   * @return avg
   */
  @Valid 
  @Schema(name = "avg", description = "Средняя цена предложения для модели в регионе.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avg")
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
   */
  @Valid 
  @Schema(name = "max", description = "Максимальная цена предложения для модели в регионе.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max")
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
   */
  @Valid 
  @Schema(name = "min", description = "Минимальная цена предложения для модели в регионе.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

