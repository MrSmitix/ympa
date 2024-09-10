package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AddOffersToArchiveDTO;
import org.openapitools.vertxweb.server.model.ApiResponseStatusType;

/**
 * Результат архивации товаров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddOffersToArchiveResponse   {
  
  private ApiResponseStatusType status;
  private AddOffersToArchiveDTO result;

  public AddOffersToArchiveResponse () {

  }

  public AddOffersToArchiveResponse (ApiResponseStatusType status, AddOffersToArchiveDTO result) {
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
  public AddOffersToArchiveDTO getResult() {
    return result;
  }
  public void setResult(AddOffersToArchiveDTO result) {
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
    AddOffersToArchiveResponse addOffersToArchiveResponse = (AddOffersToArchiveResponse) o;
    return Objects.equals(status, addOffersToArchiveResponse.status) &&
        Objects.equals(result, addOffersToArchiveResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOffersToArchiveResponse {\n");
    
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
