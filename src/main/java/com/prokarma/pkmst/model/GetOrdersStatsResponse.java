package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ApiResponseStatusType;
import com.prokarma.pkmst.model.OrdersStatsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ответ на запрос информации по заказам.
 */
@ApiModel(description = "Ответ на запрос информации по заказам.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersStatsResponse   {
  @JsonProperty("status")
  private ApiResponseStatusType status;

  @JsonProperty("result")
  private OrdersStatsDTO result;

  public GetOrdersStatsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public ApiResponseStatusType getStatus() {
    return status;
  }

  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

  public GetOrdersStatsResponse result(OrdersStatsDTO result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @ApiModelProperty(value = "")
  public OrdersStatsDTO getResult() {
    return result;
  }

  public void setResult(OrdersStatsDTO result) {
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
    GetOrdersStatsResponse getOrdersStatsResponse = (GetOrdersStatsResponse) o;
    return Objects.equals(this.status, getOrdersStatsResponse.status) &&
        Objects.equals(this.result, getOrdersStatsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrdersStatsResponse {\n");
    
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

