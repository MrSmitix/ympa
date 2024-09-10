

# OrderDeliveryDTO

Информация о доставке.

The class is defined in **[OrderDeliveryDTO.java](../../src/main/java/org/openapitools/model/OrderDeliveryDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  |  [optional property]
**type** | `OrderDeliveryType` |  |  [optional property]
**serviceName** | `String` | Наименование службы доставки. |  [optional property]
**price** | `BigDecimal` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  |  [optional property]
**deliveryPartnerType** | `OrderDeliveryPartnerType` |  |  [optional property]
**courier** | [`OrderCourierDTO`](OrderCourierDTO.md) |  |  [optional property]
**dates** | [`OrderDeliveryDatesDTO`](OrderDeliveryDatesDTO.md) |  |  [optional property]
**region** | [`RegionDTO`](RegionDTO.md) |  |  [optional property]
**address** | [`OrderDeliveryAddressDTO`](OrderDeliveryAddressDTO.md) |  |  [optional property]
**vat** | `OrderVatType` |  |  [optional property]
**deliveryServiceId** | `Long` | Идентификатор службы доставки. |  [optional property]
**liftType** | `OrderLiftType` |  |  [optional property]
**liftPrice** | `BigDecimal` | Стоимость подъема на этаж. |  [optional property]
**outletCode** | `String` | Идентификатор пункта самовывоза, присвоенный магазином. |  [optional property]
**outletStorageLimitDate** | `String` | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional property]
**dispatchType** | `OrderDeliveryDispatchType` |  |  [optional property]
**tracks** | [`List&lt;OrderTrackDTO&gt;`](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. |  [optional property]
**shipments** | [`List&lt;OrderShipmentDTO&gt;`](OrderShipmentDTO.md) | Информация о посылках. |  [optional property]
**estimated** | `Boolean` | Приблизительная ли дата доставки. |  [optional property]
**eacType** | `OrderDeliveryEacType` |  |  [optional property]
**eacCode** | `String` | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  |  [optional property]























