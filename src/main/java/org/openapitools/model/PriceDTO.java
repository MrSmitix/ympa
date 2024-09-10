package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CurrencyType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 */

@Schema(name = "PriceDTO", description = "Цена с указанием скидки, валюты и времени последнего обновления.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PriceDTO {

  private BigDecimal value;

  private BigDecimal discountBase;

  private CurrencyType currencyId;

  private Integer vat;

  public PriceDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Цена на товар.
   * @return value
   */
  @Valid 
  @Schema(name = "value", description = "Цена на товар.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public PriceDTO discountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
    return this;
  }

  /**
   * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
   * @return discountBase
   */
  @Valid 
  @Schema(name = "discountBase", description = "Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discountBase")
  public BigDecimal getDiscountBase() {
    return discountBase;
  }

  public void setDiscountBase(BigDecimal discountBase) {
    this.discountBase = discountBase;
  }

  public PriceDTO currencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
   */
  @Valid 
  @Schema(name = "currencyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currencyId")
  public CurrencyType getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(CurrencyType currencyId) {
    this.currencyId = currencyId;
  }

  public PriceDTO vat(Integer vat) {
    this.vat = vat;
    return this;
  }

  /**
   * Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
   * @return vat
   */
  
  @Schema(name = "vat", description = "Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

