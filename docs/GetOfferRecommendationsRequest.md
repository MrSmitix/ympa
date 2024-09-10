# GetOfferRecommendationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | Option<**Vec<String>**> | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional]
**cofinance_price_filter** | Option<[**models::FieldStateType**](FieldStateType.md)> |  | [optional]
**recommended_cofinance_price_filter** | Option<[**models::FieldStateType**](FieldStateType.md)> |  | [optional]
**competitiveness_filter** | Option<[**models::PriceCompetitivenessType**](PriceCompetitivenessType.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


