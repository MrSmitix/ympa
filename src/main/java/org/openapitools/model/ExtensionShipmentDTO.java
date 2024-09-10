package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об отгрузке.
 */

@Schema(name = "ExtensionShipmentDTO", description = "Информация об отгрузке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ExtensionShipmentDTO {

  private ShipmentStatusChangeDTO currentStatus;

  @Valid
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ExtensionShipmentDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExtensionShipmentDTO(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }

  public ExtensionShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
   */
  @Valid 
  @Schema(name = "currentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStatus")
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
  @NotNull @Valid 
  @Schema(name = "availableActions", description = "Доступные действия над отгрузкой.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availableActions")
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

