package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.OutletLicensesResponseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetOutletLicensesResponse   {

    private ApiResponseStatusType status;
    private OutletLicensesResponseDTO result;

    /**
     * Default constructor.
     */
    public GetOutletLicensesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOutletLicensesResponse.
     *
     * @param status status
     * @param result result
     */
    public GetOutletLicensesResponse(
        ApiResponseStatusType status, 
        OutletLicensesResponseDTO result
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
    public OutletLicensesResponseDTO getResult() {
        return result;
    }

    public void setResult(OutletLicensesResponseDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOutletLicensesResponse {\n");
        
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

