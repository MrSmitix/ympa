# OpenapiClient::OfferMappingEntriesDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **offer_mapping_entries** | [**Array&lt;OfferMappingEntryDTO&gt;**](OfferMappingEntryDTO.md) | Информация о товарах в каталоге. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferMappingEntriesDTO.new(
  paging: null,
  offer_mapping_entries: null
)
```

