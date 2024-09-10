# SearchShipmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | [**String**](string.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**date_to** | [**String**](string.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`.  | 
**statuses** | Option<[**Vec<models::ShipmentStatusType>**](ShipmentStatusType.md)> | Список статусов отгрузок. | [optional]
**order_ids** | Option<**Vec<i64>**> | Список идентификаторов заказов из отгрузок. | [optional]
**cancelled_orders** | Option<**bool**> | Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  | [optional][default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


