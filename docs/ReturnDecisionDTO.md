# OpenapiClient::ReturnDecisionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **return_item_id** | **Integer** | Идентификатор товара в возврате. | [optional] |
| **count** | **Integer** | Количество единиц товара. | [optional] |
| **comment** | **String** | Комментарий. | [optional] |
| **reason_type** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] |
| **subreason_type** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] |
| **decision_type** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] |
| **refund_amount** | **Integer** | Сумма возврата. | [optional] |
| **partner_compensation** | **Integer** | Компенсация за обратную доставку. | [optional] |
| **images** | **Array&lt;String&gt;** | Список хеш-кодов фотографий товара от покупателя. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ReturnDecisionDTO.new(
  return_item_id: null,
  count: null,
  comment: null,
  reason_type: null,
  subreason_type: null,
  decision_type: null,
  refund_amount: null,
  partner_compensation: null,
  images: null
)
```

