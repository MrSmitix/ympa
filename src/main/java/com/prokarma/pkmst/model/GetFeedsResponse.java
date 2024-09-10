package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FeedDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ответ на запрос списка прайс-листов.
 */
@ApiModel(description = "Ответ на запрос списка прайс-листов.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetFeedsResponse   {
  @JsonProperty("feeds")
  
  private List<FeedDTO> feeds = new ArrayList<>();

  public GetFeedsResponse feeds(List<FeedDTO> feeds) {
    this.feeds = feeds;
    return this;
  }

  public GetFeedsResponse addFeedsItem(FeedDTO feedsItem) {
    if (this.feeds == null) {
      this.feeds = new ArrayList<>();
    }
    this.feeds.add(feedsItem);
    return this;
  }

  /**
   * Список прайс-листов.
   * @return feeds
   */
  @ApiModelProperty(required = true, value = "Список прайс-листов.")
  public List<FeedDTO> getFeeds() {
    return feeds;
  }

  public void setFeeds(List<FeedDTO> feeds) {
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

