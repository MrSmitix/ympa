# ympa_csharp_client.Model.SearchShipmentsRequest
Запрос информации об отгрузках.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | **DateOnly** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**DateTo** | **DateOnly** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**Statuses** | [**List&lt;ShipmentStatusType&gt;**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**OrderIds** | **List&lt;long&gt;** | Список идентификаторов заказов из отгрузок. | [optional] 
**CancelledOrders** | **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

