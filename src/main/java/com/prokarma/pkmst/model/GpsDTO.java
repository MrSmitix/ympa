package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GPS-координаты широты и долготы. 
 */
@ApiModel(description = "GPS-координаты широты и долготы. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GpsDTO   {
  @JsonProperty("latitude")
  private BigDecimal latitude;

  @JsonProperty("longitude")
  private BigDecimal longitude;

  public GpsDTO latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Широта.
   * @return latitude
   */
  @ApiModelProperty(required = true, value = "Широта.")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public GpsDTO longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Долгота.
   * @return longitude
   */
  @ApiModelProperty(required = true, value = "Долгота.")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpsDTO gpsDTO = (GpsDTO) o;
    return Objects.equals(this.latitude, gpsDTO.latitude) &&
        Objects.equals(this.longitude, gpsDTO.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpsDTO {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

