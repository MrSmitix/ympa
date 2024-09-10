package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackCommentDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Комментарии к отзыву.
 */

@Schema(name = "GoodsFeedbackCommentListDTO", description = "Комментарии к отзыву.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentListDTO {

  @Valid
  private List<@Valid GoodsFeedbackCommentDTO> comments = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public GoodsFeedbackCommentListDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsFeedbackCommentListDTO(List<@Valid GoodsFeedbackCommentDTO> comments) {
    this.comments = comments;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "comments", description = "Список комментариев.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comments")
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

