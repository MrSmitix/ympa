package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 **/
@ApiModel(description = "Цена с указанием скидки, валюты и времени последнего обновления.")
@JsonTypeName("PriceDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceDTO   {
  private BigDecimal value;
  private BigDecimal discountBase;
  private CurrencyType currencyId;
  private Integer vat;

  /**
   * Цена на товар.
   **/
  public PriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Цена на товар.")
  @JsonProperty("value")
  @Valid public BigDecimal getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   **/
  public PriceDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

  
  @ApiModelProperty(value = "Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ")
  @JsonProperty("discountBase")
  @Valid public BigDecimal getDiscountBase() {
    return discountBase;
  }

  @JsonProperty("discountBase")
  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

  /**
   **/
  public PriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  @JsonProperty("currencyId")
  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  /**
   * Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
   **/
  public PriceDTO vat(Integer vat) {
    this.vat = vat;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. ")
  @JsonProperty("vat")
  public Integer getVat() {
    return vat;
  }

  @JsonProperty("vat")
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
    return Objects.equals(this.value, priceDTO.value) &&
        Objects.equals(this.discountBase, priceDTO.discountBase) &&
        Objects.equals(this.currencyId, priceDTO.currencyId) &&
        Objects.equals(this.vat, priceDTO.vat);
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

