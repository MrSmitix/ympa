package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Комментарий к отзыву или другому комментарию.
 **/
@ApiModel(description="Комментарий к отзыву или другому комментарию.")

public class UpdateGoodsFeedbackCommentDTO  {
  
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
 /**
   * Идентификатор комментария к отзыву. 
  **/
  private Long id;

  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
 /**
   * Идентификатор комментария к отзыву. 
  **/
  private Long parentId;

  @ApiModelProperty(required = true, value = "Текст комментария.")
 /**
   * Текст комментария.
  **/
  private String text;
 /**
   * Идентификатор комментария к отзыву. 
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UpdateGoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Идентификатор комментария к отзыву. 
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public UpdateGoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Текст комментария.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public UpdateGoodsFeedbackCommentDTO text(String text) {
    this.text = text;
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
    UpdateGoodsFeedbackCommentDTO updateGoodsFeedbackCommentDTO = (UpdateGoodsFeedbackCommentDTO) o;
    return Objects.equals(this.id, updateGoodsFeedbackCommentDTO.id) &&
        Objects.equals(this.parentId, updateGoodsFeedbackCommentDTO.parentId) &&
        Objects.equals(this.text, updateGoodsFeedbackCommentDTO.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGoodsFeedbackCommentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

