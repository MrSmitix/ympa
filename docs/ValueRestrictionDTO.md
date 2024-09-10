# OpenapiClient::ValueRestrictionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limiting_parameter_id** | **Integer** | Идентификатор ограничивающей характеристики. |  |
| **limited_values** | [**Array&lt;OptionValuesLimitedDTO&gt;**](OptionValuesLimitedDTO.md) | Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ValueRestrictionDTO.new(
  limiting_parameter_id: null,
  limited_values: null
)
```

