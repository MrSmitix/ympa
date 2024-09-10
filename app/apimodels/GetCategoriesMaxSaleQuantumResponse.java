package apimodels;

import apimodels.ApiResponseStatusType;
import apimodels.CategoryErrorDTO;
import apimodels.MaxSaleQuantumDTO;
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
 * GetCategoriesMaxSaleQuantumResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCategoriesMaxSaleQuantumResponse   {
  @JsonProperty("status")
  @Valid

  private ApiResponseStatusType status;

  @JsonProperty("results")
  @NotNull
@Valid

  private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

  @JsonProperty("errors")
  @Valid

  private List<@Valid CategoryErrorDTO> errors = null;

  public GetCategoriesMaxSaleQuantumResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetCategoriesMaxSaleQuantumResponse results(List<@Valid MaxSaleQuantumDTO> results) {
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
  **/
  public List<@Valid MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumResponse errors(List<@Valid CategoryErrorDTO> errors) {
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
  **/
  public List<@Valid CategoryErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid CategoryErrorDTO> errors) {
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
    return Objects.equals(status, getCategoriesMaxSaleQuantumResponse.status) &&
        Objects.equals(results, getCategoriesMaxSaleQuantumResponse.results) &&
        Objects.equals(errors, getCategoriesMaxSaleQuantumResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results, errors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

