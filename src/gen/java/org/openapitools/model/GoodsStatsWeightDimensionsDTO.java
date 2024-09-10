package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 **/
@ApiModel(description="Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. ")

public class GoodsStatsWeightDimensionsDTO  {
  
  @ApiModelProperty(value = "Длина товара в сантиметрах.")
 /**
   * Длина товара в сантиметрах.
  **/
  private BigDecimal length;

  @ApiModelProperty(value = "Ширина товара в сантиметрах.")
 /**
   * Ширина товара в сантиметрах.
  **/
  private BigDecimal width;

  @ApiModelProperty(value = "Высота товара в сантиметрах.")
 /**
   * Высота товара в сантиметрах.
  **/
  private BigDecimal height;

  @ApiModelProperty(value = "Вес товара в килограммах.")
 /**
   * Вес товара в килограммах.
  **/
  private BigDecimal weight;
 /**
   * Длина товара в сантиметрах.
   * @return length
  **/
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public GoodsStatsWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

 /**
   * Ширина товара в сантиметрах.
   * @return width
  **/
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public GoodsStatsWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

 /**
   * Высота товара в сантиметрах.
   * @return height
  **/
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public GoodsStatsWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

 /**
   * Вес товара в килограммах.
   * @return weight
  **/
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public GoodsStatsWeightDimensionsDTO weight(BigDecimal weight) {
    this.weight = weight;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

