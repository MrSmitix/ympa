package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CategoryErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Текст ошибки.
 */
@ApiModel(description = "Текст ошибки.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryErrorDTO   {
  @JsonProperty("categoryId")
  private Long categoryId;

  @JsonProperty("type")
  private CategoryErrorType type;

  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории.
   * @return categoryId
   */
  @ApiModelProperty(value = "Идентификатор категории.")
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
  @ApiModelProperty(value = "")
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

