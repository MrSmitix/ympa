package apimodels;

import apimodels.PriceSuggestType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Тип цены.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PriceSuggestDTO   {
  @JsonProperty("type")
  @Valid

  private PriceSuggestType type;

  @JsonProperty("price")
  @Valid

  private BigDecimal price;

  public PriceSuggestDTO type(PriceSuggestType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

