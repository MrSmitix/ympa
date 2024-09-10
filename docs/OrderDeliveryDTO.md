# WWW::OpenAPIClient::Object::OrderDeliveryDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderDeliveryDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**service_name** | **string** | Наименование службы доставки. | [optional] 
**price** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**delivery_partner_type** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**delivery_service_id** | **int** | Идентификатор службы доставки. | [optional] 
**lift_type** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] 
**lift_price** | **double** | Стоимость подъема на этаж. | [optional] 
**outlet_code** | **string** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outlet_storage_limit_date** | **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**dispatch_type** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**tracks** | [**ARRAY[OrderTrackDTO]**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**ARRAY[OrderShipmentDTO]**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**estimated** | **boolean** | Приблизительная ли дата доставки. | [optional] 
**eac_type** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**eac_code** | **string** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


