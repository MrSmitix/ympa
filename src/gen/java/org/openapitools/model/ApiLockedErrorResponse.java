package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiErrorDTO;
import org.openapitools.model.ApiResponseStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ресурс из запроса заблокирован от применения к нему указанного метода.
 **/
@ApiModel(description="Ресурс из запроса заблокирован от применения к нему указанного метода.")

public class ApiLockedErrorResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "Список ошибок.")
  @Valid
 /**
   * Список ошибок.
  **/
  private List<@Valid ApiErrorDTO> errors;
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

  public ApiLockedErrorResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Список ошибок.
   * @return errors
  **/
  @JsonProperty("errors")
  public List<@Valid ApiErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
  }

  public ApiLockedErrorResponse errors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public ApiLockedErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
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
    ApiLockedErrorResponse apiLockedErrorResponse = (ApiLockedErrorResponse) o;
    return Objects.equals(this.status, apiLockedErrorResponse.status) &&
        Objects.equals(this.errors, apiLockedErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLockedErrorResponse {\n");
    
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

