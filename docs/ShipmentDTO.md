# ShipmentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [optional] [default to null]
**planIntervalFrom** | **string** |  | [optional] [default to null]
**planIntervalTo** | **string** |  | [optional] [default to null]
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] [default to null]
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] [default to null]
**externalId** | **string** |  | [optional] [default to null]
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] [default to null]
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] [default to null]
**orderIds** | **Set[integer]** |  | [default to null]
**draftCount** | **integer** |  | [optional] [default to null]
**plannedCount** | **integer** |  | [optional] [default to null]
**factCount** | **integer** |  | [optional] [default to null]
**currentStatus** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] [default to null]
**availableActions** | [**Set[ShipmentActionType]**](ShipmentActionType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


