package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.PagedReturnsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetReturnsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private PagedReturnsDTO result;
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

  public GetReturnsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public PagedReturnsDTO getResult() {
    return result;
  }

  public void setResult(PagedReturnsDTO result) {
    this.result = result;
  }

  public GetReturnsResponse result(PagedReturnsDTO result) {
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
    GetReturnsResponse getReturnsResponse = (GetReturnsResponse) o;
    return Objects.equals(this.status, getReturnsResponse.status) &&
        Objects.equals(this.result, getReturnsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReturnsResponse {\n");
    
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

