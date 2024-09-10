package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Фильтр запроса комментариев отзыва. 
 **/
@ApiModel(description = "Фильтр запроса комментариев отзыва. ")
@JsonTypeName("GetGoodsFeedbackCommentsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsFeedbackCommentsRequest   {
  private Long feedbackId;

  /**
   * Идентификатор отзыва. 
   **/
  public GetGoodsFeedbackCommentsRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор отзыва. ")
  @JsonProperty("feedbackId")
  @NotNull public Long getFeedbackId() {
    return feedbackId;
  }

  @JsonProperty("feedbackId")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

