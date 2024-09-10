/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackCommentAuthorDTO;



/**
 * Комментарий к отзыву на магазин.
 */

@ApiModel(description = "Комментарий к отзыву на магазин.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackCommentDTO   {
  
  private Long id;
  private Long parentId;
  private String body;
  private Date createdAt;
  private Date updatedAt;
  private FeedbackCommentAuthorDTO author;
  private List<FeedbackCommentDTO> children;

  /**
   * Идентификатор ответа.
   */
  public FeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор ответа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Идентификатор родительского ответа.
   */
  public FeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор родительского ответа.")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   * Текст ответа.
   */
  public FeedbackCommentDTO body(String body) {
    this.body = body;
    return this;
  }

  
  @ApiModelProperty(value = "Текст ответа.")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   */
  public FeedbackCommentDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   */
  public FeedbackCommentDTO updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   */
  public FeedbackCommentDTO author(FeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("author")
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }
  public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  /**
   * Дочерние ответы.
   */
  public FeedbackCommentDTO children(List<FeedbackCommentDTO> children) {
    this.children = children;
    return this;
  }

  
  @ApiModelProperty(value = "Дочерние ответы.")
  @JsonProperty("children")
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

