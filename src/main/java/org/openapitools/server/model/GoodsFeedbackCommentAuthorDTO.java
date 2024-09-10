package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.GoodsFeedbackCommentAuthorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об авторе комментария.
 */
public class GoodsFeedbackCommentAuthorDTO   {

    private GoodsFeedbackCommentAuthorType type;
    private String name;

    /**
     * Default constructor.
     */
    public GoodsFeedbackCommentAuthorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GoodsFeedbackCommentAuthorDTO.
     *
     * @param type type
     * @param name Имя автора или название кабинета.
     */
    public GoodsFeedbackCommentAuthorDTO(
        GoodsFeedbackCommentAuthorType type, 
        String name
    ) {
        this.type = type;
        this.name = name;
    }



    /**
     * Get type
     * @return type
     */
    public GoodsFeedbackCommentAuthorType getType() {
        return type;
    }

    public void setType(GoodsFeedbackCommentAuthorType type) {
        this.type = type;
    }

    /**
     * Имя автора или название кабинета.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoodsFeedbackCommentAuthorDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

