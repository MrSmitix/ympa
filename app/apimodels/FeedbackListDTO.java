package apimodels;

import apimodels.FeedbackDTO;
import apimodels.ScrollingPagerDTO;
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
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackListDTO   {
  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("feedbackList")
  @NotNull
@Valid

  private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();

  public FeedbackListDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public FeedbackListDTO feedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
    if (this.feedbackList == null) {
      this.feedbackList = new ArrayList<>();
    }
    this.feedbackList.add(feedbackListItem);
    return this;
  }

   /**
   * Список отзывов.  Содержит не более 20 отзывов. 
   * @return feedbackList
  **/
  public List<@Valid FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }

  public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackListDTO feedbackListDTO = (FeedbackListDTO) o;
    return Objects.equals(paging, feedbackListDTO.paging) &&
        Objects.equals(feedbackList, feedbackListDTO.feedbackList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, feedbackList);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackListDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
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

