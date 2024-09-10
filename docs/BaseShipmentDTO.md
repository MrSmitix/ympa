
# Table `BaseShipmentDTO`
(mapped from: BaseShipmentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Идентификаторы заказов в отгрузке. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор отгрузки. |  [optional]
**planIntervalFrom** | planIntervalFrom | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Начало планового интервала отгрузки. |  [optional]
**planIntervalTo** | planIntervalTo | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Конец планового интервала отгрузки. |  [optional]
**shipmentType** | shipmentType | long |  | [**ShipmentType**](ShipmentType.md) |  |  [optional] [foreignkey]
**warehouse** | warehouse | long |  | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional] [foreignkey]
**warehouseTo** | warehouseTo | long |  | [**PartnerShipmentWarehouseDTO**](PartnerShipmentWarehouseDTO.md) |  |  [optional] [foreignkey]
**externalId** | externalId | text |  | **kotlin.String** | Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;. |  [optional]
**deliveryService** | deliveryService | long |  | [**DeliveryServiceDTO**](DeliveryServiceDTO.md) |  |  [optional] [foreignkey]
**palletsCount** | palletsCount | long |  | [**PalletsCountDTO**](PalletsCountDTO.md) |  |  [optional] [foreignkey]
**draftCount** | draftCount | int |  | **kotlin.Int** | Количество заказов, которое Маркет запланировал к отгрузке. |  [optional]
**plannedCount** | plannedCount | int |  | **kotlin.Int** | Количество заказов, которое Маркет подтвердил к отгрузке. |  [optional]
**factCount** | factCount | int |  | **kotlin.Int** | Количество заказов, принятых в сортировочном центре или пункте приема. |  [optional]


# **Table `BaseShipmentDTOOrderIds`**
(mapped from: BaseShipmentDTOOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
baseShipmentDTO | baseShipmentDTO | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*















