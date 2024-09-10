package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос для подтверждения отгрузки.
 */
public class ConfirmShipmentRequest   {

    private String externalShipmentId;

    /**
     * Default constructor.
     */
    public ConfirmShipmentRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ConfirmShipmentRequest.
     *
     * @param externalShipmentId Идентификатор отгрузки в системе поставщика.
     */
    public ConfirmShipmentRequest(
        String externalShipmentId
    ) {
        this.externalShipmentId = externalShipmentId;
    }



    /**
     * Идентификатор отгрузки в системе поставщика.
     * @return externalShipmentId
     */
    public String getExternalShipmentId() {
        return externalShipmentId;
    }

    public void setExternalShipmentId(String externalShipmentId) {
        this.externalShipmentId = externalShipmentId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmShipmentRequest {\n");
        
        sb.append("    externalShipmentId: ").append(toIndentedString(externalShipmentId)).append("\n");
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

