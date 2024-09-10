package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderStatusType;
import org.openapitools.server.model.OrderSubstatusType;
import org.openapitools.server.model.OrderUpdateStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список заказов.
 */
public class UpdateOrderStatusDTO   {

    private Long id;
    private OrderStatusType status;
    private OrderSubstatusType substatus;
    private OrderUpdateStatusType updateStatus;
    private String errorDetails;

    /**
     * Default constructor.
     */
    public UpdateOrderStatusDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStatusDTO.
     *
     * @param id Идентификатор заказа.
     * @param status status
     * @param substatus substatus
     * @param updateStatus updateStatus
     * @param errorDetails Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. 
     */
    public UpdateOrderStatusDTO(
        Long id, 
        OrderStatusType status, 
        OrderSubstatusType substatus, 
        OrderUpdateStatusType updateStatus, 
        String errorDetails
    ) {
        this.id = id;
        this.status = status;
        this.substatus = substatus;
        this.updateStatus = updateStatus;
        this.errorDetails = errorDetails;
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
     * Get updateStatus
     * @return updateStatus
     */
    public OrderUpdateStatusType getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
     * @return errorDetails
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderStatusDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
        sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

