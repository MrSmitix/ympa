package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об отгрузке.
 */
@ApiModel(description="Информация об отгрузке.")

public class ExtensionShipmentDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ShipmentStatusChangeDTO currentStatus;

 /**
  * Доступные действия над отгрузкой.
  */
  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
  @Valid
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();
 /**
  * Get currentStatus
  * @return currentStatus
  */
  @JsonProperty("currentStatus")
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }

  /**
   * Sets the <code>currentStatus</code> property.
   */
 public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  /**
   * Sets the <code>currentStatus</code> property.
   */
  public ExtensionShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

 /**
  * Доступные действия над отгрузкой.
  * @return availableActions
  */
  @JsonProperty("availableActions")
  @NotNull
  public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }

  /**
   * Sets the <code>availableActions</code> property.
   */
 @JsonDeserialize(as = LinkedHashSet.class)
 public void setAvailableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }

  /**
   * Sets the <code>availableActions</code> property.
   */
  public ExtensionShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  /**
   * Adds a new item to the <code>availableActions</code> list.
   */
  public ExtensionShipmentDTO addAvailableActionsItem(ShipmentActionType availableActionsItem) {
    this.availableActions.add(availableActionsItem);
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
    ExtensionShipmentDTO extensionShipmentDTO = (ExtensionShipmentDTO) o;
    return Objects.equals(this.currentStatus, extensionShipmentDTO.currentStatus) &&
        Objects.equals(this.availableActions, extensionShipmentDTO.availableActions);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

