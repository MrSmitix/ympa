package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * GPS-координаты широты и долготы. 
 */
@ApiModel(description="GPS-координаты широты и долготы. ")

public class GpsDTO  {
  
 /**
  * Широта.
  */
  @ApiModelProperty(required = true, value = "Широта.")
  @Valid
  private BigDecimal latitude;

 /**
  * Долгота.
  */
  @ApiModelProperty(required = true, value = "Долгота.")
  @Valid
  private BigDecimal longitude;
 /**
  * Широта.
  * @return latitude
  */
  @JsonProperty("latitude")
  @NotNull
  public BigDecimal getLatitude() {
    return latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
 public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
  public GpsDTO latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
  * Долгота.
  * @return longitude
  */
  @JsonProperty("longitude")
  @NotNull
  public BigDecimal getLongitude() {
    return longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
 public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
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

