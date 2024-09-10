# OrderDeliveryDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] [default to nothing]
**type** | [***OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] [default to nothing]
**serviceName** | **String** | Наименование службы доставки. | [optional] [default to nothing]
**price** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] [default to nothing]
**deliveryPartnerType** | [***OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] [default to nothing]
**courier** | [***OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] [default to nothing]
**dates** | [***OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] [default to nothing]
**region** | [***RegionDTO**](RegionDTO.md) |  | [optional] [default to nothing]
**address** | [***OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] [default to nothing]
**vat** | [***OrderVatType**](OrderVatType.md) |  | [optional] [default to nothing]
**deliveryServiceId** | **Int64** | Идентификатор службы доставки. | [optional] [default to nothing]
**liftType** | [***OrderLiftType**](OrderLiftType.md) |  | [optional] [default to nothing]
**liftPrice** | **Float64** | Стоимость подъема на этаж. | [optional] [default to nothing]
**outletCode** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] [default to nothing]
**outletStorageLimitDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to nothing]
**dispatchType** | [***OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] [default to nothing]
**tracks** | [**Vector{OrderTrackDTO}**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to nothing]
**shipments** | [**Vector{OrderShipmentDTO}**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to nothing]
**estimated** | **Bool** | Приблизительная ли дата доставки. | [optional] [default to nothing]
**eacType** | [***OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] [default to nothing]
**eacCode** | **String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


