# GetOfferRecommendationsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **Vector{String}** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] [default to nothing]
**cofinancePriceFilter** | [***FieldStateType**](FieldStateType.md) |  | [optional] [default to nothing]
**recommendedCofinancePriceFilter** | [***FieldStateType**](FieldStateType.md) |  | [optional] [default to nothing]
**competitivenessFilter** | [***PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


