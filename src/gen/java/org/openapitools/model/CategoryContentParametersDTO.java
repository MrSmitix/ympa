package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryParameterDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о параметрах категории.
 */
@ApiModel(description="Информация о параметрах категории.")

public class CategoryContentParametersDTO  {
  
 /**
  * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  */
  @ApiModelProperty(required = true, value = "Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).")
  private Integer categoryId;

 /**
  * Список характеристик.
  */
  @ApiModelProperty(value = "Список характеристик.")
  @Valid
  private List<@Valid CategoryParameterDTO> parameters;
 /**
  * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  * @return categoryId
  */
  @JsonProperty("categoryId")
  @NotNull
  public Integer getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
 public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Sets the <code>categoryId</code> property.
   */
  public CategoryContentParametersDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

 /**
  * Список характеристик.
  * @return parameters
  */
  @JsonProperty("parameters")
  public List<@Valid CategoryParameterDTO> getParameters() {
    return parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
 public void setParameters(List<@Valid CategoryParameterDTO> parameters) {
    this.parameters = parameters;
  }

  /**
   * Sets the <code>parameters</code> property.
   */
  public CategoryContentParametersDTO parameters(List<@Valid CategoryParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Adds a new item to the <code>parameters</code> list.
   */
  public CategoryContentParametersDTO addParametersItem(CategoryParameterDTO parametersItem) {
    this.parameters.add(parametersItem);
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
    CategoryContentParametersDTO categoryContentParametersDTO = (CategoryContentParametersDTO) o;
    return Objects.equals(this.categoryId, categoryContentParametersDTO.categoryId) &&
        Objects.equals(this.parameters, categoryContentParametersDTO.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, parameters);
  }

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

