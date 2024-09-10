package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ApiResponseStatusType;
import org.openapitools.vertxweb.server.model.GetSuggestedOfferMappingsResultDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSuggestedOfferMappingsResponse   {
  
  private ApiResponseStatusType status;
  private GetSuggestedOfferMappingsResultDTO result;

  public GetSuggestedOfferMappingsResponse () {

  }

  public GetSuggestedOfferMappingsResponse (ApiResponseStatusType status, GetSuggestedOfferMappingsResultDTO result) {
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
  public GetSuggestedOfferMappingsResultDTO getResult() {
    return result;
  }
  public void setResult(GetSuggestedOfferMappingsResultDTO result) {
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
    GetSuggestedOfferMappingsResponse getSuggestedOfferMappingsResponse = (GetSuggestedOfferMappingsResponse) o;
    return Objects.equals(status, getSuggestedOfferMappingsResponse.status) &&
        Objects.equals(result, getSuggestedOfferMappingsResponse.result);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
