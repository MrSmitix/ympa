package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ApiResponseStatusType;
import org.openapitools.vertxweb.server.model.OfferMappingSuggestionsListDTO;

/**
 * Ответ со списком рекомендованных карточек товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSuggestedOfferMappingEntriesResponse   {
  
  private ApiResponseStatusType status;
  private OfferMappingSuggestionsListDTO result;

  public GetSuggestedOfferMappingEntriesResponse () {

  }

  public GetSuggestedOfferMappingEntriesResponse (ApiResponseStatusType status, OfferMappingSuggestionsListDTO result) {
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
  public OfferMappingSuggestionsListDTO getResult() {
    return result;
  }
  public void setResult(OfferMappingSuggestionsListDTO result) {
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
    GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntriesResponse = (GetSuggestedOfferMappingEntriesResponse) o;
    return Objects.equals(status, getSuggestedOfferMappingEntriesResponse.status) &&
        Objects.equals(result, getSuggestedOfferMappingEntriesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingEntriesResponse {\n");
    
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
