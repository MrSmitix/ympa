package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */
@ApiModel(description="Параметры товара, для которого нужно рассчитать стоимость услуг.")

public class CalculateTariffsOfferDTO  {
  
 /**
  * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  */
  @ApiModelProperty(required = true, value = "Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
  private Long categoryId;

 /**
  * Цена на товар в рублях.
  */
  @ApiModelProperty(required = true, value = "Цена на товар в рублях.")
  @Valid
  private BigDecimal price;

 /**
  * Длина товара в сантиметрах.
  */
  @ApiModelProperty(required = true, value = "Длина товара в сантиметрах.")
  @Valid
  private BigDecimal length;

 /**
  * Ширина товара в сантиметрах.
  */
  @ApiModelProperty(required = true, value = "Ширина товара в сантиметрах.")
  @Valid
  private BigDecimal width;

 /**
  * Высота товара в сантиметрах.
  */
  @ApiModelProperty(required = true, value = "Высота товара в сантиметрах.")
  @Valid
  private BigDecimal height;

 /**
  * Вес товара в килограммах.
  */
  @ApiModelProperty(required = true, value = "Вес товара в килограммах.")
  @Valid
  private BigDecimal weight;

 /**
  * Квант продажи — количество единиц товара в одном товарном предложении.
  */
  @ApiModelProperty(value = "Квант продажи — количество единиц товара в одном товарном предложении.")
  private Integer quantity = 1;
 /**
  * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  * minimum: 0
  * @return categoryId
  */
  @JsonProperty("categoryId")
  @NotNull
 @Min(0L)  public Long getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
 public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
  public CalculateTariffsOfferDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
  * Цена на товар в рублях.
  * minimum: 0
  * @return price
  */
  @JsonProperty("price")
  @NotNull
 @DecimalMin("0")  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public CalculateTariffsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
  * Длина товара в сантиметрах.
  * minimum: 0
  * @return length
  */
  @JsonProperty("length")
  @NotNull
 @DecimalMin("0")  public BigDecimal getLength() {
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
  public CalculateTariffsOfferDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

 /**
  * Ширина товара в сантиметрах.
  * minimum: 0
  * @return width
  */
  @JsonProperty("width")
  @NotNull
 @DecimalMin("0")  public BigDecimal getWidth() {
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
  public CalculateTariffsOfferDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

 /**
  * Высота товара в сантиметрах.
  * minimum: 0
  * @return height
  */
  @JsonProperty("height")
  @NotNull
 @DecimalMin("0")  public BigDecimal getHeight() {
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
  public CalculateTariffsOfferDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

 /**
  * Вес товара в килограммах.
  * minimum: 0
  * @return weight
  */
  @JsonProperty("weight")
  @NotNull
 @DecimalMin("0")  public BigDecimal getWeight() {
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
  public CalculateTariffsOfferDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

 /**
  * Квант продажи — количество единиц товара в одном товарном предложении.
  * minimum: 1
  * @return quantity
  */
  @JsonProperty("quantity")
 @Min(1)  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the <code>quantity</code> property.
   */
 public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Sets the <code>quantity</code> property.
   */
  public CalculateTariffsOfferDTO quantity(Integer quantity) {
    this.quantity = quantity;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

