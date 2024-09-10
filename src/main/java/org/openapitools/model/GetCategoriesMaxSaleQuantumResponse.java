package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetCategoriesMaxSaleQuantumResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumResponse {

  private ApiResponseStatusType status;

  @Valid
  private List<@Valid MaxSaleQuantumDTO> results = new ArrayList<>();

  @Valid
  private JsonNullable<List<@Valid CategoryErrorDTO>> errors = JsonNullable.<List<@Valid CategoryErrorDTO>>undefined();

  public GetCategoriesMaxSaleQuantumResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCategoriesMaxSaleQuantumResponse(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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
   */
  @NotNull @Valid 
  @Schema(name = "results", description = "Категории и лимит на установку кванта и минимального количества товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid MaxSaleQuantumDTO> getResults() {
    return results;
  }

  public void setResults(List<@Valid MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  public GetCategoriesMaxSaleQuantumResponse errors(List<@Valid CategoryErrorDTO> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public GetCategoriesMaxSaleQuantumResponse addErrorsItem(CategoryErrorDTO errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Ошибки, которые появились из-за переданных категорий.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Ошибки, которые появились из-за переданных категорий.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public JsonNullable<List<@Valid CategoryErrorDTO>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<@Valid CategoryErrorDTO>> errors) {
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
        equalsNullable(this.errors, getCategoriesMaxSaleQuantumResponse.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results, hashCodeNullable(errors));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

