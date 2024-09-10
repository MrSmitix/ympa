package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.UpdateOfferMappingResultDTO;

/**
 * Описывает проблемы, возникшие при сохранении товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingsResponse   {
  
  private ApiResponseStatusType status;
  private List<UpdateOfferMappingResultDTO> results;

  public UpdateOfferMappingsResponse () {

  }

  public UpdateOfferMappingsResponse (ApiResponseStatusType status, List<UpdateOfferMappingResultDTO> results) {
    this.status = status;
    this.results = results;
  }

    
  @JsonProperty("status")
  public ApiResponseStatusType getStatus() {
    return status;
  }
  public void setStatus(ApiResponseStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("results")
  public List<UpdateOfferMappingResultDTO> getResults() {
    return results;
  }
  public void setResults(List<UpdateOfferMappingResultDTO> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingsResponse updateOfferMappingsResponse = (UpdateOfferMappingsResponse) o;
    return Objects.equals(status, updateOfferMappingsResponse.status) &&
        Objects.equals(results, updateOfferMappingsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingsResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
