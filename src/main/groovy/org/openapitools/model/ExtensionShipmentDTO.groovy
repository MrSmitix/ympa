package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;

@Canonical
class ExtensionShipmentDTO {
    
    ShipmentStatusChangeDTO currentStatus
    /* Доступные действия над отгрузкой. */
    Set<ShipmentActionType> availableActions = new LinkedHashSet<>()
}
