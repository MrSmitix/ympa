package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.util.Date;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Цена с указанием скидки и времени последнего обновления.
 */
@ApiModel(description="Цена с указанием скидки и времени последнего обновления.")

public class GetPriceWithDiscountDTO  {
  
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
  * Время последнего обновления.
  */
  @ApiModelProperty(required = true, value = "Время последнего обновления.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;
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
  public GetPriceWithDiscountDTO value(BigDecimal value) {
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
  public GetPriceWithDiscountDTO currencyId(CurrencyType currencyId) {
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
  public GetPriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

 /**
  * Время последнего обновления.
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public GetPriceWithDiscountDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    GetPriceWithDiscountDTO getPriceWithDiscountDTO = (GetPriceWithDiscountDTO) o;
    return Objects.equals(this.value, getPriceWithDiscountDTO.value) &&
        Objects.equals(this.currencyId, getPriceWithDiscountDTO.currencyId) &&
        Objects.equals(this.discountBase, getPriceWithDiscountDTO.discountBase) &&
        Objects.equals(this.updatedAt, getPriceWithDiscountDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, discountBase, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceWithDiscountDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

