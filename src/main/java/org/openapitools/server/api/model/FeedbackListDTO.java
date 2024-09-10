package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FeedbackDTO;
import org.openapitools.server.api.model.ScrollingPagerDTO;

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackListDTO   {
  
  private ScrollingPagerDTO paging;
  private List<FeedbackDTO> feedbackList = new ArrayList<>();

  public FeedbackListDTO () {

  }

  public FeedbackListDTO (ScrollingPagerDTO paging, List<FeedbackDTO> feedbackList) {
    this.paging = paging;
    this.feedbackList = feedbackList;
  }

    
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

    
  @JsonProperty("feedbackList")
  public List<FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }
  public void setFeedbackList(List<FeedbackDTO> feedbackList) {
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
