package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Комментарий к отзыву или другому комментарию.
 */

@Schema(name = "UpdateGoodsFeedbackCommentDTO", description = "Комментарий к отзыву или другому комментарию.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateGoodsFeedbackCommentDTO {

  private Long id;

  private Long parentId;

  private String text;

  public UpdateGoodsFeedbackCommentDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGoodsFeedbackCommentDTO(String text) {
    this.text = text;
  }

  public UpdateGoodsFeedbackCommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор комментария к отзыву. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UpdateGoodsFeedbackCommentDTO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Идентификатор комментария к отзыву. 
   * @return parentId
   */
  
  @Schema(name = "parentId", description = "Идентификатор комментария к отзыву. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public UpdateGoodsFeedbackCommentDTO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст комментария.
   * @return text
   */
  @NotNull @Size(min = 1, max = 4096) 
  @Schema(name = "text", description = "Текст комментария.", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

