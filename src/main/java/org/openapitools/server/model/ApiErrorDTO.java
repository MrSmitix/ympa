package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Общий формат ошибки.
 */
public class ApiErrorDTO   {

    private String code;
    private String message;

    /**
     * Default constructor.
     */
    public ApiErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ApiErrorDTO.
     *
     * @param code Код ошибки.
     * @param message Описание ошибки.
     */
    public ApiErrorDTO(
        String code, 
        String message
    ) {
        this.code = code;
        this.message = message;
    }



    /**
     * Код ошибки.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Описание ошибки.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiErrorDTO {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

