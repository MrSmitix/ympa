package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о прайс-листе.
 */
public class FeedIndexLogsFeedDTO   {

    private Long id;

    /**
     * Default constructor.
     */
    public FeedIndexLogsFeedDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedIndexLogsFeedDTO.
     *
     * @param id Идентификатор прайс-листа.
     */
    public FeedIndexLogsFeedDTO(
        Long id
    ) {
        this.id = id;
    }



    /**
     * Идентификатор прайс-листа.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedIndexLogsFeedDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

