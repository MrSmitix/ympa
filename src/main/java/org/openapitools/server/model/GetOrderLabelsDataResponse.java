package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.OrderLabelDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ с информацией для печати ярлыков.
 */
public class GetOrderLabelsDataResponse   {

    private ApiResponseStatusType status;
    private OrderLabelDTO result;

    /**
     * Default constructor.
     */
    public GetOrderLabelsDataResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOrderLabelsDataResponse.
     *
     * @param status status
     * @param result result
     */
    public GetOrderLabelsDataResponse(
        ApiResponseStatusType status, 
        OrderLabelDTO result
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
    public OrderLabelDTO getResult() {
        return result;
    }

    public void setResult(OrderLabelDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrderLabelsDataResponse {\n");
        
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

