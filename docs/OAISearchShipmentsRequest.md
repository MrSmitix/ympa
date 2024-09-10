# OAISearchShipmentsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | **NSDate*** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**dateTo** | **NSDate*** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**OAISet&lt;OAIShipmentStatusType&gt;***](OAIShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**orderIds** | **OAISet&lt;NSNumber*&gt;*** | Список идентификаторов заказов из отгрузок. | [optional] 
**cancelledOrders** | **NSNumber*** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to @(YES)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


