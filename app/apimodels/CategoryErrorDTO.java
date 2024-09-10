package apimodels;

import apimodels.CategoryErrorType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Текст ошибки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CategoryErrorDTO   {
  @JsonProperty("categoryId")
  
  private Long categoryId;

  @JsonProperty("type")
  @Valid

  private CategoryErrorType type;

  public CategoryErrorDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Идентификатор категории.
   * @return categoryId
  **/
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
  **/
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
    return Objects.equals(categoryId, categoryErrorDTO.categoryId) &&
        Objects.equals(type, categoryErrorDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

