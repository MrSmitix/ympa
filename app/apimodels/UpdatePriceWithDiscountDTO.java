package apimodels;

import apimodels.CurrencyType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Цена с указанием скидки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePriceWithDiscountDTO   {
  @JsonProperty("value")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal value;

  @JsonProperty("currencyId")
  @NotNull
@Valid

  private CurrencyType currencyId;

  @JsonProperty("discountBase")
  @DecimalMin("0")
@Valid

  private BigDecimal discountBase;

  public UpdatePriceWithDiscountDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Значение.
   * minimum: 0
   * @return value
  **/
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public UpdatePriceWithDiscountDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * Get currencyId
   * @return currencyId
  **/
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public UpdatePriceWithDiscountDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

   /**
   * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * minimum: 0
   * @return discountBase
  **/
  public BigDecimal getDiscountBase() {
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
    return Objects.equals(value, updatePriceWithDiscountDTO.value) &&
        Objects.equals(currencyId, updatePriceWithDiscountDTO.currencyId) &&
        Objects.equals(discountBase, updatePriceWithDiscountDTO.discountBase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, currencyId, discountBase);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

