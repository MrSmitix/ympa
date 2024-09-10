package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о трек-номерах.
 **/

@ApiModel(description = "Информация о трек-номерах.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TrackDTO   {
  @JsonProperty("trackCode")
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
    return Objects.equals(trackCode, trackDTO.trackCode);
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

