# OpenapiClient::GetMappingDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **market_sku** | **Integer** | SKU на Маркете. | [optional] |
| **market_sku_name** | **String** | Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] |
| **market_model_id** | **Integer** | Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] |
| **market_model_name** | **String** | Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] |
| **market_category_id** | **Integer** | Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] |
| **market_category_name** | **String** | Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetMappingDTO.new(
  market_sku: null,
  market_sku_name: null,
  market_model_id: null,
  market_model_name: null,
  market_category_id: null,
  market_category_name: null
)
```

