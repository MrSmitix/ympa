# OpenapiClient::CategoryDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор категории. |  |
| **name** | **String** | Название категории. |  |
| **children** | [**Array&lt;CategoryDTO&gt;**](CategoryDTO.md) | Дочерние категории. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CategoryDTO.new(
  id: null,
  name: null,
  children: null
)
```

