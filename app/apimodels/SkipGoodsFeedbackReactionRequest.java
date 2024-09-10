package apimodels;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Идентификаторы отзывов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SkipGoodsFeedbackReactionRequest   {
  @JsonProperty("feedbackIds")
  @NotNull
@Size(min=1,max=50)

  private Set<Long> feedbackIds = new LinkedHashSet<>();

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
  **/
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
    return Objects.equals(feedbackIds, skipGoodsFeedbackReactionRequest.feedbackIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

