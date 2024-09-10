package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GPS-координаты широты и долготы. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "GPS-координаты широты и долготы. ")
public class GpsDTO   {
  
  private BigDecimal latitude;

  private BigDecimal longitude;

  /**
   * Широта.
   **/
  public GpsDTO latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Широта.")
  @JsonProperty("latitude")
  @NotNull
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  /**
   * Долгота.
   **/
  public GpsDTO longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Долгота.")
  @JsonProperty("longitude")
  @NotNull
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

