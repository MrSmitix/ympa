# ORDER_DELIVERY_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] [default to null]
**type** | [**ORDER_DELIVERY_TYPE**](OrderDeliveryType.md) |  | [optional] [default to null]
**service_name** | [**STRING_32**](STRING_32.md) | Наименование службы доставки. | [optional] [default to null]
**price** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] [default to null]
**delivery_partner_type** | [**ORDER_DELIVERY_PARTNER_TYPE**](OrderDeliveryPartnerType.md) |  | [optional] [default to null]
**courier** | [**ORDER_COURIER_DTO**](OrderCourierDTO.md) |  | [optional] [default to null]
**dates** | [**ORDER_DELIVERY_DATES_DTO**](OrderDeliveryDatesDTO.md) |  | [optional] [default to null]
**region** | [**REGION_DTO**](RegionDTO.md) |  | [optional] [default to null]
**address** | [**ORDER_DELIVERY_ADDRESS_DTO**](OrderDeliveryAddressDTO.md) |  | [optional] [default to null]
**vat** | [**ORDER_VAT_TYPE**](OrderVatType.md) |  | [optional] [default to null]
**delivery_service_id** | **INTEGER_64** | Идентификатор службы доставки. | [optional] [default to null]
**lift_type** | [**ORDER_LIFT_TYPE**](OrderLiftType.md) |  | [optional] [default to null]
**lift_price** | **REAL_32** | Стоимость подъема на этаж. | [optional] [default to null]
**outlet_code** | [**STRING_32**](STRING_32.md) | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] [default to null]
**outlet_storage_limit_date** | [**STRING_32**](STRING_32.md) | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**dispatch_type** | [**ORDER_DELIVERY_DISPATCH_TYPE**](OrderDeliveryDispatchType.md) |  | [optional] [default to null]
**tracks** | [**LIST [ORDER_TRACK_DTO]**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to null]
**shipments** | [**LIST [ORDER_SHIPMENT_DTO]**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to null]
**estimated** | **BOOLEAN** | Приблизительная ли дата доставки. | [optional] [default to null]
**eac_type** | [**ORDER_DELIVERY_EAC_TYPE**](OrderDeliveryEacType.md) |  | [optional] [default to null]
**eac_code** | [**STRING_32**](STRING_32.md) | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


