package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос списка прайс-листов.
 */
@ApiModel(description="Ответ на запрос списка прайс-листов.")

public class GetFeedsResponse  {
  
 /**
  * Список прайс-листов.
  */
  @ApiModelProperty(required = true, value = "Список прайс-листов.")
  @Valid
  private List<@Valid FeedDTO> feeds = new ArrayList<>();
 /**
  * Список прайс-листов.
  * @return feeds
  */
  @JsonProperty("feeds")
  @NotNull
  public List<@Valid FeedDTO> getFeeds() {
    return feeds;
  }

  /**
   * Sets the <code>feeds</code> property.
   */
 public void setFeeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
  }

  /**
   * Sets the <code>feeds</code> property.
   */
  public GetFeedsResponse feeds(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
    return this;
  }

  /**
   * Adds a new item to the <code>feeds</code> list.
   */
  public GetFeedsResponse addFeedsItem(FeedDTO feedsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

