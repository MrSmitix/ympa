# OpenapiClient::OfferMappingInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferMappingInfoDTO.new(
  mapping: null,
  awaiting_moderation_mapping: null,
  rejected_mapping: null
)
```

