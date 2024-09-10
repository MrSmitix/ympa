# OpenapiClient::CategoryParameterUnitDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default_unit_id** | **Integer** | Единица измерения по умолчанию. |  |
| **units** | [**Array&lt;UnitDTO&gt;**](UnitDTO.md) | Допустимые единицы измерения. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CategoryParameterUnitDTO.new(
  default_unit_id: null,
  units: null
)
```

