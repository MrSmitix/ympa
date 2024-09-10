package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о магазине.
 */
public class FeedbackShopDTO   {

    private String name;

    /**
     * Default constructor.
     */
    public FeedbackShopDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedbackShopDTO.
     *
     * @param name Название магазина.
     */
    public FeedbackShopDTO(
        String name
    ) {
        this.name = name;
    }



    /**
     * Название магазина.
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
        sb.append("class FeedbackShopDTO {\n");
        
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

