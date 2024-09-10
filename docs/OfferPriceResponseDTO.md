# OpenapiClient::OfferPriceResponseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор предложения из прайс-листа. | [optional] |
| **price** | [**PriceDTO**](PriceDTO.md) |  | [optional] |
| **market_sku** | **Integer** | SKU на Маркете. | [optional] |
| **updated_at** | **Time** | Дата и время последнего обновления цены на товар. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferPriceResponseDTO.new(
  id: null,
  price: null,
  market_sku: null,
  updated_at: null
)
```

