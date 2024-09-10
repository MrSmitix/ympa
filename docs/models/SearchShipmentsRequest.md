

# SearchShipmentsRequest

Запрос информации об отгрузках.

The class is defined in **[SearchShipmentsRequest.java](../../src/main/java/org/openapitools/model/SearchShipmentsRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateFrom** | `LocalDate` | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**dateTo** | `LocalDate` | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | `Set&lt;ShipmentStatusType&gt;` | Список статусов отгрузок. |  [optional property]
**orderIds** | `Set&lt;Long&gt;` | Список идентификаторов заказов из отгрузок. |  [optional property]
**cancelledOrders** | `Boolean` | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  |  [optional property]







