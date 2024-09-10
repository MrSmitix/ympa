package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ApiErrorDTO;
import org.openapitools.server.model.ApiResponseStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрашиваемый ресурс не найден.
 */
public class ApiNotFoundErrorResponse   {

    private ApiResponseStatusType status;
    private List<@Valid ApiErrorDTO> errors;

    /**
     * Default constructor.
     */
    public ApiNotFoundErrorResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ApiNotFoundErrorResponse.
     *
     * @param status status
     * @param errors Список ошибок.
     */
    public ApiNotFoundErrorResponse(
        ApiResponseStatusType status, 
        List<@Valid ApiErrorDTO> errors
    ) {
        this.status = status;
        this.errors = errors;
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
     * Список ошибок.
     * @return errors
     */
    public List<@Valid ApiErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid ApiErrorDTO> errors) {
        this.errors = errors;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiNotFoundErrorResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

