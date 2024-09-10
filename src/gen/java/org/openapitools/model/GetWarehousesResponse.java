package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.WarehousesDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetWarehousesResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private WarehousesDTO result;
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
  public GetWarehousesResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get result
  * @return result
  */
  @JsonProperty("result")
  public WarehousesDTO getResult() {
    return result;
  }

  /**
   * Sets the <code>result</code> property.
   */
 public void setResult(WarehousesDTO result) {
    this.result = result;
  }

  /**
   * Sets the <code>result</code> property.
   */
  public GetWarehousesResponse result(WarehousesDTO result) {
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
    GetWarehousesResponse getWarehousesResponse = (GetWarehousesResponse) o;
    return Objects.equals(this.status, getWarehousesResponse.status) &&
        Objects.equals(this.result, getWarehousesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarehousesResponse {\n");
    
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

