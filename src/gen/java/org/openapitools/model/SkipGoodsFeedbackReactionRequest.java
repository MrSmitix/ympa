package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Идентификаторы отзывов.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SkipGoodsFeedbackReactionRequest   {
  
  private Set<Long> feedbackIds = new LinkedHashSet<>();

  /**
   * Список идентификаторов отзывов, на которые магазин не будет отвечать.
   **/
  
  @ApiModelProperty(required = true, value = "Список идентификаторов отзывов, на которые магазин не будет отвечать.")
  @JsonProperty("feedbackIds")
  @NotNull
 @Size(min=1,max=50)  public Set<Long> getFeedbackIds() {
    return feedbackIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setFeedbackIds(Set<Long> feedbackIds) {
    this.feedbackIds = feedbackIds;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

