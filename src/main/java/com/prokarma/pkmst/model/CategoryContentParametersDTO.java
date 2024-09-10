package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CategoryParameterDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о параметрах категории.
 */
@ApiModel(description = "Информация о параметрах категории.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryContentParametersDTO   {
  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("parameters")
  
  private List<CategoryParameterDTO> parameters = null;

  public CategoryContentParametersDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   * @return categoryId
   */
  @ApiModelProperty(required = true, value = "Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryContentParametersDTO parameters(List<CategoryParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  public CategoryContentParametersDTO addParametersItem(CategoryParameterDTO parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Список характеристик.
   * @return parameters
   */
  @ApiModelProperty(value = "Список характеристик.")
  public List<CategoryParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<CategoryParameterDTO> parameters) {
    this.parameters = parameters;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

