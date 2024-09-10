package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CalculateTariffsOfferDTO   {
  @JsonProperty("categoryId")
  @NotNull
@DecimalMin("0")

  private Long categoryId;

  @JsonProperty("price")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal price;

  @JsonProperty("length")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal length;

  @JsonProperty("width")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal width;

  @JsonProperty("height")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal height;

  @JsonProperty("weight")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal weight;

  @JsonProperty("quantity")
  @Min(1)

  private Integer quantity = 1;

  public CalculateTariffsOfferDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * minimum: 0
   * @return categoryId
  **/
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CalculateTariffsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Цена на товар в рублях.
   * minimum: 0
   * @return price
  **/
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CalculateTariffsOfferDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Длина товара в сантиметрах.
   * minimum: 0
   * @return length
  **/
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public CalculateTariffsOfferDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Ширина товара в сантиметрах.
   * minimum: 0
   * @return width
  **/
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public CalculateTariffsOfferDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Высота товара в сантиметрах.
   * minimum: 0
   * @return height
  **/
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public CalculateTariffsOfferDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Вес товара в килограммах.
   * minimum: 0
   * @return weight
  **/
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public CalculateTariffsOfferDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Квант продажи — количество единиц товара в одном товарном предложении.
   * minimum: 1
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTariffsOfferDTO calculateTariffsOfferDTO = (CalculateTariffsOfferDTO) o;
    return Objects.equals(categoryId, calculateTariffsOfferDTO.categoryId) &&
        Objects.equals(price, calculateTariffsOfferDTO.price) &&
        Objects.equals(length, calculateTariffsOfferDTO.length) &&
        Objects.equals(width, calculateTariffsOfferDTO.width) &&
        Objects.equals(height, calculateTariffsOfferDTO.height) &&
        Objects.equals(weight, calculateTariffsOfferDTO.weight) &&
        Objects.equals(quantity, calculateTariffsOfferDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, price, length, width, height, weight, quantity);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTariffsOfferDTO {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

