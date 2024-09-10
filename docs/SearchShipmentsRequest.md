# SearchShipmentsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | **Date** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to nothing]
**dateTo** | **Date** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to nothing]
**statuses** | [**Vector{ShipmentStatusType}**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [default to nothing]
**orderIds** | **Vector{Int64}** | Список идентификаторов заказов из отгрузок. | [optional] [default to nothing]
**cancelledOrders** | **Bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


