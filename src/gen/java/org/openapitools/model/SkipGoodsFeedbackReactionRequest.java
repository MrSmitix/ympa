package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Идентификаторы отзывов.
 **/
@ApiModel(description="Идентификаторы отзывов.")

public class SkipGoodsFeedbackReactionRequest  {
  
  @ApiModelProperty(required = true, value = "Список идентификаторов отзывов, на которые магазин не будет отвечать.")
 /**
   * Список идентификаторов отзывов, на которые магазин не будет отвечать.
  **/
  private Set<Long> feedbackIds = new LinkedHashSet<>();
 /**
   * Список идентификаторов отзывов, на которые магазин не будет отвечать.
   * @return feedbackIds
  **/
  @JsonProperty("feedbackIds")
  @NotNull
 @Size(min=1,max=50)  public Set<Long> getFeedbackIds() {
    return feedbackIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setFeedbackIds(Set<Long> feedbackIds) {
    this.feedbackIds = feedbackIds;
  }

  public SkipGoodsFeedbackReactionRequest feedbackIds(Set<Long> feedbackIds) {
    this.feedbackIds = feedbackIds;
    return this;
  }

  public SkipGoodsFeedbackReactionRequest addFeedbackIdsItem(Long feedbackIdsItem) {
    this.feedbackIds.add(feedbackIdsItem);
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
    SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = (SkipGoodsFeedbackReactionRequest) o;
    return Objects.equals(this.feedbackIds, skipGoodsFeedbackReactionRequest.feedbackIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkipGoodsFeedbackReactionRequest {\n");
    
    sb.append("    feedbackIds: ").append(toIndentedString(feedbackIds)).append("\n");
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

