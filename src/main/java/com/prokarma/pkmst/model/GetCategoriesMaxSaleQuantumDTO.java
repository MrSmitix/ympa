package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CategoryErrorDTO;
import com.prokarma.pkmst.model.MaxSaleQuantumDTO;
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
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
@ApiModel(description = "Категории и лимит на установку кванта и минимального количества товаров.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumDTO   {
  @JsonProperty("results")
  
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();

  @JsonProperty("errors")
  
  private List<CategoryErrorDTO> errors = null;

  public GetCategoriesMaxSaleQuantumDTO results(List<MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  public GetCategoriesMaxSaleQuantumDTO addResultsItem(MaxSaleQuantumDTO resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Категории и лимит на установку кванта и минимального количества товаров.
   * @return results
   */
  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
  public List<MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumDTO errors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCategoriesMaxSaleQuantumDTO addErrorsItem(CategoryErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Ошибки, которые появились из-за переданных категорий.
   * @return errors
   */
  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

