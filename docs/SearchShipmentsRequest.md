# ympa_r_client::SearchShipmentsRequest

Запрос информации об отгрузках.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | **character** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**dateTo** | **character** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | [**set[ShipmentStatusType]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] [Min. items: 1] 
**orderIds** | **set[integer]** | Список идентификаторов заказов из отгрузок. | [optional] [Min. items: 1] 
**cancelledOrders** | **character** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to TRUE] 


