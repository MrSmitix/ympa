package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */
@ApiModel(description="Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. ")

public class GoodsStatsWeightDimensionsDTO  {
  
 /**
  * Длина товара в сантиметрах.
  */
  @ApiModelProperty(value = "Длина товара в сантиметрах.")
  @Valid
  private BigDecimal length;

 /**
  * Ширина товара в сантиметрах.
  */
  @ApiModelProperty(value = "Ширина товара в сантиметрах.")
  @Valid
  private BigDecimal width;

 /**
  * Высота товара в сантиметрах.
  */
  @ApiModelProperty(value = "Высота товара в сантиметрах.")
  @Valid
  private BigDecimal height;

 /**
  * Вес товара в килограммах.
  */
  @ApiModelProperty(value = "Вес товара в килограммах.")
  @Valid
  private BigDecimal weight;
 /**
  * Длина товара в сантиметрах.
  * @return length
  */
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }

  /**
   * Sets the <code>length</code> property.
   */
 public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   * Sets the <code>length</code> property.
   */
  public GoodsStatsWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

 /**
  * Ширина товара в сантиметрах.
  * @return width
  */
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  /**
   * Sets the <code>width</code> property.
   */
 public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   * Sets the <code>width</code> property.
   */
  public GoodsStatsWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

 /**
  * Высота товара в сантиметрах.
  * @return height
  */
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  /**
   * Sets the <code>height</code> property.
   */
 public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   * Sets the <code>height</code> property.
   */
  public GoodsStatsWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

 /**
  * Вес товара в килограммах.
  * @return weight
  */
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
 public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  /**
   * Sets the <code>weight</code> property.
   */
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

