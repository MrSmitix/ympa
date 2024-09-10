package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.GetQuarantineOffersResultDTO;

/**
 * Ответ на запрос списка товаров в карантине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQuarantineOffersResponse   {
  
  private ApiResponseStatusType status;
  private GetQuarantineOffersResultDTO result;

  public GetQuarantineOffersResponse () {

  }

  public GetQuarantineOffersResponse (ApiResponseStatusType status, GetQuarantineOffersResultDTO result) {
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
  public GetQuarantineOffersResultDTO getResult() {
    return result;
  }
  public void setResult(GetQuarantineOffersResultDTO result) {
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
    GetQuarantineOffersResponse getQuarantineOffersResponse = (GetQuarantineOffersResponse) o;
    return Objects.equals(status, getQuarantineOffersResponse.status) &&
        Objects.equals(result, getQuarantineOffersResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuarantineOffersResponse {\n");
    
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
