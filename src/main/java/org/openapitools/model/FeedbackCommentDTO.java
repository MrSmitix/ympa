package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackCommentAuthorDTO;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Комментарий к отзыву на магазин.
 */

@Schema(name = "FeedbackCommentDTO", description = "Комментарий к отзыву на магазин.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentDTO {

  private Long id;

  private Long parentId;

  private String body;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  private FeedbackCommentAuthorDTO author;

  @Valid
  private JsonNullable<List<@Valid FeedbackCommentDTO>> children = JsonNullable.<List<@Valid FeedbackCommentDTO>>undefined();

  public FeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор ответа.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор ответа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Идентификатор родительского ответа.
   * @return parentId
   */
  
  @Schema(name = "parentId", description = "Идентификатор родительского ответа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public FeedbackCommentDTO body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Текст ответа.
   * @return body
   */
  
  @Schema(name = "body", description = "Текст ответа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public FeedbackCommentDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", description = "Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public FeedbackCommentDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updatedAt", description = "Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FeedbackCommentDTO author(FeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  public FeedbackCommentDTO children(List<@Valid FeedbackCommentDTO> children) {
    this.children = JsonNullable.of(children);
    return this;
  }

  public FeedbackCommentDTO addChildrenItem(FeedbackCommentDTO childrenItem) {
    if (this.children == null || !this.children.isPresent()) {
      this.children = JsonNullable.of(new ArrayList<>());
    }
    this.children.get().add(childrenItem);
    return this;
  }

  /**
   * Дочерние ответы.
   * @return children
   */
  @Valid 
  @Schema(name = "children", description = "Дочерние ответы.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public JsonNullable<List<@Valid FeedbackCommentDTO>> getChildren() {
    return children;
  }

  public void setChildren(JsonNullable<List<@Valid FeedbackCommentDTO>> children) {
    this.children = children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackCommentDTO feedbackCommentDTO = (FeedbackCommentDTO) o;
    return Objects.equals(this.id, feedbackCommentDTO.id) &&
        Objects.equals(this.parentId, feedbackCommentDTO.parentId) &&
        Objects.equals(this.body, feedbackCommentDTO.body) &&
        Objects.equals(this.createdAt, feedbackCommentDTO.createdAt) &&
        Objects.equals(this.updatedAt, feedbackCommentDTO.updatedAt) &&
        Objects.equals(this.author, feedbackCommentDTO.author) &&
        equalsNullable(this.children, feedbackCommentDTO.children);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, body, createdAt, updatedAt, author, hashCodeNullable(children));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackCommentDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

