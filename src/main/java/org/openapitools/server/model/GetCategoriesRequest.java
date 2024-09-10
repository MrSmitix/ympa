package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.LanguageType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры запроса категорий. 
 */
public class GetCategoriesRequest   {

    private LanguageType language;

    /**
     * Default constructor.
     */
    public GetCategoriesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCategoriesRequest.
     *
     * @param language language
     */
    public GetCategoriesRequest(
        LanguageType language
    ) {
        this.language = language;
    }



    /**
     * Get language
     * @return language
     */
    public LanguageType getLanguage() {
        return language;
    }

    public void setLanguage(LanguageType language) {
        this.language = language;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCategoriesRequest {\n");
        
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

