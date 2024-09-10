package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.GoodsFeedbackCommentDTO;

/**
 * Комментарии к отзыву.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackCommentListDTO   {
  
  private List<GoodsFeedbackCommentDTO> comments = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackCommentListDTO () {

  }

  public GoodsFeedbackCommentListDTO (List<GoodsFeedbackCommentDTO> comments, ForwardScrollingPagerDTO paging) {
    this.comments = comments;
    this.paging = paging;
  }

    
  @JsonProperty("comments")
  public List<GoodsFeedbackCommentDTO> getComments() {
    return comments;
  }
  public void setComments(List<GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
  }

    
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
    return Objects.equals(comments, goodsFeedbackCommentListDTO.comments) &&
        Objects.equals(paging, goodsFeedbackCommentListDTO.paging);
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
