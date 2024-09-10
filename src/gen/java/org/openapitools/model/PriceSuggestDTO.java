package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.PriceSuggestType;



/**
 * Тип цены.
 **/

@ApiModel(description = "Тип цены.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceSuggestDTO   {
  @JsonProperty("type")
  private PriceSuggestType type;

  @JsonProperty("price")
  private BigDecimal price;

  /**
   **/
  public PriceSuggestDTO type(PriceSuggestType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public PriceSuggestType getType() {
    return type;
  }
  public void setType(PriceSuggestType type) {
    this.type = type;
  }

  /**
   * Цена в рублях.
   **/
  public PriceSuggestDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "Цена в рублях.")
  @JsonProperty("price")
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
    return Objects.equals(type, priceSuggestDTO.type) &&
        Objects.equals(price, priceSuggestDTO.price);
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

