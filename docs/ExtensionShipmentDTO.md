
# Table `ExtensionShipmentDTO`
(mapped from: ExtensionShipmentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**availableActions** | `One-To-Many` | `----` | `----`  | [**kotlin.collections.Set&lt;ShipmentActionType&gt;**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 
**currentStatus** | currentStatus | long |  | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  |  [optional] [foreignkey]


# **Table `ExtensionShipmentDTOShipmentActionType`**
(mapped from: ExtensionShipmentDTOShipmentActionType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
extensionShipmentDTO | extensionShipmentDTO | long | | kotlin.Long | Primary Key | *one*
shipmentActionType | shipmentActionType | long | | kotlin.Long | Foreign Key | *many*




