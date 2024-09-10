# ReturnDecisionDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | Option<**i64**> | Идентификатор товара в возврате. | [optional]
**count** | Option<**i32**> | Количество единиц товара. | [optional]
**comment** | Option<**String**> | Комментарий. | [optional]
**reason_type** | Option<[**models::ReturnDecisionReasonType**](ReturnDecisionReasonType.md)> |  | [optional]
**subreason_type** | Option<[**models::ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md)> |  | [optional]
**decision_type** | Option<[**models::ReturnDecisionType**](ReturnDecisionType.md)> |  | [optional]
**refund_amount** | Option<**i64**> | Сумма возврата. | [optional]
**partner_compensation** | Option<**i64**> | Компенсация за обратную доставку. | [optional]
**images** | Option<**Vec<String>**> | Список хеш-кодов фотографий товара от покупателя. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


