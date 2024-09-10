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
import org.openapitools.server.api.model.UpdateOfferContentResultDTO;

/**
 * Описывает проблемы, которые появились при сохранении товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferContentResponse   {
  
  private ApiResponseStatusType status;
  private List<UpdateOfferContentResultDTO> results;

  public UpdateOfferContentResponse () {

  }

  public UpdateOfferContentResponse (ApiResponseStatusType status, List<UpdateOfferContentResultDTO> results) {
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
  public List<UpdateOfferContentResultDTO> getResults() {
    return results;
  }
  public void setResults(List<UpdateOfferContentResultDTO> results) {
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
    UpdateOfferContentResponse updateOfferContentResponse = (UpdateOfferContentResponse) o;
    return Objects.equals(status, updateOfferContentResponse.status) &&
        Objects.equals(results, updateOfferContentResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentResponse {\n");
    
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
