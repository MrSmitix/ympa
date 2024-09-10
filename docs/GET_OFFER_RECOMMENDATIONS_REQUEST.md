# GET_OFFER_RECOMMENDATIONS_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | [**LIST [STRING_32]**](STRING_32.md) | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] [default to null]
**cofinance_price_filter** | [**FIELD_STATE_TYPE**](FieldStateType.md) |  | [optional] [default to null]
**recommended_cofinance_price_filter** | [**FIELD_STATE_TYPE**](FieldStateType.md) |  | [optional] [default to null]
**competitiveness_filter** | [**PRICE_COMPETITIVENESS_TYPE**](PriceCompetitivenessType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


