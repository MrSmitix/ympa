package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ссылка на следующую страницу. 
 */
public class ForwardScrollingPagerDTO   {

    private String nextPageToken;

    /**
     * Default constructor.
     */
    public ForwardScrollingPagerDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ForwardScrollingPagerDTO.
     *
     * @param nextPageToken Идентификатор следующей страницы результатов.
     */
    public ForwardScrollingPagerDTO(
        String nextPageToken
    ) {
        this.nextPageToken = nextPageToken;
    }



    /**
     * Идентификатор следующей страницы результатов.
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForwardScrollingPagerDTO {\n");
        
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

