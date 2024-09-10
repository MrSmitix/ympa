package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class VerifyOrderEacRequest   {

    private String code;

    /**
     * Default constructor.
     */
    public VerifyOrderEacRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create VerifyOrderEacRequest.
     *
     * @param code Код для подтверждения ЭАПП.
     */
    public VerifyOrderEacRequest(
        String code
    ) {
        this.code = code;
    }



    /**
     * Код для подтверждения ЭАПП.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyOrderEacRequest {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

