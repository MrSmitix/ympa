package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.PriceSuggestType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Тип цены.
 **/
@ApiModel(description="Тип цены.")

public class PriceSuggestDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private PriceSuggestType type;

  @ApiModelProperty(value = "Цена в рублях.")
  @Valid
 /**
   * Цена в рублях.
  **/
  private BigDecimal price;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public PriceSuggestType getType() {
    return type;
  }

  public void setType(PriceSuggestType type) {
    this.type = type;
  }

  public PriceSuggestDTO type(PriceSuggestType type) {
    this.type = type;
    return this;
  }

 /**
   * Цена в рублях.
   * @return price
  **/
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public PriceSuggestDTO price(BigDecimal price) {
    this.price = price;
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
    PriceSuggestDTO priceSuggestDTO = (PriceSuggestDTO) o;
    return Objects.equals(this.type, priceSuggestDTO.type) &&
        Objects.equals(this.price, priceSuggestDTO.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceSuggestDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

