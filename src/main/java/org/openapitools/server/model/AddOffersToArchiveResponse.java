package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AddOffersToArchiveDTO;
import org.openapitools.server.model.ApiResponseStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Результат архивации товаров.
 */
public class AddOffersToArchiveResponse   {

    private ApiResponseStatusType status;
    private AddOffersToArchiveDTO result;

    /**
     * Default constructor.
     */
    public AddOffersToArchiveResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create AddOffersToArchiveResponse.
     *
     * @param status status
     * @param result result
     */
    public AddOffersToArchiveResponse(
        ApiResponseStatusType status, 
        AddOffersToArchiveDTO result
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
    public AddOffersToArchiveDTO getResult() {
        return result;
    }

    public void setResult(AddOffersToArchiveDTO result) {
        this.result = result;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOffersToArchiveResponse {\n");
        
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

