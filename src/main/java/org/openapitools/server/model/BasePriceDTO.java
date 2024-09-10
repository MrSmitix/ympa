package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Цена на товар.
 */
public class BasePriceDTO   {

    private BigDecimal value;
    private CurrencyType currencyId;

    /**
     * Default constructor.
     */
    public BasePriceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create BasePriceDTO.
     *
     * @param value Значение.
     * @param currencyId currencyId
     */
    public BasePriceDTO(
        BigDecimal value, 
        CurrencyType currencyId
    ) {
        this.value = value;
        this.currencyId = currencyId;
    }



    /**
     * Значение.
     * minimum: 0
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Get currencyId
     * @return currencyId
     */
    public CurrencyType getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(CurrencyType currencyId) {
        this.currencyId = currencyId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasePriceDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
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

