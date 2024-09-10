package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderDeliveryDateDTO;
import org.openapitools.server.model.OrderDeliveryDateReasonType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SetOrderDeliveryDateRequest   {

    private OrderDeliveryDateDTO dates;
    private OrderDeliveryDateReasonType reason;

    /**
     * Default constructor.
     */
    public SetOrderDeliveryDateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetOrderDeliveryDateRequest.
     *
     * @param dates dates
     * @param reason reason
     */
    public SetOrderDeliveryDateRequest(
        OrderDeliveryDateDTO dates, 
        OrderDeliveryDateReasonType reason
    ) {
        this.dates = dates;
        this.reason = reason;
    }



    /**
     * Get dates
     * @return dates
     */
    public OrderDeliveryDateDTO getDates() {
        return dates;
    }

    public void setDates(OrderDeliveryDateDTO dates) {
        this.dates = dates;
    }

    /**
     * Get reason
     * @return reason
     */
    public OrderDeliveryDateReasonType getReason() {
        return reason;
    }

    public void setReason(OrderDeliveryDateReasonType reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOrderDeliveryDateRequest {\n");
        
        sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

