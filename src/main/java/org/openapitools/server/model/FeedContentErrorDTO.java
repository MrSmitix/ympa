package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FeedContentErrorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. 
 */
public class FeedContentErrorDTO   {

    private FeedContentErrorType type;

    /**
     * Default constructor.
     */
    public FeedContentErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedContentErrorDTO.
     *
     * @param type type
     */
    public FeedContentErrorDTO(
        FeedContentErrorType type
    ) {
        this.type = type;
    }



    /**
     * Get type
     * @return type
     */
    public FeedContentErrorType getType() {
        return type;
    }

    public void setType(FeedContentErrorType type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedContentErrorDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

