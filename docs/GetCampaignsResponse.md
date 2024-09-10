# OpenapiClient::GetCampaignsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaigns** | [**Array&lt;CampaignDTO&gt;**](CampaignDTO.md) | Список с информацией по каждому магазину. |  |
| **pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetCampaignsResponse.new(
  campaigns: null,
  pager: null
)
```

