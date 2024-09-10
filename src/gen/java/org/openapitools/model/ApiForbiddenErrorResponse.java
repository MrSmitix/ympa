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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 */
@ApiModel(description="Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.")

public class ApiForbiddenErrorResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

 /**
  * Список ошибок.
  */
  @ApiModelProperty(value = "Список ошибок.")
  @Valid
  private List<@Valid ApiErrorDTO> errors;
 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public ApiForbiddenErrorResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Список ошибок.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid ApiErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public ApiForbiddenErrorResponse errors(List<@Valid ApiErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public ApiForbiddenErrorResponse addErrorsItem(ApiErrorDTO errorsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

