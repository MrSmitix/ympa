package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.CurrencyType;

/**
 * Настройки кабинета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessSettingsDTO   {
  
  private Boolean onlyDefaultPrice;
  private CurrencyType currency;

  public BusinessSettingsDTO () {

  }

  public BusinessSettingsDTO (Boolean onlyDefaultPrice, CurrencyType currency) {
    this.onlyDefaultPrice = onlyDefaultPrice;
    this.currency = currency;
  }

    
  @JsonProperty("onlyDefaultPrice")
  public Boolean getOnlyDefaultPrice() {
    return onlyDefaultPrice;
  }
  public void setOnlyDefaultPrice(Boolean onlyDefaultPrice) {
    this.onlyDefaultPrice = onlyDefaultPrice;
  }

    
  @JsonProperty("currency")
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
    return Objects.equals(onlyDefaultPrice, businessSettingsDTO.onlyDefaultPrice) &&
        Objects.equals(currency, businessSettingsDTO.currency);
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
