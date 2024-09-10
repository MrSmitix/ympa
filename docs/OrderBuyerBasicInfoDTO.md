# OpenapiClient::OrderBuyerBasicInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор покупателя. | [optional] |
| **last_name** | **String** | Фамилия покупателя. | [optional] |
| **first_name** | **String** | Имя покупателя. | [optional] |
| **middle_name** | **String** | Отчество покупателя. | [optional] |
| **type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderBuyerBasicInfoDTO.new(
  id: null,
  last_name: null,
  first_name: null,
  middle_name: null,
  type: null
)
```

