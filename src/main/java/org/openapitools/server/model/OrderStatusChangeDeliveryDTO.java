package org.openapitools.server.model;

import org.openapitools.server.model.OrderStatusChangeDeliveryDatesDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о доставке.
 */
public class OrderStatusChangeDeliveryDTO   {

    private OrderStatusChangeDeliveryDatesDTO dates;

    /**
     * Default constructor.
     */
    public OrderStatusChangeDeliveryDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderStatusChangeDeliveryDTO.
     *
     * @param dates dates
     */
    public OrderStatusChangeDeliveryDTO(
        OrderStatusChangeDeliveryDatesDTO dates
    ) {
        this.dates = dates;
    }



    /**
     * Get dates
     * @return dates
     */
    public OrderStatusChangeDeliveryDatesDTO getDates() {
        return dates;
    }

    public void setDates(OrderStatusChangeDeliveryDatesDTO dates) {
        this.dates = dates;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderStatusChangeDeliveryDTO {\n");
        
        sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

