package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CategoryErrorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Текст ошибки.
 */

@Schema(name = "CategoryErrorDTO", description = "Текст ошибки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryErrorDTO {

  private Long categoryId;

  private CategoryErrorType type;

  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return categoryId
   */
  
  @Schema(name = "categoryId", description = "Идентификатор категории.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryErrorDTO type(CategoryErrorType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public CategoryErrorType getType() {
    return type;
  }

  public void setType(CategoryErrorType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryErrorDTO categoryErrorDTO = (CategoryErrorDTO) o;
    return Objects.equals(this.categoryId, categoryErrorDTO.categoryId) &&
        Objects.equals(this.type, categoryErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryErrorDTO {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

