# OrderDeliveryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). | [optional] 
**type** | [**OpenAPI\Server\Model\OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**serviceName** | **string** | Наименование службы доставки. | [optional] 
**price** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа. | [optional] 
**deliveryPartnerType** | [**OpenAPI\Server\Model\OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**courier** | [**OpenAPI\Server\Model\OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**dates** | [**OpenAPI\Server\Model\OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**OpenAPI\Server\Model\RegionDTO**](RegionDTO.md) |  | [optional] 
**address** | [**OpenAPI\Server\Model\OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OpenAPI\Server\Model\OrderVatType**](OrderVatType.md) |  | [optional] 
**deliveryServiceId** | **int** | Идентификатор службы доставки. | [optional] 
**liftType** | [**OpenAPI\Server\Model\OrderLiftType**](OrderLiftType.md) |  | [optional] 
**liftPrice** | **float** | Стоимость подъема на этаж. | [optional] 
**outletCode** | **string** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outletStorageLimitDate** | **string** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. | [optional] 
**dispatchType** | [**OpenAPI\Server\Model\OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**tracks** | [**OpenAPI\Server\Model\OrderTrackDTO**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**OpenAPI\Server\Model\OrderShipmentDTO**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**estimated** | **bool** | Приблизительная ли дата доставки. | [optional] 
**eacType** | [**OpenAPI\Server\Model\OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**eacCode** | **string** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


