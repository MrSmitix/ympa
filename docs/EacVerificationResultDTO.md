# OpenapiClient::EacVerificationResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **verification_result** | [**EacVerificationStatusType**](EacVerificationStatusType.md) |  | [optional] |
| **attempts_left** | **Integer** | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::EacVerificationResultDTO.new(
  verification_result: null,
  attempts_left: null
)
```

