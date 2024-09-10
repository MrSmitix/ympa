package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о трек-номерах.
 **/
@ApiModel(description="Информация о трек-номерах.")

public class TrackDTO  {
  
  @ApiModelProperty(value = "Трек-код почтового отправления.")
 /**
   * Трек-код почтового отправления.
  **/
  private String trackCode;
 /**
   * Трек-код почтового отправления.
   * @return trackCode
  **/
  @JsonProperty("trackCode")
  public String getTrackCode() {
    return trackCode;
  }

  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
  }

  public TrackDTO trackCode(String trackCode) {
    this.trackCode = trackCode;
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
    TrackDTO trackDTO = (TrackDTO) o;
    return Objects.equals(this.trackCode, trackDTO.trackCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackDTO {\n");
    
    sb.append("    trackCode: ").append(toIndentedString(trackCode)).append("\n");
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

