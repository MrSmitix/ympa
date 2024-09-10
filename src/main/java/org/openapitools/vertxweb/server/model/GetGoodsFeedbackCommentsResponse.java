package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ApiResponseStatusType;
import org.openapitools.vertxweb.server.model.GoodsFeedbackCommentListDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGoodsFeedbackCommentsResponse   {
  
  private ApiResponseStatusType status;
  private GoodsFeedbackCommentListDTO result;

  public GetGoodsFeedbackCommentsResponse () {

  }

  public GetGoodsFeedbackCommentsResponse (ApiResponseStatusType status, GoodsFeedbackCommentListDTO result) {
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
  public GoodsFeedbackCommentListDTO getResult() {
    return result;
  }
  public void setResult(GoodsFeedbackCommentListDTO result) {
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
    GetGoodsFeedbackCommentsResponse getGoodsFeedbackCommentsResponse = (GetGoodsFeedbackCommentsResponse) o;
    return Objects.equals(status, getGoodsFeedbackCommentsResponse.status) &&
        Objects.equals(result, getGoodsFeedbackCommentsResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsFeedbackCommentsResponse {\n");
    
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
