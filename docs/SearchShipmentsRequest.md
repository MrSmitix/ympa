# WWW::OpenAPIClient::Object::SearchShipmentsRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SearchShipmentsRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **DATE** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**date_to** | **DATE** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**ARRAY[ShipmentStatusType]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**order_ids** | **ARRAY[int]** | Список идентификаторов заказов из отгрузок. | [optional] 
**cancelled_orders** | **boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


