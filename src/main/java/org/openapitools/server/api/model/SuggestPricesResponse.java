package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.SuggestPricesResultDTO;

/**
 * Ответ на запрос списка цен для продвижения.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuggestPricesResponse   {
  
  private ApiResponseStatusType status;
  private SuggestPricesResultDTO result;

  public SuggestPricesResponse () {

  }

  public SuggestPricesResponse (ApiResponseStatusType status, SuggestPricesResultDTO result) {
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
  public SuggestPricesResultDTO getResult() {
    return result;
  }
  public void setResult(SuggestPricesResultDTO result) {
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
    SuggestPricesResponse suggestPricesResponse = (SuggestPricesResponse) o;
    return Objects.equals(status, suggestPricesResponse.status) &&
        Objects.equals(result, suggestPricesResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesResponse {\n");
    
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
