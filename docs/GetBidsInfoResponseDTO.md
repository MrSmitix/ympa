# OpenapiClient::GetBidsInfoResponseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bids** | [**Array&lt;SkuBidItemDTO&gt;**](SkuBidItemDTO.md) | Страница списка товаров. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetBidsInfoResponseDTO.new(
  bids: null,
  paging: null
)
```

