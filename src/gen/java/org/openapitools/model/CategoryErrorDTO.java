package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CategoryErrorType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Текст ошибки.
 **/
@ApiModel(description="Текст ошибки.")

public class CategoryErrorDTO  {
  
  @ApiModelProperty(value = "Идентификатор категории.")
 /**
   * Идентификатор категории.
  **/
  private Long categoryId;

  @ApiModelProperty(value = "")
  private CategoryErrorType type;
 /**
   * Идентификатор категории.
   * @return categoryId
  **/
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public CategoryErrorType getType() {
    return type;
  }

  public void setType(CategoryErrorType type) {
    this.type = type;
  }

  public CategoryErrorDTO type(CategoryErrorType type) {
    this.type = type;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

