package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CurrencyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Настройки кабинета.
 */
@ApiModel(description = "Настройки кабинета.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessSettingsDTO   {
  @JsonProperty("onlyDefaultPrice")
  private Boolean onlyDefaultPrice;

  @JsonProperty("currency")
  private CurrencyType currency;

  public BusinessSettingsDTO onlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
    return this;
  }

  /**
   * Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
   * @return onlyDefaultPrice
   */
  @ApiModelProperty(value = "Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. ")
  public Boolean getOnlyDefaultPrice() {
    return onlyDefaultPrice;
  }

  public void setOnlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
  }

  public BusinessSettingsDTO currency(CurrencyType currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @ApiModelProperty(value = "")
  public CurrencyType getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyType currency) {
    this.currency = currency;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

