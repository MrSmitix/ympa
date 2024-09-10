package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedDTO;



/**
 * Ответ на запрос информации о прайс-листе.
 **/

@ApiModel(description = "Ответ на запрос информации о прайс-листе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetFeedResponse   {
  @JsonProperty("feed")
  private FeedDTO feed;

  /**
   **/
  public GetFeedResponse feed(FeedDTO feed) {
    this.feed = feed;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

