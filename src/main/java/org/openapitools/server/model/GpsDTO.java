package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * GPS-координаты широты и долготы. 
 */
public class GpsDTO   {

    private BigDecimal latitude;
    private BigDecimal longitude;

    /**
     * Default constructor.
     */
    public GpsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GpsDTO.
     *
     * @param latitude Широта.
     * @param longitude Долгота.
     */
    public GpsDTO(
        BigDecimal latitude, 
        BigDecimal longitude
    ) {
        this.latitude = latitude;
        this.longitude = longitude;
    }



    /**
     * Широта.
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * Долгота.
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

