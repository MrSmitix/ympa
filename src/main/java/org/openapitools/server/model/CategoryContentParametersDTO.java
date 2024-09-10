package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CategoryParameterDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о параметрах категории.
 */
public class CategoryContentParametersDTO   {

    private Integer categoryId;
    private List<@Valid CategoryParameterDTO> parameters;

    /**
     * Default constructor.
     */
    public CategoryContentParametersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CategoryContentParametersDTO.
     *
     * @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @param parameters Список характеристик.
     */
    public CategoryContentParametersDTO(
        Integer categoryId, 
        List<@Valid CategoryParameterDTO> parameters
    ) {
        this.categoryId = categoryId;
        this.parameters = parameters;
    }



    /**
     * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Список характеристик.
     * @return parameters
     */
    public List<@Valid CategoryParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<@Valid CategoryParameterDTO> parameters) {
        this.parameters = parameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryContentParametersDTO {\n");
        
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

