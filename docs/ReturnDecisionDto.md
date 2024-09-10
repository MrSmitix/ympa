# ReturnDecisionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **Int!** | Идентификатор товара в возврате. | [optional] [default to null]
**count** | **Int!** | Количество единиц товара. | [optional] [default to null]
**comment** | **String!** | Комментарий. | [optional] [default to null]
**reasonType** | [***ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] [default to null]
**subreasonType** | [***ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] [default to null]
**decisionType** | [***ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] [default to null]
**refundAmount** | **Int!** | Сумма возврата. | [optional] [default to null]
**partnerCompensation** | **Int!** | Компенсация за обратную доставку. | [optional] [default to null]
**images** | **String!** | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


