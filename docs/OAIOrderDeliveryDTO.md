# OAIOrderDeliveryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | [**OAIOrderDeliveryType***](OAIOrderDeliveryType.md) |  | [optional] 
**serviceName** | **NSString*** | Наименование службы доставки. | [optional] 
**price** | **NSNumber*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**deliveryPartnerType** | [**OAIOrderDeliveryPartnerType***](OAIOrderDeliveryPartnerType.md) |  | [optional] 
**courier** | [**OAIOrderCourierDTO***](OAIOrderCourierDTO.md) |  | [optional] 
**dates** | [**OAIOrderDeliveryDatesDTO***](OAIOrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**OAIRegionDTO***](OAIRegionDTO.md) |  | [optional] 
**address** | [**OAIOrderDeliveryAddressDTO***](OAIOrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OAIOrderVatType***](OAIOrderVatType.md) |  | [optional] 
**deliveryServiceId** | **NSNumber*** | Идентификатор службы доставки. | [optional] 
**liftType** | [**OAIOrderLiftType***](OAIOrderLiftType.md) |  | [optional] 
**liftPrice** | **NSNumber*** | Стоимость подъема на этаж. | [optional] 
**outletCode** | **NSString*** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outletStorageLimitDate** | **NSString*** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**dispatchType** | [**OAIOrderDeliveryDispatchType***](OAIOrderDeliveryDispatchType.md) |  | [optional] 
**tracks** | [**NSArray&lt;OAIOrderTrackDTO&gt;***](OAIOrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**NSArray&lt;OAIOrderShipmentDTO&gt;***](OAIOrderShipmentDTO.md) | Информация о посылках. | [optional] 
**estimated** | **NSNumber*** | Приблизительная ли дата доставки. | [optional] 
**eacType** | [**OAIOrderDeliveryEacType***](OAIOrderDeliveryEacType.md) |  | [optional] 
**eacCode** | **NSString*** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


