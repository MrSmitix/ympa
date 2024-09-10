package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Пустой ответ сервера.
 */
public class EmptyApiResponse   {

    private ApiResponseStatusType status;

    /**
     * Default constructor.
     */
    public EmptyApiResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create EmptyApiResponse.
     *
     * @param status status
     */
    public EmptyApiResponse(
        ApiResponseStatusType status
    ) {
        this.status = status;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmptyApiResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

