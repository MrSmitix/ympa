package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтр запроса комментариев отзыва. 
 **/
@ApiModel(description="Фильтр запроса комментариев отзыва. ")

public class GetGoodsFeedbackCommentsRequest  {
  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
 /**
   * Идентификатор отзыва. 
  **/
  private Long feedbackId;
 /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
  @JsonProperty("feedbackId")
  public Long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
  }

  public GetGoodsFeedbackCommentsRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
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
    GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = (GetGoodsFeedbackCommentsRequest) o;
    return Objects.equals(this.feedbackId, getGoodsFeedbackCommentsRequest.feedbackId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

