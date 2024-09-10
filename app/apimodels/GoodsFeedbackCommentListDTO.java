package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.GoodsFeedbackCommentDTO;
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
 * Комментарии к отзыву.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackCommentListDTO   {
  @JsonProperty("comments")
  @NotNull
@Valid

  private List<@Valid GoodsFeedbackCommentDTO> comments = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackCommentListDTO comments(List<@Valid GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  public GoodsFeedbackCommentListDTO addCommentsItem(GoodsFeedbackCommentDTO commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Список комментариев.
   * @return comments
  **/
  public List<@Valid GoodsFeedbackCommentDTO> getComments() {
    return comments;
  }

  public void setComments(List<@Valid GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  public GoodsFeedbackCommentListDTO paging(ForwardScrollingPagerDTO paging) {
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
    GoodsFeedbackCommentListDTO goodsFeedbackCommentListDTO = (GoodsFeedbackCommentListDTO) o;
    return Objects.equals(comments, goodsFeedbackCommentListDTO.comments) &&
        Objects.equals(paging, goodsFeedbackCommentListDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, paging);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

