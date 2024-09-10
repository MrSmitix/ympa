package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Параметры товара, для которого нужно рассчитать стоимость услуг.
 **/
@ApiModel(description="Параметры товара, для которого нужно рассчитать стоимость услуг.")

public class CalculateTariffsOfferDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
 /**
   * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  **/
  private Long categoryId;

  @ApiModelProperty(required = true, value = "Цена на товар в рублях.")
 /**
   * Цена на товар в рублях.
  **/
  private BigDecimal price;

  @ApiModelProperty(required = true, value = "Длина товара в сантиметрах.")
 /**
   * Длина товара в сантиметрах.
  **/
  private BigDecimal length;

  @ApiModelProperty(required = true, value = "Ширина товара в сантиметрах.")
 /**
   * Ширина товара в сантиметрах.
  **/
  private BigDecimal width;

  @ApiModelProperty(required = true, value = "Высота товара в сантиметрах.")
 /**
   * Высота товара в сантиметрах.
  **/
  private BigDecimal height;

  @ApiModelProperty(required = true, value = "Вес товара в килограммах.")
 /**
   * Вес товара в килограммах.
  **/
  private BigDecimal weight;

  @ApiModelProperty(value = "Квант продажи — количество единиц товара в одном товарном предложении.")
 /**
   * Квант продажи — количество единиц товара в одном товарном предложении.
  **/
  private Integer quantity = 1;
 /**
   * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * minimum: 0
   * @return categoryId
  **/
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CalculateTariffsOfferDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
   * Цена на товар в рублях.
   * minimum: 0
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CalculateTariffsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

 /**
   * Длина товара в сантиметрах.
   * minimum: 0
   * @return length
  **/
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public CalculateTariffsOfferDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

 /**
   * Ширина товара в сантиметрах.
   * minimum: 0
   * @return width
  **/
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public CalculateTariffsOfferDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

 /**
   * Высота товара в сантиметрах.
   * minimum: 0
   * @return height
  **/
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public CalculateTariffsOfferDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

 /**
   * Вес товара в килограммах.
   * minimum: 0
   * @return weight
  **/
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public CalculateTariffsOfferDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

 /**
   * Квант продажи — количество единиц товара в одном товарном предложении.
   * minimum: 1
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

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

