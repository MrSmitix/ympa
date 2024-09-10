package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.GetBidsInfoResponseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * description.
 */
public class GetBidsInfoResponse   {

    private ApiResponseStatusType status;
    private GetBidsInfoResponseDTO result;

    /**
     * Default constructor.
     */
    public GetBidsInfoResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetBidsInfoResponse.
     *
     * @param status status
     * @param result result
     */
    public GetBidsInfoResponse(
        ApiResponseStatusType status, 
        GetBidsInfoResponseDTO result
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
    public GetBidsInfoResponseDTO getResult() {
        return result;
    }

    public void setResult(GetBidsInfoResponseDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBidsInfoResponse {\n");
        
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

