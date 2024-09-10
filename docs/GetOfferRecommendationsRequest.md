# GetOfferRecommendationsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **Vec<models::ShopSku>** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] [default to None]
**cofinance_price_filter** | [***models::FieldStateType**](FieldStateType.md) |  | [optional] [default to None]
**recommended_cofinance_price_filter** | [***models::FieldStateType**](FieldStateType.md) |  | [optional] [default to None]
**competitiveness_filter** | [***models::PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


