package apimodels;

import apimodels.FeedbackCommentAuthorDTO;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Комментарий к отзыву на магазин.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackCommentDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("body")
  
  private String body;

  @JsonProperty("createdAt")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  @Valid

  private OffsetDateTime updatedAt;

  @JsonProperty("author")
  @Valid

  private FeedbackCommentAuthorDTO author;

  @JsonProperty("children")
  @Valid

  private List<@Valid FeedbackCommentDTO> children = null;

  public FeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор ответа.
   * @return id
  **/
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
  **/
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
  **/
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public FeedbackCommentDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FeedbackCommentDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return updatedAt
  **/
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FeedbackCommentDTO author(FeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  public FeedbackCommentDTO children(List<@Valid FeedbackCommentDTO> children) {
    this.children = children;
    return this;
  }

  public FeedbackCommentDTO addChildrenItem(FeedbackCommentDTO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Дочерние ответы.
   * @return children
  **/
  public List<@Valid FeedbackCommentDTO> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid FeedbackCommentDTO> children) {
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
    return Objects.equals(id, feedbackCommentDTO.id) &&
        Objects.equals(parentId, feedbackCommentDTO.parentId) &&
        Objects.equals(body, feedbackCommentDTO.body) &&
        Objects.equals(createdAt, feedbackCommentDTO.createdAt) &&
        Objects.equals(updatedAt, feedbackCommentDTO.updatedAt) &&
        Objects.equals(author, feedbackCommentDTO.author) &&
        Objects.equals(children, feedbackCommentDTO.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, body, createdAt, updatedAt, author, children);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

