# SearchShipmentsRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **dateFrom** | **date** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to null] |
| **dateTo** | **date** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to null] |
| **statuses** | [**Set**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [default to null] |
| **orderIds** | **Set** | Список идентификаторов заказов из отгрузок. | [optional] [default to null] |
| **cancelledOrders** | **Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

