/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryParameterDTO;



/**
 * Информация о параметрах категории.
 */

@ApiModel(description = "Информация о параметрах категории.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryContentParametersDTO   {
  
  private Integer categoryId;
  private List<CategoryParameterDTO> parameters;

  /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   */
  public CategoryContentParametersDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).")
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * Список характеристик.
   */
  public CategoryContentParametersDTO parameters(List<CategoryParameterDTO> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "Список характеристик.")
  @JsonProperty("parameters")
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
    return Objects.equals(categoryId, categoryContentParametersDTO.categoryId) &&
        Objects.equals(parameters, categoryContentParametersDTO.parameters);
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

