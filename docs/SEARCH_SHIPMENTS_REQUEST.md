# SEARCH_SHIPMENTS_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [**DATE**](DATE.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to null]
**date_to** | [**DATE**](DATE.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [default to null]
**statuses** | [**LIST [SHIPMENT_STATUS_TYPE]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [default to null]
**order_ids** | **LIST [INTEGER_64]** | Список идентификаторов заказов из отгрузок. | [optional] [default to null]
**cancelled_orders** | **BOOLEAN** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


