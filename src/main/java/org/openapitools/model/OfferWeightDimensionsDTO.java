/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */

@ApiModel(description = "Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferWeightDimensionsDTO   {
  
  private BigDecimal length;
  private BigDecimal width;
  private BigDecimal height;
  private BigDecimal weight;

  /**
   * Длина упаковки в см. 
   */
  public OfferWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

  
  @ApiModelProperty(example = "65.55", required = true, value = "Длина упаковки в см. ")
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   * Ширина упаковки в см. 
   */
  public OfferWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(example = "50.7", required = true, value = "Ширина упаковки в см. ")
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   * Высота упаковки в см. 
   */
  public OfferWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(example = "20", required = true, value = "Высота упаковки в см. ")
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   * Вес товара в кг с учетом упаковки (брутто). 
   */
  public OfferWeightDimensionsDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(example = "1.001", required = true, value = "Вес товара в кг с учетом упаковки (брутто). ")
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
    OfferWeightDimensionsDTO offerWeightDimensionsDTO = (OfferWeightDimensionsDTO) o;
    return Objects.equals(length, offerWeightDimensionsDTO.length) &&
        Objects.equals(width, offerWeightDimensionsDTO.width) &&
        Objects.equals(height, offerWeightDimensionsDTO.height) &&
        Objects.equals(weight, offerWeightDimensionsDTO.weight);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

