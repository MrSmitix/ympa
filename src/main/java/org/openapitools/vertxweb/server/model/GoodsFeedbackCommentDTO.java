package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.vertxweb.server.model.GoodsFeedbackCommentStatusType;

/**
 * Комментарий к отзыву.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsFeedbackCommentDTO   {
  
  private Long id;
  private String text;
  private Boolean canModify;
  private Long parentId;
  private GoodsFeedbackCommentAuthorDTO author;
  private GoodsFeedbackCommentStatusType status;

  public GoodsFeedbackCommentDTO () {

  }

  public GoodsFeedbackCommentDTO (Long id, String text, Boolean canModify, Long parentId, GoodsFeedbackCommentAuthorDTO author, GoodsFeedbackCommentStatusType status) {
    this.id = id;
    this.text = text;
    this.canModify = canModify;
    this.parentId = parentId;
    this.author = author;
    this.status = status;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("canModify")
  public Boolean getCanModify() {
    return canModify;
  }
  public void setCanModify(Boolean canModify) {
    this.canModify = canModify;
  }

    
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

    
  @JsonProperty("author")
  public GoodsFeedbackCommentAuthorDTO getAuthor() {
    return author;
  }
  public void setAuthor(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
  }

    
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
    return Objects.equals(id, goodsFeedbackCommentDTO.id) &&
        Objects.equals(text, goodsFeedbackCommentDTO.text) &&
        Objects.equals(canModify, goodsFeedbackCommentDTO.canModify) &&
        Objects.equals(parentId, goodsFeedbackCommentDTO.parentId) &&
        Objects.equals(author, goodsFeedbackCommentDTO.author) &&
        Objects.equals(status, goodsFeedbackCommentDTO.status);
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
