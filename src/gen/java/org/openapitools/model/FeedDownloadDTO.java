package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedDownloadErrorDTO;
import org.openapitools.model.FeedStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о последней загрузке прайс-листа.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о последней загрузке прайс-листа.")
public class FeedDownloadDTO   {
  
  private FeedStatusType status;

  private FeedDownloadErrorDTO error;

  /**
   **/
  public FeedDownloadDTO status(FeedStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public FeedStatusType getStatus() {
    return status;
  }
  public void setStatus(FeedStatusType status) {
    this.status = status;
  }


  /**
   **/
  public FeedDownloadDTO error(FeedDownloadErrorDTO error) {
    this.error = error;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

