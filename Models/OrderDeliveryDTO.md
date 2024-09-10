# OrderDeliveryDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] [default to null] |
| **type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] [default to null] |
| **serviceName** | **String** | Наименование службы доставки. | [optional] [default to null] |
| **price** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] [default to null] |
| **deliveryPartnerType** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] [default to null] |
| **courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] [default to null] |
| **dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] [default to null] |
| **region** | [**RegionDTO**](RegionDTO.md) |  | [optional] [default to null] |
| **address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] [default to null] |
| **vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] [default to null] |
| **deliveryServiceId** | **Long** | Идентификатор службы доставки. | [optional] [default to null] |
| **liftType** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] [default to null] |
| **liftPrice** | **BigDecimal** | Стоимость подъема на этаж. | [optional] [default to null] |
| **outletCode** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] [default to null] |
| **outletStorageLimitDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null] |
| **dispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] [default to null] |
| **tracks** | [**List**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] [default to null] |
| **shipments** | [**List**](OrderShipmentDTO.md) | Информация о посылках. | [optional] [default to null] |
| **estimated** | **Boolean** | Приблизительная ли дата доставки. | [optional] [default to null] |
| **eacType** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] [default to null] |
| **eacCode** | **String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

