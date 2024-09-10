package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.CategoryErrorDTO;
import org.openapitools.server.api.model.MaxSaleQuantumDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCategoriesMaxSaleQuantumResponse   {
  
  private ApiResponseStatusType status;
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();
  private List<CategoryErrorDTO> errors;

  public GetCategoriesMaxSaleQuantumResponse () {

  }

  public GetCategoriesMaxSaleQuantumResponse (ApiResponseStatusType status, List<MaxSaleQuantumDTO> results, List<CategoryErrorDTO> errors) {
    this.status = status;
    this.results = results;
    this.errors = errors;
  }

    
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
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
    GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantumResponse = (GetCategoriesMaxSaleQuantumResponse) o;
    return Objects.equals(status, getCategoriesMaxSaleQuantumResponse.status) &&
        Objects.equals(results, getCategoriesMaxSaleQuantumResponse.results) &&
        Objects.equals(errors, getCategoriesMaxSaleQuantumResponse.errors);
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
