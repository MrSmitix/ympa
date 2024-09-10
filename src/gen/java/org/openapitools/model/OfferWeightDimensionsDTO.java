package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */
@ApiModel(description="Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) ")

public class OfferWeightDimensionsDTO  {
  
 /**
  * Длина упаковки в см. 
  */
  @ApiModelProperty(example = "65.55", required = true, value = "Длина упаковки в см. ")
  @Valid
  private BigDecimal length;

 /**
  * Ширина упаковки в см. 
  */
  @ApiModelProperty(example = "50.7", required = true, value = "Ширина упаковки в см. ")
  @Valid
  private BigDecimal width;

 /**
  * Высота упаковки в см. 
  */
  @ApiModelProperty(example = "20", required = true, value = "Высота упаковки в см. ")
  @Valid
  private BigDecimal height;

 /**
  * Вес товара в кг с учетом упаковки (брутто). 
  */
  @ApiModelProperty(example = "1.001", required = true, value = "Вес товара в кг с учетом упаковки (брутто). ")
  @Valid
  private BigDecimal weight;
 /**
  * Длина упаковки в см. 
  * @return length
  */
  @JsonProperty("length")
  @NotNull
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
  public OfferWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

 /**
  * Ширина упаковки в см. 
  * @return width
  */
  @JsonProperty("width")
  @NotNull
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
  public OfferWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

 /**
  * Высота упаковки в см. 
  * @return height
  */
  @JsonProperty("height")
  @NotNull
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
  public OfferWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

 /**
  * Вес товара в кг с учетом упаковки (брутто). 
  * @return weight
  */
  @JsonProperty("weight")
  @NotNull
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
  public OfferWeightDimensionsDTO weight(BigDecimal weight) {
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
    OfferWeightDimensionsDTO offerWeightDimensionsDTO = (OfferWeightDimensionsDTO) o;
    return Objects.equals(this.length, offerWeightDimensionsDTO.length) &&
        Objects.equals(this.width, offerWeightDimensionsDTO.width) &&
        Objects.equals(this.height, offerWeightDimensionsDTO.height) &&
        Objects.equals(this.weight, offerWeightDimensionsDTO.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferWeightDimensionsDTO {\n");
    
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

