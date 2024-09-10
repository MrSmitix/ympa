package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Фильтр запроса комментариев отзыва. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGoodsFeedbackCommentsRequest   {
  
  private Long feedbackId;

  public GetGoodsFeedbackCommentsRequest () {

  }

  public GetGoodsFeedbackCommentsRequest (Long feedbackId) {
    this.feedbackId = feedbackId;
  }

    
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }
  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = (GetGoodsFeedbackCommentsRequest) o;
    return Objects.equals(feedbackId, getGoodsFeedbackCommentsRequest.feedbackId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsFeedbackCommentsRequest {\n");
    
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
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
