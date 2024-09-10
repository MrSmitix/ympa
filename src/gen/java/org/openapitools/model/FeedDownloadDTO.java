package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.FeedDownloadErrorDTO;
import org.openapitools.model.FeedStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о последней загрузке прайс-листа.
 **/
@ApiModel(description="Информация о последней загрузке прайс-листа.")

public class FeedDownloadDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FeedStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private FeedDownloadErrorDTO error;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }

  public void setStatus(FeedStatusType status) {
    this.status = status;
  }

  public FeedDownloadDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public FeedDownloadErrorDTO getError() {
    return error;
  }

  public void setError(FeedDownloadErrorDTO error) {
    this.error = error;
  }

  public FeedDownloadDTO error(FeedDownloadErrorDTO error) {
    this.error = error;
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
    FeedDownloadDTO feedDownloadDTO = (FeedDownloadDTO) o;
    return Objects.equals(this.status, feedDownloadDTO.status) &&
        Objects.equals(this.error, feedDownloadDTO.error);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

