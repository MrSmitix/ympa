# OpenapiClient::OrderDeliveryDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] |
| **type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] |
| **service_name** | **String** | Наименование службы доставки. | [optional] |
| **price** | **Float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] |
| **delivery_partner_type** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] |
| **courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] |
| **dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] |
| **region** | [**RegionDTO**](RegionDTO.md) |  | [optional] |
| **address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] |
| **vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] |
| **delivery_service_id** | **Integer** | Идентификатор службы доставки. | [optional] |
| **lift_type** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] |
| **lift_price** | **Float** | Стоимость подъема на этаж. | [optional] |
| **outlet_code** | **String** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] |
| **outlet_storage_limit_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |
| **dispatch_type** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] |
| **tracks** | [**Array&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] |
| **shipments** | [**Array&lt;OrderShipmentDTO&gt;**](OrderShipmentDTO.md) | Информация о посылках. | [optional] |
| **estimated** | **Boolean** | Приблизительная ли дата доставки. | [optional] |
| **eac_type** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] |
| **eac_code** | **String** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderDeliveryDTO.new(
  id: null,
  type: null,
  service_name: null,
  price: null,
  delivery_partner_type: null,
  courier: null,
  dates: null,
  region: null,
  address: null,
  vat: null,
  delivery_service_id: null,
  lift_type: null,
  lift_price: null,
  outlet_code: null,
  outlet_storage_limit_date: 23-09-2022,
  dispatch_type: null,
  tracks: null,
  shipments: null,
  estimated: null,
  eac_type: null,
  eac_code: null
)
```

