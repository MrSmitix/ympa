package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.FeedDownloadErrorDTO;
import org.openapitools.vertxweb.server.model.FeedStatusType;

/**
 * Информация о последней загрузке прайс-листа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedDownloadDTO   {
  
  private FeedStatusType status;
  private FeedDownloadErrorDTO error;

  public FeedDownloadDTO () {

  }

  public FeedDownloadDTO (FeedStatusType status, FeedDownloadErrorDTO error) {
    this.status = status;
    this.error = error;
  }

    
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("error")
  public FeedDownloadErrorDTO getError() {
    return error;
  }
  public void setError(FeedDownloadErrorDTO error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedDownloadDTO feedDownloadDTO = (FeedDownloadDTO) o;
    return Objects.equals(status, feedDownloadDTO.status) &&
        Objects.equals(error, feedDownloadDTO.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedDownloadDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
