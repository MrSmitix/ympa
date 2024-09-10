
# ReturnDecisionDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **returnItemId** | **kotlin.Long** | Идентификатор товара в возврате. |  [optional] |
| **count** | **kotlin.Int** | Количество единиц товара. |  [optional] |
| **comment** | **kotlin.String** | Комментарий. |  [optional] |
| **reasonType** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  |  [optional] |
| **subreasonType** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  |  [optional] |
| **decisionType** | [**ReturnDecisionType**](ReturnDecisionType.md) |  |  [optional] |
| **refundAmount** | **kotlin.Long** | Сумма возврата. |  [optional] |
| **partnerCompensation** | **kotlin.Long** | Компенсация за обратную доставку. |  [optional] |
| **images** | **kotlin.collections.List&lt;kotlin.String&gt;** | Список хеш-кодов фотографий товара от покупателя. |  [optional] |



