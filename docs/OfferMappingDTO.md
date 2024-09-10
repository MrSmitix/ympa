# OpenapiClient::OfferMappingDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **market_sku** | **Integer** | SKU на Маркете. | [optional] |
| **model_id** | **Integer** | Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.  | [optional] |
| **category_id** | **Integer** | Идентификатор категории для текущей карточки товара на Маркете. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferMappingDTO.new(
  market_sku: null,
  model_id: null,
  category_id: null
)
```

