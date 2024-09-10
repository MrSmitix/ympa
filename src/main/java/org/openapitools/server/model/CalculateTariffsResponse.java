package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import org.openapitools.server.model.CalculateTariffsResponseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CalculateTariffsResponse   {

    private ApiResponseStatusType status;
    private CalculateTariffsResponseDTO result;

    /**
     * Default constructor.
     */
    public CalculateTariffsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsResponse.
     *
     * @param status status
     * @param result result
     */
    public CalculateTariffsResponse(
        ApiResponseStatusType status, 
        CalculateTariffsResponseDTO result
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
    public CalculateTariffsResponseDTO getResult() {
        return result;
    }

    public void setResult(CalculateTariffsResponseDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalculateTariffsResponse {\n");
        
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

