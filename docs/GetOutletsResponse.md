# OpenapiClient::GetOutletsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **outlets** | [**Array&lt;FullOutletDTO&gt;**](FullOutletDTO.md) | Информация о точках продаж. |  |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetOutletsResponse.new(
  outlets: null,
  paging: null,
  pager: null
)
```

