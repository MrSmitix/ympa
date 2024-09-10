package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ApiResponseStatusType;
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
 * GetCategoriesMaxSaleQuantumResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumResponse   {
  @JsonProperty("status")
  private ApiResponseStatusType status;

  @JsonProperty("results")
  
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();

  @JsonProperty("errors")
  
  private List<CategoryErrorDTO> errors = null;

  public GetCategoriesMaxSaleQuantumResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetCategoriesMaxSaleQuantumResponse results(List<MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  public GetCategoriesMaxSaleQuantumResponse addResultsItem(MaxSaleQuantumDTO resultsItem) {
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

  public GetCategoriesMaxSaleQuantumResponse errors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public GetCategoriesMaxSaleQuantumResponse addErrorsItem(CategoryErrorDTO errorsItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

