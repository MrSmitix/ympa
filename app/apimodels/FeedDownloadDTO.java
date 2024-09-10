package apimodels;

import apimodels.FeedDownloadErrorDTO;
import apimodels.FeedStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о последней загрузке прайс-листа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedDownloadDTO   {
  @JsonProperty("status")
  @Valid

  private FeedStatusType status;

  @JsonProperty("error")
  @Valid

  private FeedDownloadErrorDTO error;

  public FeedDownloadDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedDownloadDTO error(FeedDownloadErrorDTO error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

