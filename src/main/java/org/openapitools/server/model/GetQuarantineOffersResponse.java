package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.GetQuarantineOffersResultDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос списка товаров в карантине.
 */
public class GetQuarantineOffersResponse   {

    private ApiResponseStatusType status;
    private GetQuarantineOffersResultDTO result;

    /**
     * Default constructor.
     */
    public GetQuarantineOffersResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetQuarantineOffersResponse.
     *
     * @param status status
     * @param result result
     */
    public GetQuarantineOffersResponse(
        ApiResponseStatusType status, 
        GetQuarantineOffersResultDTO result
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
    public GetQuarantineOffersResultDTO getResult() {
        return result;
    }

    public void setResult(GetQuarantineOffersResultDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQuarantineOffersResponse {\n");
        
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

