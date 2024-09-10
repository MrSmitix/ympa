package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CategoryParameterDTO;

/**
 * Информация о параметрах категории.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryContentParametersDTO   {
  
  private Integer categoryId;
  private List<CategoryParameterDTO> parameters;

  public CategoryContentParametersDTO () {

  }

  public CategoryContentParametersDTO (Integer categoryId, List<CategoryParameterDTO> parameters) {
    this.categoryId = categoryId;
    this.parameters = parameters;
  }

    
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

    
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
