package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.PriceSuggestType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Тип цены.
 */
public class PriceSuggestDTO   {

    private PriceSuggestType type;
    private BigDecimal price;

    /**
     * Default constructor.
     */
    public PriceSuggestDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceSuggestDTO.
     *
     * @param type type
     * @param price Цена в рублях.
     */
    public PriceSuggestDTO(
        PriceSuggestType type, 
        BigDecimal price
    ) {
        this.type = type;
        this.price = price;
    }



    /**
     * Get type
     * @return type
     */
    public PriceSuggestType getType() {
        return type;
    }

    public void setType(PriceSuggestType type) {
        this.type = type;
    }

    /**
     * Цена в рублях.
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceSuggestDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

