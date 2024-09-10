package apimodels;

import apimodels.ShipmentActionType;
import apimodels.ShipmentStatusChangeDTO;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об отгрузке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ExtensionShipmentDTO   {
  @JsonProperty("currentStatus")
  @Valid

  private ShipmentStatusChangeDTO currentStatus;

  @JsonProperty("availableActions")
  @NotNull
@Valid

  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ExtensionShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ExtensionShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public ExtensionShipmentDTO addAvailableActionsItem(ShipmentActionType availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new LinkedHashSet<>();
    }
    this.availableActions.add(availableActionsItem);
    return this;
  }

   /**
   * Доступные действия над отгрузкой.
   * @return availableActions
  **/
  public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

