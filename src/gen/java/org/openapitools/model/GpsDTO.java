package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * GPS-координаты широты и долготы. 
 **/
@ApiModel(description="GPS-координаты широты и долготы. ")

public class GpsDTO  {
  
  @ApiModelProperty(required = true, value = "Широта.")
 /**
   * Широта.
  **/
  private BigDecimal latitude;

  @ApiModelProperty(required = true, value = "Долгота.")
 /**
   * Долгота.
  **/
  private BigDecimal longitude;
 /**
   * Широта.
   * @return latitude
  **/
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public GpsDTO latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Долгота.
   * @return longitude
  **/
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public GpsDTO longitude(BigDecimal longitude) {
    this.longitude = longitude;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

