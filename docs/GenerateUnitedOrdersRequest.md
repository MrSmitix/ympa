# OpenapiClient::GenerateUnitedOrdersRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор бизнеса. |  |
| **date_from** | **Date** | Начало периода, включительно. |  |
| **date_to** | **Date** | Конец периода, включительно. Максимальный период — 1 год. |  |
| **campaign_ids** | **Array&lt;Integer&gt;** | Список магазинов, которые нужны в отчете. | [optional] |
| **promo_id** | **String** | Идентификатор акции, товары из которой нужны в отчете. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateUnitedOrdersRequest.new(
  business_id: null,
  date_from: null,
  date_to: null,
  campaign_ids: null,
  promo_id: null
)
```

