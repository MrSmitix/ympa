package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фильтр запроса комментариев отзыва. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetGoodsFeedbackCommentsRequest   {
  @JsonProperty("feedbackId")
  @NotNull

  private Long feedbackId;

  public GetGoodsFeedbackCommentsRequest feedbackId(Long feedbackId) {
    this.feedbackId = feedbackId;
    return this;
  }

   /**
   * Идентификатор отзыва. 
   * @return feedbackId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

