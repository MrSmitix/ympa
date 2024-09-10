package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubstatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация по заказу.
 */
public class OrderStateDTO   {

    private Long id;
    private OrderStatusType status;
    private OrderSubstatusType substatus;

    /**
     * Default constructor.
     */
    public OrderStateDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderStateDTO.
     *
     * @param id Идентификатор заказа.
     * @param status status
     * @param substatus substatus
     */
    public OrderStateDTO(
        Long id, 
        OrderStatusType status, 
        OrderSubstatusType substatus
    ) {
        this.id = id;
        this.status = status;
        this.substatus = substatus;
    }



    /**
     * Идентификатор заказа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderStateDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
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

