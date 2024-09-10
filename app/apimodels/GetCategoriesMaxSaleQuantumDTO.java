package apimodels;

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
 * Категории и лимит на установку кванта и минимального количества товаров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCategoriesMaxSaleQuantumDTO   {
  @JsonProperty("results")
  @NotNull
@Valid

  private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

  @JsonProperty("errors")
  @Valid

  private List<@Valid CategoryErrorDTO> errors = null;

  public GetCategoriesMaxSaleQuantumDTO results(List<@Valid MaxSaleQuantumDTO> results) {
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
  **/
  public List<@Valid MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumDTO errors(List<@Valid CategoryErrorDTO> errors) {
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
    GetCategoriesMaxSaleQuantumDTO getCategoriesMaxSaleQuantumDTO = (GetCategoriesMaxSaleQuantumDTO) o;
    return Objects.equals(results, getCategoriesMaxSaleQuantumDTO.results) &&
        Objects.equals(errors, getCategoriesMaxSaleQuantumDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, errors);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

