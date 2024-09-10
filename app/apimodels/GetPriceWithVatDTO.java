package apimodels;

import apimodels.CurrencyType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Цена с указанием ставки НДС и времени последнего обновления.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPriceWithVatDTO   {
  @JsonProperty("value")
  @Valid

  private BigDecimal value;

  @JsonProperty("discountBase")
  @Valid

  private BigDecimal discountBase;

  @JsonProperty("currencyId")
  @Valid

  private CurrencyType currencyId;

  @JsonProperty("vat")
  
  private Integer vat;

  @JsonProperty("updatedAt")
  @NotNull
@Valid

  private OffsetDateTime updatedAt;

  public GetPriceWithVatDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Цена на товар.
   * @return value
  **/
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public GetPriceWithVatDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

   /**
   * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * @return discountBase
  **/
  public BigDecimal getDiscountBase() {
    return discountBase;
  }

  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

  public GetPriceWithVatDTO currencyId(CurrencyType currencyId) {
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

  public GetPriceWithVatDTO vat(Integer vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
   * @return vat
  **/
  public Integer getVat() {
    return vat;
  }

  public void setVat(Integer vat) {
    this.vat = vat;
  }

  public GetPriceWithVatDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Время последнего обновления.
   * @return updatedAt
  **/
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPriceWithVatDTO getPriceWithVatDTO = (GetPriceWithVatDTO) o;
    return Objects.equals(value, getPriceWithVatDTO.value) &&
        Objects.equals(discountBase, getPriceWithVatDTO.discountBase) &&
        Objects.equals(currencyId, getPriceWithVatDTO.currencyId) &&
        Objects.equals(vat, getPriceWithVatDTO.vat) &&
        Objects.equals(updatedAt, getPriceWithVatDTO.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, discountBase, currencyId, vat, updatedAt);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPriceWithVatDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

