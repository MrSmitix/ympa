package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Категории и лимит на установку кванта и минимального количества товаров.
 **/
@ApiModel(description="Категории и лимит на установку кванта и минимального количества товаров.")

public class GetCategoriesMaxSaleQuantumDTO  {
  
  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
 /**
   * Категории и лимит на установку кванта и минимального количества товаров.
  **/
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();

  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
 /**
   * Ошибки, которые появились из-за переданных категорий.
  **/
  private List<CategoryErrorDTO> errors;
 /**
   * Категории и лимит на установку кванта и минимального количества товаров.
   * @return results
  **/
  @JsonProperty("results")
  public List<MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumDTO results(List<MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  public GetCategoriesMaxSaleQuantumDTO addResultsItem(MaxSaleQuantumDTO resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Ошибки, которые появились из-за переданных категорий.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<CategoryErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCategoriesMaxSaleQuantumDTO errors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCategoriesMaxSaleQuantumDTO addErrorsItem(CategoryErrorDTO errorsItem) {
    this.errors.add(errorsItem);
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
    GetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO = (GetCategoriesMaxSaleQuantumDTO) o;
    return Objects.equals(this.results, getCategoriesMaxSaleQuantumDTO.results) &&
        Objects.equals(this.errors, getCategoriesMaxSaleQuantumDTO.errors);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

