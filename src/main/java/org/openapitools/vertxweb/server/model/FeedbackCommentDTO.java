package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.FeedbackCommentAuthorDTO;

/**
 * Комментарий к отзыву на магазин.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackCommentDTO   {
  
  private Long id;
  private Long parentId;
  private String body;
  private OffsetDateTime createdAt;
  private OffsetDateTime updatedAt;
  private FeedbackCommentAuthorDTO author;
  private List<FeedbackCommentDTO> children;

  public FeedbackCommentDTO () {

  }

  public FeedbackCommentDTO (Long id, Long parentId, String body, OffsetDateTime createdAt, OffsetDateTime updatedAt, FeedbackCommentAuthorDTO author, List<FeedbackCommentDTO> children) {
    this.id = id;
    this.parentId = parentId;
    this.body = body;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.author = author;
    this.children = children;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

    
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("author")
  public FeedbackCommentAuthorDTO getAuthor() {
    return author;
  }
  public void setAuthor(FeedbackCommentAuthorDTO author) {
    this.author = author;
  }

    
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
