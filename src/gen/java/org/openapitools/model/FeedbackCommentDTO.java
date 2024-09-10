package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackCommentAuthorDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Комментарий к отзыву на магазин.
 */
@ApiModel(description="Комментарий к отзыву на магазин.")

public class FeedbackCommentDTO  {
  
 /**
  * Идентификатор ответа.
  */
  @ApiModelProperty(value = "Идентификатор ответа.")
  private Long id;

 /**
  * Идентификатор родительского ответа.
  */
  @ApiModelProperty(value = "Идентификатор родительского ответа.")
  private Long parentId;

 /**
  * Текст ответа.
  */
  @ApiModelProperty(value = "Текст ответа.")
  private String body;

 /**
  * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

 /**
  * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  */
  @ApiModelProperty(value = "Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;

  @ApiModelProperty(value = "")
  @Valid
  private FeedbackCommentAuthorDTO author;

 /**
  * Дочерние ответы.
  */
  @ApiModelProperty(value = "Дочерние ответы.")
  @Valid
  private List<@Valid FeedbackCommentDTO> children;
 /**
  * Идентификатор ответа.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public FeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Идентификатор родительского ответа.
  * @return parentId
  */
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
 public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
  public FeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
  * Текст ответа.
  * @return body
  */
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  /**
   * Sets the <code>body</code> property.
   */
 public void setBody(String body) {
    this.body = body;
  }

  /**
   * Sets the <code>body</code> property.
   */
  public FeedbackCommentDTO body(String body) {
    this.body = body;
    return this;
  }

 /**
  * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
  * @return createdAt
  */
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public FeedbackCommentDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
  * @return updatedAt
  */
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   */
  public FeedbackCommentDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

 /**
  * Get author
  * @return author
  */
  @JsonProperty("author")
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  /**
   * Sets the <code>author</code> property.
   */
 public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  /**
   * Sets the <code>author</code> property.
   */
  public FeedbackCommentDTO author(FeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

 /**
  * Дочерние ответы.
  * @return children
  */
  @JsonProperty("children")
  public List<@Valid FeedbackCommentDTO> getChildren() {
    return children;
  }

  /**
   * Sets the <code>children</code> property.
   */
 public void setChildren(List<@Valid FeedbackCommentDTO> children) {
    this.children = children;
  }

  /**
   * Sets the <code>children</code> property.
   */
  public FeedbackCommentDTO children(List<@Valid FeedbackCommentDTO> children) {
    this.children = children;
    return this;
  }

  /**
   * Adds a new item to the <code>children</code> list.
   */
  public FeedbackCommentDTO addChildrenItem(FeedbackCommentDTO childrenItem) {
    this.children.add(childrenItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

