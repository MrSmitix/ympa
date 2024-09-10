package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CurrencyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Цена на товар.
 */
@ApiModel(description = "Цена на товар.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BasePriceDTO   {
  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currencyId")
  private CurrencyType currencyId;

  public BasePriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Значение.
   * minimum: 0
   * @return value
   */
  @ApiModelProperty(required = true, value = "Значение.")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public BasePriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.value, basePriceDTO.value) &&
        Objects.equals(this.currencyId, basePriceDTO.currencyId);
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

