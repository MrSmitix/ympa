# Api.SearchShipmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | **Date** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**dateTo** | **Date** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**[ShipmentStatusType]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**orderIds** | **[Number]** | Список идентификаторов заказов из отгрузок. | [optional] 
**cancelledOrders** | **Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to true]


