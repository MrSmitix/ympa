package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 **/

@ApiModel(description = "Параметры товара, для которого нужно рассчитать стоимость услуг.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferDTO   {
  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("length")
  private BigDecimal length;

  @JsonProperty("width")
  private BigDecimal width;

  @JsonProperty("height")
  private BigDecimal height;

  @JsonProperty("weight")
  private BigDecimal weight;

  @JsonProperty("quantity")
  private Integer quantity = 1;

  /**
   * Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Цена на товар в рублях.
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Цена на товар в рублях.")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Длина товара в сантиметрах.
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO length(BigDecimal length) {
    this.length = length;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Длина товара в сантиметрах.")
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

  /**
   * Ширина товара в сантиметрах.
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO width(BigDecimal width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ширина товара в сантиметрах.")
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  /**
   * Высота товара в сантиметрах.
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO height(BigDecimal height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Высота товара в сантиметрах.")
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  /**
   * Вес товара в килограммах.
   * minimum: 0
   **/
  public CalculateTariffsOfferDTO weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Вес товара в килограммах.")
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  /**
   * Квант продажи — количество единиц товара в одном товарном предложении.
   * minimum: 1
   **/
  public CalculateTariffsOfferDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(value = "Квант продажи — количество единиц товара в одном товарном предложении.")
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

