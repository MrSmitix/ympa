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
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */

@Schema(name = "GoodsStatsWeightDimensionsDTO", description = "Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsWeightDimensionsDTO {

  private BigDecimal length;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal weight;

  public GoodsStatsWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

  /**
   * Длина товара в сантиметрах.
   * @return length
   */
  @Valid 
  @Schema(name = "length", description = "Длина товара в сантиметрах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public GoodsStatsWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Ширина товара в сантиметрах.
   * @return width
   */
  @Valid 
  @Schema(name = "width", description = "Ширина товара в сантиметрах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public GoodsStatsWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Высота товара в сантиметрах.
   * @return height
   */
  @Valid 
  @Schema(name = "height", description = "Высота товара в сантиметрах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public GoodsStatsWeightDimensionsDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Вес товара в килограммах.
   * @return weight
   */
  @Valid 
  @Schema(name = "weight", description = "Вес товара в килограммах.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO = (GoodsStatsWeightDimensionsDTO) o;
    return Objects.equals(this.length, goodsStatsWeightDimensionsDTO.length) &&
        Objects.equals(this.width, goodsStatsWeightDimensionsDTO.width) &&
        Objects.equals(this.height, goodsStatsWeightDimensionsDTO.height) &&
        Objects.equals(this.weight, goodsStatsWeightDimensionsDTO.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsStatsWeightDimensionsDTO {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

