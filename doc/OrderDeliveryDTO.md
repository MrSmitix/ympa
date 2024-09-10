# openapi.model.OrderDeliveryDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**serviceName** | **String** | Наименование службы доставки. | [optional] 
**price** | **num** | {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**deliveryPartnerType** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**deliveryServiceId** | **int** | Идентификатор службы доставки. | [optional] 
**liftType** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] 
**liftPrice** | **num** | Стоимость подъема на этаж. | [optional] 
**outletCode** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outletStorageLimitDate** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 
**dispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**tracks** | [**List<OrderTrackDTO>**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to const []]
**shipments** | [**List<OrderShipmentDTO>**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to const []]
**estimated** | **bool** | Приблизительная ли дата доставки. | [optional] 
**eacType** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**eacCode** | **String** | Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


