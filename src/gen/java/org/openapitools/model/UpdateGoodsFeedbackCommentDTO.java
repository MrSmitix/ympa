package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Комментарий к отзыву или другому комментарию.
 */
@ApiModel(description="Комментарий к отзыву или другому комментарию.")

public class UpdateGoodsFeedbackCommentDTO  {
  
 /**
  * Идентификатор комментария к отзыву. 
  */
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  private Long id;

 /**
  * Идентификатор комментария к отзыву. 
  */
  @ApiModelProperty(value = "Идентификатор комментария к отзыву. ")
  private Long parentId;

 /**
  * Текст комментария.
  */
  @ApiModelProperty(required = true, value = "Текст комментария.")
  private String text;
 /**
  * Идентификатор комментария к отзыву. 
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
  public UpdateGoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
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
  public UpdateGoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
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

