package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferWeightDimensionsDTO   {
  @JsonProperty("length")
  @NotNull
@Valid

  private BigDecimal length;

  @JsonProperty("width")
  @NotNull
@Valid

  private BigDecimal width;

  @JsonProperty("height")
  @NotNull
@Valid

  private BigDecimal height;

  @JsonProperty("weight")
  @NotNull
@Valid

  private BigDecimal weight;

  public OfferWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Длина упаковки в см. 
   * @return length
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

