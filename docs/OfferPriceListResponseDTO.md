# OpenapiClient::OfferPriceListResponseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offers** | [**Array&lt;OfferPriceResponseDTO&gt;**](OfferPriceResponseDTO.md) | Страница списка. |  |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **total** | **Integer** | Количество всех цен магазина, измененных через API. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferPriceListResponseDTO.new(
  offers: null,
  paging: null,
  total: null
)
```

