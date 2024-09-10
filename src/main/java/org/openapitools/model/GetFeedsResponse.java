package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос списка прайс-листов.
 */

@Schema(name = "GetFeedsResponse", description = "Ответ на запрос списка прайс-листов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetFeedsResponse {

  @Valid
  private List<@Valid FeedDTO> feeds = new ArrayList<>();

  public GetFeedsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetFeedsResponse(List<@Valid FeedDTO> feeds) {
    this.feeds = feeds;
  }

  public GetFeedsResponse feeds(List<@Valid FeedDTO> feeds) {
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
  @NotNull @Valid 
  @Schema(name = "feeds", description = "Список прайс-листов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feeds")
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

