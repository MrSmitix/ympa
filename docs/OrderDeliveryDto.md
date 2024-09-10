# OrderDeliveryDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] [default to None]
**r#type** | [***models::OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] [default to None]
**service_name** | **String** | Наименование службы доставки. | [optional] [default to None]
**price** | **f64** | {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] [default to None]
**delivery_partner_type** | [***models::OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] [default to None]
**courier** | [***models::OrderCourierDto**](OrderCourierDTO.md) |  | [optional] [default to None]
**dates** | [***models::OrderDeliveryDatesDto**](OrderDeliveryDatesDTO.md) |  | [optional] [default to None]
**region** | [***models::RegionDto**](RegionDTO.md) |  | [optional] [default to None]
**address** | [***models::OrderDeliveryAddressDto**](OrderDeliveryAddressDTO.md) |  | [optional] [default to None]
**vat** | [***models::OrderVatType**](OrderVatType.md) |  | [optional] [default to None]
**delivery_service_id** | **i64** | Идентификатор службы доставки. | [optional] [default to None]
**lift_type** | [***models::OrderLiftType**](OrderLiftType.md) |  | [optional] [default to None]
**lift_price** | **f64** | Стоимость подъема на этаж. | [optional] [default to None]
**outlet_code** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] [default to None]
**outlet_storage_limit_date** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]
**dispatch_type** | [***models::OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] [default to None]
**tracks** | [**Vec<models::OrderTrackDto>**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to None]
**shipments** | [**Vec<models::OrderShipmentDto>**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to None]
**estimated** | **bool** | Приблизительная ли дата доставки. | [optional] [default to None]
**eac_type** | [***models::OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] [default to None]
**eac_code** | **String** | Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


