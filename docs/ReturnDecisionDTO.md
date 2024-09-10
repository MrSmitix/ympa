# ReturnDecisionDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **Int64** | Идентификатор товара в возврате. | [optional] [default to nothing]
**count** | **Int64** | Количество единиц товара. | [optional] [default to nothing]
**comment** | **String** | Комментарий. | [optional] [default to nothing]
**reasonType** | [***ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] [default to nothing]
**subreasonType** | [***ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] [default to nothing]
**decisionType** | [***ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] [default to nothing]
**refundAmount** | **Int64** | Сумма возврата. | [optional] [default to nothing]
**partnerCompensation** | **Int64** | Компенсация за обратную доставку. | [optional] [default to nothing]
**images** | **Vector{String}** | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


