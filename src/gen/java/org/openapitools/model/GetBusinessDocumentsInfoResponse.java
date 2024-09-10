package org.openapitools.model;

import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.OrderBusinessDocumentsDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetBusinessDocumentsInfoResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private OrderBusinessDocumentsDTO result;
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

  public GetBusinessDocumentsInfoResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public OrderBusinessDocumentsDTO getResult() {
    return result;
  }

  public void setResult(OrderBusinessDocumentsDTO result) {
    this.result = result;
  }

  public GetBusinessDocumentsInfoResponse result(OrderBusinessDocumentsDTO result) {
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
    GetBusinessDocumentsInfoResponse getBusinessDocumentsInfoResponse = (GetBusinessDocumentsInfoResponse) o;
    return Objects.equals(this.status, getBusinessDocumentsInfoResponse.status) &&
        Objects.equals(this.result, getBusinessDocumentsInfoResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessDocumentsInfoResponse {\n");
    
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

