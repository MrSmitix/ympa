package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Настройки кабинета.
 */
@ApiModel(description="Настройки кабинета.")

public class BusinessSettingsDTO  {
  
 /**
  * Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
  */
  @ApiModelProperty(value = "Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. ")
  private Boolean onlyDefaultPrice;

  @ApiModelProperty(value = "")
  @Valid
  private CurrencyType currency;
 /**
  * Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. 
  * @return onlyDefaultPrice
  */
  @JsonProperty("onlyDefaultPrice")
  public Boolean getOnlyDefaultPrice() {
    return onlyDefaultPrice;
  }

  /**
   * Sets the <code>onlyDefaultPrice</code> property.
   */
 public void setOnlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
  }

  /**
   * Sets the <code>onlyDefaultPrice</code> property.
   */
  public BusinessSettingsDTO onlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public CurrencyType getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(CurrencyType currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public BusinessSettingsDTO currency(CurrencyType currency) {
    this.currency = currency;
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
    BusinessSettingsDTO businessSettingsDTO = (BusinessSettingsDTO) o;
    return Objects.equals(this.onlyDefaultPrice, businessSettingsDTO.onlyDefaultPrice) &&
        Objects.equals(this.currency, businessSettingsDTO.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyDefaultPrice, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSettingsDTO {\n");
    
    sb.append("    onlyDefaultPrice: ").append(toIndentedString(onlyDefaultPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

