package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.vertxweb.server.model.ShipmentActionType;
import org.openapitools.vertxweb.server.model.ShipmentStatusChangeDTO;

/**
 * Информация об отгрузке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtensionShipmentDTO   {
  
  private ShipmentStatusChangeDTO currentStatus;
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ExtensionShipmentDTO () {

  }

  public ExtensionShipmentDTO (ShipmentStatusChangeDTO currentStatus, Set<ShipmentActionType> availableActions) {
    this.currentStatus = currentStatus;
    this.availableActions = availableActions;
  }

    
  @JsonProperty("currentStatus")
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }
  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

    
  @JsonProperty("availableActions")
  public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }
  public void setAvailableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionShipmentDTO extensionShipmentDTO = (ExtensionShipmentDTO) o;
    return Objects.equals(currentStatus, extensionShipmentDTO.currentStatus) &&
        Objects.equals(availableActions, extensionShipmentDTO.availableActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentStatus, availableActions);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
