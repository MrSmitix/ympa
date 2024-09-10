package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CategoryErrorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Текст ошибки.
 */
@ApiModel(description="Текст ошибки.")

public class CategoryErrorDTO  {
  
 /**
  * Идентификатор категории.
  */
  @ApiModelProperty(value = "Идентификатор категории.")
  private Long categoryId;

  @ApiModelProperty(value = "")
  @Valid
  private CategoryErrorType type;
 /**
  * Идентификатор категории.
  * @return categoryId
  */
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
 public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public CategoryErrorType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(CategoryErrorType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
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

