package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 **/
@ApiModel(description = "Параметры товара, для которого нужно рассчитать стоимость услуг.")
@JsonTypeName("CalculateTariffsOfferDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CalculateTariffsOfferDTO   {
  private Long categoryId;
  private BigDecimal price;
  private BigDecimal length;
  private BigDecimal width;
  private BigDecimal height;
  private BigDecimal weight;
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
  @NotNull  @Min(0L)public Long getCategoryId() {
    return categoryId;
  }

  @JsonProperty("categoryId")
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
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)public BigDecimal getPrice() {
    return price;
  }

  @JsonProperty("price")
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
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)public BigDecimal getLength() {
    return length;
  }

  @JsonProperty("length")
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
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)public BigDecimal getWidth() {
    return width;
  }

  @JsonProperty("width")
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
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)public BigDecimal getHeight() {
    return height;
  }

  @JsonProperty("height")
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
  @NotNull @Valid  @DecimalMin(value="0",inclusive=false)public BigDecimal getWeight() {
    return weight;
  }

  @JsonProperty("weight")
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
   @Min(1)public Integer getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
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

