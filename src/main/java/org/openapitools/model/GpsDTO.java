package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GPS-координаты широты и долготы. 
 */

@Schema(name = "GpsDTO", description = "GPS-координаты широты и долготы. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GpsDTO {

  private BigDecimal latitude;

  private BigDecimal longitude;

  public GpsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GpsDTO(BigDecimal latitude, BigDecimal longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public GpsDTO latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Широта.
   * @return latitude
   */
  @NotNull @Valid 
  @Schema(name = "latitude", description = "Широта.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latitude")
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
  @NotNull @Valid 
  @Schema(name = "longitude", description = "Долгота.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("longitude")
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
