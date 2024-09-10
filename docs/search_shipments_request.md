# search_shipments_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **char \*** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**date_to** | **char \*** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**list_t**](shipment_status_type.md) \* | Список статусов отгрузок. | [optional] 
**order_ids** | **list_t \*** | Список идентификаторов заказов из отгрузок. | [optional] 
**cancelled_orders** | **int** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


