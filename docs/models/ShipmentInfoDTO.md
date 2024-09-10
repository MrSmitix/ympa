

# ShipmentInfoDTO

Список с информацией об отгрузках.

The class is defined in **[ShipmentInfoDTO.java](../../src/main/java/org/openapitools/model/ShipmentInfoDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор отгрузки. |  [optional property]
**planIntervalFrom** | `OffsetDateTime` | Начало планового интервала отгрузки. |  [optional property]
**planIntervalTo** | `OffsetDateTime` | Конец планового интервала отгрузки. |  [optional property]
**shipmentType** | `ShipmentType` |  |  [optional property]
**warehouse** | [`PartnerShipmentWarehouseDTO`](PartnerShipmentWarehouseDTO.md) |  |  [optional property]
**warehouseTo** | [`PartnerShipmentWarehouseDTO`](PartnerShipmentWarehouseDTO.md) |  |  [optional property]
**externalId** | `String` | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. |  [optional property]
**deliveryService** | [`DeliveryServiceDTO`](DeliveryServiceDTO.md) |  |  [optional property]
**palletsCount** | [`PalletsCountDTO`](PalletsCountDTO.md) |  |  [optional property]
**orderIds** | `Set&lt;Long&gt;` | Идентификаторы заказов в отгрузке. | 
**draftCount** | `Integer` | Количество заказов, которое Маркет запланировал к отгрузке. |  [optional property]
**plannedCount** | `Integer` | Количество заказов, которое Маркет подтвердил к отгрузке. |  [optional property]
**factCount** | `Integer` | Количество заказов, принятых в сортировочном центре или пункте приема. |  [optional property]
**status** | `ShipmentStatusType` |  |  [optional property]
**statusDescription** | `String` | Описание статуса отгрузки. |  [optional property]
**statusUpdateTime** | `OffsetDateTime` | Время последнего изменения статуса отгрузки. |  [optional property]


















