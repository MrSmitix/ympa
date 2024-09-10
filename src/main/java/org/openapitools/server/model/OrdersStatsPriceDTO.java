package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.OrdersStatsPriceType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Цена или скидки на товар.
 */
public class OrdersStatsPriceDTO   {

    private OrdersStatsPriceType type;
    private BigDecimal costPerItem;
    private BigDecimal total;

    /**
     * Default constructor.
     */
    public OrdersStatsPriceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsPriceDTO.
     *
     * @param type type
     * @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
     * @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
     */
    public OrdersStatsPriceDTO(
        OrdersStatsPriceType type, 
        BigDecimal costPerItem, 
        BigDecimal total
    ) {
        this.type = type;
        this.costPerItem = costPerItem;
        this.total = total;
    }



    /**
     * Get type
     * @return type
     */
    public OrdersStatsPriceType getType() {
        return type;
    }

    public void setType(OrdersStatsPriceType type) {
        this.type = type;
    }

    /**
     * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
     * @return costPerItem
     */
    public BigDecimal getCostPerItem() {
        return costPerItem;
    }

    public void setCostPerItem(BigDecimal costPerItem) {
        this.costPerItem = costPerItem;
    }

    /**
     * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsPriceDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    costPerItem: ").append(toIndentedString(costPerItem)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

