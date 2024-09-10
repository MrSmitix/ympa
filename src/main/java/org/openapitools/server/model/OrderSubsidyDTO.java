package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.OrderSubsidyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 */
public class OrderSubsidyDTO   {

    private OrderSubsidyType type;
    private BigDecimal amount;

    /**
     * Default constructor.
     */
    public OrderSubsidyDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderSubsidyDTO.
     *
     * @param type type
     * @param amount Сумма субсидии.
     */
    public OrderSubsidyDTO(
        OrderSubsidyType type, 
        BigDecimal amount
    ) {
        this.type = type;
        this.amount = amount;
    }



    /**
     * Get type
     * @return type
     */
    public OrderSubsidyType getType() {
        return type;
    }

    public void setType(OrderSubsidyType type) {
        this.type = type;
    }

    /**
     * Сумма субсидии.
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderSubsidyDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

