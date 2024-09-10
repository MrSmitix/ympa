package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.OrdersShipmentInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetShipmentOrdersInfoResponse   {

    private ApiResponseStatusType status;
    private OrdersShipmentInfoDTO result;

    /**
     * Default constructor.
     */
    public GetShipmentOrdersInfoResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetShipmentOrdersInfoResponse.
     *
     * @param status status
     * @param result result
     */
    public GetShipmentOrdersInfoResponse(
        ApiResponseStatusType status, 
        OrdersShipmentInfoDTO result
    ) {
        this.status = status;
        this.result = result;
    }



    /**
     * Get status
     * @return status
     */
    public ApiResponseStatusType getStatus() {
        return status;
    }

    public void setStatus(ApiResponseStatusType status) {
        this.status = status;
    }

    /**
     * Get result
     * @return result
     */
    public OrdersShipmentInfoDTO getResult() {
        return result;
    }

    public void setResult(OrdersShipmentInfoDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetShipmentOrdersInfoResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

