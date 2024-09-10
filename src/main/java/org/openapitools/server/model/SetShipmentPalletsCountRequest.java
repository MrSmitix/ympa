package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на передачу количества упаковок в отгрузке.
 */
public class SetShipmentPalletsCountRequest   {

    private Integer placesCount;

    /**
     * Default constructor.
     */
    public SetShipmentPalletsCountRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetShipmentPalletsCountRequest.
     *
     * @param placesCount Количество упаковок в отгрузке.
     */
    public SetShipmentPalletsCountRequest(
        Integer placesCount
    ) {
        this.placesCount = placesCount;
    }



    /**
     * Количество упаковок в отгрузке.
     * minimum: 0
     * @return placesCount
     */
    public Integer getPlacesCount() {
        return placesCount;
    }

    public void setPlacesCount(Integer placesCount) {
        this.placesCount = placesCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetShipmentPalletsCountRequest {\n");
        
        sb.append("    placesCount: ").append(toIndentedString(placesCount)).append("\n");
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

