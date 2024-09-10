# OpenapiClient::GetCategoriesMaxSaleQuantumDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **results** | [**Array&lt;MaxSaleQuantumDTO&gt;**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. |  |
| **errors** | [**Array&lt;CategoryErrorDTO&gt;**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetCategoriesMaxSaleQuantumDTO.new(
  results: null,
  errors: null
)
```

