# ympa_r_client::OrderDeliveryDTO

Информация о доставке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] [Enum: ] 
**serviceName** | **character** | Наименование службы доставки. | [optional] 
**price** | **numeric** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**deliveryPartnerType** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] [Enum: ] 
**courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] [Enum: ] 
**deliveryServiceId** | **integer** | Идентификатор службы доставки. | [optional] 
**liftType** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] [Enum: ] 
**liftPrice** | **numeric** | Стоимость подъема на этаж. | [optional] 
**outletCode** | **character** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outletStorageLimitDate** | **character** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**dispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] [Enum: ] 
**tracks** | [**array[OrderTrackDTO]**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**array[OrderShipmentDTO]**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**estimated** | **character** | Приблизительная ли дата доставки. | [optional] 
**eacType** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] [Enum: ] 
**eacCode** | **character** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 


