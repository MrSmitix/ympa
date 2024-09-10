package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Отзывы пользователей Яндекс Маркета об указанном магазине.
 **/
@ApiModel(description="Отзывы пользователей Яндекс Маркета об указанном магазине.")

public class FeedbackListDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

  @ApiModelProperty(required = true, value = "Список отзывов.  Содержит не более 20 отзывов. ")
  @Valid
 /**
   * Список отзывов.  Содержит не более 20 отзывов. 
  **/
  private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();
 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public FeedbackListDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Список отзывов.  Содержит не более 20 отзывов. 
   * @return feedbackList
  **/
  @JsonProperty("feedbackList")
  @NotNull
  public List<@Valid FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }

  public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }

  public FeedbackListDTO feedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
    this.feedbackList.add(feedbackListItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

