package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsStatsWeightDimensionsDTO   {
  @JsonProperty("length")
  @Valid

  private BigDecimal length;

  @JsonProperty("width")
  @Valid

  private BigDecimal width;

  @JsonProperty("height")
  @Valid

  private BigDecimal height;

  @JsonProperty("weight")
  @Valid

  private BigDecimal weight;

  public GoodsStatsWeightDimensionsDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Длина товара в сантиметрах.
   * @return length
  **/
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
  **/
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
  **/
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
    GoodsStatsWeightDimensionsDTO goodsStatsWeightDimensionsDTO = (GoodsStatsWeightDimensionsDTO) o;
    return Objects.equals(length, goodsStatsWeightDimensionsDTO.length) &&
        Objects.equals(width, goodsStatsWeightDimensionsDTO.width) &&
        Objects.equals(height, goodsStatsWeightDimensionsDTO.height) &&
        Objects.equals(weight, goodsStatsWeightDimensionsDTO.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, weight);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

