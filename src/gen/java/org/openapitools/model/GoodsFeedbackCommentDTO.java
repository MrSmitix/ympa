package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.model.GoodsFeedbackCommentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Комментарий к отзыву.
 */
@ApiModel(description="Комментарий к отзыву.")

public class GoodsFeedbackCommentDTO  {
  
 /**
  * Идентификатор комментария к отзыву. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор комментария к отзыву. ")
  private Long id;

 /**
  * Текст комментария.
  */
  @ApiModelProperty(required = true, value = "Текст комментария.")
  private String text;

 /**
  * Может ли продавец изменять комментарий или удалять его.
  */
  @ApiModelProperty(value = "Может ли продавец изменять комментарий или удалять его.")
  private Boolean canModify;

 /**
  * Идентификатор комментария к отзыву. 
  */
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  private Long parentId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GoodsFeedbackCommentAuthorDTO author;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GoodsFeedbackCommentStatusType status;
 /**
  * Идентификатор комментария к отзыву. 
  * @return id
  */
  @JsonProperty("id")
  @NotNull
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
  public GoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Текст комментария.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
 @Size(min=1,max=4096)  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public GoodsFeedbackCommentDTO text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Может ли продавец изменять комментарий или удалять его.
  * @return canModify
  */
  @JsonProperty("canModify")
  public Boolean getCanModify() {
    return canModify;
  }

  /**
   * Sets the <code>canModify</code> property.
   */
 public void setCanModify(Boolean canModify) {
    this.canModify = canModify;
  }

  /**
   * Sets the <code>canModify</code> property.
   */
  public GoodsFeedbackCommentDTO canModify(Boolean canModify) {
    this.canModify = canModify;
    return this;
  }

 /**
  * Идентификатор комментария к отзыву. 
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
  public GoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
  * Get author
  * @return author
  */
  @JsonProperty("author")
  @NotNull
  public GoodsFeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  /**
   * Sets the <code>author</code> property.
   */
 public void setAuthor(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  /**
   * Sets the <code>author</code> property.
   */
  public GoodsFeedbackCommentDTO author(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public GoodsFeedbackCommentStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(GoodsFeedbackCommentStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public GoodsFeedbackCommentDTO status(GoodsFeedbackCommentStatusType status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

