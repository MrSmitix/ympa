# OpenapiClient::OrdersStatsPaymentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор денежного перевода. | [optional] |
| **date** | **Date** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] |
| **source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] |
| **total** | **Float** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] |
| **payment_order** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrdersStatsPaymentDTO.new(
  id: null,
  date: null,
  type: null,
  source: null,
  total: null,
  payment_order: null
)
```

