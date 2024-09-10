package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ForwardScrollingPagerDTO;
import com.prokarma.pkmst.model.GoodsFeedbackDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список отзывов о товарах. 
 */
@ApiModel(description = "Список отзывов о товарах. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackListDTO   {
  @JsonProperty("feedbacks")
  
  private List<GoodsFeedbackDTO> feedbacks = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackListDTO feedbacks(List<GoodsFeedbackDTO> feedbacks) {
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
  @ApiModelProperty(required = true, value = "Список отзывов.")
  public List<GoodsFeedbackDTO> getFeedbacks() {
    return feedbacks;
  }

  public void setFeedbacks(List<GoodsFeedbackDTO> feedbacks) {
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
  @ApiModelProperty(value = "")
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

