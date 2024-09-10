package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Цена с указанием скидки.
 */
@ApiModel(description="Цена с указанием скидки.")

public class UpdatePriceWithDiscountDTO  {
  
 /**
  * Значение.
  */
  @ApiModelProperty(required = true, value = "Значение.")
  @Valid
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CurrencyType currencyId;

 /**
  * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  */
  @ApiModelProperty(value = "Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
  @Valid
  private BigDecimal discountBase;
 /**
  * Значение.
  * minimum: 0
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0")  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public UpdatePriceWithDiscountDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

 /**
  * Get currencyId
  * @return currencyId
  */
  @JsonProperty("currencyId")
  @NotNull
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  /**
   * Sets the <code>currencyId</code> property.
   */
 public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * Sets the <code>currencyId</code> property.
   */
  public UpdatePriceWithDiscountDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

 /**
  * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  * minimum: 0
  * @return discountBase
  */
  @JsonProperty("discountBase")
 @DecimalMin("0")  public BigDecimal getDiscountBase() {
    return discountBase;
  }

  /**
   * Sets the <code>discountBase</code> property.
   */
 public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

  /**
   * Sets the <code>discountBase</code> property.
   */
  public UpdatePriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

