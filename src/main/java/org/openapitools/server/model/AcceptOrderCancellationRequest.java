package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderCancellationReasonType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AcceptOrderCancellationRequest   {

    private Boolean accepted;
    private OrderCancellationReasonType reason;

    /**
     * Default constructor.
     */
    public AcceptOrderCancellationRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AcceptOrderCancellationRequest.
     *
     * @param accepted Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
     * @param reason reason
     */
    public AcceptOrderCancellationRequest(
        Boolean accepted, 
        OrderCancellationReasonType reason
    ) {
        this.accepted = accepted;
        this.reason = reason;
    }



    /**
     * Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
     * @return accepted
     */
    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    /**
     * Get reason
     * @return reason
     */
    public OrderCancellationReasonType getReason() {
        return reason;
    }

    public void setReason(OrderCancellationReasonType reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptOrderCancellationRequest {\n");
        
        sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

