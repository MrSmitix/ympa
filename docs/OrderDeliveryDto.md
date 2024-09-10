# OrderDeliveryDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional]
**r#type** | Option<[**models::OrderDeliveryType**](OrderDeliveryType.md)> |  | [optional]
**service_name** | Option<**String**> | Наименование службы доставки. | [optional]
**price** | Option<**f64**> | {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional]
**delivery_partner_type** | Option<[**models::OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md)> |  | [optional]
**courier** | Option<[**models::OrderCourierDto**](OrderCourierDTO.md)> |  | [optional]
**dates** | Option<[**models::OrderDeliveryDatesDto**](OrderDeliveryDatesDTO.md)> |  | [optional]
**region** | Option<[**models::RegionDto**](RegionDTO.md)> |  | [optional]
**address** | Option<[**models::OrderDeliveryAddressDto**](OrderDeliveryAddressDTO.md)> |  | [optional]
**vat** | Option<[**models::OrderVatType**](OrderVatType.md)> |  | [optional]
**delivery_service_id** | Option<**i64**> | Идентификатор службы доставки. | [optional]
**lift_type** | Option<[**models::OrderLiftType**](OrderLiftType.md)> |  | [optional]
**lift_price** | Option<**f64**> | Стоимость подъема на этаж. | [optional]
**outlet_code** | Option<**String**> | Идентификатор пункта самовывоза, присвоенный магазином. | [optional]
**outlet_storage_limit_date** | Option<**String**> | Формат даты: `ДД-ММ-ГГГГ`.  | [optional]
**dispatch_type** | Option<[**models::OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md)> |  | [optional]
**tracks** | Option<[**Vec<models::OrderTrackDto>**](OrderTrackDTO.md)> | Информация для отслеживания перемещений посылки. | [optional]
**shipments** | Option<[**Vec<models::OrderShipmentDto>**](OrderShipmentDTO.md)> | Информация о посылках. | [optional]
**estimated** | Option<**bool**> | Приблизительная ли дата доставки. | [optional]
**eac_type** | Option<[**models::OrderDeliveryEacType**](OrderDeliveryEacType.md)> |  | [optional]
**eac_code** | Option<**String**> | Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


