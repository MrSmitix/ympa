package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Настройки кабинета.
 */
public class BusinessSettingsDTO   {

    private Boolean onlyDefaultPrice;
    private CurrencyType currency;

    /**
     * Default constructor.
     */
    public BusinessSettingsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessSettingsDTO.
     *
     * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * &#x60;false&#x60; — можно задать и базовую цену, и цены в конкретных магазинах. * &#x60;true&#x60; — можно задать только базовую цену. 
     * @param currency currency
     */
    public BusinessSettingsDTO(
        Boolean onlyDefaultPrice, 
        CurrencyType currency
    ) {
        this.onlyDefaultPrice = onlyDefaultPrice;
        this.currency = currency;
    }



    /**
     * Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
     * @return onlyDefaultPrice
     */
    public Boolean getOnlyDefaultPrice() {
        return onlyDefaultPrice;
    }

    public void setOnlyDefaultPrice(Boolean onlyDefaultPrice) {
        this.onlyDefaultPrice = onlyDefaultPrice;
    }

    /**
     * Get currency
     * @return currency
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

