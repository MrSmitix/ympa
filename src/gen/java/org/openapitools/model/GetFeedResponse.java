package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Ответ на запрос информации о прайс-листе.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetFeedResponse   {
  
  private FeedDTO feed;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("feed")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

