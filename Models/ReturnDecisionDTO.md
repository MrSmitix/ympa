# ReturnDecisionDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **returnItemId** | **Long** | Идентификатор товара в возврате. | [optional] [default to null] |
| **count** | **Integer** | Количество единиц товара. | [optional] [default to null] |
| **comment** | **String** | Комментарий. | [optional] [default to null] |
| **reasonType** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] [default to null] |
| **subreasonType** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] [default to null] |
| **decisionType** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] [default to null] |
| **refundAmount** | **Long** | Сумма возврата. | [optional] [default to null] |
| **partnerCompensation** | **Long** | Компенсация за обратную доставку. | [optional] [default to null] |
| **images** | **List** | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

