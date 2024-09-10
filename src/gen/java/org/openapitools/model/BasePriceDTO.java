package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;



/**
 * Цена на товар.
 **/

@ApiModel(description = "Цена на товар.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BasePriceDTO   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currencyId")
  private CurrencyType currencyId;

  /**
   * Значение.
   * minimum: 0
   **/
  public BasePriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение.")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  public BasePriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasePriceDTO basePriceDTO = (BasePriceDTO) o;
    return Objects.equals(value, basePriceDTO.value) &&
        Objects.equals(currencyId, basePriceDTO.currencyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasePriceDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
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

