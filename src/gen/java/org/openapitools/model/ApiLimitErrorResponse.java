package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiErrorDTO;
import org.openapitools.model.ApiResponseStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Превышено ограничение на доступ к ресурсу.
 **/
@ApiModel(description="Превышено ограничение на доступ к ресурсу.")

public class ApiLimitErrorResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "Список ошибок.")
 /**
   * Список ошибок.
  **/
  private List<ApiErrorDTO> errors;
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

  public ApiLimitErrorResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Список ошибок.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<ApiErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiErrorDTO> errors) {
    this.errors = errors;
  }

  public ApiLimitErrorResponse errors(List<ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ApiLimitErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
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
    ApiLimitErrorResponse apiLimitErrorResponse = (ApiLimitErrorResponse) o;
    return Objects.equals(this.status, apiLimitErrorResponse.status) &&
        Objects.equals(this.errors, apiLimitErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLimitErrorResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

