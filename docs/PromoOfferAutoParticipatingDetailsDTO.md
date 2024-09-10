# OpenapiClient::PromoOfferAutoParticipatingDetailsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_ids** | **Array&lt;Integer&gt;** | Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PromoOfferAutoParticipatingDetailsDTO.new(
  campaign_ids: null
)
```

