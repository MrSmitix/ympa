package org.openapitools.model;

import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.GetSuggestedOfferMappingsResultDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSuggestedOfferMappingsResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private GetSuggestedOfferMappingsResultDTO result;
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

  public GetSuggestedOfferMappingsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public GetSuggestedOfferMappingsResultDTO getResult() {
    return result;
  }

  public void setResult(GetSuggestedOfferMappingsResultDTO result) {
    this.result = result;
  }

  public GetSuggestedOfferMappingsResponse result(GetSuggestedOfferMappingsResultDTO result) {
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
    GetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse = (GetSuggestedOfferMappingsResponse) o;
    return Objects.equals(this.status, getSuggestedOfferMappingsResponse.status) &&
        Objects.equals(this.result, getSuggestedOfferMappingsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsResponse {\n");
    
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

