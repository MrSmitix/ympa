package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о страницах результатов.
 */
public class ScrollingPagerDTO   {

    private String nextPageToken;
    private String prevPageToken;

    /**
     * Default constructor.
     */
    public ScrollingPagerDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ScrollingPagerDTO.
     *
     * @param nextPageToken Идентификатор следующей страницы результатов.
     * @param prevPageToken Идентификатор предыдущей страницы результатов.
     */
    public ScrollingPagerDTO(
        String nextPageToken, 
        String prevPageToken
    ) {
        this.nextPageToken = nextPageToken;
        this.prevPageToken = prevPageToken;
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
     * Идентификатор предыдущей страницы результатов.
     * @return prevPageToken
     */
    public String getPrevPageToken() {
        return prevPageToken;
    }

    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrollingPagerDTO {\n");
        
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
        sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
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

