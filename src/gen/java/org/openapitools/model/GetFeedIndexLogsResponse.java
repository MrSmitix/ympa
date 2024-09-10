package org.openapitools.model;

import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.FeedIndexLogsResultDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetFeedIndexLogsResponse  {
  
  @ApiModelProperty(value = "")
  private ApiResponseStatusType status;

  @ApiModelProperty(value = "")
  private FeedIndexLogsResultDTO result;
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

  public GetFeedIndexLogsResponse status(ApiResponseStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  public FeedIndexLogsResultDTO getResult() {
    return result;
  }

  public void setResult(FeedIndexLogsResultDTO result) {
    this.result = result;
  }

  public GetFeedIndexLogsResponse result(FeedIndexLogsResultDTO result) {
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
    GetFeedIndexLogsResponse getFeedIndexLogsResponse = (GetFeedIndexLogsResponse) o;
    return Objects.equals(this.status, getFeedIndexLogsResponse.status) &&
        Objects.equals(this.result, getFeedIndexLogsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeedIndexLogsResponse {\n");
    
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

