package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о трек-номерах.
 */
public class TrackDTO   {

    private String trackCode;

    /**
     * Default constructor.
     */
    public TrackDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create TrackDTO.
     *
     * @param trackCode Трек-код почтового отправления.
     */
    public TrackDTO(
        String trackCode
    ) {
        this.trackCode = trackCode;
    }



    /**
     * Трек-код почтового отправления.
     * @return trackCode
     */
    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

