# OpenapiClient::OfferParamDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  |  |
| **value** | **String** | Значение.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferParamDTO.new(
  name: Wi-Fi,
  value: есть
)
```

