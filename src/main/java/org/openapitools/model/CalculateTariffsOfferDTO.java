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
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

@Schema(name = "CalculateTariffsOfferDTO", description = "Параметры товара, для которого нужно рассчитать стоимость услуг.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferDTO {

  private Long categoryId;

  private BigDecimal price;

  private BigDecimal length;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal weight;

  private Integer quantity = 1;

  public CalculateTariffsOfferDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CalculateTariffsOfferDTO(Long categoryId, BigDecimal price, BigDecimal length, BigDecimal width, BigDecimal height, BigDecimal weight) {
    this.categoryId = categoryId;
    this.price = price;
    this.length = length;
    this.width = width;
    this.height = height;
    this.weight = weight;
  }

  public CalculateTariffsOfferDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * minimum: 0
   * @return categoryId
   */
  @NotNull @Min(0L) 
  @Schema(name = "categoryId", description = "Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categoryId")
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
   */
  @NotNull @Valid @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "price", description = "Цена на товар в рублях.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
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
   */
  @NotNull @Valid @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "length", description = "Длина товара в сантиметрах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("length")
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
   */
  @NotNull @Valid @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "width", description = "Ширина товара в сантиметрах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("width")
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
   */
  @NotNull @Valid @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "height", description = "Высота товара в сантиметрах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
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
   */
  @NotNull @Valid @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "weight", description = "Вес товара в килограммах.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("weight")
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
   */
  @Min(1) 
  @Schema(name = "quantity", description = "Квант продажи — количество единиц товара в одном товарном предложении.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
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
    return Objects.equals(this.categoryId, calculateTariffsOfferDTO.categoryId) &&
        Objects.equals(this.price, calculateTariffsOfferDTO.price) &&
        Objects.equals(this.length, calculateTariffsOfferDTO.length) &&
        Objects.equals(this.width, calculateTariffsOfferDTO.width) &&
        Objects.equals(this.height, calculateTariffsOfferDTO.height) &&
        Objects.equals(this.weight, calculateTariffsOfferDTO.weight) &&
        Objects.equals(this.quantity, calculateTariffsOfferDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, price, length, width, height, weight, quantity);
  }

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

