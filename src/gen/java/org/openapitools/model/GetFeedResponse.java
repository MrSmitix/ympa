package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ на запрос информации о прайс-листе.
 **/
@ApiModel(description="Ответ на запрос информации о прайс-листе.")

public class GetFeedResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FeedDTO feed;
 /**
   * Get feed
   * @return feed
  **/
  @JsonProperty("feed")
  public FeedDTO getFeed() {
    return feed;
  }

  public void setFeed(FeedDTO feed) {
    this.feed = feed;
  }

  public GetFeedResponse feed(FeedDTO feed) {
    this.feed = feed;
    return this;
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
    return Objects.equals(this.feed, getFeedResponse.feed);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

