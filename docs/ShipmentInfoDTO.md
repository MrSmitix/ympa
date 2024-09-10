

# ShipmentInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор отгрузки. |  [optional]
**planIntervalFrom** | [**Date**](Date.md) | Начало планового интервала отгрузки. |  [optional]
**planIntervalTo** | [**Date**](Date.md) | Конец планового интервала отгрузки. |  [optional]
**shipmentType** | [**ShipmentType**](ShipmentType.md) |  |  [optional]
**warehouse** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional]
**warehouseTo** | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional]
**externalId** | **String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. |  [optional]
**deliveryService** | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  |  [optional]
**palletsCount** | [**PalletsCountDTO**](PalletsCountDTO.md) |  |  [optional]
**orderIds** | **Set&lt;Long&gt;** | Идентификаторы заказов в отгрузке. | 
**draftCount** | **Integer** | Количество заказов, которое Маркет запланировал к отгрузке. |  [optional]
**plannedCount** | **Integer** | Количество заказов, которое Маркет подтвердил к отгрузке. |  [optional]
**factCount** | **Integer** | Количество заказов, принятых в сортировочном центре или пункте приема. |  [optional]
**status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  |  [optional]
**statusDescription** | **String** | Описание статуса отгрузки. |  [optional]
**statusUpdateTime** | [**Date**](Date.md) | Время последнего изменения статуса отгрузки. |  [optional]




