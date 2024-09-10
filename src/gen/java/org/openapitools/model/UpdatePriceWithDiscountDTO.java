package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Цена с указанием скидки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Цена с указанием скидки.")
public class UpdatePriceWithDiscountDTO   {
  
  private BigDecimal value;

  private CurrencyType currencyId;

  private BigDecimal discountBase;

  /**
   * Значение.
   * minimum: 0
   **/
  public UpdatePriceWithDiscountDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Значение.")
  @JsonProperty("value")
  @NotNull
 @DecimalMin(value="0",inclusive=false)  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   **/
  public UpdatePriceWithDiscountDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currencyId")
  @NotNull
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }


  /**
   * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * minimum: 0
   **/
  public UpdatePriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

  
  @ApiModelProperty(value = "Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
  @JsonProperty("discountBase")
 @DecimalMin(value="0",inclusive=false)  public BigDecimal getDiscountBase() {
    return discountBase;
  }
  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePriceWithDiscountDTO updatePriceWithDiscountDTO = (UpdatePriceWithDiscountDTO) o;
    return Objects.equals(this.value, updatePriceWithDiscountDTO.value) &&
        Objects.equals(this.currencyId, updatePriceWithDiscountDTO.currencyId) &&
        Objects.equals(this.discountBase, updatePriceWithDiscountDTO.discountBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, discountBase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePriceWithDiscountDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
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

