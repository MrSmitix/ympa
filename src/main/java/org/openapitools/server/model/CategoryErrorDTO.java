package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CategoryErrorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Текст ошибки.
 */
public class CategoryErrorDTO   {

    private Long categoryId;
    private CategoryErrorType type;

    /**
     * Default constructor.
     */
    public CategoryErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CategoryErrorDTO.
     *
     * @param categoryId Идентификатор категории.
     * @param type type
     */
    public CategoryErrorDTO(
        Long categoryId, 
        CategoryErrorType type
    ) {
        this.categoryId = categoryId;
        this.type = type;
    }



    /**
     * Идентификатор категории.
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Get type
     * @return type
     */
    public CategoryErrorType getType() {
        return type;
    }

    public void setType(CategoryErrorType type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

