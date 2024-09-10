# OpenapiClient::UpdateOfferMappingEntryDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **offer** | [**UpdateMappingsOfferDTO**](UpdateMappingsOfferDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOfferMappingEntryDTO.new(
  mapping: null,
  awaiting_moderation_mapping: null,
  rejected_mapping: null,
  offer: null
)
```

