package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
@ApiModel(description="Категории и лимит на установку кванта и минимального количества товаров.")

public class GetCategoriesMaxSaleQuantumDTO  {
  
 /**
  * Категории и лимит на установку кванта и минимального количества товаров.
  */
  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
  @Valid
  private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

 /**
  * Ошибки, которые появились из-за переданных категорий.
  */
  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
  @Valid
  private List<@Valid CategoryErrorDTO> errors;
 /**
  * Категории и лимит на установку кванта и минимального количества товаров.
  * @return results
  */
  @JsonProperty("results")
  @NotNull
  public List<@Valid MaxSaleQuantumDTO> getResults() {
    return results;
  }

  /**
   * Sets the <code>results</code> property.
   */
 public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  /**
   * Sets the <code>results</code> property.
   */
  public GetCategoriesMaxSaleQuantumDTO results(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  /**
   * Adds a new item to the <code>results</code> list.
   */
  public GetCategoriesMaxSaleQuantumDTO addResultsItem(MaxSaleQuantumDTO resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
  * Ошибки, которые появились из-за переданных категорий.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid CategoryErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid CategoryErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public GetCategoriesMaxSaleQuantumDTO errors(List<@Valid CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
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

