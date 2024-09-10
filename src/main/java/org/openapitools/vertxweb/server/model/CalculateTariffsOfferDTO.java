package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateTariffsOfferDTO   {
  
  private Long categoryId;
  private BigDecimal price;
  private BigDecimal length;
  private BigDecimal width;
  private BigDecimal height;
  private BigDecimal weight;
  private Integer quantity = 1;

  public CalculateTariffsOfferDTO () {

  }

  public CalculateTariffsOfferDTO (Long categoryId, BigDecimal price, BigDecimal length, BigDecimal width, BigDecimal height, BigDecimal weight, Integer quantity) {
    this.categoryId = categoryId;
    this.price = price;
    this.length = length;
    this.width = width;
    this.height = height;
    this.weight = weight;
    this.quantity = quantity;
  }

    
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("length")
  public BigDecimal getLength() {
    return length;
  }
  public void setLength(BigDecimal length) {
    this.length = length;
  }

    
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }
  public void setWidth(BigDecimal width) {
    this.width = width;
  }

    
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }
  public void setHeight(BigDecimal height) {
    this.height = height;
  }

    
  @JsonProperty("weight")
  public BigDecimal getWeight() {
    return weight;
  }
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

    
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
