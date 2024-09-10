package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос списка прайс-листов.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос списка прайс-листов.")
public class GetFeedsResponse   {
  
  private List<@Valid FeedDTO> feeds = new ArrayList<>();

  /**
   * Список прайс-листов.
   **/
  public GetFeedsResponse feeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список прайс-листов.")
  @JsonProperty("feeds")
  @NotNull
  public List<@Valid FeedDTO> getFeeds() {
    return feeds;
  }
  public void setFeeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
  }

  public GetFeedsResponse addFeedsItem(FeedDTO feedsItem) {
    if (this.feeds == null) {
      this.feeds = new ArrayList<>();
    }
    this.feeds.add(feedsItem);
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

