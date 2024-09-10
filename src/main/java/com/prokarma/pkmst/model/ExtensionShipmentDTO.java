package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.prokarma.pkmst.model.ShipmentActionType;
import com.prokarma.pkmst.model.ShipmentStatusChangeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об отгрузке.
 */
@ApiModel(description = "Информация об отгрузке.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ExtensionShipmentDTO   {
  @JsonProperty("currentStatus")
  private ShipmentStatusChangeDTO currentStatus;

  @JsonProperty("availableActions")
  
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ExtensionShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

