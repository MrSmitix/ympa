package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.GoodsFeedbackDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список отзывов о товарах. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackListDTO   {
  @JsonProperty("feedbacks")
  @NotNull
@Valid

  private List<@Valid GoodsFeedbackDTO> feedbacks = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackListDTO feedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  public GoodsFeedbackListDTO addFeedbacksItem(GoodsFeedbackDTO feedbacksItem) {
    if (this.feedbacks == null) {
      this.feedbacks = new ArrayList<>();
    }
    this.feedbacks.add(feedbacksItem);
    return this;
  }

   /**
   * Список отзывов.
   * @return feedbacks
  **/
  public List<@Valid GoodsFeedbackDTO> getFeedbacks() {
    return feedbacks;
  }

  public void setFeedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
  }

  public GoodsFeedbackListDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

