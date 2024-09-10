package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackCommentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Комментарии к отзыву.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Комментарии к отзыву.")
public class GoodsFeedbackCommentListDTO   {
  
  private List<@Valid GoodsFeedbackCommentDTO> comments = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  /**
   * Список комментариев.
   **/
  public GoodsFeedbackCommentListDTO comments(List<@Valid GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список комментариев.")
  @JsonProperty("comments")
  @NotNull
  public List<@Valid GoodsFeedbackCommentDTO> getComments() {
    return comments;
  }
  public void setComments(List<@Valid GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  public GoodsFeedbackCommentListDTO addCommentsItem(GoodsFeedbackCommentDTO commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }


  /**
   **/
  public GoodsFeedbackCommentListDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    GoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO = (GoodsFeedbackCommentListDTO) o;
    return Objects.equals(this.comments, goodsFeedbackCommentListDTO.comments) &&
        Objects.equals(this.paging, goodsFeedbackCommentListDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackCommentListDTO {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

