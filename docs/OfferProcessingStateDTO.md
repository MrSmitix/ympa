# OpenapiClient::OfferProcessingStateDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**OfferProcessingStatusType**](OfferProcessingStatusType.md) |  | [optional] |
| **notes** | [**Array&lt;OfferProcessingNoteDTO&gt;**](OfferProcessingNoteDTO.md) | Причины, по которым товар не прошел модерацию. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferProcessingStateDTO.new(
  status: null,
  notes: null
)
```

