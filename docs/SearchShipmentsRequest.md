
# SearchShipmentsRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  |
| **dateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  |
| **statuses** | [**kotlin.collections.Set&lt;ShipmentStatusType&gt;**](ShipmentStatusType.md) | Список статусов отгрузок. |  [optional] |
| **orderIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Список идентификаторов заказов из отгрузок. |  [optional] |
| **cancelledOrders** | **kotlin.Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  |  [optional] |



