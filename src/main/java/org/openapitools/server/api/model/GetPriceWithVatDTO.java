package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.CurrencyType;

/**
 * Цена с указанием ставки НДС и времени последнего обновления.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceWithVatDTO   {
  
  private BigDecimal value;
  private BigDecimal discountBase;
  private CurrencyType currencyId;
  private Integer vat;
  private OffsetDateTime updatedAt;

  public GetPriceWithVatDTO () {

  }

  public GetPriceWithVatDTO (BigDecimal value, BigDecimal discountBase, CurrencyType currencyId, Integer vat, OffsetDateTime updatedAt) {
    this.value = value;
    this.discountBase = discountBase;
    this.currencyId = currencyId;
    this.vat = vat;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

    
  @JsonProperty("discountBase")
  public BigDecimal getDiscountBase() {
    return discountBase;
  }
  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

    
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

    
  @JsonProperty("vat")
  public Integer getVat() {
    return vat;
  }
  public void setVat(Integer vat) {
    this.vat = vat;
  }

    
  @JsonProperty("updatedAt")
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
