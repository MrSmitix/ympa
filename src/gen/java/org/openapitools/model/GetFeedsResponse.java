package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedDTO;

/**
 * Ответ на запрос списка прайс-листов.
 */
@ApiModel(description = "Ответ на запрос списка прайс-листов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetFeedsResponse   {
  @JsonProperty("feeds")
  private List<@Valid FeedDTO> feeds = new ArrayList<>();

  public GetFeedsResponse feeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
    return this;
  }

  public GetFeedsResponse addFeedsItem(FeedDTO feedsItem) {
    this.feeds.add(feedsItem);
    return this;
  }

   /**
   * Список прайс-листов.
   * @return feeds
  **/
  @ApiModelProperty(required = true, value = "Список прайс-листов.")
  public List<@Valid FeedDTO> getFeeds() {
    return feeds;
  }

  public void setFeeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeedsResponse getFeedsResponse = (GetFeedsResponse) o;
    return Objects.equals(this.feeds, getFeedsResponse.feeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeds);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

