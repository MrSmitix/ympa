# OpenapiClient::OfferMappingEntryDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **awaiting_moderation_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **rejected_mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] |
| **offer** | [**MappingsOfferDTO**](MappingsOfferDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferMappingEntryDTO.new(
  mapping: null,
  awaiting_moderation_mapping: null,
  rejected_mapping: null,
  offer: null
)
```

