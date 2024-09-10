# ShipmentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор отгрузки. | [optional] 
**PlanIntervalFrom** | **System.DateTime** | Начало планового интервала отгрузки. | [optional] 
**PlanIntervalTo** | **System.DateTime** | Конец планового интервала отгрузки. | [optional] 
**ShipmentType** | [**ShipmentType**](ShipmentType.md) |  | [optional] 
**Warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**WarehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  | [optional] 
**ExternalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. | [optional] 
**DeliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  | [optional] 
**PalletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  | [optional] 
**OrderIds** | **Int64[]** | Идентификаторы заказов в отгрузке. | 
**DraftCount** | **Int32** | Количество заказов, которое Маркет запланировал к отгрузке. | [optional] 
**PlannedCount** | **Int32** | Количество заказов, которое Маркет подтвердил к отгрузке. | [optional] 
**FactCount** | **Int32** | Количество заказов, принятых в сортировочном центре или пункте приема. | [optional] 
**CurrentStatus** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] 
**AvailableActions** | [**ShipmentActionType[]**](ShipmentActionType.md) | Доступные действия над отгрузкой. | 

## Examples

- Prepare the resource
```powershell
$ShipmentDTO = Initialize-ympa_powershell_clientShipmentDTO  -Id null `
 -PlanIntervalFrom null `
 -PlanIntervalTo null `
 -ShipmentType null `
 -Warehouse null `
 -WarehouseTo null `
 -ExternalId null `
 -DeliveryService null `
 -PalletsCount null `
 -OrderIds null `
 -DraftCount null `
 -PlannedCount null `
 -FactCount null `
 -CurrentStatus null `
 -AvailableActions null
```

- Convert the resource to JSON
```powershell
$ShipmentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

