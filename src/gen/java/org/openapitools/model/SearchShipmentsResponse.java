package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.SearchShipmentsResponseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ответ на запрос информации об отгрузках.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Ответ на запрос информации об отгрузках.")
public class SearchShipmentsResponse   {
  
  private ApiResponseStatusType status;

  private SearchShipmentsResponseDTO result;

  /**
   **/
  public SearchShipmentsResponse status(ApiResponseStatusType status) {
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
   **/
  public SearchShipmentsResponse result(SearchShipmentsResponseDTO result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("result")
  public SearchShipmentsResponseDTO getResult() {
    return result;
  }
  public void setResult(SearchShipmentsResponseDTO result) {
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
    SearchShipmentsResponse searchShipmentsResponse = (SearchShipmentsResponse) o;
    return Objects.equals(this.status, searchShipmentsResponse.status) &&
        Objects.equals(this.result, searchShipmentsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShipmentsResponse {\n");
    
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

