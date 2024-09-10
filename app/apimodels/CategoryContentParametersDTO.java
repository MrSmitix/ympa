package apimodels;

import apimodels.CategoryParameterDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о параметрах категории.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CategoryContentParametersDTO   {
  @JsonProperty("categoryId")
  @NotNull

  private Integer categoryId;

  @JsonProperty("parameters")
  @Valid

  private List<@Valid CategoryParameterDTO> parameters = null;

  public CategoryContentParametersDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   * @return categoryId
  **/
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryContentParametersDTO parameters(List<@Valid CategoryParameterDTO> parameters) {
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
  **/
  public List<@Valid CategoryParameterDTO> getParameters() {
    return parameters;
  }

  public void setParameters(List<@Valid CategoryParameterDTO> parameters) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

