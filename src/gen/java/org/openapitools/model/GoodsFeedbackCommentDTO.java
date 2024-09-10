package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.model.GoodsFeedbackCommentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Комментарий к отзыву.
 **/
@ApiModel(description = "Комментарий к отзыву.")
@JsonTypeName("GoodsFeedbackCommentDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsFeedbackCommentDTO   {
  private Long id;
  private String text;
  private Boolean canModify;
  private Long parentId;
  private GoodsFeedbackCommentAuthorDTO author;
  private GoodsFeedbackCommentStatusType status;

  /**
   * Идентификатор комментария к отзыву. 
   **/
  public GoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор комментария к отзыву. ")
  @JsonProperty("id")
  @NotNull public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Текст комментария.
   **/
  public GoodsFeedbackCommentDTO text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Текст комментария.")
  @JsonProperty("text")
  @NotNull  @Size(min=1,max=4096)public String getText() {
    return text;
  }

  @JsonProperty("text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Может ли продавец изменять комментарий или удалять его.
   **/
  public GoodsFeedbackCommentDTO canModify(Boolean canModify) {
    this.canModify = canModify;
    return this;
  }

  
  @ApiModelProperty(value = "Может ли продавец изменять комментарий или удалять его.")
  @JsonProperty("canModify")
  public Boolean getCanModify() {
    return canModify;
  }

  @JsonProperty("canModify")
  public void setCanModify(Boolean canModify) {
    this.canModify = canModify;
  }

  /**
   * Идентификатор комментария к отзыву. 
   **/
  public GoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  @JsonProperty("parentId")
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public GoodsFeedbackCommentDTO author(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("author")
  @NotNull @Valid public GoodsFeedbackCommentAuthorDTO getAuthor() {
    return author;
  }

  @JsonProperty("author")
  public void setAuthor(GoodsFeedbackCommentAuthorDTO author) {
    this.author = author;
  }

  /**
   **/
  public GoodsFeedbackCommentDTO status(GoodsFeedbackCommentStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull public GoodsFeedbackCommentStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
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

