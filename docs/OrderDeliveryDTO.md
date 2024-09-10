
# OrderDeliveryDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  |  [optional] |
| **type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  |  [optional] |
| **serviceName** | **kotlin.String** | Наименование службы доставки. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  |  [optional] |
| **deliveryPartnerType** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  |  [optional] |
| **courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  |  [optional] |
| **dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  |  [optional] |
| **region** | [**RegionDTO**](RegionDTO.md) |  |  [optional] |
| **address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  |  [optional] |
| **vat** | [**OrderVatType**](OrderVatType.md) |  |  [optional] |
| **deliveryServiceId** | **kotlin.Long** | Идентификатор службы доставки. |  [optional] |
| **liftType** | [**OrderLiftType**](OrderLiftType.md) |  |  [optional] |
| **liftPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость подъема на этаж. |  [optional] |
| **outletCode** | **kotlin.String** | Идентификатор пункта самовывоза, присвоенный магазином. |  [optional] |
| **outletStorageLimitDate** | **kotlin.String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional] |
| **dispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  |  [optional] |
| **tracks** | [**kotlin.collections.List&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. |  [optional] |
| **shipments** | [**kotlin.collections.List&lt;OrderShipmentDTO&gt;**](OrderShipmentDTO.md) | Информация о посылках. |  [optional] |
| **estimated** | **kotlin.Boolean** | Приблизительная ли дата доставки. |  [optional] |
| **eacType** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  |  [optional] |
| **eacCode** | **kotlin.String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  |  [optional] |



