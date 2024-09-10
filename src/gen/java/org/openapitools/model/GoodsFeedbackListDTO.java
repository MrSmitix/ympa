package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список отзывов о товарах. 
 */
@ApiModel(description="Список отзывов о товарах. ")

public class GoodsFeedbackListDTO  {
  
 /**
  * Список отзывов.
  */
  @ApiModelProperty(required = true, value = "Список отзывов.")
  @Valid
  private List<@Valid GoodsFeedbackDTO> feedbacks = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Список отзывов.
  * @return feedbacks
  */
  @JsonProperty("feedbacks")
  @NotNull
  public List<@Valid GoodsFeedbackDTO> getFeedbacks() {
    return feedbacks;
  }

  /**
   * Sets the <code>feedbacks</code> property.
   */
 public void setFeedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
  }

  /**
   * Sets the <code>feedbacks</code> property.
   */
  public GoodsFeedbackListDTO feedbacks(List<@Valid GoodsFeedbackDTO> feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  /**
   * Adds a new item to the <code>feedbacks</code> list.
   */
  public GoodsFeedbackListDTO addFeedbacksItem(GoodsFeedbackDTO feedbacksItem) {
    this.feedbacks.add(feedbacksItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public GoodsFeedbackListDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

