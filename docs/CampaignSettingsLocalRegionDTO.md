# OpenapiClient::CampaignSettingsLocalRegionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор региона. | [optional] |
| **name** | **String** | Название региона. | [optional] |
| **type** | [**RegionType**](RegionType.md) |  | [optional] |
| **delivery_options_source** | [**CampaignSettingsScheduleSourceType**](CampaignSettingsScheduleSourceType.md) |  | [optional] |
| **delivery** | [**CampaignSettingsDeliveryDTO**](CampaignSettingsDeliveryDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CampaignSettingsLocalRegionDTO.new(
  id: null,
  name: null,
  type: null,
  delivery_options_source: null,
  delivery: null
)
```

