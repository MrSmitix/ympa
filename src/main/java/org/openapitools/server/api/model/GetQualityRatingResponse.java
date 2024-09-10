package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.ApiResponseStatusType;
import org.openapitools.server.api.model.CampaignsQualityRatingDTO;

/**
 * Информация об индексе качества магазинов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQualityRatingResponse   {
  
  private ApiResponseStatusType status;
  private CampaignsQualityRatingDTO result;

  public GetQualityRatingResponse () {

  }

  public GetQualityRatingResponse (ApiResponseStatusType status, CampaignsQualityRatingDTO result) {
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
  public CampaignsQualityRatingDTO getResult() {
    return result;
  }
  public void setResult(CampaignsQualityRatingDTO result) {
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
    GetQualityRatingResponse getQualityRatingResponse = (GetQualityRatingResponse) o;
    return Objects.equals(status, getQualityRatingResponse.status) &&
        Objects.equals(result, getQualityRatingResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQualityRatingResponse {\n");
    
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
