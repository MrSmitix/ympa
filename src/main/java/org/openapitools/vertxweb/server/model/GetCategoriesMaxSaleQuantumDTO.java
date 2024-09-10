package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CategoryErrorDTO;
import org.openapitools.vertxweb.server.model.MaxSaleQuantumDTO;

/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCategoriesMaxSaleQuantumDTO   {
  
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();
  private List<CategoryErrorDTO> errors;

  public GetCategoriesMaxSaleQuantumDTO () {

  }

  public GetCategoriesMaxSaleQuantumDTO (List<MaxSaleQuantumDTO> results, List<CategoryErrorDTO> errors) {
    this.results = results;
    this.errors = errors;
  }

    
  @JsonProperty("results")
  public List<MaxSaleQuantumDTO> getResults() {
    return results;
  }
  public void setResults(List<MaxSaleQuantumDTO> results) {
    this.results = results;
  }

    
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
