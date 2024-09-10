package org.openapitools.server.model;

import org.openapitools.server.model.FeedDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос информации о прайс-листе.
 */
public class GetFeedResponse   {

    private FeedDTO feed;

    /**
     * Default constructor.
     */
    public GetFeedResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetFeedResponse.
     *
     * @param feed feed
     */
    public GetFeedResponse(
        FeedDTO feed
    ) {
        this.feed = feed;
    }



    /**
     * Get feed
     * @return feed
     */
    public FeedDTO getFeed() {
        return feed;
    }

    public void setFeed(FeedDTO feed) {
        this.feed = feed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeedResponse {\n");
        
        sb.append("    feed: ").append(toIndentedString(feed)).append("\n");
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

