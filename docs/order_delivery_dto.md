# order_delivery_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | **order_delivery_type_t \*** |  | [optional] 
**service_name** | **char \*** | Наименование службы доставки. | [optional] 
**price** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**delivery_partner_type** | **order_delivery_partner_type_t \*** |  | [optional] 
**courier** | [**order_courier_dto_t**](order_courier_dto.md) \* |  | [optional] 
**dates** | [**order_delivery_dates_dto_t**](order_delivery_dates_dto.md) \* |  | [optional] 
**region** | [**region_dto_t**](region_dto.md) \* |  | [optional] 
**address** | [**order_delivery_address_dto_t**](order_delivery_address_dto.md) \* |  | [optional] 
**vat** | **order_vat_type_t \*** |  | [optional] 
**delivery_service_id** | **long** | Идентификатор службы доставки. | [optional] 
**lift_type** | **order_lift_type_t \*** |  | [optional] 
**lift_price** | **double** | Стоимость подъема на этаж. | [optional] 
**outlet_code** | **char \*** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outlet_storage_limit_date** | **char \*** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**dispatch_type** | **order_delivery_dispatch_type_t \*** |  | [optional] 
**tracks** | [**list_t**](order_track_dto.md) \* | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**list_t**](order_shipment_dto.md) \* | Информация о посылках. | [optional] 
**estimated** | **int** | Приблизительная ли дата доставки. | [optional] 
**eac_type** | **order_delivery_eac_type_t \*** |  | [optional] 
**eac_code** | **char \*** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


