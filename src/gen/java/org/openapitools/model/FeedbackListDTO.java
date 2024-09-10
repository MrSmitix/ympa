package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Отзывы пользователей Яндекс Маркета об указанном магазине.")
public class FeedbackListDTO   {
  
  private ScrollingPagerDTO paging;

  private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();

  /**
   **/
  public FeedbackListDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }


  /**
   * Список отзывов.  Содержит не более 20 отзывов. 
   **/
  public FeedbackListDTO feedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список отзывов.  Содержит не более 20 отзывов. ")
  @JsonProperty("feedbackList")
  @NotNull
  public List<@Valid FeedbackDTO> getFeedbackList() {
    return feedbackList;
  }
  public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
    this.feedbackList = feedbackList;
  }

  public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
    if (this.feedbackList == null) {
      this.feedbackList = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

