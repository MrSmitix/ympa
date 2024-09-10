package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.FeedDTO;

/**
 * Ответ на запрос информации о прайс-листе.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFeedResponse   {
  
  private FeedDTO feed;

  public GetFeedResponse () {

  }

  public GetFeedResponse (FeedDTO feed) {
    this.feed = feed;
  }

    
  @JsonProperty("feed")
  public FeedDTO getFeed() {
    return feed;
  }
  public void setFeed(FeedDTO feed) {
    this.feed = feed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedResponse getFeedResponse = (GetFeedResponse) o;
    return Objects.equals(feed, getFeedResponse.feed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feed);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
