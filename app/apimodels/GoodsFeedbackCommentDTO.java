package apimodels;

import apimodels.GoodsFeedbackCommentAuthorDTO;
import apimodels.GoodsFeedbackCommentStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Комментарий к отзыву.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsFeedbackCommentDTO   {
  @JsonProperty("id")
  @NotNull

  private Long id;

  @JsonProperty("text")
  @NotNull
@Size(min=1,max=4096)

  private String text;

  @JsonProperty("canModify")
  
  private Boolean canModify;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("author")
  @NotNull
@Valid

  private GoodsFeedbackCommentAuthorDTO author;

  @JsonProperty("status")
  @NotNull
@Valid

  private GoodsFeedbackCommentStatusType status;

  public GoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор комментария к отзыву. 
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

