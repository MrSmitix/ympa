package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.GoodsFeedbackCommentAuthorDTO;
import com.prokarma.pkmst.model.GoodsFeedbackCommentStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Комментарий к отзыву.
 */
@ApiModel(description = "Комментарий к отзыву.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("text")
  private String text;

  @JsonProperty("canModify")
  private Boolean canModify;

  @JsonProperty("parentId")
  private Long parentId;

  @JsonProperty("author")
  private GoodsFeedbackCommentAuthorDTO author;

  @JsonProperty("status")
  private GoodsFeedbackCommentStatusType status;

  public GoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return id
   */
  @ApiModelProperty(required = true, value = "Идентификатор комментария к отзыву. ")
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
  @ApiModelProperty(required = true, value = "Текст комментария.")
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
  @ApiModelProperty(value = "Может ли продавец изменять комментарий или удалять его.")
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
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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

