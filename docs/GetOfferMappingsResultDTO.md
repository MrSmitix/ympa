# OpenapiClient::GetOfferMappingsResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **offer_mappings** | [**Array&lt;GetOfferMappingDTO&gt;**](GetOfferMappingDTO.md) | Информация о товарах. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOfferMappingsResultDTO.new(
  paging: null,
  offer_mappings: null
)
```

