

# OrderDeliveryDTO

Информация о доставке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  |  [optional]
**`type`** | **OrderDeliveryType** |  |  [optional]
**serviceName** | **String** | Наименование службы доставки. |  [optional]
**price** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  |  [optional]
**deliveryPartnerType** | **OrderDeliveryPartnerType** |  |  [optional]
**courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  |  [optional]
**dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  |  [optional]
**region** | [**RegionDTO**](RegionDTO.md) |  |  [optional]
**address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  |  [optional]
**vat** | **OrderVatType** |  |  [optional]
**deliveryServiceId** | **Long** | Идентификатор службы доставки. |  [optional]
**liftType** | **OrderLiftType** |  |  [optional]
**liftPrice** | **BigDecimal** | Стоимость подъема на этаж. |  [optional]
**outletCode** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. |  [optional]
**outletStorageLimitDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional]
**dispatchType** | **OrderDeliveryDispatchType** |  |  [optional]
**tracks** | [**Seq&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. |  [optional]
**shipments** | [**Seq&lt;OrderShipmentDTO&gt;**](OrderShipmentDTO.md) | Информация о посылках. |  [optional]
**estimated** | **Boolean** | Приблизительная ли дата доставки. |  [optional]
**eacType** | **OrderDeliveryEacType** |  |  [optional]
**eacCode** | **String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  |  [optional]



