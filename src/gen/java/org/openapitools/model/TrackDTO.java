package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о трек-номерах.
 **/
@ApiModel(description = "Информация о трек-номерах.")
@JsonTypeName("TrackDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TrackDTO   {
  private String trackCode;

  /**
   * Трек-код почтового отправления.
   **/
  public TrackDTO trackCode(String trackCode) {
    this.trackCode = trackCode;
    return this;
  }

  
  @ApiModelProperty(value = "Трек-код почтового отправления.")
  @JsonProperty("trackCode")
  public String getTrackCode() {
    return trackCode;
  }

  @JsonProperty("trackCode")
  public void setTrackCode(String trackCode) {
    this.trackCode = trackCode;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

