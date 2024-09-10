package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.OrdersStatsCommissionType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о стоимости услуг.
 */
public class OrdersStatsCommissionDTO   {

    private OrdersStatsCommissionType type;
    private BigDecimal actual;

    /**
     * Default constructor.
     */
    public OrdersStatsCommissionDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsCommissionDTO.
     *
     * @param type type
     * @param actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
     */
    public OrdersStatsCommissionDTO(
        OrdersStatsCommissionType type, 
        BigDecimal actual
    ) {
        this.type = type;
        this.actual = actual;
    }



    /**
     * Get type
     * @return type
     */
    public OrdersStatsCommissionType getType() {
        return type;
    }

    public void setType(OrdersStatsCommissionType type) {
        this.type = type;
    }

    /**
     * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
     * @return actual
     */
    public BigDecimal getActual() {
        return actual;
    }

    public void setActual(BigDecimal actual) {
        this.actual = actual;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsCommissionDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
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

