# OpenapiClient::ParameterValueDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **parameter_id** | **Integer** | Идентификатор характеристики. |  |
| **unit_id** | **Integer** | Идентификатор единицы измерения. Если вы не передали параметр &#x60;unitId&#x60;, используется единица измерения по умолчанию. | [optional] |
| **value_id** | **Integer** | Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа &#x60;ENUM&#x60;.  | [optional] |
| **value** | **String** | Значение. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ParameterValueDTO.new(
  parameter_id: null,
  unit_id: null,
  value_id: null,
  value: null
)
```

