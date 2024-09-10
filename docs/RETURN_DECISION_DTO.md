# RETURN_DECISION_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **INTEGER_64** | Идентификатор товара в возврате. | [optional] [default to null]
**count** | **INTEGER_32** | Количество единиц товара. | [optional] [default to null]
**comment** | [**STRING_32**](STRING_32.md) | Комментарий. | [optional] [default to null]
**reason_type** | [**RETURN_DECISION_REASON_TYPE**](ReturnDecisionReasonType.md) |  | [optional] [default to null]
**subreason_type** | [**RETURN_DECISION_SUBREASON_TYPE**](ReturnDecisionSubreasonType.md) |  | [optional] [default to null]
**decision_type** | [**RETURN_DECISION_TYPE**](ReturnDecisionType.md) |  | [optional] [default to null]
**refund_amount** | **INTEGER_64** | Сумма возврата. | [optional] [default to null]
**partner_compensation** | **INTEGER_64** | Компенсация за обратную доставку. | [optional] [default to null]
**images** | [**LIST [STRING_32]**](STRING_32.md) | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


