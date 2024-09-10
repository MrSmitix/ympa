package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;



/**
 * Информация об отгрузке.
 **/

@ApiModel(description = "Информация об отгрузке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ExtensionShipmentDTO   {
  @JsonProperty("currentStatus")
  private ShipmentStatusChangeDTO currentStatus;

  @JsonProperty("availableActions")
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  /**
   **/
  public ExtensionShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentStatus")
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }
  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  /**
   * Доступные действия над отгрузкой.
   **/
  public ExtensionShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
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

