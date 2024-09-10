package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FeedbackCommentAuthorDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Комментарий к отзыву на магазин.
 */
@ApiModel(description = "Комментарий к отзыву на магазин.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("parentId")
  private Long parentId;

  @JsonProperty("body")
  private String body;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt;

  @JsonProperty("author")
  private FeedbackCommentAuthorDTO author;

  @JsonProperty("children")
  
  private List<FeedbackCommentDTO> children = null;

  public FeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор ответа.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор ответа.")
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
  @ApiModelProperty(value = "Идентификатор родительского ответа.")
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
  @ApiModelProperty(value = "Текст ответа.")
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
   */
  @ApiModelProperty(value = "Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
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
   */
  @ApiModelProperty(value = "Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
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
   */
  @ApiModelProperty(value = "")
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  public FeedbackCommentDTO children(List<FeedbackCommentDTO> children) {
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
   */
  @ApiModelProperty(value = "Дочерние ответы.")
  public List<FeedbackCommentDTO> getChildren() {
    return children;
  }

  public void setChildren(List<FeedbackCommentDTO> children) {
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
        Objects.equals(this.children, feedbackCommentDTO.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, body, createdAt, updatedAt, author, children);
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

