package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FeedDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ответ на запрос списка прайс-листов.
 */
public class GetFeedsResponse   {

    private List<@Valid FeedDTO> feeds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetFeedsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetFeedsResponse.
     *
     * @param feeds Список прайс-листов.
     */
    public GetFeedsResponse(
        List<@Valid FeedDTO> feeds
    ) {
        this.feeds = feeds;
    }



    /**
     * Список прайс-листов.
     * @return feeds
     */
    public List<@Valid FeedDTO> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<@Valid FeedDTO> feeds) {
        this.feeds = feeds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFeedsResponse {\n");
        
        sb.append("    feeds: ").append(toIndentedString(feeds)).append("\n");
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

