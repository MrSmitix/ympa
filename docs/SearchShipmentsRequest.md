# SearchShipmentsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [***chrono::naive::NaiveDate**](date.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**date_to** | [***chrono::naive::NaiveDate**](date.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**statuses** | [**Vec<models::ShipmentStatusType>**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [default to None]
**order_ids** | **Vec<i64>** | Список идентификаторов заказов из отгрузок. | [optional] [default to None]
**cancelled_orders** | **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  | [optional] [default to Some(true)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


