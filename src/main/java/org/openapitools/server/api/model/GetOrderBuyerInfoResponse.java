package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.OrderBuyerInfoDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOrderBuyerInfoResponse   {
  
  private ApiResponseStatusType status;
  private OrderBuyerInfoDTO result;

  public GetOrderBuyerInfoResponse () {

  }

  public GetOrderBuyerInfoResponse (ApiResponseStatusType status, OrderBuyerInfoDTO result) {
    this.status = status;
    this.result = result;
  }

    
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("result")
  public OrderBuyerInfoDTO getResult() {
    return result;
  }
  public void setResult(OrderBuyerInfoDTO result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderBuyerInfoResponse getOrderBuyerInfoResponse = (GetOrderBuyerInfoResponse) o;
    return Objects.equals(status, getOrderBuyerInfoResponse.status) &&
        Objects.equals(result, getOrderBuyerInfoResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderBuyerInfoResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
