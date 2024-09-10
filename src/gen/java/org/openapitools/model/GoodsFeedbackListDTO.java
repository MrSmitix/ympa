package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список отзывов о товарах. 
 **/
@ApiModel(description = "Список отзывов о товарах. ")
@JsonTypeName("GoodsFeedbackListDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackListDTO   {
  private @Valid List<@Valid GoodsFeedbackDTO> feedbacks = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Список отзывов.
   **/
  public GoodsFeedbackListDTO feedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список отзывов.")
  @JsonProperty("feedbacks")
  @NotNull @Valid public List<@Valid GoodsFeedbackDTO> getFeedbacks() {
    return feedbacks;
  }

  @JsonProperty("feedbacks")
  public void setFeedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
  }

  public GoodsFeedbackListDTO addFeedbacksItem(GoodsFeedbackDTO feedbacksItem) {
    if (this.feedbacks == null) {
      this.feedbacks = new ArrayList<>();
    }

    this.feedbacks.add(feedbacksItem);
    return this;
  }

  public GoodsFeedbackListDTO removeFeedbacksItem(GoodsFeedbackDTO feedbacksItem) {
    if (feedbacksItem != null && this.feedbacks != null) {
      this.feedbacks.remove(feedbacksItem);
    }

    return this;
  }
  /**
   **/
  public GoodsFeedbackListDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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

