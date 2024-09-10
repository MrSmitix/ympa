package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ApiResponseStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Стандартная обертка для ответов сервера.
 */
public class ModelApiResponse   {

    private ApiResponseStatusType status;

    /**
     * Default constructor.
     */
    public ModelApiResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ModelApiResponse.
     *
     * @param status status
     */
    public ModelApiResponse(
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
        sb.append("class ModelApiResponse {\n");
        
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

