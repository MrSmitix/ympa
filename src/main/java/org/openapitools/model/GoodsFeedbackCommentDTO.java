package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.model.GoodsFeedbackCommentStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Комментарий к отзыву.
 */

@Schema(name = "GoodsFeedbackCommentDTO", description = "Комментарий к отзыву.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentDTO {

  private Long id;

  private String text;

  private Boolean canModify;

  private Long parentId;

  private GoodsFeedbackCommentAuthorDTO author;

  private GoodsFeedbackCommentStatusType status;

  public GoodsFeedbackCommentDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsFeedbackCommentDTO(Long id, String text, GoodsFeedbackCommentAuthorDTO author, GoodsFeedbackCommentStatusType status) {
    this.id = id;
    this.text = text;
    this.author = author;
    this.status = status;
  }

  public GoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор комментария к отзыву. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GoodsFeedbackCommentDTO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст комментария.
   * @return text
   */
  @NotNull @Size(min = 1, max = 4096) 
  @Schema(name = "text", description = "Текст комментария.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GoodsFeedbackCommentDTO canModify(Boolean canModify) {
    this.canModify = canModify;
    return this;
  }

  /**
   * Может ли продавец изменять комментарий или удалять его.
   * @return canModify
   */
  
  @Schema(name = "canModify", description = "Может ли продавец изменять комментарий или удалять его.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canModify")
  public Boolean getCanModify() {
    return canModify;
  }

  public void setCanModify(Boolean canModify) {
    this.canModify = canModify;
  }

  public GoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return parentId
   */
  
  @Schema(name = "parentId", description = "Идентификатор комментария к отзыву. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public GoodsFeedbackCommentDTO author(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @NotNull @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("author")
  public GoodsFeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  public GoodsFeedbackCommentDTO status(GoodsFeedbackCommentStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public GoodsFeedbackCommentStatusType getStatus() {
    return status;
  }

  public void setStatus(GoodsFeedbackCommentStatusType status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsFeedbackCommentDTO goodsFeedbackCommentDTO = (GoodsFeedbackCommentDTO) o;
    return Objects.equals(this.id, goodsFeedbackCommentDTO.id) &&
        Objects.equals(this.text, goodsFeedbackCommentDTO.text) &&
        Objects.equals(this.canModify, goodsFeedbackCommentDTO.canModify) &&
        Objects.equals(this.parentId, goodsFeedbackCommentDTO.parentId) &&
        Objects.equals(this.author, goodsFeedbackCommentDTO.author) &&
        Objects.equals(this.status, goodsFeedbackCommentDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, canModify, parentId, author, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsFeedbackCommentDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

