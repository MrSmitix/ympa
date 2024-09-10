# OpenapiClient::GetRegionsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **regions** | [**Array&lt;RegionDTO&gt;**](RegionDTO.md) | Регион доставки. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetRegionsResponse.new(
  regions: null,
  paging: null
)
```

