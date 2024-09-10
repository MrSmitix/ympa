package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Комментарий к отзыву или другому комментарию.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateGoodsFeedbackCommentDTO   {
  
  private Long id;
  private Long parentId;
  private String text;

  public UpdateGoodsFeedbackCommentDTO () {

  }

  public UpdateGoodsFeedbackCommentDTO (Long id, Long parentId, String text) {
    this.id = id;
    this.parentId = parentId;
    this.text = text;
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

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
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
    return Objects.equals(id, updateGoodsFeedbackCommentDTO.id) &&
        Objects.equals(parentId, updateGoodsFeedbackCommentDTO.parentId) &&
        Objects.equals(text, updateGoodsFeedbackCommentDTO.text);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
