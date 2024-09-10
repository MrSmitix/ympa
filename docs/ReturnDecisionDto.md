# ReturnDecisionDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **i64** | Идентификатор товара в возврате. | [optional] [default to None]
**count** | **i32** | Количество единиц товара. | [optional] [default to None]
**comment** | **String** | Комментарий. | [optional] [default to None]
**reason_type** | [***models::ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] [default to None]
**subreason_type** | [***models::ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] [default to None]
**decision_type** | [***models::ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] [default to None]
**refund_amount** | **i64** | Сумма возврата. | [optional] [default to None]
**partner_compensation** | **i64** | Компенсация за обратную доставку. | [optional] [default to None]
**images** | **Vec<String>** | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


