package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackDTO;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

@Schema(name = "FeedbackListDTO", description = "Отзывы пользователей Яндекс Маркета об указанном магазине.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackListDTO {

  private ScrollingPagerDTO paging;

  @Valid
  private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();

  public FeedbackListDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeedbackListDTO(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }

  public FeedbackListDTO paging(ScrollingPagerDTO paging) {
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
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public FeedbackListDTO feedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
    if (this.feedbackList == null) {
      this.feedbackList = new ArrayList<>();
    }
    this.feedbackList.add(feedbackListItem);
    return this;
  }

  /**
   * Список отзывов.  Содержит не более 20 отзывов. 
   * @return feedbackList
   */
  @NotNull @Valid 
  @Schema(name = "feedbackList", description = "Список отзывов.  Содержит не более 20 отзывов. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feedbackList")
  public List<@Valid FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }

  public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackListDTO feedbackListDTO = (FeedbackListDTO) o;
    return Objects.equals(this.paging, feedbackListDTO.paging) &&
        Objects.equals(this.feedbackList, feedbackListDTO.feedbackList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, feedbackList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackListDTO {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
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

