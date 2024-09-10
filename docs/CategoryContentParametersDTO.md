# OpenapiClient::CategoryContentParametersDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **category_id** | **Integer** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). |  |
| **parameters** | [**Array&lt;CategoryParameterDTO&gt;**](CategoryParameterDTO.md) | Список характеристик. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CategoryContentParametersDTO.new(
  category_id: null,
  parameters: null
)
```

