# ympa_csharp_client.Model.OrderDeliveryDTO
Информация о доставке.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**Type** | **OrderDeliveryType** |  | [optional] 
**ServiceName** | **string** | Наименование службы доставки. | [optional] 
**Price** | **decimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**DeliveryPartnerType** | **OrderDeliveryPartnerType** |  | [optional] 
**Courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**Dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**Region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**Address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**Vat** | **OrderVatType** |  | [optional] 
**DeliveryServiceId** | **long** | Идентификатор службы доставки. | [optional] 
**LiftType** | **OrderLiftType** |  | [optional] 
**LiftPrice** | **decimal** | Стоимость подъема на этаж. | [optional] 
**OutletCode** | **string** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**OutletStorageLimitDate** | **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**DispatchType** | **OrderDeliveryDispatchType** |  | [optional] 
**Tracks** | [**List&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**Shipments** | [**List&lt;OrderShipmentDTO&gt;**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**Estimated** | **bool** | Приблизительная ли дата доставки. | [optional] 
**EacType** | **OrderDeliveryEacType** |  | [optional] 
**EacCode** | **string** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

