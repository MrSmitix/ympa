package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CurrencyType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Настройки кабинета.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BusinessSettingsDTO   {
  
  private Boolean onlyDefaultPrice;
  private CurrencyType currency;

  /**
   * Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. 
   **/
  
  @ApiModelProperty(value = "Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. ")
  @JsonProperty("onlyDefaultPrice")
  public Boolean getOnlyDefaultPrice() {
    return onlyDefaultPrice;
  }
  public void setOnlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  @Valid
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

