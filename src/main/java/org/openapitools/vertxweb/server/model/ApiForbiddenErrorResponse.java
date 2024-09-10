package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ApiErrorDTO;
import org.openapitools.vertxweb.server.model.ApiResponseStatusType;

/**
 * Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiForbiddenErrorResponse   {
  
  private ApiResponseStatusType status;
  private List<ApiErrorDTO> errors;

  public ApiForbiddenErrorResponse () {

  }

  public ApiForbiddenErrorResponse (ApiResponseStatusType status, List<ApiErrorDTO> errors) {
    this.status = status;
    this.errors = errors;
  }

    
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("errors")
  public List<ApiErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<ApiErrorDTO> errors) {
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
    ApiForbiddenErrorResponse apiForbiddenErrorResponse = (ApiForbiddenErrorResponse) o;
    return Objects.equals(status, apiForbiddenErrorResponse.status) &&
        Objects.equals(errors, apiForbiddenErrorResponse.errors);
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
