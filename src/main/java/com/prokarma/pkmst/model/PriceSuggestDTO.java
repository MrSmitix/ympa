package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.PriceSuggestType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Тип цены.
 */
@ApiModel(description = "Тип цены.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceSuggestDTO   {
  @JsonProperty("type")
  private PriceSuggestType type;

  @JsonProperty("price")
  private BigDecimal price;

  public PriceSuggestDTO type(PriceSuggestType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(value = "")
  public PriceSuggestType getType() {
    return type;
  }

  public void setType(PriceSuggestType type) {
    this.type = type;
  }

  public PriceSuggestDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Цена в рублях.
   * @return price
   */
  @ApiModelProperty(value = "Цена в рублях.")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

