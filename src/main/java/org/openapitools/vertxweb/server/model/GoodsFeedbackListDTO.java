package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.GoodsFeedbackDTO;

/**
 * Список отзывов о товарах. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackListDTO   {
  
  private List<GoodsFeedbackDTO> feedbacks = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackListDTO () {

  }

  public GoodsFeedbackListDTO (List<GoodsFeedbackDTO> feedbacks, ForwardScrollingPagerDTO paging) {
    this.feedbacks = feedbacks;
    this.paging = paging;
  }

    
  @JsonProperty("feedbacks")
  public List<GoodsFeedbackDTO> getFeedbacks() {
    return feedbacks;
  }
  public void setFeedbacks(List<GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
  }

    
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackListDTO goodsFeedbackListDTO = (GoodsFeedbackListDTO) o;
    return Objects.equals(feedbacks, goodsFeedbackListDTO.feedbacks) &&
        Objects.equals(paging, goodsFeedbackListDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbacks, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackListDTO {\n");
    
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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
