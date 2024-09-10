package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCategoriesMaxSaleQuantumResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
  @Valid
 /**
   * Категории и лимит на установку кванта и минимального количества товаров.
  **/
  private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
  @Valid
 /**
   * Ошибки, которые появились из-за переданных категорий.
  **/
  private List<@Valid CategoryErrorDTO> errors;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetCategoriesMaxSaleQuantumResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Категории и лимит на установку кванта и минимального количества товаров.
   * @return results
  **/
  @JsonProperty("results")
  @NotNull
  public List<@Valid MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumResponse results(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  public GetCategoriesMaxSaleQuantumResponse addResultsItem(MaxSaleQuantumDTO resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

 /**
   * Ошибки, которые появились из-за переданных категорий.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid CategoryErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid CategoryErrorDTO> errors) {
    this.errors = errors;
  }

  public GetCategoriesMaxSaleQuantumResponse errors(List<@Valid CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCategoriesMaxSaleQuantumResponse addErrorsItem(CategoryErrorDTO errorsItem) {
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
    GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantumResponse = (GetCategoriesMaxSaleQuantumResponse) o;
    return Objects.equals(this.status, getCategoriesMaxSaleQuantumResponse.status) &&
        Objects.equals(this.results, getCategoriesMaxSaleQuantumResponse.results) &&
        Objects.equals(this.errors, getCategoriesMaxSaleQuantumResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoriesMaxSaleQuantumResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

