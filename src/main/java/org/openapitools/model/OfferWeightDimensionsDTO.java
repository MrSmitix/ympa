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
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */

@Schema(name = "OfferWeightDimensionsDTO", description = "Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferWeightDimensionsDTO {

  private BigDecimal length;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal weight;

  public OfferWeightDimensionsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferWeightDimensionsDTO(BigDecimal length, BigDecimal width, BigDecimal height, BigDecimal weight) {
    this.length = length;
    this.width = width;
    this.height = height;
    this.weight = weight;
  }

  public OfferWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

  /**
   * Длина упаковки в см. 
   * @return length
   */
  @NotNull @Valid 
  @Schema(name = "length", example = "65.55", description = "Длина упаковки в см. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public OfferWeightDimensionsDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Ширина упаковки в см. 
   * @return width
   */
  @NotNull @Valid 
  @Schema(name = "width", example = "50.7", description = "Ширина упаковки в см. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public OfferWeightDimensionsDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Высота упаковки в см. 
   * @return height
   */
  @NotNull @Valid 
  @Schema(name = "height", example = "20", description = "Высота упаковки в см. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public OfferWeightDimensionsDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Вес товара в кг с учетом упаковки (брутто). 
   * @return weight
   */
  @NotNull @Valid 
  @Schema(name = "weight", example = "1.001", description = "Вес товара в кг с учетом упаковки (брутто). ", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

