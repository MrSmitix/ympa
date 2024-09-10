package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ModelPriceDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Модель товара.
 */
@ApiModel(description="Модель товара.")

public class ModelDTO  {
  
 /**
  * Идентификатор модели товара.
  */
  @ApiModelProperty(value = "Идентификатор модели товара.")
  private Long id;

 /**
  * Название модели товара.
  */
  @ApiModelProperty(value = "Название модели товара.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private ModelPriceDTO prices;
 /**
  * Идентификатор модели товара.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ModelDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название модели товара.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ModelDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get prices
  * @return prices
  */
  @JsonProperty("prices")
  public ModelPriceDTO getPrices() {
    return prices;
  }

  /**
   * Sets the <code>prices</code> property.
   */
 public void setPrices(ModelPriceDTO prices) {
    this.prices = prices;
  }

  /**
   * Sets the <code>prices</code> property.
   */
  public ModelDTO prices(ModelPriceDTO prices) {
    this.prices = prices;
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
    ModelDTO modelDTO = (ModelDTO) o;
    return Objects.equals(this.id, modelDTO.id) &&
        Objects.equals(this.name, modelDTO.name) &&
        Objects.equals(this.prices, modelDTO.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

