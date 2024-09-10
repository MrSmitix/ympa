package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Идентификаторы отзывов.
 */

@Schema(name = "SkipGoodsFeedbackReactionRequest", description = "Идентификаторы отзывов.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SkipGoodsFeedbackReactionRequest {

  @Valid
  private Set<Long> feedbackIds = new LinkedHashSet<>();

  public SkipGoodsFeedbackReactionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SkipGoodsFeedbackReactionRequest(Set<Long> feedbackIds) {
    this.feedbackIds = feedbackIds;
  }

  public SkipGoodsFeedbackReactionRequest feedbackIds(Set<Long> feedbackIds) {
    this.feedbackIds = feedbackIds;
    return this;
  }

  public SkipGoodsFeedbackReactionRequest addFeedbackIdsItem(Long feedbackIdsItem) {
    if (this.feedbackIds == null) {
      this.feedbackIds = new LinkedHashSet<>();
    }
    this.feedbackIds.add(feedbackIdsItem);
    return this;
  }

  /**
   * Список идентификаторов отзывов, на которые магазин не будет отвечать.
   * @return feedbackIds
   */
  @NotNull @Size(min = 1, max = 50) 
  @Schema(name = "feedbackIds", description = "Список идентификаторов отзывов, на которые магазин не будет отвечать.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feedbackIds")
  public Set<Long> getFeedbackIds() {
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

