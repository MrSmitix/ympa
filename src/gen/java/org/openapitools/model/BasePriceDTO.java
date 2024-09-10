package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Цена на товар.
 **/
@ApiModel(description="Цена на товар.")

public class BasePriceDTO  {
  
  @ApiModelProperty(required = true, value = "Значение.")
  @Valid
 /**
   * Значение.
  **/
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CurrencyType currencyId;
 /**
   * Значение.
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
 @DecimalMin(value="0",inclusive=false)  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public BasePriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
   * Get currencyId
   * @return currencyId
  **/
  @JsonProperty("currencyId")
  @NotNull
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public BasePriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

