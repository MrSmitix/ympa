package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiErrorDTO;
import org.openapitools.model.ApiResponseStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.")
public class ApiForbiddenErrorResponse   {
  
  private ApiResponseStatusType status;

  private List<@Valid ApiErrorDTO> errors;

  /**
   **/
  public ApiForbiddenErrorResponse status(ApiResponseStatusType status) {
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
   * Список ошибок.
   **/
  public ApiForbiddenErrorResponse errors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Список ошибок.")
  @JsonProperty("errors")
  public List<@Valid ApiErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
  }

  public ApiForbiddenErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
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
    ApiForbiddenErrorResponse apiForbiddenErrorResponse = (ApiForbiddenErrorResponse) o;
    return Objects.equals(this.status, apiForbiddenErrorResponse.status) &&
        Objects.equals(this.errors, apiForbiddenErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiForbiddenErrorResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

