/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.CategoryErrorDTO;
import org.openapitools.model.MaxSaleQuantumDTO;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesMaxSaleQuantumResponse   {
  
  private ApiResponseStatusType status;
  private List<MaxSaleQuantumDTO> results = new ArrayList<>();
  private List<CategoryErrorDTO> errors;

  /**
   */
  public GetCategoriesMaxSaleQuantumResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   * Категории и лимит на установку кванта и минимального количества товаров.
   */
  public GetCategoriesMaxSaleQuantumResponse results(List<MaxSaleQuantumDTO> results) {
    this.results = results;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Категории и лимит на установку кванта и минимального количества товаров.")
  @JsonProperty("results")
  public List<MaxSaleQuantumDTO> getResults() {
    return results;
  }
  public void setResults(List<MaxSaleQuantumDTO> results) {
    this.results = results;
  }

  /**
   * Ошибки, которые появились из-за переданных категорий.
   */
  public GetCategoriesMaxSaleQuantumResponse errors(List<CategoryErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки, которые появились из-за переданных категорий.")
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

