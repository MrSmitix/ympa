package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.CategoryContentParametersDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ со списком характеристик для категории и их допустимыми значениями.
 **/
@ApiModel(description="Ответ со списком характеристик для категории и их допустимыми значениями.")

public class GetCategoryContentParametersResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private CategoryContentParametersDTO result;
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

  public GetCategoryContentParametersResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public CategoryContentParametersDTO getResult() {
    return result;
  }

  public void setResult(CategoryContentParametersDTO result) {
    this.result = result;
  }

  public GetCategoryContentParametersResponse result(CategoryContentParametersDTO result) {
    this.result = result;
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
    GetCategoryContentParametersResponse getCategoryContentParametersResponse = (GetCategoryContentParametersResponse) o;
    return Objects.equals(this.status, getCategoryContentParametersResponse.status) &&
        Objects.equals(this.result, getCategoryContentParametersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoryContentParametersResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

