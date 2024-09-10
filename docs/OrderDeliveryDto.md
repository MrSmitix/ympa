# OrderDeliveryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] [default to null]
**Type_** | [***OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] [default to null]
**serviceName** | **String!** | Наименование службы доставки. | [optional] [default to null]
**price** | **Float!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] [default to null]
**deliveryPartnerType** | [***OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] [default to null]
**courier** | [***OrderCourierDto**](OrderCourierDTO.md) |  | [optional] [default to null]
**dates** | [***OrderDeliveryDatesDto**](OrderDeliveryDatesDTO.md) |  | [optional] [default to null]
**region** | [***RegionDto**](RegionDTO.md) |  | [optional] [default to null]
**address** | [***OrderDeliveryAddressDto**](OrderDeliveryAddressDTO.md) |  | [optional] [default to null]
**vat** | [***OrderVatType**](OrderVatType.md) |  | [optional] [default to null]
**deliveryServiceId** | **Int!** | Идентификатор службы доставки. | [optional] [default to null]
**liftType** | [***OrderLiftType**](OrderLiftType.md) |  | [optional] [default to null]
**liftPrice** | **Float!** | Стоимость подъема на этаж. | [optional] [default to null]
**outletCode** | **String!** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] [default to null]
**outletStorageLimitDate** | **String!** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**dispatchType** | [***OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] [default to null]
**tracks** | [**OrderTrackDto**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to null]
**shipments** | [**OrderShipmentDto**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to null]
**estimated** | **Boolean!** | Приблизительная ли дата доставки. | [optional] [default to null]
**eacType** | [***OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] [default to null]
**eacCode** | **String!** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


