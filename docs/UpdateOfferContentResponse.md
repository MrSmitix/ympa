# OpenapiClient::UpdateOfferContentResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] |
| **results** | [**Array&lt;UpdateOfferContentResultDTO&gt;**](UpdateOfferContentResultDTO.md) | Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOfferContentResponse.new(
  status: null,
  results: null
)
```

