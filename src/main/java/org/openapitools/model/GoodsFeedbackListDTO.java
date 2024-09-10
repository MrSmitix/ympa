package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список отзывов о товарах. 
 */

@Schema(name = "GoodsFeedbackListDTO", description = "Список отзывов о товарах. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackListDTO {

  @Valid
  private List<@Valid GoodsFeedbackDTO> feedbacks = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackListDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsFeedbackListDTO(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "feedbacks", description = "Список отзывов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feedbacks")
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
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.feedbacks, goodsFeedbackListDTO.feedbacks) &&
        Objects.equals(this.paging, goodsFeedbackListDTO.paging);
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

