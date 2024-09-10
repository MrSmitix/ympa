package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.CurrencyType;

/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceDTO   {
  
  private BigDecimal value;
  private BigDecimal discountBase;
  private CurrencyType currencyId;
  private Integer vat;

  public PriceDTO () {

  }

  public PriceDTO (BigDecimal value, BigDecimal discountBase, CurrencyType currencyId, Integer vat) {
    this.value = value;
    this.discountBase = discountBase;
    this.currencyId = currencyId;
    this.vat = vat;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceDTO priceDTO = (PriceDTO) o;
    return Objects.equals(value, priceDTO.value) &&
        Objects.equals(discountBase, priceDTO.discountBase) &&
        Objects.equals(currencyId, priceDTO.currencyId) &&
        Objects.equals(vat, priceDTO.vat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, discountBase, currencyId, vat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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
