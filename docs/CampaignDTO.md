# OpenapiClient::CampaignDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **domain** | **String** | URL магазина. | [optional] |
| **id** | **Integer** | Идентификатор кампании. | [optional] |
| **client_id** | **Integer** | Идентификатор плательщика в Яндекс Балансе. | [optional] |
| **business** | [**BusinessDTO**](BusinessDTO.md) |  | [optional] |
| **placement_type** | [**PlacementType**](PlacementType.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CampaignDTO.new(
  domain: null,
  id: null,
  client_id: null,
  business: null,
  placement_type: null
)
```

