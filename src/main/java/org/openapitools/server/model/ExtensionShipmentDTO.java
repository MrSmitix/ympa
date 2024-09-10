package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.server.model.ShipmentActionType;
import org.openapitools.server.model.ShipmentStatusChangeDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об отгрузке.
 */
public class ExtensionShipmentDTO   {

    private ShipmentStatusChangeDTO currentStatus;
    private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public ExtensionShipmentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ExtensionShipmentDTO.
     *
     * @param currentStatus currentStatus
     * @param availableActions Доступные действия над отгрузкой.
     */
    public ExtensionShipmentDTO(
        ShipmentStatusChangeDTO currentStatus, 
        Set<ShipmentActionType> availableActions
    ) {
        this.currentStatus = currentStatus;
        this.availableActions = availableActions;
    }



    /**
     * Get currentStatus
     * @return currentStatus
     */
    public ShipmentStatusChangeDTO getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * Доступные действия над отгрузкой.
     * @return availableActions
     */
    public Set<ShipmentActionType> getAvailableActions() {
        return availableActions;
    }

    public void setAvailableActions(Set<ShipmentActionType> availableActions) {
        this.availableActions = availableActions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionShipmentDTO {\n");
        
        sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
        sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
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

