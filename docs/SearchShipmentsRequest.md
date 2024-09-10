
# Table `SearchShipmentsRequest`
(mapped from: SearchShipmentsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dateFrom** | dateFrom | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**dateTo** | dateTo | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**statuses** | `One-To-Many` | `----` | `----`  | [**kotlin.collections.Set&lt;ShipmentStatusType&gt;**](ShipmentStatusType.md) | Список статусов отгрузок. |  [optional]
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Список идентификаторов заказов из отгрузок. |  [optional]
**cancelledOrders** | cancelledOrders | boolean |  | **kotlin.Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  |  [optional]




# **Table `SearchShipmentsRequestShipmentStatusType`**
(mapped from: SearchShipmentsRequestShipmentStatusType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchShipmentsRequest | searchShipmentsRequest | long | | kotlin.Long | Primary Key | *one*
shipmentStatusType | shipmentStatusType | long | | kotlin.Long | Foreign Key | *many*



# **Table `SearchShipmentsRequestOrderIds`**
(mapped from: SearchShipmentsRequestOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchShipmentsRequest | searchShipmentsRequest | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*




