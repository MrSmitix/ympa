package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Цена с указанием времени последнего обновления.
 */
public class GetPriceDTO   {

    private BigDecimal value;
    private CurrencyType currencyId;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public GetPriceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPriceDTO.
     *
     * @param value Значение.
     * @param currencyId currencyId
     * @param updatedAt Время последнего обновления.
     */
    public GetPriceDTO(
        BigDecimal value, 
        CurrencyType currencyId, 
        OffsetDateTime updatedAt
    ) {
        this.value = value;
        this.currencyId = currencyId;
        this.updatedAt = updatedAt;
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
     * Время последнего обновления.
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPriceDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

