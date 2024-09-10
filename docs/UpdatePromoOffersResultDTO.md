# OpenapiClient::UpdatePromoOffersResultDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rejected_offers** | [**Array&lt;RejectedPromoOfferUpdateDTO&gt;**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  | [optional] |
| **warning_offers** | [**Array&lt;WarningPromoOfferUpdateDTO&gt;**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdatePromoOffersResultDTO.new(
  rejected_offers: null,
  warning_offers: null
)
```

