package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.OrderItemSubsidyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */
public class OrderItemSubsidyDTO   {

    private OrderItemSubsidyType type;
    private BigDecimal amount;

    /**
     * Default constructor.
     */
    public OrderItemSubsidyDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemSubsidyDTO.
     *
     * @param type type
     * @param amount Сумма субсидии.
     */
    public OrderItemSubsidyDTO(
        OrderItemSubsidyType type, 
        BigDecimal amount
    ) {
        this.type = type;
        this.amount = amount;
    }



    /**
     * Get type
     * @return type
     */
    public OrderItemSubsidyType getType() {
        return type;
    }

    public void setType(OrderItemSubsidyType type) {
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
        sb.append("class OrderItemSubsidyDTO {\n");
        
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

