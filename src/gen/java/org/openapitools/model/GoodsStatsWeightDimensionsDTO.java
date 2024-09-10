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

@ApiModel(description="Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsWeightDimensionsDTO   {
  
  private BigDecimal length;
  private BigDecimal width;
  private BigDecimal height;
  private BigDecimal weight;

  /**
   * Длина товара в сантиметрах.
   **/
  
  @ApiModelProperty(value = "Длина товара в сантиметрах.")
  @JsonProperty("length")
  @Valid
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   * Ширина товара в сантиметрах.
   **/
  
  @ApiModelProperty(value = "Ширина товара в сантиметрах.")
  @JsonProperty("width")
  @Valid
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   * Высота товара в сантиметрах.
   **/
  
  @ApiModelProperty(value = "Высота товара в сантиметрах.")
  @JsonProperty("height")
  @Valid
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   * Вес товара в килограммах.
   **/
  
  @ApiModelProperty(value = "Вес товара в килограммах.")
  @JsonProperty("weight")
  @Valid
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

