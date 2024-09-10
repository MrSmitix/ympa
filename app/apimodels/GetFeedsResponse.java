package apimodels;

import apimodels.FeedDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ответ на запрос списка прайс-листов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetFeedsResponse   {
  @JsonProperty("feeds")
  @NotNull
@Valid

  private List<@Valid FeedDTO> feeds = new ArrayList<>();

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
  **/
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
    return Objects.equals(feeds, getFeedsResponse.feeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

