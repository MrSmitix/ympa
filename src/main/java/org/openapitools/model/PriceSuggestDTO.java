package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.PriceSuggestType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Тип цены.
 */

@Schema(name = "PriceSuggestDTO", description = "Тип цены.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceSuggestDTO {

  private PriceSuggestType type;

  private BigDecimal price;

  public PriceSuggestDTO type(PriceSuggestType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
  @Valid 
  @Schema(name = "price", description = "Цена в рублях.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

