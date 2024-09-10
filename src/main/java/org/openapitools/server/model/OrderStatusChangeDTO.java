package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubstatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Заказ.
 */
public class OrderStatusChangeDTO   {

    private OrderStatusType status;
    private OrderSubstatusType substatus;
    private OrderStatusChangeDeliveryDTO delivery;

    /**
     * Default constructor.
     */
    public OrderStatusChangeDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderStatusChangeDTO.
     *
     * @param status status
     * @param substatus substatus
     * @param delivery delivery
     */
    public OrderStatusChangeDTO(
        OrderStatusType status, 
        OrderSubstatusType substatus, 
        OrderStatusChangeDeliveryDTO delivery
    ) {
        this.status = status;
        this.substatus = substatus;
        this.delivery = delivery;
    }



    /**
     * Get status
     * @return status
     */
    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    /**
     * Get substatus
     * @return substatus
     */
    public OrderSubstatusType getSubstatus() {
        return substatus;
    }

    public void setSubstatus(OrderSubstatusType substatus) {
        this.substatus = substatus;
    }

    /**
     * Get delivery
     * @return delivery
     */
    public OrderStatusChangeDeliveryDTO getDelivery() {
        return delivery;
    }

    public void setDelivery(OrderStatusChangeDeliveryDTO delivery) {
        this.delivery = delivery;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderStatusChangeDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
        sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

