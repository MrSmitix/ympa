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
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;



/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 **/

@ApiModel(description = "Категории и лимит на установку кванта и минимального количества товаров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumDTO   {
  @JsonProperty("results")
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();

  @JsonProperty("errors")
  private List<CategoryErrorDTO> errors = null;

  /**
   * Категории и лимит на установку кванта и минимального количества товаров.
   **/
  public GetCategoriesMaxSaleQuantumDTO results(List<MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
  @JsonProperty("results")
  public List<MaxSaleQuantumDTO> getResults() {
    return results;
  }
  public void setResults(List<MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  /**
   * Ошибки, которые появились из-за переданных категорий.
   **/
  public GetCategoriesMaxSaleQuantumDTO errors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
  @JsonProperty("errors")
  public List<CategoryErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO = (GetCategoriesMaxSaleQuantumDTO) o;
    return Objects.equals(results, getCategoriesMaxSaleQuantumDTO.results) &&
        Objects.equals(errors, getCategoriesMaxSaleQuantumDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoriesMaxSaleQuantumDTO {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

