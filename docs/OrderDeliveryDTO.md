
# Table `OrderDeliveryDTO`
(mapped from: OrderDeliveryDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  |  [optional]
**type** | type | long |  | [**OrderDeliveryType**](OrderDeliveryType.md) |  |  [optional] [foreignkey]
**serviceName** | serviceName | text |  | **kotlin.String** | Наименование службы доставки. |  [optional]
**price** | price | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  |  [optional]
**deliveryPartnerType** | deliveryPartnerType | long |  | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  |  [optional] [foreignkey]
**courier** | courier | long |  | [**OrderCourierDTO**](OrderCourierDTO.md) |  |  [optional] [foreignkey]
**dates** | dates | long |  | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  |  [optional] [foreignkey]
**region** | region | long |  | [**RegionDTO**](RegionDTO.md) |  |  [optional] [foreignkey]
**address** | address | long |  | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  |  [optional] [foreignkey]
**vat** | vat | long |  | [**OrderVatType**](OrderVatType.md) |  |  [optional] [foreignkey]
**deliveryServiceId** | deliveryServiceId | long |  | **kotlin.Long** | Идентификатор службы доставки. |  [optional]
**liftType** | liftType | long |  | [**OrderLiftType**](OrderLiftType.md) |  |  [optional] [foreignkey]
**liftPrice** | liftPrice | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость подъема на этаж. |  [optional]
**outletCode** | outletCode | text |  | **kotlin.String** | Идентификатор пункта самовывоза, присвоенный магазином. |  [optional]
**outletStorageLimitDate** | outletStorageLimitDate | text |  | **kotlin.String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional]
**dispatchType** | dispatchType | long |  | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  |  [optional] [foreignkey]
**tracks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. |  [optional]
**shipments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderShipmentDTO&gt;**](OrderShipmentDTO.md) | Информация о посылках. |  [optional]
**estimated** | estimated | boolean |  | **kotlin.Boolean** | Приблизительная ли дата доставки. |  [optional]
**eacType** | eacType | long |  | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  |  [optional] [foreignkey]
**eacCode** | eacCode | text |  | **kotlin.String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  |  [optional]


















# **Table `OrderDeliveryDTOOrderTrackDTO`**
(mapped from: OrderDeliveryDTOOrderTrackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderDeliveryDTO | orderDeliveryDTO | long | | kotlin.Long | Primary Key | *one*
orderTrackDTO | orderTrackDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrderDeliveryDTOOrderShipmentDTO`**
(mapped from: OrderDeliveryDTOOrderShipmentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderDeliveryDTO | orderDeliveryDTO | long | | kotlin.Long | Primary Key | *one*
orderShipmentDTO | orderShipmentDTO | long | | kotlin.Long | Foreign Key | *many*






