# OpenapiClient::OfferCardsContentStatusDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **offer_cards** | [**Array&lt;OfferCardDTO&gt;**](OfferCardDTO.md) | Страница списка товаров с информацией о состоянии карточек. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferCardsContentStatusDTO.new(
  offer_cards: null,
  paging: null
)
```

